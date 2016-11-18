package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class ojm {
    public static final ojm a = new ojm();
    private okg b;
    private Executor c;
    private String d;
    private ojk e;
    private ojh f = ojh.b;
    private String g;
    private Object[][] h = ((Object[][]) Array.newInstance(Object.class, new int[]{0, 2}));
    private boolean i;

    private ojm a(okg okg) {
        ojm ojm = new ojm(this);
        ojm.b = okg;
        return ojm;
    }

    public ojm a(long j, TimeUnit timeUnit) {
        return a(okg.a(j, timeUnit));
    }

    public okg a() {
        return this.b;
    }

    public ojh b() {
        return this.f;
    }

    public String c() {
        return this.g;
    }

    public String d() {
        return this.d;
    }

    public ojk e() {
        return this.e;
    }

    public ojm a(Executor executor) {
        ojm ojm = new ojm(this);
        ojm.c = executor;
        return ojm;
    }

    public Executor f() {
        return this.c;
    }

    private ojm() {
    }

    public boolean g() {
        return this.i;
    }

    private ojm(ojm ojm) {
        this.b = ojm.b;
        this.d = ojm.d;
        this.e = ojm.e;
        this.f = ojm.f;
        this.c = ojm.c;
        this.g = ojm.g;
        this.h = ojm.h;
        this.i = ojm.i;
    }

    public String toString() {
        mex P = gwb.P(this);
        P.a("deadline", this.b);
        P.a("authority", this.d);
        P.a("callCredentials", this.e);
        P.a("affinity", this.f);
        P.a("executor", this.c != null ? this.c.getClass() : null);
        P.a("compressorName", this.g);
        P.a("customOptions", Arrays.deepToString(this.h));
        P.a("waitForReady", g());
        return P.toString();
    }
}
