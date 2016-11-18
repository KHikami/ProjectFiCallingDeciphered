package p000;

public final class irh implements itd {
    private ite f18768a;
    private boolean f18769b;

    public void mo3385a(ite ite) {
        this.f18768a = ite;
        c_(this.f18769b);
    }

    public void mo3384a() {
        c_(false);
        this.f18768a = null;
    }

    public boolean Q_() {
        return this.f18769b;
    }

    public void c_(boolean z) {
        this.f18769b = z;
        if (this.f18768a != null) {
            this.f18768a.mo3220b(!this.f18769b);
        }
    }
}
