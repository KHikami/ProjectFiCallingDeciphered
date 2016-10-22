import android.content.Context;

public final class cmv {
    public static final String a;
    public static final String b;
    public static final String c;
    private static cmt d;

    static {
        a = jnh.class.getName();
        b = gqw.class.getName();
        c = bte.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new cmt();
        }
        jyn.a(jnh.class, new cmw(context));
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new cmt();
        }
        jyn.a(gqw.class, d.a());
    }

    public static void c(Context context, jyn jyn) {
        if (d == null) {
            d = new cmt();
        }
        jyn.a(bte.class, new cmf());
    }
}
