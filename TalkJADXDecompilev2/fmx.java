package defpackage;

import android.content.Context;

public final class fmx {
    public static final String a = emw.class.getName();
    public static final String b = fmk.class.getName();
    private static fmu c;

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
