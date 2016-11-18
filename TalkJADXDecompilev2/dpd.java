package defpackage;

import android.content.Context;

public final class dpd {
    public static final String a = dpg.class.getName();
    public static final String b = cxd.class.getName();
    public static final String c = dpb.class.getName();
    private static dpc d;

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
