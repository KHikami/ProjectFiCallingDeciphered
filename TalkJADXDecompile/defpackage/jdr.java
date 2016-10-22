package defpackage;

import android.content.Context;

/* renamed from: jdr */
public final class jdr {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    private static jdq g;

    static {
        a = jcv.class.getName();
        b = jcq.class.getName();
        c = jcf.class.getName();
        d = jcr.class.getName();
        e = jin.class.getName();
        f = jzz.class.getName();
    }

    public static void a(jyn jyn) {
        if (g == null) {
            g = new jdq();
        }
        jyn.a(jcv.class, jdq.a((jcf) jyn.a(jcf.class)));
    }

    public static void a(Context context, jyn jyn) {
        if (g == null) {
            g = new jdq();
        }
        jyn.a(jcq.class, jdq.a(context, (ics) jyn.a(ics.class)));
    }

    public static void b(Context context, jyn jyn) {
        if (g == null) {
            g = new jdq();
        }
        jyn.a(jcf.class, jdq.a(context));
    }

    public static void c(Context context, jyn jyn) {
        if (g == null) {
            g = new jdq();
        }
        jyn.a(jcr.class, jdq.b(context));
    }

    public static void b(jyn jyn) {
        if (g == null) {
            g = new jdq();
        }
        jyn.a(jin.class, jdq.b((jcv) jyn.a(jcv.class)));
    }

    public static void c(jyn jyn) {
        if (g == null) {
            g = new jdq();
        }
        jyn.a(jzz.class, jdq.a((jcv) jyn.a(jcv.class)));
    }
}
