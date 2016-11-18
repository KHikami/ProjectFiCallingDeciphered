package p000;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

public final class bhr implements Serializable {
    public static final long f3369a = TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES);
    public static final long f3370b = TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS);
    private final long f3371c;
    private final long f3372d;
    private final long f3373e;
    private final long f3374f;
    private final double f3375g;
    private final boolean f3376h;
    private long f3377i = glj.m17956a();
    private long f3378j;
    private long f3379k = 0;

    bhr(bhs bhs) {
        boolean z;
        boolean z2 = true;
        this.f3371c = bhs.f3380a;
        this.f3372d = bhs.f3381b;
        this.f3373e = bhs.f3382c;
        this.f3374f = bhs.f3383d;
        this.f3375g = bhs.f3384e;
        this.f3378j = bhs.f3385f;
        this.f3376h = bhs.f3386g;
        ba.m4577a(this.f3371c > 0);
        if (this.f3372d > 0) {
            z = true;
        } else {
            z = false;
        }
        ba.m4577a(z);
        if (this.f3373e >= this.f3372d) {
            z = true;
        } else {
            z = false;
        }
        ba.m4577a(z);
        if (this.f3374f >= 0) {
            z = true;
        } else {
            z = false;
        }
        ba.m4577a(z);
        if (this.f3375g > 1.0d) {
            z = true;
        } else {
            z = false;
        }
        ba.m4577a(z);
        if (this.f3378j < -1) {
            z2 = false;
        }
        ba.m4577a(z2);
    }

    public void m5261a(long j) {
        ba.m4577a(j > -1);
        this.f3378j = j;
    }

    public void m5260a() {
        this.f3378j = -1;
    }

    public boolean m5262b() {
        return glj.m17956a() - this.f3377i >= this.f3373e;
    }

    public void m5263c() {
        this.f3379k = 0;
        this.f3377i = glj.m17956a();
    }

    public boolean m5264d() {
        return this.f3376h;
    }

    public long m5265e() {
        if (this.f3378j > -1) {
            return this.f3378j;
        }
        return this.f3379k;
    }

    public long m5266f() {
        if (m5262b()) {
            return -1;
        }
        if (this.f3378j > -1) {
            return this.f3378j;
        }
        long j;
        if (this.f3379k == 0 || this.f3379k == this.f3372d) {
            j = this.f3379k;
        } else {
            j = this.f3379k;
            if (this.f3379k > this.f3372d) {
                j = this.f3372d;
            }
            j += (long) (Math.random() * ((double) this.f3374f));
        }
        if (this.f3379k == 0) {
            this.f3379k = this.f3371c;
            return j;
        }
        this.f3379k = (long) (((double) this.f3379k) * this.f3375g);
        if (this.f3379k <= this.f3372d) {
            return j;
        }
        this.f3379k = this.f3372d;
        return j;
    }
}
