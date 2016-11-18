package defpackage;

import android.content.Context;

public final class dsz {
    public static final String a = jze.class.getName();
    public static final String b = dsi.class.getName();
    public static final String c = jzr.class.getName();
    private static dsy d;

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new dsy();
        }
        jyn.a(jze.class, new dsw());
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new dsy();
        }
        jyn.a(dsi.class, new dsx());
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new dsy();
        }
        jyn.a(jzr.class, new dsw());
    }
}
