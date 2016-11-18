package p000;

public final class mcg extends nyx<mcg> {
    public Integer f27318a;
    public Boolean f27319b;
    public Integer f27320c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31696b(nyt);
    }

    public mcg() {
        m31697d();
    }

    private mcg m31697d() {
        this.f27319b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27318a != null) {
            nyu.a(1, this.f27318a.intValue());
        }
        if (this.f27319b != null) {
            nyu.a(2, this.f27319b.booleanValue());
        }
        if (this.f27320c != null) {
            nyu.a(3, this.f27320c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27318a != null) {
            b += nyu.f(1, this.f27318a.intValue());
        }
        if (this.f27319b != null) {
            this.f27319b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f27320c != null) {
            return b + nyu.f(3, this.f27320c.intValue());
        }
        return b;
    }

    private mcg m31696b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f27318a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f27319b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f27320c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
