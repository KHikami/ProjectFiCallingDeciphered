package defpackage;

import android.content.Context;

public final class jgb {
    public static final String a = jze.class.getName();
    public static final String b = jgu.class.getName();
    public static final String c = jge.class.getName();
    public static final String d = jzr.class.getName();
    public static final String e = jzz.class.getName();
    private static jga f;

    public static void a(jyn jyn) {
        if (f == null) {
            f = new jga();
        }
        jyn.a(jze.class, new jgh());
    }

    public static void a(Context context, jyn jyn) {
        if (f == null) {
            f = new jga();
        }
        jyn.a(jgu.class, new jgu(context));
    }

    public static void b(Context context, jyn jyn) {
        if (f == null) {
            f = new jga();
        }
        jyn.a(jge.class, new jgo(context));
    }

    public static void b(jyn jyn) {
        if (f == null) {
            f = new jga();
        }
        jyn.a(jzr.class, new jgh());
    }

    public static void c(Context context, jyn jyn) {
        if (f == null) {
            f = new jga();
        }
        kad kad = jzz.a;
        jyn.a(jzz.class, new jzz[0]);
    }
}
