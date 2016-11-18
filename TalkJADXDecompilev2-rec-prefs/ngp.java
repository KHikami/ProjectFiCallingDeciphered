package p000;

public final class ngp extends nyx<ngp> {
    public Boolean f29797a;

    public /* synthetic */ nzf m34851a(nyt nyt) {
        return m34849b(nyt);
    }

    public ngp() {
        m34850d();
    }

    private ngp m34850d() {
        this.f29797a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34852a(nyu nyu) {
        if (this.f29797a != null) {
            nyu.m37172a(1, this.f29797a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34853b() {
        int b = super.b();
        if (this.f29797a == null) {
            return b;
        }
        this.f29797a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngp m34849b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29797a = Boolean.valueOf(nyt.m37116i());
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
