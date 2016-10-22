import com.google.api.client.http.ExponentialBackOffPolicy;

public final class bhs {
    long a;
    long b;
    long c;
    long d;
    double e;
    long f;
    public boolean g;

    public bhs() {
        this.a = 250;
        this.b = bhr.a;
        this.c = bhr.b;
        this.d = 500;
        this.e = ExponentialBackOffPolicy.DEFAULT_MULTIPLIER;
        this.f = -1;
        this.g = false;
    }

    public bhs a(long j) {
        this.a = j;
        return this;
    }

    public bhs b(long j) {
        this.b = j;
        return this;
    }

    public bhs c(long j) {
        this.c = j;
        return this;
    }

    public bhs d(long j) {
        this.f = j;
        return this;
    }

    public bhs a(boolean z) {
        this.g = true;
        return this;
    }

    public bhr a() {
        return new bhr(this);
    }
}
