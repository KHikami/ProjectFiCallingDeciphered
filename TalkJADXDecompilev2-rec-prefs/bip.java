package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

public final class bip extends SQLiteOpenHelper {
    private final long f3441a;
    private final SQLiteDatabase f3442b = getWritableDatabase();

    public bip(Context context) {
        super(context, "concurrent_service_task_store.db", null, 10);
        this.f3441a = ((gmp) jyn.m25426a(context, gmp.class)).mo2301d();
        this.f3442b.delete("tasks", "version_code != ?", new String[]{String.valueOf(this.f3441a)});
    }

    private static void m5307a(SQLiteDatabase sQLiteDatabase) {
        biq.m5314b(sQLiteDatabase);
        biq.m5313a(sQLiteDatabase);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        biq.m5313a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        bip.m5307a(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        bip.m5307a(sQLiteDatabase);
    }

    long m5309a(bho bho) {
        ba.m4577a(bho.f3360h.f3388b);
        ba.m4577a(bho.f3361i == -1);
        ContentValues contentValues = new ContentValues();
        contentValues.put("version_code", Long.valueOf(this.f3441a));
        contentValues.put("persisted_task", bho.m5257a(bho));
        long insert = this.f3442b.insert("tasks", null, contentValues);
        bho.f3361i = insert;
        String.format("Wrote persistent task %s to db", new Object[]{bho.m5258a()});
        return insert;
    }

    boolean m5311b(bho bho) {
        ba.m4577a(bho.f3361i != -1);
        int a = m5306a(bho.f3361i);
        if (a == 1) {
            String.format("Removed persistent task %s from db", new Object[]{bho.m5258a()});
        }
        return a == 1;
    }

    private int m5306a(long j) {
        return this.f3442b.delete("tasks", "_id = ?", new String[]{String.valueOf(j)});
    }

    int m5308a(List<bho> list) {
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
            strArr[i] = String.valueOf(((bho) list.get(i)).f3361i);
        }
        i = this.f3442b.delete("tasks", stringBuilder2, strArr);
        if (i == 1) {
            String.format("Removed %d persistent tasks of group %s", new Object[]{Integer.valueOf(i), ((bho) list.get(0)).f3355c.m5245b()});
        }
        return i;
    }

    void m5312c(bho bho) {
        ba.m4577a(bho.f3361i >= 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("version_code", Long.valueOf(this.f3441a));
        contentValues.put("persisted_task", bho.m5257a(bho));
        this.f3442b.update("tasks", contentValues, "_id = ?", new String[]{String.valueOf(bho.f3361i)});
        String.format("Updated persistent task %s in db", new Object[]{bho.m5258a()});
    }

    List<bho> m5310a() {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor query = this.f3442b.query("tasks", biq.f3443a, null, null, null, null, "_id ASC");
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
                    bho a = bho.m5256a(query.getBlob(2));
                    a.f3361i = j;
                    arrayList.add(a);
                } catch (Throwable e) {
                    glk.m17980d("Babel_ConcService", "Error deserializing task from db", e);
                    m5306a(query.getLong(0));
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
