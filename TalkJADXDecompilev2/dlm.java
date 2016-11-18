package defpackage;

import android.content.Context;

public final class dlm {
    public static final String a = dlj.class.getName();
    public static final String b = dlh.class.getName();
    public static final String c = cxd.class.getName();
    private static dll d;

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new dll();
        }
        jyn.a(dlj.class, new dln());
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new dll();
        }
        jyn.a(dlh.class, d.a(context));
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new dll();
        }
        jyn.a(cxd.class, d.a());
    }
}
