import android.content.Context;

public final class gim {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    private static gil f;

    static {
        a = jze.class.getName();
        b = gie.class.getName();
        c = gif.class.getName();
        d = gid.class.getName();
        e = jzr.class.getName();
    }

    public static void a(jyn jyn) {
        if (f == null) {
            f = new gil();
        }
        jyn.a(jze.class, new gik());
    }

    public static void a(Context context, jyn jyn) {
        if (f == null) {
            f = new gil();
        }
        jyn.a(gie.class, new gij(context, null));
    }

    public static void b(Context context, jyn jyn) {
        if (f == null) {
            f = new gil();
        }
        jyn.a(gif.class, new gif());
    }

    public static void c(Context context, jyn jyn) {
        if (f == null) {
            f = new gil();
        }
        jyn.a(gid.class, new gij(context, null));
    }

    public static void b(jyn jyn) {
        if (f == null) {
            f = new gil();
        }
        jyn.a(jzr.class, new gik());
    }
}
