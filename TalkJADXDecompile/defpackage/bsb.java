package defpackage;

import android.content.Context;

/* renamed from: bsb */
public final class bsb {
    public static final String a;
    public static final String b;
    private static bsa c;

    static {
        a = jze.class.getName();
        b = jzr.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new bsa();
        }
        jyn.a(jze.class, new bse());
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new bsa();
        }
        jyn.a(jzr.class, new bse());
    }
}
