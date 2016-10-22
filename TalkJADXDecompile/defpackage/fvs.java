package defpackage;

import android.content.Context;

/* renamed from: fvs */
public final class fvs {
    public static final String a;
    public static final String b;
    public static final String c;
    private static fvr d;

    static {
        a = fvv.class.getName();
        b = fuz.class.getName();
        c = ful.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new fvr();
        }
        jyn.a(fvv.class, new fvv(context));
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new fvr();
        }
        jyn.a(fuz.class, new fuz(context));
    }

    public static void c(Context context, jyn jyn) {
        if (d == null) {
            d = new fvr();
        }
        jyn.a(ful.class, new ful(context));
    }
}
