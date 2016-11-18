package p000;

public final class neg extends nyx<neg> {
    public Boolean f29603a;

    public /* synthetic */ nzf m34537a(nyt nyt) {
        return m34535b(nyt);
    }

    public neg() {
        m34536d();
    }

    private neg m34536d() {
        this.f29603a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34538a(nyu nyu) {
        if (this.f29603a != null) {
            nyu.m37172a(1, this.f29603a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34539b() {
        int b = super.b();
        if (this.f29603a == null) {
            return b;
        }
        this.f29603a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private neg m34535b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29603a = Boolean.valueOf(nyt.m37116i());
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
