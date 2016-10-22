package defpackage;

import android.content.Context;

/* renamed from: dtl */
public final class dtl {
    public static final String a;
    private static dtk b;

    static {
        a = dti.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new dtk();
        }
        jyn.a(dti.class, new dtn(context));
    }
}
