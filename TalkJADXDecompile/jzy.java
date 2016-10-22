public final class jzy {
    public static final String a;
    public static final String b;
    private static jzx c;

    static {
        a = jze.class.getName();
        b = jzr.class.getName();
    }

    public static void a(jyn jyn) {
        if (c == null) {
            c = new jzx();
        }
        jyn.a(jze.class, new jzw());
    }

    public static void b(jyn jyn) {
        if (c == null) {
            c = new jzx();
        }
        jyn.a(jzr.class, new jzw());
    }
}
