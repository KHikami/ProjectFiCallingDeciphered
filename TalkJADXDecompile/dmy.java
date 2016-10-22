import android.content.Context;

public final class dmy {
    public static final String a;
    public static final String b;
    public static final String c;
    private static dmw d;

    static {
        a = dmt.class.getName();
        b = cxd.class.getName();
        c = dmu.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new dmw();
        }
        jyn.a(dmt.class, d.a(context));
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new dmw();
        }
        jyn.a(cxd.class, d.a());
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new dmw();
        }
        jyn.a(dmu.class, d.b());
    }
}
