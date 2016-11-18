package p000;

final class aqp<Z> implements aqr<Z>, bay {
    private static final ll<aqp<?>> f2154a = bas.m4695b(20, new aqq());
    private final bba f2155b = bba.m4705a();
    private aqr<Z> f2156c;
    private boolean f2157d;
    private boolean f2158e;

    static <Z> aqp<Z> m3753a(aqr<Z> aqr_Z) {
        aqp<Z> aqp_Z = (aqp) f2154a.mo436a();
        aqp_Z.f2158e = false;
        aqp_Z.f2157d = true;
        aqp_Z.f2156c = aqr_Z;
        return aqp_Z;
    }

    aqp() {
    }

    public synchronized void m3754a() {
        this.f2155b.mo439b();
        if (this.f2157d) {
            this.f2157d = false;
            if (this.f2158e) {
                mo348e();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public Class<Z> mo345b() {
        return this.f2156c.mo345b();
    }

    public Z mo346c() {
        return this.f2156c.mo346c();
    }

    public int mo347d() {
        return this.f2156c.mo347d();
    }

    public synchronized void mo348e() {
        this.f2155b.mo439b();
        this.f2158e = true;
        if (!this.f2157d) {
            this.f2156c.mo348e();
            this.f2156c = null;
            f2154a.mo437a(this);
        }
    }

    public bba j_() {
        return this.f2155b;
    }
}
