public final class kty extends nyx<kty> {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Boolean f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kty() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.doubleValue());
        nyu.a(2, this.b.doubleValue());
        if (this.c != null) {
            nyu.a(3, this.c.doubleValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.doubleValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.doubleValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        this.a.doubleValue();
        b += nyu.h(1) + 8;
        this.b.doubleValue();
        b += nyu.h(2) + 8;
        if (this.c != null) {
            this.c.doubleValue();
            b += nyu.h(3) + 8;
        }
        if (this.d != null) {
            this.d.doubleValue();
            b += nyu.h(4) + 8;
        }
        if (this.e != null) {
            this.e.doubleValue();
            b += nyu.h(5) + 8;
        }
        if (this.f == null) {
            return b;
        }
        this.f.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private kty b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.n /*9*/:
                    this.a = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.b = Double.valueOf(nyt.b());
                    continue;
                case wi.dz /*25*/:
                    this.c = Double.valueOf(nyt.b());
                    continue;
                case 33:
                    this.d = Double.valueOf(nyt.b());
                    continue;
                case 41:
                    this.e = Double.valueOf(nyt.b());
                    continue;
                case 48:
                    this.f = Boolean.valueOf(nyt.i());
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
