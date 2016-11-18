package p000;

import android.content.Context;

public final class gbw {
    public static final String f14628a = jnh.class.getName();
    public static final String f14629b = gbu.class.getName();
    private static gbv f14630c;

    public static void m16875a(Context context, jyn jyn) {
        if (f14630c == null) {
            f14630c = new gbv();
        }
        jyn.m25445a(jnh.class, (jnh) jyn.m25426a(context, gbu.class));
    }

    public static void m16876b(Context context, jyn jyn) {
        if (f14630c == null) {
            f14630c = new gbv();
        }
        jyn.m25444a(gbu.class, new gbu(context));
    }
}
