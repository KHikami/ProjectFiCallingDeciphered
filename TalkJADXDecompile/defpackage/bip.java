package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bip */
public final class bip extends SQLiteOpenHelper {
    private final long a;
    private final SQLiteDatabase b;

    public bip(Context context) {
        super(context, "concurrent_service_task_store.db", null, 10);
        this.b = getWritableDatabase();
        this.a = ((gmp) jyn.a(context, gmp.class)).d();
        this.b.delete("tasks", "version_code != ?", new String[]{String.valueOf(this.a)});
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        biq.b(sQLiteDatabase);
        biq.a(sQLiteDatabase);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        biq.a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        bip.a(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        bip.a(sQLiteDatabase);
    }

    long a(bho bho) {
        ba.a(bho.h.b);
        ba.a(bho.i == -1);
        ContentValues contentValues = new ContentValues();
        contentValues.put("version_code", Long.valueOf(this.a));
        contentValues.put("persisted_task", bho.a(bho));
        long insert = this.b.insert("tasks", null, contentValues);
        bho.i = insert;
        String.format("Wrote persistent task %s to db", new Object[]{bho.a()});
        return insert;
    }

    boolean b(bho bho) {
        ba.a(bho.i != -1);
        int a = a(bho.i);
        if (a == 1) {
            String.format("Removed persistent task %s from db", new Object[]{bho.a()});
        }
        return a == 1;
    }

    private int a(long j) {
        return this.b.delete("tasks", "_id = ?", new String[]{String.valueOf(j)});
    }

    int a(List<bho> list) {
        if (list.isEmpty()) {
            return 0;
        }
        int i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("_id");
        stringBuilder.append(" IN(");
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            stringBuilder.append("?,");
        }
        stringBuilder.append("?)");
        String stringBuilder2 = stringBuilder.toString();
        String[] strArr = new String[list.size()];
        for (i = 0; i < list.size(); i++) {
            strArr[i] = String.valueOf(((bho) list.get(i)).i);
        }
        i = this.b.delete("tasks", stringBuilder2, strArr);
        if (i == 1) {
            String.format("Removed %d persistent tasks of group %s", new Object[]{Integer.valueOf(i), ((bho) list.get(0)).c.b()});
        }
        return i;
    }

    void c(bho bho) {
        ba.a(bho.i >= 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("version_code", Long.valueOf(this.a));
        contentValues.put("persisted_task", bho.a(bho));
        this.b.update("tasks", contentValues, "_id = ?", new String[]{String.valueOf(bho.i)});
        String.format("Updated persistent task %s in db", new Object[]{bho.a()});
    }

    List<bho> a() {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor query = this.b.query("tasks", biq.a, null, null, null, null, "_id ASC");
            query.moveToFirst();
            if (query.isAfterLast()) {
                if (query != null) {
                    query.close();
                }
                return null;
            }
            List<bho> arrayList = new ArrayList();
            do {
                try {
                    long j = query.getLong(0);
                    bho a = bho.a(query.getBlob(2));
                    a.i = j;
                    arrayList.add(a);
                } catch (Throwable e) {
                    glk.d("Babel_ConcService", "Error deserializing task from db", e);
                    a(query.getLong(0));
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                }
            } while (query.moveToNext());
            String.format("Loaded %d persistent tasks from the db", new Object[]{Integer.valueOf(arrayList.size())});
            if (query == null) {
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
