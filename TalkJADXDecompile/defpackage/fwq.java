package defpackage;

/* renamed from: fwq */
public final class fwq {
    public static final String a;
    public static final String b;
    private static fwp c;

    static {
        a = jze.class.getName();
        b = jzr.class.getName();
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new fwp();
        }
        jyn.a(jze.class, new fwt());
    }

    public static void b(jyn jyn) {
        if (c == null) {
            c = new fwp();
        }
        jyn.a(jzr.class, new fwt());
    }
}
