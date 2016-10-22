package defpackage;

import android.content.Context;

/* renamed from: cye */
public final class cye {
    public static final String a;
    public static final String b;
    private static cyd c;

    static {
        a = cxo.class.getName();
        b = cxd.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new cyd();
        }
        jyn.a(cxo.class, c.a(context));
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new cyd();
        }
        jyn.a(cxd.class, c.a());
    }
}
