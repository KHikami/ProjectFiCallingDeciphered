public final class azq implements azi, azj {
    private azi a;
    private azi b;
    private azj c;
    private boolean d;

    public azq() {
        this(null);
    }

    public azq(azj azj) {
        this.c = azj;
    }

    public void a(azi azi, azi azi2) {
        this.a = azi;
        this.b = azi2;
    }

    public void c(azi azi) {
        if (!azi.equals(this.b)) {
            if (this.c != null) {
                this.c.c(this);
            }
            if (!this.b.f()) {
                this.b.c();
            }
        }
    }

    public void a() {
        this.d = true;
        if (!this.b.e()) {
            this.b.a();
        }
        if (this.d && !this.a.e()) {
            this.a.a();
        }
    }

    public void b() {
        this.d = false;
        this.a.b();
        this.b.b();
    }

    public void c() {
        this.d = false;
        this.b.c();
        this.a.c();
    }

    public boolean e() {
        return this.a.e();
    }

    public boolean f() {
        return this.a.f() || this.b.f();
    }

    public boolean g() {
        return this.a.g() || this.b.g();
    }

    public boolean h() {
        return this.a.h();
    }

    public void i() {
        this.a.i();
        this.b.i();
    }

    public boolean a(azi azi) {
        boolean z;
        if (this.c == null || this.c.a(this)) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (!azi.equals(this.a) && this.a.g())) {
            return false;
        }
        return true;
    }

    public boolean b(azi azi) {
        boolean z;
        if (this.c == null || this.c.b(this)) {
            z = true;
        } else {
            z = false;
        }
        if (z && azi.equals(this.a) && !d()) {
            return true;
        }
        return false;
    }

    public boolean d() {
        boolean z;
        if (this.c == null || !this.c.d()) {
            z = false;
        } else {
            z = true;
        }
        return z || g();
    }
}
