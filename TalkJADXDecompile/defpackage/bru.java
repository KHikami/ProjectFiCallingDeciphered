package defpackage;

import android.content.Context;

/* renamed from: bru */
public final class bru {
    public static final String a;
    public static final String b;
    private static brt c;

    static {
        a = jze.class.getName();
        b = jzr.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new brt();
        }
        jyn.a(jze.class, new brx());
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new brt();
        }
        jyn.a(jzr.class, new brx());
    }
}
