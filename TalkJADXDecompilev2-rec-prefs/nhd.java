package p000;

public final class nhd extends nyx<nhd> {
    public Boolean f29822a;

    public /* synthetic */ nzf m34927a(nyt nyt) {
        return m34925b(nyt);
    }

    public nhd() {
        m34926d();
    }

    private nhd m34926d() {
        this.f29822a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34928a(nyu nyu) {
        if (this.f29822a != null) {
            nyu.m37172a(1, this.f29822a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34929b() {
        int b = super.b();
        if (this.f29822a == null) {
            return b;
        }
        this.f29822a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nhd m34925b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29822a = Boolean.valueOf(nyt.m37116i());
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
