package defpackage;

import android.content.Context;

/* renamed from: clh */
public final class clh {
    public static final String a;
    public static final String b;
    private static clf c;

    static {
        a = cxd.class.getName();
        b = ckq.class.getName();
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new clf();
        }
        jyn.a(cxd.class, c.a());
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new clf();
        }
        jyn.a(ckq.class, c.a(context));
    }
}
