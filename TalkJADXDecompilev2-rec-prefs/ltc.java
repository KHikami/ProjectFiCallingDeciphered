package p000;

public final class ltc extends nyx<ltc> {
    public lor f26365a;
    public Integer f26366b;
    public Long f26367c;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30414b(nyt);
    }

    public ltc() {
        m30415d();
    }

    private ltc m30415d() {
        this.requestHeader = null;
        this.f26365a = null;
        this.f26367c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26365a != null) {
            nyu.b(2, this.f26365a);
        }
        if (this.f26366b != null) {
            nyu.a(3, this.f26366b.intValue());
        }
        if (this.f26367c != null) {
            nyu.a(4, this.f26367c.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26365a != null) {
            b += nyu.d(2, this.f26365a);
        }
        if (this.f26366b != null) {
            b += nyu.f(3, this.f26366b.intValue());
        }
        if (this.f26367c != null) {
            return b + nyu.e(4, this.f26367c.longValue());
        }
        return b;
    }

    private ltc m30414b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26365a == null) {
                        this.f26365a = new lor();
                    }
                    nyt.a(this.f26365a);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26366b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.f26367c = Long.valueOf(nyt.d());
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
