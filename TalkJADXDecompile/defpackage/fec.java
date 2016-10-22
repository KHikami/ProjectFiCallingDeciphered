package defpackage;

import android.content.Context;

/* renamed from: fec */
public final class fec {
    public static final String a;
    private static feb b;

    static {
        a = iih.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new feb();
        }
        jyn.a(iih.class, new fdm(context));
    }
}
