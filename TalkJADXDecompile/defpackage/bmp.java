package defpackage;

import android.content.Context;

/* renamed from: bmp */
public final class bmp {
    public static final String a;
    private static bmn b;

    static {
        a = bmq.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new bmn();
        }
        jyn.a(bmq.class, b.a());
    }
}
