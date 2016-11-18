package p000;

import com.google.api.client.http.ExponentialBackOffPolicy;

public final class bhs {
    long f3380a = 250;
    long f3381b = bhr.f3369a;
    long f3382c = bhr.f3370b;
    long f3383d = 500;
    double f3384e = ExponentialBackOffPolicy.DEFAULT_MULTIPLIER;
    long f3385f = -1;
    public boolean f3386g = false;

    public bhs m5268a(long j) {
        this.f3380a = j;
        return this;
    }

    public bhs m5270b(long j) {
        this.f3381b = j;
        return this;
    }

    public bhs m5271c(long j) {
        this.f3382c = j;
        return this;
    }

    public bhs m5272d(long j) {
        this.f3385f = j;
        return this;
    }

    public bhs m5269a(boolean z) {
        this.f3386g = true;
        return this;
    }

    public bhr m5267a() {
        return new bhr(this);
    }
}
