package p000;

import android.content.Context;

public final class eim {
    public static final String f11610a = jze.class.getName();
    public static final String f11611b = ehz.class.getName();
    public static final String f11612c = jzr.class.getName();
    private static eil f11613d;

    public static void m13983a(jyn jyn) {
        if (f11613d == null) {
            f11613d = new eil();
        }
        jyn.m25445a(jze.class, new eik());
    }

    public static void m13982a(Context context, jyn jyn) {
        if (f11613d == null) {
            f11613d = new eil();
        }
        jyn.m25444a(ehz.class, new eig(context));
    }

    public static void m13984b(jyn jyn) {
        if (f11613d == null) {
            f11613d = new eil();
        }
        jyn.m25445a(jzr.class, new eik());
    }
}
