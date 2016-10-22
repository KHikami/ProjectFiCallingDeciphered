package defpackage;

import android.content.Context;

/* renamed from: epz */
public final class epz {
    public static final String a;
    private static epy b;

    static {
        a = eps.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new epy();
        }
        jyn.a(eps.class, new eps(context));
    }
}
