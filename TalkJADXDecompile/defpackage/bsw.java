package defpackage;

import android.content.Context;

/* renamed from: bsw */
public final class bsw {
    public static final String a;
    public static final String b;
    private static bsv c;

    static {
        a = jze.class.getName();
        b = jzr.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new bsv();
        }
        jyn.a(jze.class, new bsz());
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new bsv();
        }
        jyn.a(jzr.class, new bsz());
    }
}
