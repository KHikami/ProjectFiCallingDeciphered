package defpackage;

import android.content.Context;

public final class dpl {
    public static final String a = iyf.class.getName();
    public static final String b = ixw.class.getName();
    public static final String c = iym.class.getName();
    public static final String d = iyd.class.getName();
    private static dph e;

    public static void a(Context context, jyn jyn) {
        if (e == null) {
            e = new dph();
        }
        boolean a = gwb.a(context, "babel_healthcheck_package_enabled", false);
        glk.c("Babel_Prime", "primesPackageConfigurationsProvider=" + a, new Object[0]);
        jyn.a(iyf.class, new iyf(a));
    }

    public static void b(Context context, jyn jyn) {
        if (e == null) {
            e = new dph();
        }
        jyn.a(ixw.class, e.d(context));
    }

    public static void c(Context context, jyn jyn) {
        if (e == null) {
            e = new dph();
        }
        jyn.a(iym.class, e.c(context));
    }

    public static void d(Context context, jyn jyn) {
        if (e == null) {
            e = new dph();
        }
        jyn.a(iyd.class, e.b(context));
    }
}