package defpackage;

import com.google.api.client.http.ExponentialBackOffPolicy;
import com.google.api.client.http.HttpStatusCodes;

/* renamed from: kft */
public final class kft {
    public int a;
    public double b;
    public double c;
    public int d;
    public int e;
    public kge f;

    public kft() {
        this.a = HttpStatusCodes.STATUS_CODE_SERVER_ERROR;
        this.b = ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR;
        this.c = ExponentialBackOffPolicy.DEFAULT_MULTIPLIER;
        this.d = ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS;
        this.e = ExponentialBackOffPolicy.DEFAULT_MAX_ELAPSED_TIME_MILLIS;
        this.f = kge.a;
    }

    public kfs a() {
        return new kfs(this);
    }

    public kft a(int i) {
        this.a = i;
        return this;
    }

    public kft a(double d) {
        this.b = d;
        return this;
    }

    public kft b(double d) {
        this.c = d;
        return this;
    }

    public kft b(int i) {
        this.d = i;
        return this;
    }

    public kft c(int i) {
        this.e = i;
        return this;
    }

    public kft a(kge kge) {
        this.f = (kge) bc.a((Object) kge);
        return this;
    }
}
