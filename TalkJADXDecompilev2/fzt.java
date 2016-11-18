package defpackage;

import android.content.Context;

public final class fzt {
    public static final String a = dpo.class.getName();
    public static final String b = fzw.class.getName();
    public static final String c = fzu.class.getName();
    private static fzs d;

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
