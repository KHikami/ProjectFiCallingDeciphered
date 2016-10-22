import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class bqg {
    public static final brb a;
    public static final bqy b;
    private static bqz c;
    private static bql d;
    private final Context e;
    private final String f;
    private final int g;
    private String h;
    private int i;
    private String j;
    private String k;
    private final boolean l;
    private int m;
    private final bql n;
    private final bwa o;
    private final bqf p;
    private bqk q;

    static {
        a = new brb();
        c = new bqh();
        b = new bqy("ClearcutLogger.API", c, a);
        d = new clo();
    }

    private bqg(Context context, int i, String str, String str2, String str3, boolean z, bql bql, bwa bwa, bqk bqk, bqf bqf) {
        this.i = -1;
        this.m = 0;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.e = applicationContext;
        this.f = context.getPackageName();
        this.g = a(context);
        this.i = -1;
        this.h = str;
        this.j = str2;
        this.k = str3;
        this.l = false;
        this.n = bql;
        this.o = bwa;
        this.q = new bqk();
        this.p = bqf;
        this.m = 0;
        if (this.l) {
            buf.b(this.j == null, (Object) "can't be anonymous with an upload account");
        }
    }

    @Deprecated
    public bqg(Context context, String str, String str2, String str3) {
        this(context, -1, str, str2, null, false, d, bwb.c(), null, bqf.b);
    }

    private static int a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return i;
        }
    }

    public final bqi a(bqj bqj) {
        return new bqi(this, bqj);
    }

    public final bqi a(byte[] bArr) {
        return new bqi(this, bArr);
    }

    static /* synthetic */ int[] a(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            iArr[i] = ((Integer) it.next()).intValue();
            i = i2;
        }
        return iArr;
    }
}
