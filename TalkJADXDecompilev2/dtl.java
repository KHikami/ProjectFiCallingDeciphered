package defpackage;

import android.content.Context;

public final class dtl {
    public static final String a = dti.class.getName();
    private static dtk b;

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new dtk();
        }
        jyn.a(dti.class, new dtn(context));
    }
}
