package defpackage;

/* renamed from: bzn */
public final class bzn {
    public static final String a;
    public static final String b;
    private static bzm c;

    static {
        a = jze.class.getName();
        b = jzr.class.getName();
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new bzm();
        }
        jyn.a(jze.class, new bzo(), new bzp());
    }

    public static void b(jyn jyn) {
        if (c == null) {
            c = new bzm();
        }
        jyn.a(jzr.class, new bzo(), new bzp());
    }
}
