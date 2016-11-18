package p000;

public final class lzj extends nyx<lzj> {
    public Long f27002a;
    public String f27003b;
    public lzk f27004c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31278b(nyt);
    }

    public lzj() {
        m31279d();
    }

    private lzj m31279d() {
        this.f27002a = null;
        this.f27003b = null;
        this.f27004c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27002a != null) {
            nyu.b(1, this.f27002a.longValue());
        }
        if (this.f27003b != null) {
            nyu.a(2, this.f27003b);
        }
        if (this.f27004c != null) {
            nyu.b(3, this.f27004c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27002a != null) {
            b += nyu.f(1, this.f27002a.longValue());
        }
        if (this.f27003b != null) {
            b += nyu.b(2, this.f27003b);
        }
        if (this.f27004c != null) {
            return b + nyu.d(3, this.f27004c);
        }
        return b;
    }

    private lzj m31278b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27002a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    this.f27003b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f27004c == null) {
                        this.f27004c = new lzk();
                    }
                    nyt.a(this.f27004c);
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
