package p000;

public final class ngy extends nyx<ngy> {
    public Boolean f29813a;

    public /* synthetic */ nzf m34896a(nyt nyt) {
        return m34894b(nyt);
    }

    public ngy() {
        m34895d();
    }

    private ngy m34895d() {
        this.f29813a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34897a(nyu nyu) {
        if (this.f29813a != null) {
            nyu.m37172a(1, this.f29813a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34898b() {
        int b = super.b();
        if (this.f29813a == null) {
            return b;
        }
        this.f29813a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngy m34894b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29813a = Boolean.valueOf(nyt.m37116i());
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
