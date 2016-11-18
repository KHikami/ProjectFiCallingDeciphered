package p000;

public final class nhm extends nyx<nhm> {
    public Boolean f29838a;

    public /* synthetic */ nzf m34972a(nyt nyt) {
        return m34970b(nyt);
    }

    public nhm() {
        m34971d();
    }

    private nhm m34971d() {
        this.f29838a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34973a(nyu nyu) {
        if (this.f29838a != null) {
            nyu.m37172a(1, this.f29838a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34974b() {
        int b = super.b();
        if (this.f29838a == null) {
            return b;
        }
        this.f29838a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nhm m34970b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29838a = Boolean.valueOf(nyt.m37116i());
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
