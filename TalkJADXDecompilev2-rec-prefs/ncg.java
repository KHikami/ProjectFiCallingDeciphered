package p000;

public final class ncg extends nyx<ncg> {
    public Boolean f29494a;

    public /* synthetic */ nzf m34297a(nyt nyt) {
        return m34296b(nyt);
    }

    public ncg() {
        this.f29494a = null;
        this.cachedSize = -1;
    }

    public void m34298a(nyu nyu) {
        if (this.f29494a != null) {
            nyu.m37172a(1, this.f29494a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34299b() {
        int b = super.b();
        if (this.f29494a == null) {
            return b;
        }
        this.f29494a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ncg m34296b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29494a = Boolean.valueOf(nyt.m37116i());
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
