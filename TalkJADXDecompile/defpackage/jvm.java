package defpackage;

import android.content.Context;

/* renamed from: jvm */
public final class jvm {
    public static final String a;
    private static jvl b;

    static {
        a = jvg.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new jvl();
        }
        jyn.a(jvg.class, new jvj((icq) jyn.a(context, icq.class)));
    }
}
