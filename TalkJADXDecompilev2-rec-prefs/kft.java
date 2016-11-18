package p000;

import com.google.api.client.http.ExponentialBackOffPolicy;

public final class kft {
    public int f21609a = 500;
    public double f21610b = ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR;
    public double f21611c = ExponentialBackOffPolicy.DEFAULT_MULTIPLIER;
    public int f21612d = ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS;
    public int f21613e = ExponentialBackOffPolicy.DEFAULT_MAX_ELAPSED_TIME_MILLIS;
    public kge f21614f = kge.f21645a;

    public kfs m25739a() {
        return new kfs(this);
    }

    public kft m25741a(int i) {
        this.f21609a = i;
        return this;
    }

    public kft m25740a(double d) {
        this.f21610b = d;
        return this;
    }

    public kft m25743b(double d) {
        this.f21611c = d;
        return this;
    }

    public kft m25744b(int i) {
        this.f21612d = i;
        return this;
    }

    public kft m25745c(int i) {
        this.f21613e = i;
        return this;
    }

    public kft m25742a(kge kge) {
        this.f21614f = (kge) bc.m4799a((Object) kge);
        return this;
    }
}
