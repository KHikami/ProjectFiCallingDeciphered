package defpackage;

import android.content.Context;

/* renamed from: fzt */
public final class fzt {
    public static final String a;
    public static final String b;
    public static final String c;
    private static fzs d;

    static {
        a = dpo.class.getName();
        b = fzw.class.getName();
        c = fzu.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new fzs();
        }
        jyn.a(dpo.class, (dpo) jyn.a(context, fzu.class));
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new fzs();
        }
        jyn.a(fzw.class, (fzw) jyn.a(context, fzu.class));
    }

    public static void c(Context context, jyn jyn) {
        if (d == null) {
            d = new fzs();
        }
        jyn.a(fzu.class, new fzu(context));
    }
}
