package p000;

public final class nkg extends nyx<nkg> {
    public Boolean f30034a;

    public /* synthetic */ nzf m35345a(nyt nyt) {
        return m35343b(nyt);
    }

    public nkg() {
        m35344d();
    }

    private nkg m35344d() {
        this.f30034a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35346a(nyu nyu) {
        if (this.f30034a != null) {
            nyu.m37172a(1, this.f30034a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35347b() {
        int b = super.b();
        if (this.f30034a == null) {
            return b;
        }
        this.f30034a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nkg m35343b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30034a = Boolean.valueOf(nyt.m37116i());
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
