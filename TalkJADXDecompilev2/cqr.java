package defpackage;

import android.content.Context;

public final class cqr {
    public static final String a = cxd.class.getName();
    public static final String b = bhq.class.getName();
    public static final String c = cqw.class.getName();
    public static final String d = cqp.class.getName();
    private static cqq e;

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
