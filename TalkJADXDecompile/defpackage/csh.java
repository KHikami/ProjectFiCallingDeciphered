package defpackage;

import android.content.Context;

/* renamed from: csh */
public final class csh {
    public static final String a;
    public static final String b;
    private static csg c;

    static {
        a = dgt.class.getName();
        b = dlk.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new csg();
        }
        jyn.a(dgt.class, new crg(context));
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new csg();
        }
        jyn.a(dlk.class, new csr(context));
    }
}
