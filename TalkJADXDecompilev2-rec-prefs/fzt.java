package p000;

import android.content.Context;

public final class fzt {
    public static final String f14505a = dpo.class.getName();
    public static final String f14506b = fzw.class.getName();
    public static final String f14507c = fzu.class.getName();
    private static fzs f14508d;

    public static void m16727a(Context context, jyn jyn) {
        if (f14508d == null) {
            f14508d = new fzs();
        }
        jyn.m25445a(dpo.class, (dpo) jyn.m25426a(context, fzu.class));
    }

    public static void m16728b(Context context, jyn jyn) {
        if (f14508d == null) {
            f14508d = new fzs();
        }
        jyn.m25444a(fzw.class, (fzw) jyn.m25426a(context, fzu.class));
    }

    public static void m16729c(Context context, jyn jyn) {
        if (f14508d == null) {
            f14508d = new fzs();
        }
        jyn.m25444a(fzu.class, new fzu(context));
    }
}
