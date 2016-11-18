package p000;

public final class les extends nyx<les> {
    public String f24863a;
    public let f24864b;
    public Integer f24865c;
    public ler f24866d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28920b(nyt);
    }

    public les() {
        m28921d();
    }

    private les m28921d() {
        this.f24863a = null;
        this.f24864b = null;
        this.f24866d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24863a != null) {
            nyu.a(1, this.f24863a);
        }
        if (this.f24864b != null) {
            nyu.b(2, this.f24864b);
        }
        if (this.f24865c != null) {
            nyu.a(3, this.f24865c.intValue());
        }
        if (this.f24866d != null) {
            nyu.b(4, this.f24866d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24863a != null) {
            b += nyu.b(1, this.f24863a);
        }
        if (this.f24864b != null) {
            b += nyu.d(2, this.f24864b);
        }
        if (this.f24865c != null) {
            b += nyu.f(3, this.f24865c.intValue());
        }
        if (this.f24866d != null) {
            return b + nyu.d(4, this.f24866d);
        }
        return b;
    }

    private les m28920b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24863a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f24864b == null) {
                        this.f24864b = new let();
                    }
                    nyt.a(this.f24864b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f24865c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f24866d == null) {
                        this.f24866d = new ler();
                    }
                    nyt.a(this.f24866d);
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
