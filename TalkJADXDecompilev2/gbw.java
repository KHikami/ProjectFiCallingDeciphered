package defpackage;

import android.content.Context;

public final class gbw {
    public static final String a = jnh.class.getName();
    public static final String b = gbu.class.getName();
    private static gbv c;

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new gbv();
        }
        jyn.a(jnh.class, (jnh) jyn.a(context, gbu.class));
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new gbv();
        }
        jyn.a(gbu.class, new gbu(context));
    }
}
