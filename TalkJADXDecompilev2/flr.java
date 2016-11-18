package defpackage;

import android.content.Context;

public final class flr {
    public static final String a = flo.class.getName();
    public static final String b = ghz.class.getName();
    private static flq c;

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new flq();
        }
        jyn.a(flo.class, new flp(context));
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new flq();
        }
        jyn.a(ghz.class, (flp) jyn.a(context, flo.class));
    }
}
