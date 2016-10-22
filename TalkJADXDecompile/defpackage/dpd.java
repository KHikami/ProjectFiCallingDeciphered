package defpackage;

import android.content.Context;

/* renamed from: dpd */
public final class dpd {
    public static final String a;
    public static final String b;
    public static final String c;
    private static dpc d;

    static {
        a = dpg.class.getName();
        b = cxd.class.getName();
        c = dpb.class.getName();
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new dpc();
        }
        jyn.a(dpg.class, new dpg());
    }

    public static void b(jyn jyn) {
        if (d == null) {
            d = new dpc();
        }
        jyn.a(cxd.class, d.a());
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new dpc();
        }
        jyn.a(dpb.class, d.a(context));
    }
}
