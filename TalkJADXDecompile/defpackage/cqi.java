package defpackage;

import android.content.Context;

/* renamed from: cqi */
public final class cqi {
    public static final String a;
    private static cqh b;

    static {
        a = cqc.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new cqh();
        }
        jyn.a(cqc.class, new cqf(context), new cqd(context), new cqe(), new cqg());
    }
}
