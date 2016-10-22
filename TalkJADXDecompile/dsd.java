import android.content.Context;

public final class dsd {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private static dsc e;

    static {
        a = ffw.class.getName();
        b = cxd.class.getName();
        c = drx.class.getName();
        d = dse.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (e == null) {
            e = new dsc();
        }
        jyn.a(ffw.class, e.a(context));
    }

    public static void a(jyn jyn) {
        if (e == null) {
            e = new dsc();
        }
        jyn.a(cxd.class, e.a());
    }

    public static void b(Context context, jyn jyn) {
        if (e == null) {
            e = new dsc();
        }
        jyn.a(drx.class, (drx) jyn.a(context, dse.class));
    }

    public static void c(Context context, jyn jyn) {
        if (e == null) {
            e = new dsc();
        }
        jyn.a(dse.class, new dse(context));
    }
}
