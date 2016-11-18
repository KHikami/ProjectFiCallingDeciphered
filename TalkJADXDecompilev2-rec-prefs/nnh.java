package p000;

public final class nnh extends nyx<nnh> {
    public Boolean f30274a;

    public /* synthetic */ nzf m35761a(nyt nyt) {
        return m35759b(nyt);
    }

    public nnh() {
        m35760d();
    }

    private nnh m35760d() {
        this.f30274a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35762a(nyu nyu) {
        if (this.f30274a != null) {
            nyu.m37172a(1, this.f30274a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35763b() {
        int b = super.b();
        if (this.f30274a == null) {
            return b;
        }
        this.f30274a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nnh m35759b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30274a = Boolean.valueOf(nyt.m37116i());
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
