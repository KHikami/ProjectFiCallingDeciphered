package p000;

public final class nde extends nyx<nde> {
    public Boolean f29550a;

    public /* synthetic */ nzf m34403a(nyt nyt) {
        return m34402b(nyt);
    }

    public nde() {
        this.f29550a = null;
        this.cachedSize = -1;
    }

    public void m34404a(nyu nyu) {
        if (this.f29550a != null) {
            nyu.m37172a(1, this.f29550a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34405b() {
        int b = super.b();
        if (this.f29550a == null) {
            return b;
        }
        this.f29550a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nde m34402b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29550a = Boolean.valueOf(nyt.m37116i());
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
