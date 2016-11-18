package p000;

public final class nfp extends nyx<nfp> {
    public Boolean f29711a;

    public /* synthetic */ nzf m34714a(nyt nyt) {
        return m34712b(nyt);
    }

    public nfp() {
        m34713d();
    }

    private nfp m34713d() {
        this.f29711a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34715a(nyu nyu) {
        if (this.f29711a != null) {
            nyu.m37172a(1, this.f29711a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34716b() {
        int b = super.b();
        if (this.f29711a == null) {
            return b;
        }
        this.f29711a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nfp m34712b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29711a = Boolean.valueOf(nyt.m37116i());
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
