package p000;

public final class luk extends nyx<luk> {
    public lqm f26491a;
    public String f26492b;
    public byte[] f26493c;
    public Long f26494d;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30607b(nyt);
    }

    public luk() {
        m30608d();
    }

    private luk m30608d() {
        this.requestHeader = null;
        this.f26491a = null;
        this.f26492b = null;
        this.f26493c = null;
        this.f26494d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26493c != null) {
            nyu.a(2, this.f26493c);
        }
        if (this.f26492b != null) {
            nyu.a(3, this.f26492b);
        }
        if (this.f26494d != null) {
            nyu.a(4, this.f26494d.longValue());
        }
        if (this.f26491a != null) {
            nyu.b(5, this.f26491a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26493c != null) {
            b += nyu.b(2, this.f26493c);
        }
        if (this.f26492b != null) {
            b += nyu.b(3, this.f26492b);
        }
        if (this.f26494d != null) {
            b += nyu.e(4, this.f26494d.longValue());
        }
        if (this.f26491a != null) {
            return b + nyu.d(5, this.f26491a);
        }
        return b;
    }

    private luk m30607b(nyt nyt) {
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
                    this.f26493c = nyt.k();
                    continue;
                case wi.dx /*26*/:
                    this.f26492b = nyt.j();
                    continue;
                case 32:
                    this.f26494d = Long.valueOf(nyt.d());
                    continue;
                case 42:
                    if (this.f26491a == null) {
                        this.f26491a = new lqm();
                    }
                    nyt.a(this.f26491a);
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
