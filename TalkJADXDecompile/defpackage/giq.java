package defpackage;

import android.content.Context;

/* renamed from: giq */
public final class giq {
    public static final String a;
    public static final String b;
    private static gip c;

    static {
        a = bnd.class.getName();
        b = bne.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new gip();
        }
        jyn.a(bnd.class, new gin((bbm) jyn.a(context, bbm.class)));
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new gip();
        }
        jyn.a(bne.class, new gio((bbm) jyn.a(context, bbm.class)));
    }
}
