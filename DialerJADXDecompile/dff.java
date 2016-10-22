/* compiled from: PG */
public final class dff {
    public static final dff a;
    public dfc b;

    static {
        a = new dff();
    }

    private dff() {
        this.b = dfc.b;
    }

    public final String toString() {
        cyl C = buf.C((Object) this);
        C.a("deadline", null);
        C.a("authority", null);
        C.a("affinity", this.b);
        C.a("executor", null);
        C.a("compressorName", null);
        return C.toString();
    }
}
