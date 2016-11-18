package p000;

public final class lcz extends nyx<lcz> {
    private static volatile lcz[] f24635h;
    public ldz f24636a;
    public String f24637b;
    public Integer f24638c;
    public lda f24639d;
    public lcq f24640e;
    public ldb f24641f;
    public lcr f24642g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28686b(nyt);
    }

    public static lcz[] m28687d() {
        if (f24635h == null) {
            synchronized (nzc.c) {
                if (f24635h == null) {
                    f24635h = new lcz[0];
                }
            }
        }
        return f24635h;
    }

    public lcz() {
        m28688g();
    }

    private lcz m28688g() {
        this.f24636a = null;
        this.f24637b = null;
        this.f24639d = null;
        this.f24640e = null;
        this.f24641f = null;
        this.f24642g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24636a != null) {
            nyu.b(1, this.f24636a);
        }
        if (this.f24637b != null) {
            nyu.a(2, this.f24637b);
        }
        if (this.f24638c != null) {
            nyu.a(3, this.f24638c.intValue());
        }
        if (this.f24639d != null) {
            nyu.b(4, this.f24639d);
        }
        if (this.f24640e != null) {
            nyu.b(5, this.f24640e);
        }
        if (this.f24641f != null) {
            nyu.b(6, this.f24641f);
        }
        if (this.f24642g != null) {
            nyu.b(7, this.f24642g);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24636a != null) {
            b += nyu.d(1, this.f24636a);
        }
        if (this.f24637b != null) {
            b += nyu.b(2, this.f24637b);
        }
        if (this.f24638c != null) {
            b += nyu.f(3, this.f24638c.intValue());
        }
        if (this.f24639d != null) {
            b += nyu.d(4, this.f24639d);
        }
        if (this.f24640e != null) {
            b += nyu.d(5, this.f24640e);
        }
        if (this.f24641f != null) {
            b += nyu.d(6, this.f24641f);
        }
        if (this.f24642g != null) {
            return b + nyu.d(7, this.f24642g);
        }
        return b;
    }

    private lcz m28686b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24636a == null) {
                        this.f24636a = new ldz();
                    }
                    nyt.a(this.f24636a);
                    continue;
                case wi.dH /*18*/:
                    this.f24637b = nyt.j();
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
                            this.f24638c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f24639d == null) {
                        this.f24639d = new lda();
                    }
                    nyt.a(this.f24639d);
                    continue;
                case 42:
                    if (this.f24640e == null) {
                        this.f24640e = new lcq();
                    }
                    nyt.a(this.f24640e);
                    continue;
                case 50:
                    if (this.f24641f == null) {
                        this.f24641f = new ldb();
                    }
                    nyt.a(this.f24641f);
                    continue;
                case 58:
                    if (this.f24642g == null) {
                        this.f24642g = new lcr();
                    }
                    nyt.a(this.f24642g);
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
