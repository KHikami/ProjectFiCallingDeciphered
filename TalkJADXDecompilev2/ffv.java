package defpackage;

public final class ffv implements fok {
    private static final long serialVersionUID = 2;
    private int a = 0;
    private final String b;
    private final boolean c;
    private String d;

    public ffv(boolean z) {
        this.c = z;
        this.b = glk.a(new Throwable());
    }

    public ead a() {
        return new ffu(this);
    }

    public void b(int i) {
        this.a = i;
    }

    public int L_() {
        return this.a;
    }

    public void d_(String str) {
        this.d = str;
    }

    public String toString() {
        return gwb.P((Object) this).a("shouldRetry", this.c).a("creationStack", this.b).a("originStack", this.d).toString();
    }

    public boolean a(int i) {
        return false;
    }

    public boolean c() {
        return this.c;
    }
}
