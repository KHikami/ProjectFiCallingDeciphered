package p000;

import android.content.Context;

public final class fwj {
    public static final String f14160a = fwh.class.getName();
    public static final String f14161b = bcp.class.getName();
    public static final String f14162c = cxd.class.getName();
    private static fwi f14163d;

    public static void m16394a(Context context, jyn jyn) {
        if (f14163d == null) {
            f14163d = new fwi();
        }
        jyn.m25444a(fwh.class, f14163d.m16391a(context));
    }

    public static void m16396b(Context context, jyn jyn) {
        if (f14163d == null) {
            f14163d = new fwi();
        }
        jyn.m25445a(bcp.class, f14163d.m16393b(context));
    }

    public static void m16395a(jyn jyn) {
        if (f14163d == null) {
            f14163d = new fwi();
        }
        jyn.m25445a(cxd.class, f14163d.m16392a());
    }
}
