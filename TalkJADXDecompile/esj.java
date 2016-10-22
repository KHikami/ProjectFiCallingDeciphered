import android.content.Context;

public final class esj {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private static esi e;

    static {
        a = ese.class.getName();
        b = erw.class.getName();
        c = cxd.class.getName();
        d = esm.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (e == null) {
            e = new esi();
        }
        jyn.a(ese.class, e.a(context));
    }

    public static void b(Context context, jyn jyn) {
        if (e == null) {
            e = new esi();
        }
        jyn.a(erw.class, e.b(context));
    }

    public static void a(jyn jyn) {
        if (e == null) {
            e = new esi();
        }
        jyn.a(cxd.class, e.a());
    }

    public static void c(Context context, jyn jyn) {
        if (e == null) {
            e = new esi();
        }
        jyn.a(esm.class, e.b());
    }
}
