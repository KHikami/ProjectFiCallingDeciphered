package defpackage;

import android.content.Context;

public final class jxt {
    public static final String a = jxp.class.getName();
    public static final String b = jxq.class.getName();
    private static jxs c;

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new jxs();
        }
        jyn.a(jxp.class, new jxp(context));
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new jxs();
        }
        jyn.a(jxq.class, new jxq());
    }
}
