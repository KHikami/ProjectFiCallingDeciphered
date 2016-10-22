import android.content.Context;

public final class jkw {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private static jkv e;

    static {
        a = jkn.class.getName();
        b = jim.class.getName();
        c = jkh.class.getName();
        d = jzz.class.getName();
    }

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
