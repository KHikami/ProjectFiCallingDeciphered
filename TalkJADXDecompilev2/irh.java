package defpackage;

public final class irh implements itd {
    private ite a;
    private boolean b;

    public void a(ite ite) {
        this.a = ite;
        c_(this.b);
    }

    public void a() {
        c_(false);
        this.a = null;
    }

    public boolean Q_() {
        return this.b;
    }

    public void c_(boolean z) {
        this.b = z;
        if (this.a != null) {
            this.a.b(!this.b);
        }
    }
}
