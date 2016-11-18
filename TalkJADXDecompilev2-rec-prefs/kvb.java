package p000;

public final class kvb extends nyx<kvb> {
    public String f23560a;
    public String f23561b;
    public Boolean f23562c;
    public String f23563d;
    public String f23564e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27657b(nyt);
    }

    public kvb() {
        m27658d();
    }

    private kvb m27658d() {
        this.f23560a = null;
        this.f23561b = null;
        this.f23562c = null;
        this.f23563d = null;
        this.f23564e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23560a != null) {
            nyu.a(1, this.f23560a);
        }
        if (this.f23561b != null) {
            nyu.a(2, this.f23561b);
        }
        if (this.f23562c != null) {
            nyu.a(3, this.f23562c.booleanValue());
        }
        if (this.f23563d != null) {
            nyu.a(4, this.f23563d);
        }
        if (this.f23564e != null) {
            nyu.a(5, this.f23564e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23560a != null) {
            b += nyu.b(1, this.f23560a);
        }
        if (this.f23561b != null) {
            b += nyu.b(2, this.f23561b);
        }
        if (this.f23562c != null) {
            this.f23562c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f23563d != null) {
            b += nyu.b(4, this.f23563d);
        }
        if (this.f23564e != null) {
            return b + nyu.b(5, this.f23564e);
        }
        return b;
    }

    private kvb m27657b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23560a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23561b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f23562c = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    this.f23563d = nyt.j();
                    continue;
                case 42:
                    this.f23564e = nyt.j();
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
