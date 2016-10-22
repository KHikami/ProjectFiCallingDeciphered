package defpackage;

import android.content.Context;

/* renamed from: fbm */
public final class fbm {
    public static final String a;
    public static final String b;
    private static fbl c;

    static {
        a = fbo.class.getName();
        b = fbn.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new fbl();
        }
        jyn.a(fbo.class, new fbo(context));
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new fbl();
        }
        jyn.a(fbn.class, new fbn(context));
    }
}
