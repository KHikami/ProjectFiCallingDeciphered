package defpackage;

import android.content.Context;

/* renamed from: bjv */
public final class bjv {
    public static final String a;
    private static bju b;

    static {
        a = bjs.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new bju();
        }
        jyn.a(bjs.class, new bjs(context));
    }
}
