package p000;

public final class mdk extends nyx<mdk> {
    public Integer f27464a;
    public Integer f27465b;
    public Integer f27466c;
    public Boolean f27467d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31852b(nyt);
    }

    public mdk() {
        m31853d();
    }

    private mdk m31853d() {
        this.f27467d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27465b != null) {
            nyu.a(2, this.f27465b.intValue());
        }
        if (this.f27466c != null) {
            nyu.a(3, this.f27466c.intValue());
        }
        if (this.f27467d != null) {
            nyu.a(4, this.f27467d.booleanValue());
        }
        if (this.f27464a != null) {
            nyu.a(21, this.f27464a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27465b != null) {
            b += nyu.f(2, this.f27465b.intValue());
        }
        if (this.f27466c != null) {
            b += nyu.f(3, this.f27466c.intValue());
        }
        if (this.f27467d != null) {
            this.f27467d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f27464a != null) {
            return b + nyu.f(21, this.f27464a.intValue());
        }
        return b;
    }

    private mdk m31852b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f27465b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 10:
                        case 20:
                        case wi.dz /*25*/:
                        case 30:
                        case 100:
                            this.f27466c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.f27467d = Boolean.valueOf(nyt.i());
                    continue;
                case 168:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f27464a = Integer.valueOf(a);
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
