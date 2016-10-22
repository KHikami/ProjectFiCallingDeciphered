package io.grpc.internal;

import cob;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class g {
    Random a;
    long b;
    long c;
    double d;
    double e;
    long f;

    public long a() {
        long j = this.f;
        this.f = Math.min((long) (((double) j) * this.d), this.c);
        return j + a((-this.e) * ((double) j), this.e * ((double) j));
    }

    g() {
        this.a = new Random();
        this.b = TimeUnit.SECONDS.toMillis(1);
        this.c = TimeUnit.MINUTES.toMillis(2);
        this.d = 1.6d;
        this.e = 0.2d;
        this.f = this.b;
    }

    long a(double d, double d2) {
        cob.a(d2 >= d);
        return (long) (((d2 - d) * this.a.nextDouble()) + d);
    }
}
