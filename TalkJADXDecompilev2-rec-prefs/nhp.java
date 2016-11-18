package p000;

public final class nhp extends nyx<nhp> {
    public Boolean f29841a;

    public /* synthetic */ nzf m34987a(nyt nyt) {
        return m34985b(nyt);
    }

    public nhp() {
        m34986d();
    }

    private nhp m34986d() {
        this.f29841a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34988a(nyu nyu) {
        if (this.f29841a != null) {
            nyu.m37172a(1, this.f29841a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34989b() {
        int b = super.b();
        if (this.f29841a == null) {
            return b;
        }
        this.f29841a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nhp m34985b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29841a = Boolean.valueOf(nyt.m37116i());
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
