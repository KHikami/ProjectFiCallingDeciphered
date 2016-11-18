package defpackage;

import android.content.Context;

public final class jkw {
    public static final String a = jkn.class.getName();
    public static final String b = jim.class.getName();
    public static final String c = jkh.class.getName();
    public static final String d = jzz.class.getName();
    private static jkv e;

    public static void a(Context context, jyn jyn) {
        if (e == null) {
            e = new jkv();
        }
        jyn.a(jkn.class, new jkp(context, (jlo) jyn.a(context, jlo.class)));
    }

    public static void a(jyn jyn) {
        if (e == null) {
            e = new jkv();
        }
        jyn.a(jim.class, new jkm());
    }

    public static void b(jyn jyn) {
        if (e == null) {
            e = new jkv();
        }
        jyn.a(jkh.class, new jka());
    }

    public static void c(jyn jyn) {
        if (e == null) {
            e = new jkv();
        }
        kad kad = jzz.a;
        jyn.a(jzz.class, new jzz[0]);
    }
}
