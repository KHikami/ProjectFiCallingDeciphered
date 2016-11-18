package p000;

import android.content.Context;

public final class dlm {
    public static final String f10080a = dlj.class.getName();
    public static final String f10081b = dlh.class.getName();
    public static final String f10082c = cxd.class.getName();
    private static dll f10083d;

    public static void m12190a(Context context, jyn jyn) {
        if (f10083d == null) {
            f10083d = new dll();
        }
        jyn.m25444a(dlj.class, new dln());
    }

    public static void m12192b(Context context, jyn jyn) {
        if (f10083d == null) {
            f10083d = new dll();
        }
        jyn.m25444a(dlh.class, f10083d.m12188a(context));
    }

    public static void m12191a(jyn jyn) {
        if (f10083d == null) {
            f10083d = new dll();
        }
        jyn.m25445a(cxd.class, f10083d.m12189a());
    }
}
