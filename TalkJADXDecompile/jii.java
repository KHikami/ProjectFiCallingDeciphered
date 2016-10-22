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
    private static final jig a;
    public static final kad d;
    private final List<jia> b;
    private boolean c;
    private final Context e;
    private final int f;
    private final String g;
    private final jxp h;

    static {
        d = new kad("debug.social.database");
        a = jig.a;
    }

    public jii(Context context, String str, int i, CursorFactory cursorFactory, int i2) {
        String str2;
        String str3 = null;
        Context applicationContext = context.getApplicationContext();
        if (str == null) {
            str2 = null;
        } else {
            str2 = kdq.a(kdq.a().append(str).append(i).append(".db"));
        }
        super(applicationContext, str2, null, 1);
        jcf jcf = (jcf) jyn.a(context, jcf.class);
        this.e = context;
        this.f = i;
        this.b = jyn.c(context, jia.class);
        this.h = (jxp) jyn.b(context, jxp.class);
        if (jcf.c(i)) {
            str3 = jcf.a(i).b("account_name");
        }
        this.g = str3;
        List list = this.b;
    }

    protected String a() {
        return "Database Upgrade Failures";
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            if (d(sQLiteDatabase)) {
                b(sQLiteDatabase);
            }
        } catch (Throwable e) {
            Log.e("PartitionedDatabase", "Failed to init database partitions", e);
            a(sQLiteDatabase);
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
        }
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
        jib.a(sQLiteDatabase);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase, a, 0);
        for (jia a : this.b) {
            a(sQLiteDatabase, a, 0);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        b();
        return super.getReadableDatabase();
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        b();
        return super.getWritableDatabase();
    }

    private void b() {
        if (this.c) {
            throw new jij("Database deleted. Account: " + this.f);
        }
    }

    protected void a(SQLiteDatabase sQLiteDatabase) {
        jib.b(sQLiteDatabase);
        jib.c(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    private boolean a(SQLiteDatabase sQLiteDatabase, jia jia, int i) {
        if (i == 1) {
            return false;
        }
        if (i == 0) {
            jia.a(sQLiteDatabase);
        } else if (i > 1) {
            a(sQLiteDatabase, jia);
        } else {
            try {
                if (!jia.a(i, 1)) {
                    a(sQLiteDatabase, jia);
                }
            } catch (Throwable e) {
                Throwable th = e;
                new jxx(this.g, jia.a(), i, 1, i).a(this.e);
                if (this.h != null) {
                    this.h.a(th, a());
                }
                String valueOf = String.valueOf(jia.a());
                Log.e("PartitionedDatabase", new StringBuilder(String.valueOf(valueOf).length() + 57).append("Failed to upgrade partition: ").append(valueOf).append(" ").append(i).append(" --> 1").toString(), th);
                a(sQLiteDatabase, jia);
            }
        }
        a.a(sQLiteDatabase, jia);
        return true;
    }

    protected void b(SQLiteDatabase sQLiteDatabase) {
        jib.c(sQLiteDatabase);
        c(sQLiteDatabase);
    }

    protected void c(SQLiteDatabase sQLiteDatabase) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase, jia jia) {
        if (Log.isLoggable("PartitionedDatabase", 4)) {
            String str = "Rebuilding partition: ";
            String valueOf = String.valueOf(jia.a());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        a(sQLiteDatabase, jia.a());
        jia.a(sQLiteDatabase);
    }

    private static void a(SQLiteDatabase sQLiteDatabase, String str) {
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
        String[] b = jig.b(sQLiteDatabase, str);
        jib.a(sQLiteDatabase, b);
        String[] c = jig.c(sQLiteDatabase, str);
        jib.b(sQLiteDatabase, c);
        a.a(sQLiteDatabase, str);
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

    protected boolean d(SQLiteDatabase sQLiteDatabase) {
        boolean z;
        Map b = jig.b(sQLiteDatabase);
        if (a(sQLiteDatabase, a, gwb.a((Integer) b.get(a.a())))) {
            b = jig.b(sQLiteDatabase);
            z = true;
        } else {
            z = false;
        }
        b.remove(a.a());
        if (Log.isLoggable("PartitionedDatabase", 4)) {
            int size = this.b.size();
            new StringBuilder(70).append("Partitions in Binder: ").append(size).append(", Partitions in database: ").append(b.size());
        }
        boolean z2 = z;
        for (jia jia : this.b) {
            z2 = a(sQLiteDatabase, jia, gwb.a((Integer) b.remove(jia.a()))) | z2;
        }
        for (String a : b.keySet()) {
            a(sQLiteDatabase, a);
        }
        if (b.isEmpty()) {
            return z2;
        }
        return true;
    }
}
