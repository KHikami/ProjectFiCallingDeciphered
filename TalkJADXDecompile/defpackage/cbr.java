package defpackage;

import android.content.Context;

/* renamed from: cbr */
public final class cbr {
    public static final String a;
    public static final String b;
    public static final String c;
    private static cbq d;

    static {
        a = jze.class.getName();
        b = jzr.class.getName();
        c = cbk.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new cbq();
        }
        jyn.a(jze.class, new cbp());
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new cbq();
        }
        jyn.a(jzr.class, new cbp());
    }

    public static void c(Context context, jyn jyn) {
        if (d == null) {
            d = new cbq();
        }
        jyn.a(cbk.class, new cbs(context));
    }
}
