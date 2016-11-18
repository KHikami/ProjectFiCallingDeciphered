package p000;

import android.content.Context;

public final class gba {
    public static final String f14577a = gav.class.getName();
    public static final String f14578b = dyy.class.getName();
    private static gaz f14579c;

    public static void m16837a(Context context, jyn jyn) {
        if (f14579c == null) {
            f14579c = new gaz();
        }
        jyn.m25444a(gav.class, new gbb());
    }

    public static void m16838b(Context context, jyn jyn) {
        if (f14579c == null) {
            f14579c = new gaz();
        }
        jyn.m25445a(dyy.class, new gbo(context));
    }
}
