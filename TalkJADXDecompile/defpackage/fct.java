package defpackage;

import android.content.Context;

/* renamed from: fct */
public final class fct {
    public static final String a;
    private static fcs b;

    static {
        a = fcn.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new fcs();
        }
        jyn.a(fcn.class, new fcu(context));
    }
}
