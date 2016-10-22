package defpackage;

import android.content.Context;

/* renamed from: dpv */
public final class dpv {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private static dpu e;

    static {
        a = dpq.class.getName();
        b = dpp.class.getName();
        c = epk.class.getName();
        d = dyy.class.getName();
    }

    public static void a(jyn jyn) {
        if (e == null) {
            e = new dpu();
        }
        jyn.a(dpq.class, new dps());
    }

    public static void b(jyn jyn) {
        if (e == null) {
            e = new dpu();
        }
        jyn.a(dpp.class, new dpw());
    }

    public static void a(Context context, jyn jyn) {
        if (e == null) {
            e = new dpu();
        }
        jyn.a(epk.class, (epk) jyn.a(context, dpq.class));
    }

    public static void b(Context context, jyn jyn) {
        if (e == null) {
            e = new dpu();
        }
        jyn.a(dyy.class, new dpr());
    }
}
