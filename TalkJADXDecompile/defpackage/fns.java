package defpackage;

import android.content.Context;

/* renamed from: fns */
public final class fns {
    public static final String a;
    public static final String b;
    public static final String c;
    private static fnr d;

    static {
        a = fnc.class.getName();
        b = fnh.class.getName();
        c = bhq.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new fnr();
        }
        jyn.a(fnc.class, new fnq(context, new fnp(context)));
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new fnr();
        }
        jyn.a(fnh.class, new fnh(context));
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new fnr();
        }
        jyn.a(bhq.class, new bhq(fnj.class), new bhq(fnk.class), new bhq(fnl.class), new bhq(fnu.class), new bhq(fnv.class), new bhq(fnw.class), new bhq(fnt.class));
    }
}
