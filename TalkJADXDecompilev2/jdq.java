package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

public final class jdq {
    private static final kad a = new kad(".login.accountsource");

    public static jcf a(Context context) {
        return new jcx(context);
    }

    public static jcr b(Context context) {
        return new jds(context);
    }

    public static jcq[] a(Context context, ics ics) {
        if (VERSION.SDK_INT >= 23) {
            return new jcq[]{new jdw(ics)};
        }
        return new jcq[]{new jdx(context)};
    }

    static jcv a(jcf jcf) {
        return new jcv(jcf);
    }

    public static jzz[] a(jcv jcv) {
        kad kad = jzz.a;
        return new jzz[0];
    }

    public static jin[] b(jcv jcv) {
        kad kad = jin.a;
        return new jin[0];
    }
}
