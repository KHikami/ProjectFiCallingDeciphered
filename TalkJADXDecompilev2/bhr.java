package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

public final class bhr implements Serializable {
    public static final long a = TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES);
    public static final long b = TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS);
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final double g;
    private final boolean h;
    private long i = glj.a();
    private long j;
    private long k = 0;

    bhr(bhs bhs) {
        boolean z;
        boolean z2 = true;
        this.c = bhs.a;
        this.d = bhs.b;
        this.e = bhs.c;
        this.f = bhs.d;
        this.g = bhs.e;
        this.j = bhs.f;
        this.h = bhs.g;
        ba.a(this.c > 0);
        if (this.d > 0) {
            z = true;
        } else {
            z = false;
        }
        ba.a(z);
        if (this.e >= this.d) {
            z = true;
        } else {
            z = false;
        }
        ba.a(z);
        if (this.f >= 0) {
            z = true;
        } else {
            z = false;
        }
        ba.a(z);
        if (this.g > 1.0d) {
            z = true;
        } else {
            z = false;
        }
        ba.a(z);
        if (this.j < -1) {
            z2 = false;
        }
        ba.a(z2);
    }

    public void a(long j) {
        ba.a(j > -1);
        this.j = j;
    }

    public void a() {
        this.j = -1;
    }

    public boolean b() {
        return glj.a() - this.i >= this.e;
    }

    public void c() {
        this.k = 0;
        this.i = glj.a();
    }

    public boolean d() {
        return this.h;
    }

    public long e() {
        if (this.j > -1) {
            return this.j;
        }
        return this.k;
    }

    public long f() {
        if (b()) {
            return -1;
        }
        if (this.j > -1) {
            return this.j;
        }
        long j;
        if (this.k == 0 || this.k == this.d) {
            j = this.k;
        } else {
            j = this.k;
            if (this.k > this.d) {
                j = this.d;
            }
            j += (long) (Math.random() * ((double) this.f));
        }
        if (this.k == 0) {
            this.k = this.c;
            return j;
        }
        this.k = (long) (((double) this.k) * this.g);
        if (this.k <= this.d) {
            return j;
        }
        this.k = this.d;
        return j;
    }
}
