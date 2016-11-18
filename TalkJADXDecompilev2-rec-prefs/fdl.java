package p000;

import android.content.Context;

public final class fdl {
    public static final String f12740a = jcd.class.getName();
    public static final String f12741b = jnh.class.getName();
    public static final String f12742c = fde.class.getName();
    private static fdk f12743d;

    public static void m15071a(jyn jyn) {
        if (f12743d == null) {
            f12743d = new fdk();
        }
        jyn.m25445a(jcd.class, (jcd) jyn.m25443a(fde.class));
    }

    public static void m15072b(jyn jyn) {
        if (f12743d == null) {
            f12743d = new fdk();
        }
        jyn.m25445a(jnh.class, (jnh) jyn.m25443a(fde.class));
    }

    public static void m15070a(Context context, jyn jyn) {
        if (f12743d == null) {
            f12743d = new fdk();
        }
        jyn.m25444a(fde.class, new fde(context));
    }
}
