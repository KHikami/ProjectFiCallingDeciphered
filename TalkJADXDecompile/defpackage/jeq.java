package defpackage;

import android.content.Context;

/* renamed from: jeq */
public final class jeq {
    public static final String a;
    public static final String b;
    public static final String c;
    private static jep d;

    static {
        a = jze.class.getName();
        b = jfk.class.getName();
        c = jzr.class.getName();
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new jep();
        }
        jyn.a(jze.class, new jfm(), new jff(), new jet(), new jen());
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new jep();
        }
        jyn.a(jfk.class, new jfk(context));
    }

    public static void b(jyn jyn) {
        if (d == null) {
            d = new jep();
        }
        jyn.a(jzr.class, new jeo(), new jfg());
    }
}
