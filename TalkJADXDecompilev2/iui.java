package defpackage;

public abstract class iui {
    private static final ThreadLocal<iui> a = new iuj();

    public abstract void a(iuk iuk);

    public abstract void b(iuk iuk);

    public static iui a() {
        return (iui) a.get();
    }
}
