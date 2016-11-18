package p000;

import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;

public final class bcx {
    public static final String f3057a = ActivityLifecycleCallbacks.class.getName();
    public static final String f3058b = bcp.class.getName();
    public static final String f3059c = bcs.class.getName();
    public static final String f3060d = bct.class.getName();
    public static final String f3061e = bcr.class.getName();
    public static final String f3062f = bcz.class.getName();
    public static final String f3063g = bcu.class.getName();
    public static final String f3064h = bcv.class.getName();
    private static bcw f3065i;

    public static void m4925a(Context context, jyn jyn) {
        if (f3065i == null) {
            f3065i = new bcw();
        }
        jyn.m25445a(ActivityLifecycleCallbacks.class, f3065i.m4923b(context));
    }

    public static void m4926b(Context context, jyn jyn) {
        if (f3065i == null) {
            f3065i = new bcw();
        }
        jyn.m25445a(bcp.class, f3065i.m4924c(context));
    }

    public static void m4927c(Context context, jyn jyn) {
        if (f3065i == null) {
            f3065i = new bcw();
        }
        jyn.m25444a(bcs.class, (bcs) jyn.m25426a(context, bcz.class));
    }

    public static void m4928d(Context context, jyn jyn) {
        if (f3065i == null) {
            f3065i = new bcw();
        }
        jyn.m25444a(bct.class, new bdb((bcz) jyn.m25426a(context, bcz.class)));
    }

    public static void m4929e(Context context, jyn jyn) {
        if (f3065i == null) {
            f3065i = new bcw();
        }
        jyn.m25444a(bcr.class, f3065i.m4922a(context));
    }

    public static void m4930f(Context context, jyn jyn) {
        if (f3065i == null) {
            f3065i = new bcw();
        }
        jyn.m25444a(bcz.class, new bcz());
    }

    public static void m4931g(Context context, jyn jyn) {
        if (f3065i == null) {
            f3065i = new bcw();
        }
        jyn.m25444a(bcu.class, new bdc(context));
    }

    public static void m4932h(Context context, jyn jyn) {
        if (f3065i == null) {
            f3065i = new bcw();
        }
        jyn.m25444a(bcv.class, new bdf(context));
    }
}
