import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class gti {
    public static final gue a;
    public static final guc<hdo, Object> b;
    public static final gtz<Object> c;
    public static final gtm d;
    private final Context e;
    private final String f;
    private final int g;
    private String h;
    private int i;
    private String j;
    private String k;
    private final boolean l;
    private int m;
    private final gtm n;
    private final gxs o;
    private final gth p;
    private gtl q;

    static {
        a = new gue((byte) 0);
        b = new gtj();
        c = new gtz("ClearcutLogger.API", b, a);
        d = new hdc();
    }

    private gti(Context context, int i, String str, String str2, String str3, boolean z, gtm gtm, gxs gxs, gtl gtl, gth gth) {
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
        this.n = gtm;
        this.o = gxs;
        this.q = new gtl();
        this.p = gth;
        this.m = 0;
        if (this.l) {
            gwb.b(this.j == null, (Object) "can't be anonymous with an upload account");
        }
    }

    public gti(Context context, String str, String str2) {
        this(context, -1, str, str2, null, false, d, gxu.c(), null, gth.b);
    }

    @Deprecated
    public gti(Context context, String str, String str2, String str3) {
        this(context, -1, str, str2, null, false, d, gxu.c(), null, gth.b);
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

    public gtk a(byte[] bArr) {
        return new gtk(this, bArr);
    }

    public void a(gui gui) {
        this.n.a(gui);
    }

    public boolean a(gui gui, long j, TimeUnit timeUnit) {
        return this.n.a(j, timeUnit);
    }

    static /* synthetic */ int[] a(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int intValue = ((Integer) obj).intValue();
            int i3 = i2 + 1;
            iArr[i2] = intValue;
            i2 = i3;
        }
        return iArr;
    }
}
