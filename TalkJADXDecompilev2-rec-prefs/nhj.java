package p000;

public final class nhj extends nyx<nhj> {
    public Boolean f29834a;

    public /* synthetic */ nzf m34957a(nyt nyt) {
        return m34955b(nyt);
    }

    public nhj() {
        m34956d();
    }

    private nhj m34956d() {
        this.f29834a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34958a(nyu nyu) {
        if (this.f29834a != null) {
            nyu.m37172a(1, this.f29834a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34959b() {
        int b = super.b();
        if (this.f29834a == null) {
            return b;
        }
        this.f29834a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nhj m34955b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29834a = Boolean.valueOf(nyt.m37116i());
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
