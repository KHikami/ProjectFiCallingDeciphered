package defpackage;

import android.content.Context;

/* renamed from: bgo */
public final class bgo {
    public static final String a;
    public static final String b;
    private static bgn c;

    static {
        a = bgp.class.getName();
        b = jcl.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new bgn();
        }
        jyn.a(bgp.class, new bgp(context));
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new bgn();
        }
        jyn.a(jcl.class, (jcl) jyn.b(context, bgp.class));
    }
}
