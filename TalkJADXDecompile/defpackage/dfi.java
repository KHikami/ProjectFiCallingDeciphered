package defpackage;

import android.content.Context;

/* renamed from: dfi */
public final class dfi {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private static dfh e;

    static {
        a = jze.class.getName();
        b = amu.class.getName();
        c = dey.class.getName();
        d = dex.class.getName();
    }

    public static void a(jyn jyn) {
        if (e == null) {
            e = new dfh();
        }
        jyn.a(jze.class, new dfg());
    }

    public static void a(Context context, jyn jyn) {
        if (e == null) {
            e = new dfh();
        }
        jyn.a(amu.class, ami.b(context));
    }

    public static void b(Context context, jyn jyn) {
        if (e == null) {
            e = new dfh();
        }
        jyn.a(dey.class, new dfj(context));
    }

    public static void c(Context context, jyn jyn) {
        if (e == null) {
            e = new dfh();
        }
        jyn.a(dex.class, new dfd(context));
    }
}
