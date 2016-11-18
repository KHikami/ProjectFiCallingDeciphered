package defpackage;

import android.content.Context;

public final class dqj {
    public static final String a = dqh.class.getName();
    public static final String b = cxd.class.getName();
    private static dqi c;

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new dqi();
        }
        jyn.a(dqh.class, c.a(context));
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new dqi();
        }
        jyn.a(cxd.class, c.a());
    }
}
