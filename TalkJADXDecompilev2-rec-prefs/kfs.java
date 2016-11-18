package p000;

public final class kfs implements kfd {
    public int f21601c;
    public final int f21602d;
    public final double f21603e;
    public final double f21604f;
    public final int f21605g;
    long f21606h;
    public final int f21607i;
    private final kge f21608j;

    public kfs() {
        this(new kft());
    }

    protected kfs(kft kft) {
        boolean z;
        boolean z2 = true;
        this.f21602d = kft.f21609a;
        this.f21603e = kft.f21610b;
        this.f21604f = kft.f21611c;
        this.f21605g = kft.f21612d;
        this.f21607i = kft.f21613e;
        this.f21608j = kft.f21614f;
        bc.m4814a(this.f21602d > 0);
        if (0.0d > this.f21603e || this.f21603e >= 1.0d) {
            z = false;
        } else {
            z = true;
        }
        bc.m4814a(z);
        if (this.f21604f >= 1.0d) {
            z = true;
        } else {
            z = false;
        }
        bc.m4814a(z);
        if (this.f21605g >= this.f21602d) {
            z = true;
        } else {
            z = false;
        }
        bc.m4814a(z);
        if (this.f21607i <= 0) {
            z2 = false;
        }
        bc.m4814a(z2);
        m25737b();
    }

    public final void m25737b() {
        this.f21601c = this.f21602d;
        this.f21606h = this.f21608j.mo3672a();
    }

    public long mo3670a() {
        if (m25738c() > ((long) this.f21607i)) {
            return -1;
        }
        double d = this.f21603e;
        double random = Math.random();
        int i = this.f21601c;
        d *= (double) i;
        double d2 = ((double) i) - d;
        int i2 = (int) (((((d + ((double) i)) - d2) + 1.0d) * random) + d2);
        if (((double) this.f21601c) >= ((double) this.f21605g) / this.f21604f) {
            this.f21601c = this.f21605g;
        } else {
            this.f21601c = (int) (((double) this.f21601c) * this.f21604f);
        }
        return (long) i2;
    }

    public final long m25738c() {
        return (this.f21608j.mo3672a() - this.f21606h) / 1000000;
    }
}
