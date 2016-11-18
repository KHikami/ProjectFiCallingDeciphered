package p000;

public final class mbv extends nyx<mbv> {
    public Long f27275a;
    public Long f27276b;
    public Integer f27277c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31639b(nyt);
    }

    public mbv() {
        m31640d();
    }

    private mbv m31640d() {
        this.f27275a = null;
        this.f27276b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27275a != null) {
            nyu.b(1, this.f27275a.longValue());
        }
        if (this.f27276b != null) {
            nyu.b(2, this.f27276b.longValue());
        }
        if (this.f27277c != null) {
            nyu.a(3, this.f27277c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27275a != null) {
            b += nyu.f(1, this.f27275a.longValue());
        }
        if (this.f27276b != null) {
            b += nyu.f(2, this.f27276b.longValue());
        }
        if (this.f27277c != null) {
            return b + nyu.f(3, this.f27277c.intValue());
        }
        return b;
    }

    private mbv m31639b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27275a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.f27276b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f27277c = Integer.valueOf(a);
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
