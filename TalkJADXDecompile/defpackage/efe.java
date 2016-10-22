package defpackage;

import android.content.Context;

/* renamed from: efe */
public final class efe {
    public static final String a;
    private static efc b;

    static {
        a = eez.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new efc();
        }
        jyn.a(eez.class, b.a());
    }
}
