package p000;

public final class C0222new extends nyx<C0222new> {
    public Boolean f29644a;

    public /* synthetic */ nzf m34618a(nyt nyt) {
        return m34616b(nyt);
    }

    public C0222new() {
        m34617d();
    }

    private C0222new m34617d() {
        this.f29644a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34619a(nyu nyu) {
        if (this.f29644a != null) {
            nyu.m37172a(1, this.f29644a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34620b() {
        int b = super.b();
        if (this.f29644a == null) {
            return b;
        }
        this.f29644a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private C0222new m34616b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29644a = Boolean.valueOf(nyt.m37116i());
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
