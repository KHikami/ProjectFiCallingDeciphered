package p000;

import android.content.Context;

public final class dpd {
    public static final String f10271a = dpg.class.getName();
    public static final String f10272b = cxd.class.getName();
    public static final String f10273c = dpb.class.getName();
    private static dpc f10274d;

    public static void m12409a(jyn jyn) {
        if (f10274d == null) {
            f10274d = new dpc();
        }
        jyn.m25444a(dpg.class, new dpg());
    }

    public static void m12410b(jyn jyn) {
        if (f10274d == null) {
            f10274d = new dpc();
        }
        jyn.m25445a(cxd.class, f10274d.m12407a());
    }

    public static void m12408a(Context context, jyn jyn) {
        if (f10274d == null) {
            f10274d = new dpc();
        }
        jyn.m25444a(dpb.class, f10274d.m12406a(context));
    }
}
