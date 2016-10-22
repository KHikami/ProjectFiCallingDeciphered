package defpackage;

import android.content.Context;

/* renamed from: bsp */
public final class bsp {
    public static final String a;
    public static final String b;
    private static bso c;

    static {
        a = jze.class.getName();
        b = jzr.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new bso();
        }
        jyn.a(jze.class, new bss());
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new bso();
        }
        jyn.a(jzr.class, new bss());
    }
}
