package defpackage;

import android.content.Context;

/* renamed from: jgb */
public final class jgb {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    private static jga f;

    static {
        a = jze.class.getName();
        b = jgu.class.getName();
        c = jge.class.getName();
        d = jzr.class.getName();
        e = jzz.class.getName();
    }

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
