import android.content.Context;

public final class eqi {
    public static final String a;
    public static final String b;
    public static final String c;
    private static eqh d;

    static {
        a = eqa.class.getName();
        b = cxd.class.getName();
        c = epx.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new eqh();
        }
        jyn.a(eqa.class, d.a(context));
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new eqh();
        }
        jyn.a(cxd.class, d.a());
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new eqh();
        }
        jyn.a(epx.class, d.b(context));
    }
}
