package p000;

import android.content.Context;

public final class dpl {
    public static final String f10293a = iyf.class.getName();
    public static final String f10294b = ixw.class.getName();
    public static final String f10295c = iym.class.getName();
    public static final String f10296d = iyd.class.getName();
    private static dph f10297e;

    public static void m12429a(Context context, jyn jyn) {
        if (f10297e == null) {
            f10297e = new dph();
        }
        boolean a = gwb.m1906a(context, "babel_healthcheck_package_enabled", false);
        glk.m17979c("Babel_Prime", "primesPackageConfigurationsProvider=" + a, new Object[0]);
        jyn.m25444a(iyf.class, new iyf(a));
    }

    public static void m12430b(Context context, jyn jyn) {
        if (f10297e == null) {
            f10297e = new dph();
        }
        jyn.m25444a(ixw.class, f10297e.m12419d(context));
    }

    public static void m12431c(Context context, jyn jyn) {
        if (f10297e == null) {
            f10297e = new dph();
        }
        jyn.m25444a(iym.class, f10297e.m12418c(context));
    }

    public static void m12432d(Context context, jyn jyn) {
        if (f10297e == null) {
            f10297e = new dph();
        }
        jyn.m25444a(iyd.class, f10297e.m12417b(context));
    }
}
