package defpackage;

import android.content.Context;

public final class bgo {
    public static final String a = bgp.class.getName();
    public static final String b = jcl.class.getName();
    private static bgn c;

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
