package p000;

public final class nhe extends nyx<nhe> {
    public Boolean f29823a;

    public /* synthetic */ nzf m34932a(nyt nyt) {
        return m34930b(nyt);
    }

    public nhe() {
        m34931d();
    }

    private nhe m34931d() {
        this.f29823a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34933a(nyu nyu) {
        if (this.f29823a != null) {
            nyu.m37172a(1, this.f29823a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34934b() {
        int b = super.b();
        if (this.f29823a == null) {
            return b;
        }
        this.f29823a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nhe m34930b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29823a = Boolean.valueOf(nyt.m37116i());
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
