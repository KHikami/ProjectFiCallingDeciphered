package defpackage;

/* renamed from: fqt */
public final class fqt {
    public static final String a;
    public static final String b;
    private static fqr c;

    static {
        a = fqq.class.getName();
        b = bhq.class.getName();
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new fqr();
        }
        jyn.a(fqq.class, c.a());
    }

    public static void b(jyn jyn) {
        if (c == null) {
            c = new fqr();
        }
        jyn.a(bhq.class, new bhq(frc.class));
    }
}
