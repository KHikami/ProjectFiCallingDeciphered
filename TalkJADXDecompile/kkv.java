public final class kkv extends nyx<kkv> {
    public Double a;
    public Double b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kkv() {
        d();
    }

    private kkv d() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.doubleValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.doubleValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.doubleValue();
            b += nyu.h(1) + 8;
        }
        if (this.b == null) {
            return b;
        }
        this.b.doubleValue();
        return b + (nyu.h(2) + 8);
    }

    private kkv b(nyt nyt) {
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
