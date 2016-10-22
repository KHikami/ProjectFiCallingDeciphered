package defpackage;

import android.content.Context;

/* renamed from: cqr */
public final class cqr {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private static cqq e;

    static {
        a = cxd.class.getName();
        b = bhq.class.getName();
        c = cqw.class.getName();
        d = cqp.class.getName();
    }

    public static void a(jyn jyn) {
        if (e == null) {
            e = new cqq();
        }
        jyn.a(cxd.class, e.a());
    }

    public static void a(Context context, jyn jyn) {
        if (e == null) {
            e = new cqq();
        }
        jyn.a(bhq.class, new bhq(cqo.class));
    }

    public static void b(Context context, jyn jyn) {
        if (e == null) {
            e = new cqq();
        }
        jyn.a(cqw.class, e.b(context));
    }

    public static void c(Context context, jyn jyn) {
        if (e == null) {
            e = new cqq();
        }
        jyn.a(cqp.class, e.a(context));
    }
}
