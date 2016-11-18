package p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class gti {
    public static final gue f16099a = new gue((byte) 0);
    public static final guc<hdo, Object> f16100b = new gtj();
    public static final gtz<Object> f16101c = new gtz("ClearcutLogger.API", f16100b, f16099a);
    public static final gtm f16102d = new hdc();
    private final Context f16103e;
    private final String f16104f;
    private final int f16105g;
    private String f16106h;
    private int f16107i;
    private String f16108j;
    private String f16109k;
    private final boolean f16110l;
    private int f16111m;
    private final gtm f16112n;
    private final gxs f16113o;
    private final gth f16114p;
    private gtl f16115q;

    private gti(Context context, int i, String str, String str2, String str3, boolean z, gtm gtm, gxs gxs, gtl gtl, gth gth) {
        this.f16107i = -1;
        this.f16111m = 0;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f16103e = applicationContext;
        this.f16104f = context.getPackageName();
        this.f16105g = gti.m18511a(context);
        this.f16107i = -1;
        this.f16106h = str;
        this.f16108j = str2;
        this.f16109k = str3;
        this.f16110l = false;
        this.f16112n = gtm;
        this.f16113o = gxs;
        this.f16115q = new gtl();
        this.f16114p = gth;
        this.f16111m = 0;
        if (this.f16110l) {
            gwb.m2048b(this.f16108j == null, (Object) "can't be anonymous with an upload account");
        }
    }

    public gti(Context context, String str, String str2) {
        this(context, -1, str, str2, null, false, f16102d, gxu.m18926c(), null, gth.f16098b);
    }

    @Deprecated
    public gti(Context context, String str, String str2, String str3) {
        this(context, -1, str, str2, null, false, f16102d, gxu.m18926c(), null, gth.f16098b);
    }

    private static int m18511a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return i;
        }
    }

    public gtk m18526a(byte[] bArr) {
        return new gtk(this, bArr);
    }

    public void m18527a(gui gui) {
        this.f16112n.mo2461a(gui);
    }

    public boolean m18528a(gui gui, long j, TimeUnit timeUnit) {
        return this.f16112n.mo2462a(j, timeUnit);
    }

    static /* synthetic */ int[] m18513a(ArrayList arrayList) {
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
