package p000;

public final class nlo extends nyx<nlo> {
    public Boolean f30148a;

    public /* synthetic */ nzf m35526a(nyt nyt) {
        return m35524b(nyt);
    }

    public nlo() {
        m35525d();
    }

    private nlo m35525d() {
        this.f30148a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35527a(nyu nyu) {
        if (this.f30148a != null) {
            nyu.m37172a(1, this.f30148a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35528b() {
        int b = super.b();
        if (this.f30148a == null) {
            return b;
        }
        this.f30148a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nlo m35524b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30148a = Boolean.valueOf(nyt.m37116i());
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
