package defpackage;

/* renamed from: kfs */
public final class kfs implements kfd {
    public int c;
    public final int d;
    public final double e;
    public final double f;
    public final int g;
    long h;
    public final int i;
    private final kge j;

    public kfs() {
        this(new kft());
    }

    protected kfs(kft kft) {
        boolean z;
        boolean z2 = true;
        this.d = kft.a;
        this.e = kft.b;
        this.f = kft.c;
        this.g = kft.d;
        this.i = kft.e;
        this.j = kft.f;
        bc.a(this.d > 0);
        if (0.0d > this.e || this.e >= 1.0d) {
            z = false;
        } else {
            z = true;
        }
        bc.a(z);
        if (this.f >= 1.0d) {
            z = true;
        } else {
            z = false;
        }
        bc.a(z);
        if (this.g >= this.d) {
            z = true;
        } else {
            z = false;
        }
        bc.a(z);
        if (this.i <= 0) {
            z2 = false;
        }
        bc.a(z2);
        b();
    }

    public final void b() {
        this.c = this.d;
        this.h = this.j.a();
    }

    public long a() {
        if (c() > ((long) this.i)) {
            return -1;
        }
        double d = this.e;
        double random = Math.random();
        int i = this.c;
        d *= (double) i;
        double d2 = ((double) i) - d;
        int i2 = (int) (((((d + ((double) i)) - d2) + 1.0d) * random) + d2);
        if (((double) this.c) >= ((double) this.g) / this.f) {
            this.c = this.g;
        } else {
            this.c = (int) (((double) this.c) * this.f);
        }
        return (long) i2;
    }

    public final long c() {
        return (this.j.a() - this.h) / 1000000;
    }
}
