package p000;

public final class ndm extends nyx<ndm> {
    public Boolean f29567a;
    public ndn f29568b;

    public /* synthetic */ nzf m34436a(nyt nyt) {
        return m34435b(nyt);
    }

    public ndm() {
        this.f29567a = null;
        this.cachedSize = -1;
    }

    public void m34437a(nyu nyu) {
        if (this.f29567a != null) {
            nyu.m37172a(1, this.f29567a.booleanValue());
        }
        if (this.f29568b != null) {
            nyu.m37182b(2, this.f29568b);
        }
        super.a(nyu);
    }

    protected int m34438b() {
        int b = super.b();
        if (this.f29567a != null) {
            this.f29567a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f29568b != null) {
            return b + nyu.m37145d(2, this.f29568b);
        }
        return b;
    }

    private ndm m34435b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29567a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f29568b == null) {
                        this.f29568b = new ndn();
                    }
                    nyt.m37101a(this.f29568b);
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
