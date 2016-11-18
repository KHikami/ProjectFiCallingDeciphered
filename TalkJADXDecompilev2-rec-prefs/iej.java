package p000;

import android.content.Context;

public final class iej {
    public static final String f17606a = idy.class.getName();
    public static final String f17607b = idz.class.getName();
    public static final String f17608c = ief.class.getName();
    private static iei f17609d;

    public static void m21651a(Context context, jyn jyn) {
        if (f17609d == null) {
            f17609d = new iei();
        }
        jyn.m25444a(idy.class, new ieg(context, (byte) 0));
    }

    public static void m21652a(jyn jyn) {
        if (f17609d == null) {
            f17609d = new iei();
        }
        jyn.m25444a(idz.class, new ieh());
    }

    public static void m21653b(jyn jyn) {
        if (f17609d == null) {
            f17609d = new iei();
        }
        jyn.m25444a(ief.class, new ieq());
    }
}
