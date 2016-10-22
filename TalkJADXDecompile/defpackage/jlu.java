package defpackage;

import android.content.Context;

/* renamed from: jlu */
public final class jlu {
    public static final String a;
    private static jlt b;

    static {
        a = jlo.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new jlt();
        }
        jyn.a(jlo.class, new jlp(context).a());
    }
}
