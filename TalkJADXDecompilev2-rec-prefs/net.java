package p000;

public final class net extends nyx<net> {
    public Boolean f29636a;

    public /* synthetic */ nzf m34603a(nyt nyt) {
        return m34601b(nyt);
    }

    public net() {
        m34602d();
    }

    private net m34602d() {
        this.f29636a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34604a(nyu nyu) {
        if (this.f29636a != null) {
            nyu.m37172a(1, this.f29636a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34605b() {
        int b = super.b();
        if (this.f29636a == null) {
            return b;
        }
        this.f29636a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private net m34601b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29636a = Boolean.valueOf(nyt.m37116i());
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
