public final class dlr {
    public static final String a;
    public static final String b;
    private static dlo c;

    static {
        a = dpn.class.getName();
        b = dpo.class.getName();
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new dlo();
        }
        jyn.a(dpn.class, c.a());
    }

    public static void b(jyn jyn) {
        if (c == null) {
            c = new dlo();
        }
        jyn.a(dpo.class, c.b());
    }
}
