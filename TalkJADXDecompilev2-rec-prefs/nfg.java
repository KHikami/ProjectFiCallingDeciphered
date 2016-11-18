package p000;

public final class nfg extends nyx<nfg> {
    public Boolean f29674a;

    public /* synthetic */ nzf m34668a(nyt nyt) {
        return m34666b(nyt);
    }

    public nfg() {
        m34667d();
    }

    private nfg m34667d() {
        this.f29674a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34669a(nyu nyu) {
        if (this.f29674a != null) {
            nyu.m37172a(1, this.f29674a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34670b() {
        int b = super.b();
        if (this.f29674a == null) {
            return b;
        }
        this.f29674a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nfg m34666b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29674a = Boolean.valueOf(nyt.m37116i());
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
