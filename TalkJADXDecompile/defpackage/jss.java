package defpackage;

import android.content.Context;

/* renamed from: jss */
public final class jss {
    public static final String a;
    private static jsr b;

    static {
        a = jsn.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new jsr();
        }
        jyn.a(jsn.class, new jsq(context));
    }
}
