package defpackage;

/* renamed from: bzd */
public final class bzd {
    public static final String a;
    public static final String b;
    private static bzc c;

    static {
        a = jze.class.getName();
        b = jzr.class.getName();
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new bzc();
        }
        jyn.a(jze.class, new bze());
    }

    public static void b(jyn jyn) {
        if (c == null) {
            c = new bzc();
        }
        jyn.a(jzr.class, new bze());
    }
}
