package p000;

public final class nkq extends nyx<nkq> {
    public Boolean f30059a;

    public /* synthetic */ nzf m35395a(nyt nyt) {
        return m35393b(nyt);
    }

    public nkq() {
        m35394d();
    }

    private nkq m35394d() {
        this.f30059a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35396a(nyu nyu) {
        if (this.f30059a != null) {
            nyu.m37172a(1, this.f30059a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35397b() {
        int b = super.b();
        if (this.f30059a == null) {
            return b;
        }
        this.f30059a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nkq m35393b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30059a = Boolean.valueOf(nyt.m37116i());
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
