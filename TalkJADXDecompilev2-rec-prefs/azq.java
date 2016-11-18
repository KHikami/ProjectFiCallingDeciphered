package p000;

public final class azq implements azi, azj {
    private azi f2644a;
    private azi f2645b;
    private azj f2646c;
    private boolean f2647d;

    public azq() {
        this(null);
    }

    public azq(azj azj) {
        this.f2646c = azj;
    }

    public void m4485a(azi azi, azi azi2) {
        this.f2644a = azi;
        this.f2645b = azi2;
    }

    public void mo430c(azi azi) {
        if (!azi.equals(this.f2645b)) {
            if (this.f2646c != null) {
                this.f2646c.mo430c(this);
            }
            if (!this.f2645b.mo424f()) {
                this.f2645b.mo422c();
            }
        }
    }

    public void mo417a() {
        this.f2647d = true;
        if (!this.f2645b.mo423e()) {
            this.f2645b.mo417a();
        }
        if (this.f2647d && !this.f2644a.mo423e()) {
            this.f2644a.mo417a();
        }
    }

    public void mo421b() {
        this.f2647d = false;
        this.f2644a.mo421b();
        this.f2645b.mo421b();
    }

    public void mo422c() {
        this.f2647d = false;
        this.f2645b.mo422c();
        this.f2644a.mo422c();
    }

    public boolean mo423e() {
        return this.f2644a.mo423e();
    }

    public boolean mo424f() {
        return this.f2644a.mo424f() || this.f2645b.mo424f();
    }

    public boolean mo425g() {
        return this.f2644a.mo425g() || this.f2645b.mo425g();
    }

    public boolean mo426h() {
        return this.f2644a.mo426h();
    }

    public void mo427i() {
        this.f2644a.mo427i();
        this.f2645b.mo427i();
    }

    public boolean mo428a(azi azi) {
        boolean z;
        if (this.f2646c == null || this.f2646c.mo428a(this)) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (!azi.equals(this.f2644a) && this.f2644a.mo425g())) {
            return false;
        }
        return true;
    }

    public boolean mo429b(azi azi) {
        boolean z;
        if (this.f2646c == null || this.f2646c.mo429b(this)) {
            z = true;
        } else {
            z = false;
        }
        if (z && azi.equals(this.f2644a) && !mo431d()) {
            return true;
        }
        return false;
    }

    public boolean mo431d() {
        boolean z;
        if (this.f2646c == null || !this.f2646c.mo431d()) {
            z = false;
        } else {
            z = true;
        }
        return z || mo425g();
    }
}
