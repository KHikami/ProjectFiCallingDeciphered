package p000;

public final class nnl extends nyx<nnl> {
    public Boolean f30294a;

    public /* synthetic */ nzf m35782a(nyt nyt) {
        return m35780b(nyt);
    }

    public nnl() {
        m35781d();
    }

    private nnl m35781d() {
        this.f30294a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35783a(nyu nyu) {
        if (this.f30294a != null) {
            nyu.m37172a(1, this.f30294a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35784b() {
        int b = super.b();
        if (this.f30294a == null) {
            return b;
        }
        this.f30294a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nnl m35780b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30294a = Boolean.valueOf(nyt.m37116i());
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
