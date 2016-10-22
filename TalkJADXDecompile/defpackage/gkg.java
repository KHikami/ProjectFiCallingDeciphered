package defpackage;

/* renamed from: gkg */
public final class gkg {
    private static final Object a;
    private final lc<Object> b;

    static {
        a = new Object();
    }

    public gkg() {
        this.b = new lc();
    }

    public boolean a(long j) {
        if (this.b.a(j, null) == a) {
            return true;
        }
        return false;
    }

    public void b(long j) {
        this.b.b(j, a);
    }

    public void c(long j) {
        this.b.b(j);
    }
}
