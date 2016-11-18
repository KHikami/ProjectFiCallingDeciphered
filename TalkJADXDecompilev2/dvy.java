package defpackage;

import android.content.Context;

public final class dvy {
    public static final String a = dvt.class.getName();
    public static final String b = dvs.class.getName();
    private static dvx c;

    public static void a(jyn jyn) {
        if (c == null) {
            c = new dvx();
        }
        jyn.a(dvt.class, new dvz());
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new dvx();
        }
        jyn.a(dvs.class, new dvw(context));
    }
}
