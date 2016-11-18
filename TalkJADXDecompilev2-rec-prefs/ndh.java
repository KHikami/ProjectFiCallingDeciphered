package p000;

public final class ndh extends nyx<ndh> {
    public Boolean f29555a;

    public /* synthetic */ nzf m34415a(nyt nyt) {
        return m34414b(nyt);
    }

    public ndh() {
        this.f29555a = null;
        this.cachedSize = -1;
    }

    public void m34416a(nyu nyu) {
        if (this.f29555a != null) {
            nyu.m37172a(1, this.f29555a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34417b() {
        int b = super.b();
        if (this.f29555a == null) {
            return b;
        }
        this.f29555a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ndh m34414b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29555a = Boolean.valueOf(nyt.m37116i());
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
