package p000;

public final class nkn extends nyx<nkn> {
    public Boolean f30042a;

    public /* synthetic */ nzf m35380a(nyt nyt) {
        return m35378b(nyt);
    }

    public nkn() {
        m35379d();
    }

    private nkn m35379d() {
        this.f30042a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35381a(nyu nyu) {
        if (this.f30042a != null) {
            nyu.m37172a(1, this.f30042a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35382b() {
        int b = super.b();
        if (this.f30042a == null) {
            return b;
        }
        this.f30042a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nkn m35378b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30042a = Boolean.valueOf(nyt.m37116i());
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
