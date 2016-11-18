package p000;

public final class lui extends nyx<lui> {
    public lqm f26483a;
    public ltr f26484b;
    public byte[] f26485c;
    public Long f26486d;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30597b(nyt);
    }

    public lui() {
        m30598d();
    }

    private lui m30598d() {
        this.requestHeader = null;
        this.f26483a = null;
        this.f26484b = null;
        this.f26485c = null;
        this.f26486d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26485c != null) {
            nyu.a(2, this.f26485c);
        }
        if (this.f26484b != null) {
            nyu.b(3, this.f26484b);
        }
        if (this.f26486d != null) {
            nyu.a(4, this.f26486d.longValue());
        }
        if (this.f26483a != null) {
            nyu.b(5, this.f26483a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26485c != null) {
            b += nyu.b(2, this.f26485c);
        }
        if (this.f26484b != null) {
            b += nyu.d(3, this.f26484b);
        }
        if (this.f26486d != null) {
            b += nyu.e(4, this.f26486d.longValue());
        }
        if (this.f26483a != null) {
            return b + nyu.d(5, this.f26483a);
        }
        return b;
    }

    private lui m30597b(nyt nyt) {
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
                    this.f26485c = nyt.k();
                    continue;
                case wi.dx /*26*/:
                    if (this.f26484b == null) {
                        this.f26484b = new ltr();
                    }
                    nyt.a(this.f26484b);
                    continue;
                case 32:
                    this.f26486d = Long.valueOf(nyt.d());
                    continue;
                case 42:
                    if (this.f26483a == null) {
                        this.f26483a = new lqm();
                    }
                    nyt.a(this.f26483a);
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
