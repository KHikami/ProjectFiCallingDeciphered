import android.content.Context;

public final class eeo {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    private static een f;

    static {
        a = eem.class.getName();
        b = dlc.class.getName();
        c = eei.class.getName();
        d = ffw.class.getName();
        e = cxd.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (f == null) {
            f = new een();
        }
        jyn.a(eem.class, new eem(context));
    }

    public static void b(Context context, jyn jyn) {
        if (f == null) {
            f = new een();
        }
        jyn.a(dlc.class, new eep(context));
    }

    public static void c(Context context, jyn jyn) {
        if (f == null) {
            f = new een();
        }
        jyn.a(eei.class, (eei) jyn.a(context, eem.class));
    }

    public static void d(Context context, jyn jyn) {
        if (f == null) {
            f = new een();
        }
        jyn.a(ffw.class, f.a(context));
    }

    public static void a(jyn jyn) {
        if (f == null) {
            f = new een();
        }
        jyn.a(cxd.class, f.a());
    }
}
