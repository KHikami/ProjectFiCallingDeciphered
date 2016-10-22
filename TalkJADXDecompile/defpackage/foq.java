package defpackage;

import android.content.Context;

/* renamed from: foq */
public final class foq {
    public static final String a;
    public static final String b;
    private static fop c;

    static {
        a = jvb.class.getName();
        b = fol.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new fop();
        }
        jyn.a(jvb.class, new fol(context));
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new fop();
        }
        jyn.a(fol.class, new fol(context));
    }
}
