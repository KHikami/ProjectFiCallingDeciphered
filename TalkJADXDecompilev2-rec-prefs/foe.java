package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public class foe extends SQLiteOpenHelper implements eah {
    private static final boolean f13560a = false;
    private final long f13561b;
    private SQLiteDatabase f13562c = getWritableDatabase();

    static {
        kae kae = glk.f15569p;
    }

    public static foe m15782a(Context context) {
        return (foe) jyn.m25426a(context, foe.class);
    }

    foe(Context context) {
        super(context, "message_store.db", null, 60);
        this.f13561b = ((gmp) jyn.m25426a(context, gmp.class)).mo2301d();
        glk.m17970a("Babel_RequestWriter", "RequestWriterDatabase init", new Object[0]);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        ba.m4552a(sQLiteDatabase);
        bc.m4802a(sQLiteDatabase);
    }

    private static void m15783a(SQLiteDatabase sQLiteDatabase) {
        gwb.m1759a(sQLiteDatabase);
        ba.m4603b(sQLiteDatabase);
        bc.m4822b(sQLiteDatabase);
        ba.m4552a(sQLiteDatabase);
        bc.m4802a(sQLiteDatabase);
        gwb.m2176e(0, 0);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 60) {
            foe.m15783a(sQLiteDatabase);
            RealTimeChatService.m9085c();
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        foe.m15783a(sQLiteDatabase);
        RealTimeChatService.m9085c();
    }

    void m15789a(fny fny) {
        List arrayList = new ArrayList();
        if (m15785a(null, arrayList)) {
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                dzz dzz = (dzz) obj;
                if (fde.m15018e(dzz.f10976c.m13268b()) == null) {
                    new StringBuilder(51).append("Ignoring message restore for account id ").append(dzz.f10976c.m13268b());
                } else {
                    fny.mo1187a(dzz);
                }
            }
            return;
        }
        int delete = this.f13562c.delete("requests", "1", null);
        if (delete == 0) {
            glk.m17982e("Babel_RequestWriter", "Dropped 0 pending request(s)", new Object[0]);
            return;
        }
        glk.m17981d("Babel_RequestWriter", "Dropped " + delete + " pending request(s)", new Object[0]);
        gwb.m1823a(null, 1982);
        RealTimeChatService.m9085c();
    }

    public dzz m15791b(long j) {
        List arrayList = new ArrayList();
        if (!m15785a(new String[]{Long.toString(j)}, arrayList) || arrayList.size() <= 0) {
            return null;
        }
        return (dzz) arrayList.get(0);
    }

    private boolean m15785a(String[] strArr, List<dzz> list) {
        Cursor query = this.f13562c.query("requests", fof.f13563a, strArr == null ? null : "_id = ?", strArr, null, null, "creation_time ASC");
        if (f13560a) {
            new StringBuilder(29).append("Decoding ").append(query.getCount()).append(" messages");
        }
        while (query.moveToNext()) {
            long j = query.getLong(1);
            if (j < this.f13561b) {
                glk.m17981d("Babel_RequestWriter", "Dropping all pending request(s) due to apk upgrade from " + j + " => " + this.f13561b, new Object[0]);
                return false;
            }
            try {
                long j2 = query.getLong(0);
                if (f13560a) {
                    new StringBuilder(33).append("Decoding row ").append(j2);
                }
                ead a = foh.m15794a(query.getBlob(4));
                if (a == null) {
                    glk.m17981d("Babel_RequestWriter", "Decode row " + j2 + " with empty network request", new Object[0]);
                } else {
                    dzz dzz = new dzz(j2, query.getString(2), query.getInt(3), query.getInt(5), query.getInt(6), query.getLong(7), a);
                    if (f13560a) {
                        String valueOf = String.valueOf(dzz);
                        new StringBuilder(String.valueOf(valueOf).length() + 25).append("Restoring ServerRequest: ").append(valueOf);
                    }
                    list.add(dzz);
                }
            } catch (Throwable e) {
                glk.m17980d("Babel_RequestWriter", "Failed to decode pending requests", e);
                return false;
            } finally {
                query.close();
            }
        }
        query.close();
        return true;
    }

    public long m15790b(dzz dzz) {
        int b = dzz.f10976c.m13268b();
        eaf eaf = dzz.f10976c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("version_code", Long.valueOf(this.f13561b));
        contentValues.put("account", Integer.valueOf(b));
        contentValues.put("queue_name", eaf.m13266a());
        contentValues.put("server_request", dzz.m13261h());
        contentValues.put("creation_time", Long.valueOf(dzz.f10975b));
        contentValues.put("fail_count", Integer.valueOf(eaf.m13269c()));
        contentValues.put("server_fail_count", Integer.valueOf(eaf.m13270d()));
        contentValues.put("server_target_retry", Long.valueOf(eaf.f10987b));
        try {
            dzz.f10974a = this.f13562c.insert("requests", null, contentValues);
            if (f13560a) {
                new StringBuilder(34).append("Wrote request ").append(dzz.f10974a);
            }
            return dzz.f10974a;
        } catch (Throwable e) {
            glk.m17980d("Babel_RequestWriter", "caught constraint exception ", e);
            return 0;
        }
    }

    public void mo2050a(long j) {
        m15784a("requests", j);
    }

    public void mo2051a(dzz dzz) {
        ContentValues contentValues = new ContentValues();
        eaf eaf = dzz.f10976c;
        contentValues.put("fail_count", Integer.valueOf(eaf.m13269c()));
        contentValues.put("server_fail_count", Integer.valueOf(eaf.m13270d()));
        contentValues.put("server_target_retry", Long.valueOf(eaf.f10987b));
        long j = dzz.f10974a;
        this.f13562c.update("requests", contentValues, "_id=?", new String[]{String.valueOf(j)});
    }

    public long m15786a(evz evz) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("version_code", Long.valueOf(this.f13561b));
        contentValues.put("creation_time", Long.valueOf(glj.m17956a()));
        contentValues.put("server_response", evz.m8133f());
        long insert = this.f13562c.insert("responses", null, contentValues);
        iil.m21878b("Database insert failed", Long.valueOf(insert), Integer.valueOf(-1));
        return insert;
    }

    public evz m15792c(long j) {
        evz evz = null;
        Cursor query = this.f13562c.query("responses", fog.f13564a, "_id = ?", new String[]{Long.toString(j)}, evz, evz, evz);
        try {
            boolean z;
            int count = query.getCount();
            iil.m21879b("Did not find row for row id " + j, count == 0);
            String str = "Found " + count + " rows for row id " + j;
            if (count > 1) {
                z = true;
            } else {
                z = false;
            }
            iil.m21879b(str, z);
            if (f13560a) {
                new StringBuilder(37).append("Getting response ").append(j);
            }
            query.moveToNext();
            if (((long) query.getInt(1)) != this.f13561b) {
                m15793d(j);
            } else {
                evz = foh.m15798b(query.getBlob(3));
                query.close();
            }
            return evz;
        } finally {
            query.close();
        }
    }

    public void m15793d(long j) {
        m15784a("responses", j);
    }

    private void m15784a(String str, long j) {
        if (f13560a) {
            new StringBuilder(String.valueOf(str).length() + 39).append("Deleting row ").append(j).append(" from ").append(str);
        }
        int delete = this.f13562c.delete(str, "_id=?", new String[]{Long.toString(j)});
        if (delete != 1) {
            glk.m17981d("Babel_RequestWriter", "Expected to delete 1 row but deleted " + delete + " rows.", new Object[0]);
        }
    }
}
