package p000;

public final class lvd extends nyx<lvd> {
    public Integer f26578a;
    public Long f26579b;
    public Long f26580c;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30703b(nyt);
    }

    public lvd() {
        m30704d();
    }

    private lvd m30704d() {
        this.responseHeader = null;
        this.f26579b = null;
        this.f26580c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26578a != null) {
            nyu.a(2, this.f26578a.intValue());
        }
        if (this.f26579b != null) {
            nyu.a(3, this.f26579b.longValue());
        }
        if (this.f26580c != null) {
            nyu.a(4, this.f26580c.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26578a != null) {
            b += nyu.f(2, this.f26578a.intValue());
        }
        if (this.f26579b != null) {
            b += nyu.e(3, this.f26579b.longValue());
        }
        if (this.f26580c != null) {
            return b + nyu.e(4, this.f26580c.longValue());
        }
        return b;
    }

    private lvd m30703b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                            this.f26578a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f26579b = Long.valueOf(nyt.d());
                    continue;
                case 32:
                    this.f26580c = Long.valueOf(nyt.d());
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
