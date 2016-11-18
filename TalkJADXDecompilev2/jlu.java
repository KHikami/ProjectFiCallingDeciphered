package defpackage;

import android.content.Context;

public final class jlu {
    public static final String a = jlo.class.getName();
    private static jlt b;

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new jlt();
        }
        jyn.a(jlo.class, new jlp(context).a());
    }
}
