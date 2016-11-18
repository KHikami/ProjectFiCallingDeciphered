package p000;

public final class nng extends nyx<nng> {
    public Boolean f30273a;

    public /* synthetic */ nzf m35756a(nyt nyt) {
        return m35754b(nyt);
    }

    public nng() {
        m35755d();
    }

    private nng m35755d() {
        this.f30273a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35757a(nyu nyu) {
        if (this.f30273a != null) {
            nyu.m37172a(1, this.f30273a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35758b() {
        int b = super.b();
        if (this.f30273a == null) {
            return b;
        }
        this.f30273a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nng m35754b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30273a = Boolean.valueOf(nyt.m37116i());
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
