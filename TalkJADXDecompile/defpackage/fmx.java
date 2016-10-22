package defpackage;

import android.content.Context;

/* renamed from: fmx */
public final class fmx {
    public static final String a;
    public static final String b;
    private static fmu c;

    static {
        a = emw.class.getName();
        b = fmk.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new fmu();
        }
        jyn.a(emw.class, c.a());
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new fmu();
        }
        jyn.a(fmk.class, new fmt());
    }
}
