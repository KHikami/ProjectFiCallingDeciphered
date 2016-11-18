package p000;

final class apj<Z> {
    private anv f2049a;
    private aob<Z> f2050b;
    private aqp<Z> f2051c;

    apj() {
    }

    <X> void m3657a(anv anv, aob<X> aob_X, aqp<X> aqp_X) {
        this.f2049a = anv;
        this.f2050b = aob_X;
        this.f2051c = aqp_X;
    }

    void m3658a(apk apk, anz anz) {
        try {
            apk.m3661a().mo369a(this.f2049a, new arv(this.f2050b, this.f2051c, anz));
        } finally {
            this.f2051c.m3754a();
        }
    }

    boolean m3659a() {
        return this.f2051c != null;
    }

    void m3660b() {
        this.f2049a = null;
        this.f2050b = null;
        this.f2051c = null;
    }
}
