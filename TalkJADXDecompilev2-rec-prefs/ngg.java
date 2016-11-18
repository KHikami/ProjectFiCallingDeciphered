package p000;

public final class ngg extends nyx<ngg> {
    public Boolean f29784a;

    public /* synthetic */ nzf m34806a(nyt nyt) {
        return m34804b(nyt);
    }

    public ngg() {
        m34805d();
    }

    private ngg m34805d() {
        this.f29784a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34807a(nyu nyu) {
        if (this.f29784a != null) {
            nyu.m37172a(1, this.f29784a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34808b() {
        int b = super.b();
        if (this.f29784a == null) {
            return b;
        }
        this.f29784a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngg m34804b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29784a = Boolean.valueOf(nyt.m37116i());
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
