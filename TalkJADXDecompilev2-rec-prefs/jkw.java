package p000;

import android.content.Context;

public final class jkw {
    public static final String f20382a = jkn.class.getName();
    public static final String f20383b = jim.class.getName();
    public static final String f20384c = jkh.class.getName();
    public static final String f20385d = jzz.class.getName();
    private static jkv f20386e;

    public static void m24615a(Context context, jyn jyn) {
        if (f20386e == null) {
            f20386e = new jkv();
        }
        jyn.m25444a(jkn.class, new jkp(context, (jlo) jyn.m25426a(context, jlo.class)));
    }

    public static void m24616a(jyn jyn) {
        if (f20386e == null) {
            f20386e = new jkv();
        }
        jyn.m25445a(jim.class, new jkm());
    }

    public static void m24617b(jyn jyn) {
        if (f20386e == null) {
            f20386e = new jkv();
        }
        jyn.m25445a(jkh.class, new jka());
    }

    public static void m24618c(jyn jyn) {
        if (f20386e == null) {
            f20386e = new jkv();
        }
        kad kad = jzz.f19869a;
        jyn.m25445a(jzz.class, new jzz[0]);
    }
}
