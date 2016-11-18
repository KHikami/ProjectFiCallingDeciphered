package p000;

public final class kgx extends nyx<kgx> {
    public String f21669a;
    public Integer f21670b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25783b(nyt);
    }

    public kgx() {
        m25784d();
    }

    private kgx m25784d() {
        this.f21669a = null;
        this.f21670b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21669a != null) {
            nyu.a(1, this.f21669a);
        }
        if (this.f21670b != null) {
            nyu.a(2, this.f21670b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21669a != null) {
            b += nyu.b(1, this.f21669a);
        }
        if (this.f21670b != null) {
            return b + nyu.f(2, this.f21670b.intValue());
        }
        return b;
    }

    private kgx m25783b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21669a = nyt.j();
                    continue;
                case 16:
                    this.f21670b = Integer.valueOf(nyt.f());
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
