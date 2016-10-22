package defpackage;

import android.content.Context;

/* renamed from: cny */
public final class cny {
    public static final String a;
    public static final String b;
    private static cnx c;

    static {
        a = cnt.class.getName();
        b = bhq.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new cnx();
        }
        jyn.a(cnt.class, new cnw(context));
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new cnx();
        }
        jyn.a(bhq.class, new bhq(cov.class), new bhq(coe.class), new bhq(coj.class), new bhq(cpc.class), new bhq(cnz.class), new bhq(coq.class), new bhq(cos.class), new bhq(cor.class), new bhq(cot.class));
    }
}
