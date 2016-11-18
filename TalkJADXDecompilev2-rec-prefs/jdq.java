package p000;

import android.content.Context;
import android.os.Build.VERSION;

public final class jdq {
    private static final kad f19904a = new kad(".login.accountsource");

    public static jcf m23996a(Context context) {
        return new jcx(context);
    }

    public static jcr m24000b(Context context) {
        return new jds(context);
    }

    public static jcq[] m23998a(Context context, ics ics) {
        if (VERSION.SDK_INT >= 23) {
            return new jcq[]{new jdw(ics)};
        }
        return new jcq[]{new jdx(context)};
    }

    static jcv m23997a(jcf jcf) {
        return new jcv(jcf);
    }

    public static jzz[] m23999a(jcv jcv) {
        kad kad = jzz.f19869a;
        return new jzz[0];
    }

    public static jin[] m24001b(jcv jcv) {
        kad kad = jin.f19868a;
        return new jin[0];
    }
}
