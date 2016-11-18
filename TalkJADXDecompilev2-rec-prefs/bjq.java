package p000;

import android.content.Context;

public final class bjq {
    public static final String f3539a = bjr.class.getName();
    public static final String f3540b = jnh.class.getName();
    public static final String f3541c = bkq.class.getName();
    public static final String f3542d = jcl.class.getName();
    private static bjp f3543e;

    public static void m5477a(jyn jyn) {
        if (f3543e == null) {
            f3543e = new bjp();
        }
        jyn.m25445a(bjr.class, new bnz());
    }

    public static void m5479b(jyn jyn) {
        if (f3543e == null) {
            f3543e = new bjp();
        }
        jyn.m25445a(jnh.class, (jnh) jyn.m25443a(bkq.class));
    }

    public static void m5476a(Context context, jyn jyn) {
        if (f3543e == null) {
            f3543e = new bjp();
        }
        jyn.m25444a(bkq.class, new bkq(context));
    }

    public static void m5478b(Context context, jyn jyn) {
        if (f3543e == null) {
            f3543e = new bjp();
        }
        jyn.m25445a(jcl.class, (jcl) jyn.m25426a(context, bkq.class));
    }
}
