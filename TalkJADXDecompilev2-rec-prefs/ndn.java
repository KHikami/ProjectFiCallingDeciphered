package p000;

public final class ndn extends nyx<ndn> {
    public Boolean f29569a;

    public /* synthetic */ nzf m34440a(nyt nyt) {
        return m34439b(nyt);
    }

    public ndn() {
        this.f29569a = null;
        this.cachedSize = -1;
    }

    public void m34441a(nyu nyu) {
        if (this.f29569a != null) {
            nyu.m37172a(1, this.f29569a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34442b() {
        int b = super.b();
        if (this.f29569a == null) {
            return b;
        }
        this.f29569a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ndn m34439b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29569a = Boolean.valueOf(nyt.m37116i());
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
