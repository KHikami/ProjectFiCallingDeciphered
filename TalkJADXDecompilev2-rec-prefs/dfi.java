package p000;

import android.content.Context;

public final class dfi {
    public static final String f9604a = jze.class.getName();
    public static final String f9605b = amu.class.getName();
    public static final String f9606c = dey.class.getName();
    public static final String f9607d = dex.class.getName();
    private static dfh f9608e;

    public static void m11593a(jyn jyn) {
        if (f9608e == null) {
            f9608e = new dfh();
        }
        jyn.m25445a(jze.class, new dfg());
    }

    public static void m11592a(Context context, jyn jyn) {
        if (f9608e == null) {
            f9608e = new dfh();
        }
        jyn.m25444a(amu.class, ami.m2901b(context));
    }

    public static void m11594b(Context context, jyn jyn) {
        if (f9608e == null) {
            f9608e = new dfh();
        }
        jyn.m25444a(dey.class, new dfj(context));
    }

    public static void m11595c(Context context, jyn jyn) {
        if (f9608e == null) {
            f9608e = new dfh();
        }
        jyn.m25444a(dex.class, new dfd(context));
    }
}
