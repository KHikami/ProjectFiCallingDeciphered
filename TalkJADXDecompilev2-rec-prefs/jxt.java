package p000;

import android.content.Context;

public final class jxt {
    public static final String f21259a = jxp.class.getName();
    public static final String f21260b = jxq.class.getName();
    private static jxs f21261c;

    public static void m25393a(Context context, jyn jyn) {
        if (f21261c == null) {
            f21261c = new jxs();
        }
        jyn.m25444a(jxp.class, new jxp(context));
    }

    public static void m25394a(jyn jyn) {
        if (f21261c == null) {
            f21261c = new jxs();
        }
        jyn.m25444a(jxq.class, new jxq());
    }
}
