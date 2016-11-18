package p000;

public final class lzq extends nyx<lzq> {
    public Integer f27023a;
    public Integer f27024b;
    public Integer f27025c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31315b(nyt);
    }

    public lzq() {
        m31316d();
    }

    private lzq m31316d() {
        this.f27023a = null;
        this.f27024b = null;
        this.f27025c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27023a != null) {
            nyu.c(1, this.f27023a.intValue());
        }
        if (this.f27024b != null) {
            nyu.c(2, this.f27024b.intValue());
        }
        if (this.f27025c != null) {
            nyu.c(3, this.f27025c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27023a != null) {
            b += nyu.g(1, this.f27023a.intValue());
        }
        if (this.f27024b != null) {
            b += nyu.g(2, this.f27024b.intValue());
        }
        if (this.f27025c != null) {
            return b + nyu.g(3, this.f27025c.intValue());
        }
        return b;
    }

    private lzq m31315b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27023a = Integer.valueOf(nyt.l());
                    continue;
                case 16:
                    this.f27024b = Integer.valueOf(nyt.l());
                    continue;
                case wi.dA /*24*/:
                    this.f27025c = Integer.valueOf(nyt.l());
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
