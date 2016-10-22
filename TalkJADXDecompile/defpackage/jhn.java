package defpackage;

import android.content.Context;

/* renamed from: jhn */
public final class jhn {
    public static final String a;
    private static jhm b;

    static {
        a = jhf.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new jhm();
        }
        jyn.a(jhf.class, new jhh(context));
    }
}
