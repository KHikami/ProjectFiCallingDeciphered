import android.content.Context;

public final class dlm {
    public static final String a;
    public static final String b;
    public static final String c;
    private static dll d;

    static {
        a = dlj.class.getName();
        b = dlh.class.getName();
        c = cxd.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new dll();
        }
        jyn.a(dlj.class, new dln());
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new dll();
        }
        jyn.a(dlh.class, d.a(context));
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new dll();
        }
        jyn.a(cxd.class, d.a());
    }
}
