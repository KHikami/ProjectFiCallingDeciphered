package p000;

public final class ndj extends nyx<ndj> {
    public Boolean f29560a;
    public ndm f29561b;

    public /* synthetic */ nzf m34423a(nyt nyt) {
        return m34422b(nyt);
    }

    public ndj() {
        this.f29560a = null;
        this.cachedSize = -1;
    }

    public void m34424a(nyu nyu) {
        if (this.f29560a != null) {
            nyu.m37172a(1, this.f29560a.booleanValue());
        }
        if (this.f29561b != null) {
            nyu.m37182b(2, this.f29561b);
        }
        super.a(nyu);
    }

    protected int m34425b() {
        int b = super.b();
        if (this.f29560a != null) {
            this.f29560a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f29561b != null) {
            return b + nyu.m37145d(2, this.f29561b);
        }
        return b;
    }

    private ndj m34422b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29560a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f29561b == null) {
                        this.f29561b = new ndm();
                    }
                    nyt.m37101a(this.f29561b);
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
