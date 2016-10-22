package defpackage;

import android.content.Context;

/* renamed from: dvg */
public final class dvg {
    public static final String a;
    public static final String b;
    private static dvf c;

    static {
        a = dut.class.getName();
        b = bte.class.getName();
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new dvf();
        }
        jyn.a(dut.class, new dvd());
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new dvf();
        }
        jyn.a(bte.class, new duz());
    }
}
