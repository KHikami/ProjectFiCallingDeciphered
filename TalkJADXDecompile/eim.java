import android.content.Context;

public final class eim {
    public static final String a;
    public static final String b;
    public static final String c;
    private static eil d;

    static {
        a = jze.class.getName();
        b = ehz.class.getName();
        c = jzr.class.getName();
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new eil();
        }
        jyn.a(jze.class, new eik());
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new eil();
        }
        jyn.a(ehz.class, new eig(context));
    }

    public static void b(jyn jyn) {
        if (d == null) {
            d = new eil();
        }
        jyn.a(jzr.class, new eik());
    }
}
