package defpackage;

import android.content.Context;

/* renamed from: gsa */
public final class gsa {
    public static final String a;
    public static final String b;
    public static final String c;
    private static grx d;

    static {
        a = grv.class.getName();
        b = grq.class.getName();
        c = bhq.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new grx();
        }
        jyn.a(grv.class, d.b());
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new grx();
        }
        jyn.a(grq.class, d.a());
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new grx();
        }
        jyn.a(bhq.class, new bhq(grh.class), new bhq(grj.class), new bhq(grk.class), new bhq(grl.class));
    }
}
