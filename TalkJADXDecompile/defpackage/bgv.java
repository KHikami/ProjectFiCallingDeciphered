package defpackage;

import android.content.Context;

/* renamed from: bgv */
public final class bgv {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private static bgu e;

    static {
        a = bgr.class.getName();
        b = bgs.class.getName();
        c = bgt.class.getName();
        d = cxd.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (e == null) {
            e = new bgu();
        }
        jyn.a(bgr.class, e.b(context));
    }

    public static void b(Context context, jyn jyn) {
        if (e == null) {
            e = new bgu();
        }
        jyn.a(bgs.class, e.a(context));
    }

    public static void c(Context context, jyn jyn) {
        if (e == null) {
            e = new bgu();
        }
        jyn.a(bgt.class, e.c(context));
    }

    public static void a(jyn jyn) {
        if (e == null) {
            e = new bgu();
        }
        jyn.a(cxd.class, e.a());
    }
}
