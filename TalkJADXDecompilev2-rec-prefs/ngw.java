package p000;

public final class ngw extends nyx<ngw> {
    public Boolean f29806a;
    public Boolean f29807b;
    public nmk f29808c;
    public ngx f29809d;
    public nhg f29810e;

    public /* synthetic */ nzf m34886a(nyt nyt) {
        return m34884b(nyt);
    }

    public ngw() {
        m34885d();
    }

    private ngw m34885d() {
        this.f29806a = null;
        this.f29807b = null;
        this.f29808c = null;
        this.f29809d = null;
        this.f29810e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34887a(nyu nyu) {
        if (this.f29806a != null) {
            nyu.m37172a(1, this.f29806a.booleanValue());
        }
        if (this.f29808c != null) {
            nyu.m37182b(2, this.f29808c);
        }
        if (this.f29809d != null) {
            nyu.m37182b(3, this.f29809d);
        }
        if (this.f29810e != null) {
            nyu.m37182b(4, this.f29810e);
        }
        if (this.f29807b != null) {
            nyu.m37172a(5, this.f29807b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34888b() {
        int b = super.b();
        if (this.f29806a != null) {
            this.f29806a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f29808c != null) {
            b += nyu.m37145d(2, this.f29808c);
        }
        if (this.f29809d != null) {
            b += nyu.m37145d(3, this.f29809d);
        }
        if (this.f29810e != null) {
            b += nyu.m37145d(4, this.f29810e);
        }
        if (this.f29807b == null) {
            return b;
        }
        this.f29807b.booleanValue();
        return b + (nyu.m37154h(5) + 1);
    }

    private ngw m34884b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29806a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f29808c == null) {
                        this.f29808c = new nmk();
                    }
                    nyt.m37101a(this.f29808c);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29809d == null) {
                        this.f29809d = new ngx();
                    }
                    nyt.m37101a(this.f29809d);
                    continue;
                case 34:
                    if (this.f29810e == null) {
                        this.f29810e = new nhg();
                    }
                    nyt.m37101a(this.f29810e);
                    continue;
                case 40:
                    this.f29807b = Boolean.valueOf(nyt.m37116i());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
