package p000;

public final class lvv extends nyx<lvv> {
    public lor f26621a;
    public ltr f26622b;
    public Long f26623c;
    public Integer f26624d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30793b(nyt);
    }

    public lvv() {
        m30794d();
    }

    private lvv m30794d() {
        this.f26621a = null;
        this.f26622b = null;
        this.f26623c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26621a != null) {
            nyu.b(1, this.f26621a);
        }
        if (this.f26622b != null) {
            nyu.b(2, this.f26622b);
        }
        if (this.f26623c != null) {
            nyu.a(3, this.f26623c.longValue());
        }
        if (this.f26624d != null) {
            nyu.a(4, this.f26624d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26621a != null) {
            b += nyu.d(1, this.f26621a);
        }
        if (this.f26622b != null) {
            b += nyu.d(2, this.f26622b);
        }
        if (this.f26623c != null) {
            b += nyu.e(3, this.f26623c.longValue());
        }
        if (this.f26624d != null) {
            return b + nyu.f(4, this.f26624d.intValue());
        }
        return b;
    }

    private lvv m30793b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26621a == null) {
                        this.f26621a = new lor();
                    }
                    nyt.a(this.f26621a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26622b == null) {
                        this.f26622b = new ltr();
                    }
                    nyt.a(this.f26622b);
                    continue;
                case wi.dA /*24*/:
                    this.f26623c = Long.valueOf(nyt.d());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f26624d = Integer.valueOf(a);
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
