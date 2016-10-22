package defpackage;

import android.content.Context;

/* renamed from: jeb */
public final class jeb {
    public static final String a;
    public static final String b;
    private static jea c;

    static {
        a = jdy.class.getName();
        b = jzz.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new jea();
        }
        jyn.a(jdy.class, new jdz(context));
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new jea();
        }
        kad kad = jzz.a;
        jyn.a(jzz.class, new jzz[0]);
    }
}
