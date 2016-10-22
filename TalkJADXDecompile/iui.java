public abstract class iui {
    private static final ThreadLocal<iui> a;

    public abstract void a(iuk iuk);

    public abstract void b(iuk iuk);

    static {
        a = new iuj();
    }

    public static iui a() {
        return (iui) a.get();
    }
}
