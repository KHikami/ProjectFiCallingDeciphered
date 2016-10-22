package defpackage;

import android.content.Context;

/* renamed from: igv */
public final class igv {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    private static igu h;

    static {
        a = ifw.class.getName();
        b = igg.class.getName();
        c = ifz.class.getName();
        d = igb.class.getName();
        e = ige.class.getName();
        f = ifx.class.getName();
        g = igc.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (h == null) {
            h = new igu();
        }
        jyn.a(ifw.class, new igm(context));
    }

    public static void a(jyn jyn) {
        if (h == null) {
            h = new igu();
        }
        jyn.a(igg.class, new igs());
    }

    public static void b(jyn jyn) {
        if (h == null) {
            h = new igu();
        }
        jyn.a(ifz.class, new ign());
    }

    public static void b(Context context, jyn jyn) {
        if (h == null) {
            h = new igu();
        }
        jyn.a(igb.class, new igk(context, (byte) 0));
    }

    public static void c(jyn jyn) {
        if (h == null) {
            h = new igu();
        }
        jyn.a(ige.class, new igq());
    }

    public static void c(Context context, jyn jyn) {
        if (h == null) {
            h = new igu();
        }
        jyn.a(ifx.class, new igj(context));
    }

    public static void d(Context context, jyn jyn) {
        if (h == null) {
            h = new igu();
        }
        jyn.a(igc.class, new igl(context));
    }
}
