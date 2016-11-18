package p000;

public final class kpv extends nyx<kpv> {
    public kqd f22702a;
    public Integer f22703b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26979b(nyt);
    }

    public kpv() {
        m26980d();
    }

    private kpv m26980d() {
        this.f22702a = null;
        this.f22703b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22702a != null) {
            nyu.b(1, this.f22702a);
        }
        if (this.f22703b != null) {
            nyu.a(2, this.f22703b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22702a != null) {
            b += nyu.d(1, this.f22702a);
        }
        if (this.f22703b != null) {
            return b + nyu.f(2, this.f22703b.intValue());
        }
        return b;
    }

    private kpv m26979b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22702a == null) {
                        this.f22702a = new kqd();
                    }
                    nyt.a(this.f22702a);
                    continue;
                case 16:
                    this.f22703b = Integer.valueOf(nyt.f());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
