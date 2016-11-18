package p000;

public final class muq extends nyx<muq> {
    public Integer f28398a;
    public Integer f28399b;
    public Double f28400c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32988b(nyt);
    }

    public muq() {
        m32989d();
    }

    private muq m32989d() {
        this.f28398a = null;
        this.f28399b = null;
        this.f28400c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28398a != null) {
            nyu.a(1, this.f28398a.intValue());
        }
        if (this.f28399b != null) {
            nyu.a(2, this.f28399b.intValue());
        }
        if (this.f28400c != null) {
            nyu.a(3, this.f28400c.doubleValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28398a != null) {
            b += nyu.f(1, this.f28398a.intValue());
        }
        if (this.f28399b != null) {
            b += nyu.f(2, this.f28399b.intValue());
        }
        if (this.f28400c == null) {
            return b;
        }
        this.f28400c.doubleValue();
        return b + (nyu.h(3) + 8);
    }

    private muq m32988b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28398a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f28399b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dz /*25*/:
                    this.f28400c = Double.valueOf(nyt.b());
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
