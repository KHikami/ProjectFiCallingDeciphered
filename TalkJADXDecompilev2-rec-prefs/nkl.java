package p000;

public final class nkl extends nyx<nkl> {
    public Boolean f30040a;

    public /* synthetic */ nzf m35370a(nyt nyt) {
        return m35368b(nyt);
    }

    public nkl() {
        m35369d();
    }

    private nkl m35369d() {
        this.f30040a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35371a(nyu nyu) {
        if (this.f30040a != null) {
            nyu.m37172a(1, this.f30040a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35372b() {
        int b = super.b();
        if (this.f30040a == null) {
            return b;
        }
        this.f30040a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nkl m35368b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30040a = Boolean.valueOf(nyt.m37116i());
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
