package defpackage;

import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;

/* renamed from: dya */
public final class dya {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    private static dxy q;

    static {
        a = dwv.class.getName();
        b = dxc.class.getName();
        c = dwx.class.getName();
        d = dwu.class.getName();
        e = ActivityLifecycleCallbacks.class.getName();
        f = dxu.class.getName();
        g = cxd.class.getName();
        h = dwy.class.getName();
        i = bjn.class.getName();
        j = dwr.class.getName();
        k = jcd.class.getName();
        l = jnh.class.getName();
        m = dws.class.getName();
        n = dyb.class.getName();
        o = dwt.class.getName();
        p = bhq.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(dwv.class, new dxn(context));
    }

    public static void b(Context context, jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(dxc.class, new dxx(context));
    }

    public static void c(Context context, jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(dwx.class, new dxo(context));
    }

    public static void d(Context context, jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(dwu.class, q.b(context));
    }

    public static void e(Context context, jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(ActivityLifecycleCallbacks.class, (ActivityLifecycleCallbacks) jyn.a(context, dyb.class));
    }

    public static void f(Context context, jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(dxu.class, new dxu(context));
    }

    public static void a(jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(cxd.class, q.a());
    }

    public static void b(jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(dwy.class, new dxp());
    }

    public static void g(Context context, jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(bjn.class, q.c(context));
    }

    public static void c(jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(dwr.class, new dxd());
    }

    public static void h(Context context, jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(jcd.class, (jcd) jyn.a(context, dyb.class));
    }

    public static void i(Context context, jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(jnh.class, (jnh) jyn.a(context, dyb.class));
    }

    public static void d(jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(dws.class, new dxe());
    }

    public static void j(Context context, jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(dyb.class, new dyb(context));
    }

    public static void k(Context context, jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(dwt.class, q.a(context));
    }

    public static void l(Context context, jyn jyn) {
        if (q == null) {
            q = new dxy();
        }
        jyn.a(bhq.class, new bhq(dww.class));
    }
}
