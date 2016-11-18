package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class jii extends SQLiteOpenHelper {
    private static final jig f3151a = jig.f20131a;
    public static final kad f3152d = new kad("debug.social.database");
    private final List<jia> f3153b;
    private boolean f3154c;
    private final Context f3155e;
    private final int f3156f;
    private final String f3157g;
    private final jxp f3158h;

    public jii(Context context, String str, int i, CursorFactory cursorFactory, int i2) {
        String str2;
        String str3 = null;
        Context applicationContext = context.getApplicationContext();
        if (str == null) {
            str2 = null;
        } else {
            str2 = kdq.m25599a(kdq.m25600a().append(str).append(i).append(".db"));
        }
        super(applicationContext, str2, null, 1);
        jcf jcf = (jcf) jyn.m25426a(context, jcf.class);
        this.f3155e = context;
        this.f3156f = i;
        this.f3153b = jyn.m25438c(context, jia.class);
        this.f3158h = (jxp) jyn.m25433b(context, jxp.class);
        if (jcf.mo3467c(i)) {
            str3 = jcf.mo3456a(i).mo3440b("account_name");
        }
        this.f3157g = str3;
        List list = this.f3153b;
    }

    protected String m5020a() {
        return "Database Upgrade Failures";
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            if (m5024d(sQLiteDatabase)) {
                m5022b(sQLiteDatabase);
            }
        } catch (Throwable e) {
            Log.e("PartitionedDatabase", "Failed to init database partitions", e);
            m5021a(sQLiteDatabase);
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
        }
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
        jib.m24296a(sQLiteDatabase);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m5018a(sQLiteDatabase, f3151a, 0);
        for (jia a : this.f3153b) {
            m5018a(sQLiteDatabase, a, 0);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m5021a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        m5019b();
        return super.getReadableDatabase();
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        m5019b();
        return super.getWritableDatabase();
    }

    private void m5019b() {
        if (this.f3154c) {
            throw new jij("Database deleted. Account: " + this.f3156f);
        }
    }

    protected void m5021a(SQLiteDatabase sQLiteDatabase) {
        jib.m24300b(sQLiteDatabase);
        jib.m24302c(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    private boolean m5018a(SQLiteDatabase sQLiteDatabase, jia jia, int i) {
        if (i == 1) {
            return false;
        }
        if (i == 0) {
            jia.mo508a(sQLiteDatabase);
        } else if (i > 1) {
            m5017a(sQLiteDatabase, jia);
        } else {
            try {
                if (!jia.mo509a(i, 1)) {
                    m5017a(sQLiteDatabase, jia);
                }
            } catch (Throwable e) {
                Throwable th = e;
                new jxx(this.f3157g, jia.mo507a(), i, 1, i).m25400a(this.f3155e);
                if (this.f3158h != null) {
                    this.f3158h.m25392a(th, m5020a());
                }
                String valueOf = String.valueOf(jia.mo507a());
                Log.e("PartitionedDatabase", new StringBuilder(String.valueOf(valueOf).length() + 57).append("Failed to upgrade partition: ").append(valueOf).append(" ").append(i).append(" --> 1").toString(), th);
                m5017a(sQLiteDatabase, jia);
            }
        }
        f3151a.m24311a(sQLiteDatabase, jia);
        return true;
    }

    protected void m5022b(SQLiteDatabase sQLiteDatabase) {
        jib.m24302c(sQLiteDatabase);
        m5023c(sQLiteDatabase);
    }

    protected void m5023c(SQLiteDatabase sQLiteDatabase) {
        Iterator it = this.f3153b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void m5017a(SQLiteDatabase sQLiteDatabase, jia jia) {
        if (Log.isLoggable("PartitionedDatabase", 4)) {
            String str = "Rebuilding partition: ";
            String valueOf = String.valueOf(jia.mo507a());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        jii.m5016a(sQLiteDatabase, jia.mo507a());
        jia.mo508a(sQLiteDatabase);
    }

    private static void m5016a(SQLiteDatabase sQLiteDatabase, String str) {
        String str2;
        String valueOf;
        if (Log.isLoggable("PartitionedDatabase", 4)) {
            str2 = "Dropping partition: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        String[] b = jig.m24305b(sQLiteDatabase, str);
        jib.m24298a(sQLiteDatabase, b);
        String[] c = jig.m24307c(sQLiteDatabase, str);
        jib.m24301b(sQLiteDatabase, c);
        f3151a.m24310a(sQLiteDatabase, str);
        if (Log.isLoggable("PartitionedDatabase", 3)) {
            String str3 = "Dropped tables: ";
            str2 = String.valueOf(Arrays.toString(b));
            if (str2.length() != 0) {
                str3.concat(str2);
            } else {
                str2 = new String(str3);
            }
            str2 = "Dropped views: ";
            valueOf = String.valueOf(Arrays.toString(c));
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
    }

    protected boolean m5024d(SQLiteDatabase sQLiteDatabase) {
        boolean z;
        Map b = jig.m24303b(sQLiteDatabase);
        if (m5018a(sQLiteDatabase, f3151a, gwb.m1507a((Integer) b.get(f3151a.mo507a())))) {
            b = jig.m24303b(sQLiteDatabase);
            z = true;
        } else {
            z = false;
        }
        b.remove(f3151a.mo507a());
        if (Log.isLoggable("PartitionedDatabase", 4)) {
            int size = this.f3153b.size();
            new StringBuilder(70).append("Partitions in Binder: ").append(size).append(", Partitions in database: ").append(b.size());
        }
        boolean z2 = z;
        for (jia jia : this.f3153b) {
            z2 = m5018a(sQLiteDatabase, jia, gwb.m1507a((Integer) b.remove(jia.mo507a()))) | z2;
        }
        for (String a : b.keySet()) {
            jii.m5016a(sQLiteDatabase, a);
        }
        if (b.isEmpty()) {
            return z2;
        }
        return true;
    }
}
