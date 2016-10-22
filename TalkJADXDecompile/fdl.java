import android.content.Context;

public final class fdl {
    public static final String a;
    public static final String b;
    public static final String c;
    private static fdk d;

    static {
        a = jcd.class.getName();
        b = jnh.class.getName();
        c = fde.class.getName();
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new fdk();
        }
        jyn.a(jcd.class, (jcd) jyn.a(fde.class));
    }

    public static void b(jyn jyn) {
        if (d == null) {
            d = new fdk();
        }
        jyn.a(jnh.class, (jnh) jyn.a(fde.class));
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new fdk();
        }
        jyn.a(fde.class, new fde(context));
    }
}
