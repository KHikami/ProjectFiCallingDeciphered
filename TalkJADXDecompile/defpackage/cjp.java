package defpackage;

import android.content.Context;

/* renamed from: cjp */
public final class cjp {
    public static final String a;
    private static cjn b;

    static {
        a = cjj.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new cjn();
        }
        jyn.a(cjj.class, b.a(context));
    }
}
