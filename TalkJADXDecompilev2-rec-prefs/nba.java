package p000;

public final class nba extends nyx<nba> {
    public String f29413a;

    public /* synthetic */ nzf m34141a(nyt nyt) {
        return m34139b(nyt);
    }

    public nba() {
        m34140d();
    }

    private nba m34140d() {
        this.f29413a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34142a(nyu nyu) {
        if (this.f29413a != null) {
            nyu.m37170a(1, this.f29413a);
        }
        super.a(nyu);
    }

    protected int m34143b() {
        int b = super.b();
        if (this.f29413a != null) {
            return b + nyu.m37137b(1, this.f29413a);
        }
        return b;
    }

    private nba m34139b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29413a = nyt.m37117j();
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
