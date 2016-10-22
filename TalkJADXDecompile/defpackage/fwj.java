package defpackage;

import android.content.Context;

/* renamed from: fwj */
public final class fwj {
    public static final String a;
    public static final String b;
    public static final String c;
    private static fwi d;

    static {
        a = fwh.class.getName();
        b = bcp.class.getName();
        c = cxd.class.getName();
    }

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
