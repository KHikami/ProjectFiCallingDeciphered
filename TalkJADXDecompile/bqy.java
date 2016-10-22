import android.content.Context;

public final class bqy {
    public static final String a;
    public static final String b;
    private static bqx c;

    static {
        a = jze.class.getName();
        b = jzr.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (c == null) {
            c = new bqx();
        }
        jyn.a(jze.class, new brb());
    }

    public static void b(Context context, jyn jyn) {
        if (c == null) {
            c = new bqx();
        }
        jyn.a(jzr.class, new brb());
    }
}
