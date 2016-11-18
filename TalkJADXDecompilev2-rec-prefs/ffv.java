package p000;

public final class ffv implements fok {
    private static final long serialVersionUID = 2;
    private int f12987a = 0;
    private final String f12988b;
    private final boolean f12989c;
    private String f12990d;

    public ffv(boolean z) {
        this.f12989c = z;
        this.f12988b = glk.m17967a(new Throwable());
    }

    public ead mo1021a() {
        return new ffu(this);
    }

    public void mo1023b(int i) {
        this.f12987a = i;
    }

    public int L_() {
        return this.f12987a;
    }

    public void d_(String str) {
        this.f12990d = str;
    }

    public String toString() {
        return gwb.m1436P((Object) this).m31975a("shouldRetry", this.f12989c).m31974a("creationStack", this.f12988b).m31974a("originStack", this.f12990d).toString();
    }

    public boolean mo1022a(int i) {
        return false;
    }

    public boolean m15222c() {
        return this.f12989c;
    }
}
