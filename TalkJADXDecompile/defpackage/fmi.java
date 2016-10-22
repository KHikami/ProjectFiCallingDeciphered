package defpackage;

/* renamed from: fmi */
public final class fmi {
    public static final String a;
    private static fmh b;

    static {
        a = fmf.class.getName();
    }

    public static void a(jyn jyn) {
        if (b == null) {
            b = new fmh();
        }
        jyn.a(fmf.class, new fmg());
    }
}
