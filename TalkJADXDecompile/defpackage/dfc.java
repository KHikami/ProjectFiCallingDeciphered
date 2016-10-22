package defpackage;

import android.content.Context;

/* renamed from: dfc */
public final class dfc {
    public static final String a;
    public static final String b;
    private static dfa c;

    static {
        a = dew.class.getName();
        b = cxd.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new dfa();
        }
        jyn.a(dew.class, c.a(context));
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new dfa();
        }
        jyn.a(cxd.class, c.a());
    }
}
