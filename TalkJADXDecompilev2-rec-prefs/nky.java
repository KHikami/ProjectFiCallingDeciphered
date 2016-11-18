package p000;

public final class nky extends nyx<nky> {
    public Boolean f30086a;

    public /* synthetic */ nzf m35435a(nyt nyt) {
        return m35433b(nyt);
    }

    public nky() {
        m35434d();
    }

    private nky m35434d() {
        this.f30086a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35436a(nyu nyu) {
        if (this.f30086a != null) {
            nyu.m37172a(1, this.f30086a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35437b() {
        int b = super.b();
        if (this.f30086a == null) {
            return b;
        }
        this.f30086a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nky m35433b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30086a = Boolean.valueOf(nyt.m37116i());
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
