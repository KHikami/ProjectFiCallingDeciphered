package defpackage;

import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;

public final class bcx {
    public static final String a = ActivityLifecycleCallbacks.class.getName();
    public static final String b = bcp.class.getName();
    public static final String c = bcs.class.getName();
    public static final String d = bct.class.getName();
    public static final String e = bcr.class.getName();
    public static final String f = bcz.class.getName();
    public static final String g = bcu.class.getName();
    public static final String h = bcv.class.getName();
    private static bcw i;

    public static void a(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(ActivityLifecycleCallbacks.class, i.b(context));
    }

    public static void b(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(bcp.class, i.c(context));
    }

    public static void c(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(bcs.class, (bcs) jyn.a(context, bcz.class));
    }

    public static void d(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(bct.class, new bdb((bcz) jyn.a(context, bcz.class)));
    }

    public static void e(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(bcr.class, i.a(context));
    }

    public static void f(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(bcz.class, new bcz());
    }

    public static void g(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(bcu.class, new bdc(context));
    }

    public static void h(Context context, jyn jyn) {
        if (i == null) {
            i = new bcw();
        }
        jyn.a(bcv.class, new bdf(context));
    }
}
