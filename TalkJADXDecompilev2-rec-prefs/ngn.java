package p000;

public final class ngn extends nyx<ngn> {
    public Boolean f29795a;

    public /* synthetic */ nzf m34841a(nyt nyt) {
        return m34839b(nyt);
    }

    public ngn() {
        m34840d();
    }

    private ngn m34840d() {
        this.f29795a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34842a(nyu nyu) {
        if (this.f29795a != null) {
            nyu.m37172a(1, this.f29795a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34843b() {
        int b = super.b();
        if (this.f29795a == null) {
            return b;
        }
        this.f29795a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngn m34839b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29795a = Boolean.valueOf(nyt.m37116i());
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
