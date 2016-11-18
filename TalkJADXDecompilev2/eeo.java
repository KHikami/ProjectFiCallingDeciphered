package defpackage;

import android.content.Context;

public final class eeo {
    public static final String a = eem.class.getName();
    public static final String b = dlc.class.getName();
    public static final String c = eei.class.getName();
    public static final String d = ffw.class.getName();
    public static final String e = cxd.class.getName();
    private static een f;

    public static void a(Context context, jyn jyn) {
        if (f == null) {
            f = new een();
        }
        jyn.a(eem.class, new eem(context));
    }

    public static void b(Context context, jyn jyn) {
        if (f == null) {
            f = new een();
        }
        jyn.a(dlc.class, new eep(context));
    }

    public static void c(Context context, jyn jyn) {
        if (f == null) {
            f = new een();
        }
        jyn.a(eei.class, (eei) jyn.a(context, eem.class));
    }

    public static void d(Context context, jyn jyn) {
        if (f == null) {
            f = new een();
        }
        jyn.a(ffw.class, f.a(context));
    }

    public static void a(jyn jyn) {
        if (f == null) {
            f = new een();
        }
        jyn.a(cxd.class, f.a());
    }
}
