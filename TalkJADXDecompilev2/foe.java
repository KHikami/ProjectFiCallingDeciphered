package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public class foe extends SQLiteOpenHelper implements eah {
    private static final boolean a = false;
    private final long b;
    private SQLiteDatabase c = getWritableDatabase();

    static {
        kae kae = glk.p;
    }

    public static foe a(Context context) {
        return (foe) jyn.a(context, foe.class);
    }

    foe(Context context) {
        super(context, "message_store.db", null, 60);
        this.b = ((gmp) jyn.a(context, gmp.class)).d();
        glk.a("Babel_RequestWriter", "RequestWriterDatabase init", new Object[0]);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        ba.a(sQLiteDatabase);
        bc.a(sQLiteDatabase);
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        gwb.a(sQLiteDatabase);
        ba.b(sQLiteDatabase);
        bc.b(sQLiteDatabase);
        ba.a(sQLiteDatabase);
        bc.a(sQLiteDatabase);
        gwb.e(0, 0);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 60) {
            foe.a(sQLiteDatabase);
            RealTimeChatService.c();
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        foe.a(sQLiteDatabase);
        RealTimeChatService.c();
    }

    void a(fny fny) {
        List arrayList = new ArrayList();
        if (a(null, arrayList)) {
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                dzz dzz = (dzz) obj;
                if (fde.e(dzz.c.b()) == null) {
                    new StringBuilder(51).append("Ignoring message restore for account id ").append(dzz.c.b());
                } else {
                    fny.a(dzz);
                }
            }
            return;
        }
        int delete = this.c.delete("requests", "1", null);
        if (delete == 0) {
            glk.e("Babel_RequestWriter", "Dropped 0 pending request(s)", new Object[0]);
            return;
        }
        glk.d("Babel_RequestWriter", "Dropped " + delete + " pending request(s)", new Object[0]);
        gwb.a(null, 1982);
        RealTimeChatService.c();
    }

    public dzz b(long j) {
        List arrayList = new ArrayList();
        if (!a(new String[]{Long.toString(j)}, arrayList) || arrayList.size() <= 0) {
            return null;
        }
        return (dzz) arrayList.get(0);
    }

    private boolean a(String[] strArr, List<dzz> list) {
        Cursor query = this.c.query("requests", fof.a, strArr == null ? null : "_id = ?", strArr, null, null, "creation_time ASC");
        if (a) {
            new StringBuilder(29).append("Decoding ").append(query.getCount()).append(" messages");
        }
        while (query.moveToNext()) {
            long j = query.getLong(1);
            if (j < this.b) {
                glk.d("Babel_RequestWriter", "Dropping all pending request(s) due to apk upgrade from " + j + " => " + this.b, new Object[0]);
                return false;
            }
            try {
                long j2 = query.getLong(0);
                if (a) {
                    new StringBuilder(33).append("Decoding row ").append(j2);
                }
                ead a = foh.a(query.getBlob(4));
                if (a == null) {
                    glk.d("Babel_RequestWriter", "Decode row " + j2 + " with empty network request", new Object[0]);
                } else {
                    dzz dzz = new dzz(j2, query.getString(2), query.getInt(3), query.getInt(5), query.getInt(6), query.getLong(7), a);
                    if (a) {
                        String valueOf = String.valueOf(dzz);
                        new StringBuilder(String.valueOf(valueOf).length() + 25).append("Restoring ServerRequest: ").append(valueOf);
                    }
                    list.add(dzz);
                }
            } catch (Throwable e) {
                glk.d("Babel_RequestWriter", "Failed to decode pending requests", e);
                return false;
            } finally {
                query.close();
            }
        }
        query.close();
        return true;
    }

    public long b(dzz dzz) {
        int b = dzz.c.b();
        eaf eaf = dzz.c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("version_code", Long.valueOf(this.b));
        contentValues.put("account", Integer.valueOf(b));
        contentValues.put("queue_name", eaf.a());
        contentValues.put("server_request", dzz.h());
        contentValues.put("creation_time", Long.valueOf(dzz.b));
        contentValues.put("fail_count", Integer.valueOf(eaf.c()));
        contentValues.put("server_fail_count", Integer.valueOf(eaf.d()));
        contentValues.put("server_target_retry", Long.valueOf(eaf.b));
        try {
            dzz.a = this.c.insert("requests", null, contentValues);
            if (a) {
                new StringBuilder(34).append("Wrote request ").append(dzz.a);
            }
            return dzz.a;
        } catch (Throwable e) {
            glk.d("Babel_RequestWriter", "caught constraint exception ", e);
            return 0;
        }
    }

    public void a(long j) {
        a("requests", j);
    }

    public void a(dzz dzz) {
        ContentValues contentValues = new ContentValues();
        eaf eaf = dzz.c;
        contentValues.put("fail_count", Integer.valueOf(eaf.c()));
        contentValues.put("server_fail_count", Integer.valueOf(eaf.d()));
        contentValues.put("server_target_retry", Long.valueOf(eaf.b));
        long j = dzz.a;
        this.c.update("requests", contentValues, "_id=?", new String[]{String.valueOf(j)});
    }

    public long a(evz evz) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("version_code", Long.valueOf(this.b));
        contentValues.put("creation_time", Long.valueOf(glj.a()));
        contentValues.put("server_response", evz.f());
        long insert = this.c.insert("responses", null, contentValues);
        iil.b("Database insert failed", Long.valueOf(insert), Integer.valueOf(-1));
        return insert;
    }

    public evz c(long j) {
        evz evz = null;
        Cursor query = this.c.query("responses", fog.a, "_id = ?", new String[]{Long.toString(j)}, evz, evz, evz);
        try {
            boolean z;
            int count = query.getCount();
            iil.b("Did not find row for row id " + j, count == 0);
            String str = "Found " + count + " rows for row id " + j;
            if (count > 1) {
                z = true;
            } else {
                z = false;
            }
            iil.b(str, z);
            if (a) {
                new StringBuilder(37).append("Getting response ").append(j);
            }
            query.moveToNext();
            if (((long) query.getInt(1)) != this.b) {
                d(j);
            } else {
                evz = foh.b(query.getBlob(3));
                query.close();
            }
            return evz;
        } finally {
            query.close();
        }
    }

    public void d(long j) {
        a("responses", j);
    }

    private void a(String str, long j) {
        if (a) {
            new StringBuilder(String.valueOf(str).length() + 39).append("Deleting row ").append(j).append(" from ").append(str);
        }
        int delete = this.c.delete(str, "_id=?", new String[]{Long.toString(j)});
        if (delete != 1) {
            glk.d("Babel_RequestWriter", "Expected to delete 1 row but deleted " + delete + " rows.", new Object[0]);
        }
    }
}
