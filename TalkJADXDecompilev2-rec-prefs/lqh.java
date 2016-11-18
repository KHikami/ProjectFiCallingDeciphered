package p000;

public final class lqh extends nyx<lqh> {
    public ltr f26131a;
    public Long f26132b;
    public Integer f26133c;
    public lwm f26134d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30030b(nyt);
    }

    public lqh() {
        m30031d();
    }

    private lqh m30031d() {
        this.f26131a = null;
        this.f26132b = null;
        this.f26134d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26131a != null) {
            nyu.b(1, this.f26131a);
        }
        if (this.f26132b != null) {
            nyu.a(2, this.f26132b.longValue());
        }
        if (this.f26133c != null) {
            nyu.a(3, this.f26133c.intValue());
        }
        if (this.f26134d != null) {
            nyu.b(4, this.f26134d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26131a != null) {
            b += nyu.d(1, this.f26131a);
        }
        if (this.f26132b != null) {
            b += nyu.e(2, this.f26132b.longValue());
        }
        if (this.f26133c != null) {
            b += nyu.f(3, this.f26133c.intValue());
        }
        if (this.f26134d != null) {
            return b + nyu.d(4, this.f26134d);
        }
        return b;
    }

    private lqh m30030b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26131a == null) {
                        this.f26131a = new ltr();
                    }
                    nyt.a(this.f26131a);
                    continue;
                case 16:
                    this.f26132b = Long.valueOf(nyt.d());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 10:
                        case 20:
                        case wi.dz /*25*/:
                        case 30:
                        case 100:
                            this.f26133c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f26134d == null) {
                        this.f26134d = new lwm();
                    }
                    nyt.a(this.f26134d);
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
