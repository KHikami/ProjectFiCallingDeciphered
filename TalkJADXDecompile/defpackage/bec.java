package defpackage;

import android.content.Context;

/* renamed from: bec */
public final class bec {
    public static final String a;
    private static beb b;

    static {
        a = bdm.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new beb();
        }
        jyn.a(bdm.class, new bee(context));
    }
}
