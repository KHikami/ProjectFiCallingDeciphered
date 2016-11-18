package defpackage;

import android.content.Context;

public final class clh {
    public static final String a = cxd.class.getName();
    public static final String b = ckq.class.getName();
    private static clf c;

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
