package defpackage;

import android.content.Context;

public final class fwj {
    public static final String a = fwh.class.getName();
    public static final String b = bcp.class.getName();
    public static final String c = cxd.class.getName();
    private static fwi d;

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new fwi();
        }
        jyn.a(fwh.class, d.a(context));
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new fwi();
        }
        jyn.a(bcp.class, d.b(context));
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new fwi();
        }
        jyn.a(cxd.class, d.a());
    }
}
