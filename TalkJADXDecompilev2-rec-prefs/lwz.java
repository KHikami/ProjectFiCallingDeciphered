package p000;

public final class lwz extends nyx<lwz> {
    public lor f26738a;
    public Long f26739b;
    public Integer f26740c;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30949b(nyt);
    }

    public lwz() {
        m30950d();
    }

    private lwz m30950d() {
        this.requestHeader = null;
        this.f26738a = null;
        this.f26739b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26738a != null) {
            nyu.b(2, this.f26738a);
        }
        if (this.f26739b != null) {
            nyu.a(3, this.f26739b.longValue());
        }
        if (this.f26740c != null) {
            nyu.a(4, this.f26740c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26738a != null) {
            b += nyu.d(2, this.f26738a);
        }
        if (this.f26739b != null) {
            b += nyu.e(3, this.f26739b.longValue());
        }
        if (this.f26740c != null) {
            return b + nyu.f(4, this.f26740c.intValue());
        }
        return b;
    }

    private lwz m30949b(nyt nyt) {
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
                    if (this.f26738a == null) {
                        this.f26738a = new lor();
                    }
                    nyt.a(this.f26738a);
                    continue;
                case wi.dA /*24*/:
                    this.f26739b = Long.valueOf(nyt.d());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f26740c = Integer.valueOf(a);
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
