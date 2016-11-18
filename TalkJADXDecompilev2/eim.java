package defpackage;

import android.content.Context;

public final class eim {
    public static final String a = jze.class.getName();
    public static final String b = ehz.class.getName();
    public static final String c = jzr.class.getName();
    private static eil d;

    public static void a(jyn jyn) {
        if (d == null) {
            d = new eil();
        }
        jyn.a(jze.class, new eik());
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new eil();
        }
        jyn.a(ehz.class, new eig(context));
    }

    public static void b(jyn jyn) {
        if (d == null) {
            d = new eil();
        }
        jyn.a(jzr.class, new eik());
    }
}
