package defpackage;

import android.content.Context;

/* renamed from: cnj */
public final class cnj {
    public static final String a;
    private static cni b;

    static {
        a = cnf.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new cni();
        }
        jyn.a(cnf.class, new cnf(context));
    }
}
