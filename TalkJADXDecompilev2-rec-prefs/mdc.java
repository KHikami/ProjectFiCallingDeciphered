package p000;

public final class mdc extends nyx<mdc> {
    public Long f27438a;
    public Integer f27439b;
    public Integer f27440c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31810b(nyt);
    }

    public mdc() {
        m31811d();
    }

    private mdc m31811d() {
        this.f27438a = null;
        this.f27440c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27438a != null) {
            nyu.a(1, this.f27438a.longValue());
        }
        if (this.f27439b != null) {
            nyu.a(2, this.f27439b.intValue());
        }
        if (this.f27440c != null) {
            nyu.a(3, this.f27440c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27438a != null) {
            b += nyu.e(1, this.f27438a.longValue());
        }
        if (this.f27439b != null) {
            b += nyu.f(2, this.f27439b.intValue());
        }
        if (this.f27440c != null) {
            return b + nyu.f(3, this.f27440c.intValue());
        }
        return b;
    }

    private mdc m31810b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27438a = Long.valueOf(nyt.d());
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f27439b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f27440c = Integer.valueOf(nyt.f());
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
