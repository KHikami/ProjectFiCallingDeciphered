import android.content.Context;

public final class dqf {
    public static final String a;
    public static final String b;
    public static final String c;
    private static dqe d;

    static {
        a = jnh.class.getName();
        b = dqg.class.getName();
        c = dqc.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new dqe();
        }
        jyn.a(jnh.class, (jnh) jyn.a(context, dqg.class));
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new dqe();
        }
        jyn.a(dqg.class, new dqg(context));
    }

    public static void c(Context context, jyn jyn) {
        if (d == null) {
            d = new dqe();
        }
        jyn.a(dqc.class, (dqc) jyn.a(context, dqg.class));
    }
}
