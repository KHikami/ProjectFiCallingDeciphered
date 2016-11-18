package p000;

public final class ngo extends nyx<ngo> {
    public Boolean f29796a;

    public /* synthetic */ nzf m34846a(nyt nyt) {
        return m34844b(nyt);
    }

    public ngo() {
        m34845d();
    }

    private ngo m34845d() {
        this.f29796a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34847a(nyu nyu) {
        if (this.f29796a != null) {
            nyu.m37172a(1, this.f29796a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34848b() {
        int b = super.b();
        if (this.f29796a == null) {
            return b;
        }
        this.f29796a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngo m34844b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29796a = Boolean.valueOf(nyt.m37116i());
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
