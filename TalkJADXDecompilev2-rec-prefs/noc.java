package p000;

public final class noc extends nyx<noc> {
    public Boolean f30342a;

    public /* synthetic */ nzf m35869a(nyt nyt) {
        return m35867b(nyt);
    }

    public noc() {
        m35868d();
    }

    private noc m35868d() {
        this.f30342a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35870a(nyu nyu) {
        if (this.f30342a != null) {
            nyu.m37172a(1, this.f30342a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35871b() {
        int b = super.b();
        if (this.f30342a == null) {
            return b;
        }
        this.f30342a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private noc m35867b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30342a = Boolean.valueOf(nyt.m37116i());
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
