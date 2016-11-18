package p000;

public final class nks extends nyx<nks> {
    public Boolean f30065a;

    public /* synthetic */ nzf m35405a(nyt nyt) {
        return m35403b(nyt);
    }

    public nks() {
        m35404d();
    }

    private nks m35404d() {
        this.f30065a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35406a(nyu nyu) {
        if (this.f30065a != null) {
            nyu.m37172a(1, this.f30065a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35407b() {
        int b = super.b();
        if (this.f30065a == null) {
            return b;
        }
        this.f30065a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nks m35403b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30065a = Boolean.valueOf(nyt.m37116i());
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
