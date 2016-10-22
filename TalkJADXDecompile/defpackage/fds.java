package defpackage;

import android.content.Context;

/* renamed from: fds */
public final class fds {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private static fdr e;

    static {
        a = bjr.class.getName();
        b = dpo.class.getName();
        c = ffw.class.getName();
        d = fdq.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (e == null) {
            e = new fdr();
        }
        jyn.a(bjr.class, (bjr) jyn.a(context, fdq.class));
    }

    public static void b(Context context, jyn jyn) {
        if (e == null) {
            e = new fdr();
        }
        jyn.a(dpo.class, (dpo) jyn.a(context, fdq.class));
    }

    public static void c(Context context, jyn jyn) {
        if (e == null) {
            e = new fdr();
        }
        jyn.a(ffw.class, (ffw) jyn.a(context, fdq.class));
    }

    public static void d(Context context, jyn jyn) {
        if (e == null) {
            e = new fdr();
        }
        jyn.a(fdq.class, new fdq(context));
    }
}
