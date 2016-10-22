package defpackage;

import android.content.Context;

/* renamed from: brn */
public final class brn {
    public static final String a;
    public static final String b;
    private static brm c;

    static {
        a = jze.class.getName();
        b = jzr.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new brm();
        }
        jyn.a(jze.class, new brq());
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new brm();
        }
        jyn.a(jzr.class, new brq());
    }
}
