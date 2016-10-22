package defpackage;

import android.content.Context;

/* renamed from: dqb */
public final class dqb {
    public static final String a;
    public static final String b;
    private static dqa c;

    static {
        a = iik.class.getName();
        b = cxd.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new dqa();
        }
        jyn.a(iik.class, c.a(context));
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new dqa();
        }
        jyn.a(cxd.class, c.a());
    }
}
