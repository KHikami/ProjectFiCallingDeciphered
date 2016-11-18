package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class ojm {
    public static final ojm f33095a = new ojm();
    private okg f33096b;
    private Executor f33097c;
    private String f33098d;
    private ojk f33099e;
    private ojh f33100f = ojh.f33081b;
    private String f33101g;
    private Object[][] f33102h = ((Object[][]) Array.newInstance(Object.class, new int[]{0, 2}));
    private boolean f33103i;

    private ojm m38568a(okg okg) {
        ojm ojm = new ojm(this);
        ojm.f33096b = okg;
        return ojm;
    }

    public ojm m38569a(long j, TimeUnit timeUnit) {
        return m38568a(okg.m38626a(j, timeUnit));
    }

    public okg m38571a() {
        return this.f33096b;
    }

    public ojh m38572b() {
        return this.f33100f;
    }

    public String m38573c() {
        return this.f33101g;
    }

    public String m38574d() {
        return this.f33098d;
    }

    public ojk m38575e() {
        return this.f33099e;
    }

    public ojm m38570a(Executor executor) {
        ojm ojm = new ojm(this);
        ojm.f33097c = executor;
        return ojm;
    }

    public Executor m38576f() {
        return this.f33097c;
    }

    private ojm() {
    }

    public boolean m38577g() {
        return this.f33103i;
    }

    private ojm(ojm ojm) {
        this.f33096b = ojm.f33096b;
        this.f33098d = ojm.f33098d;
        this.f33099e = ojm.f33099e;
        this.f33100f = ojm.f33100f;
        this.f33097c = ojm.f33097c;
        this.f33101g = ojm.f33101g;
        this.f33102h = ojm.f33102h;
        this.f33103i = ojm.f33103i;
    }

    public String toString() {
        mex P = gwb.P(this);
        P.a("deadline", this.f33096b);
        P.a("authority", this.f33098d);
        P.a("callCredentials", this.f33099e);
        P.a("affinity", this.f33100f);
        P.a("executor", this.f33097c != null ? this.f33097c.getClass() : null);
        P.a("compressorName", this.f33101g);
        P.a("customOptions", Arrays.deepToString(this.f33102h));
        P.a("waitForReady", m38577g());
        return P.toString();
    }
}
