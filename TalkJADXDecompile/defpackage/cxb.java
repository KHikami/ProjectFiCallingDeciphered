package defpackage;

import android.content.Context;

/* renamed from: cxb */
public final class cxb {
    public static final String a;
    public static final String b;
    private static cxa c;

    static {
        a = cwv.class.getName();
        b = cxd.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new cxa();
        }
        jyn.a(cwv.class, c.a(context));
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new cxa();
        }
        jyn.a(cxd.class, c.a());
    }
}
