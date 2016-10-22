import android.content.Context;

public final class dsz {
    public static final String a;
    public static final String b;
    public static final String c;
    private static dsy d;

    static {
        a = jze.class.getName();
        b = dsi.class.getName();
        c = jzr.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new dsy();
        }
        jyn.a(jze.class, new dsw());
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new dsy();
        }
        jyn.a(dsi.class, new dsx());
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new dsy();
        }
        jyn.a(jzr.class, new dsw());
    }
}
