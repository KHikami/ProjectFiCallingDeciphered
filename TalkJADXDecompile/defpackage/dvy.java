package defpackage;

import android.content.Context;

/* renamed from: dvy */
public final class dvy {
    public static final String a;
    public static final String b;
    private static dvx c;

    static {
        a = dvt.class.getName();
        b = dvs.class.getName();
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new dvx();
        }
        jyn.a(dvt.class, new dvz());
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new dvx();
        }
        jyn.a(dvs.class, new dvw(context));
    }
}
