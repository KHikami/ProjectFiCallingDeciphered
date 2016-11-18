package defpackage;

import android.content.Context;

public final class dfi {
    public static final String a = jze.class.getName();
    public static final String b = amu.class.getName();
    public static final String c = dey.class.getName();
    public static final String d = dex.class.getName();
    private static dfh e;

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
