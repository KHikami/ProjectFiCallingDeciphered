package defpackage;

public final class dlr {
    public static final String a = dpn.class.getName();
    public static final String b = dpo.class.getName();
    private static dlo c;

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
