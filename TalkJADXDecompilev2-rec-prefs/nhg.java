package p000;

public final class nhg extends nyx<nhg> {
    public Boolean f29831a;

    public /* synthetic */ nzf m34942a(nyt nyt) {
        return m34940b(nyt);
    }

    public nhg() {
        m34941d();
    }

    private nhg m34941d() {
        this.f29831a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34943a(nyu nyu) {
        if (this.f29831a != null) {
            nyu.m37172a(1, this.f29831a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34944b() {
        int b = super.b();
        if (this.f29831a == null) {
            return b;
        }
        this.f29831a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nhg m34940b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29831a = Boolean.valueOf(nyt.m37116i());
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
