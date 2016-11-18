package p000;

public final class myd extends nyx<myd> {
    public Double f29129a;
    public Double f29130b;
    public Double f29131c;
    public Double f29132d;
    public Double f29133e;
    public Double f29134f;

    public /* synthetic */ nzf m33782a(nyt nyt) {
        return m33780b(nyt);
    }

    public myd() {
        m33781d();
    }

    private myd m33781d() {
        this.f29129a = null;
        this.f29130b = null;
        this.f29131c = null;
        this.f29132d = null;
        this.f29133e = null;
        this.f29134f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33783a(nyu nyu) {
        if (this.f29129a != null) {
            nyu.m37166a(1, this.f29129a.doubleValue());
        }
        if (this.f29130b != null) {
            nyu.m37166a(2, this.f29130b.doubleValue());
        }
        if (this.f29131c != null) {
            nyu.m37166a(3, this.f29131c.doubleValue());
        }
        if (this.f29132d != null) {
            nyu.m37166a(4, this.f29132d.doubleValue());
        }
        if (this.f29133e != null) {
            nyu.m37166a(5, this.f29133e.doubleValue());
        }
        if (this.f29134f != null) {
            nyu.m37166a(6, this.f29134f.doubleValue());
        }
        super.a(nyu);
    }

    protected int m33784b() {
        int b = super.b();
        if (this.f29129a != null) {
            this.f29129a.doubleValue();
            b += nyu.m37154h(1) + 8;
        }
        if (this.f29130b != null) {
            this.f29130b.doubleValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f29131c != null) {
            this.f29131c.doubleValue();
            b += nyu.m37154h(3) + 8;
        }
        if (this.f29132d != null) {
            this.f29132d.doubleValue();
            b += nyu.m37154h(4) + 8;
        }
        if (this.f29133e != null) {
            this.f29133e.doubleValue();
            b += nyu.m37154h(5) + 8;
        }
        if (this.f29134f == null) {
            return b;
        }
        this.f29134f.doubleValue();
        return b + (nyu.m37154h(6) + 8);
    }

    private myd m33780b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f29129a = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dK /*17*/:
                    this.f29130b = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dz /*25*/:
                    this.f29131c = Double.valueOf(nyt.m37104b());
                    continue;
                case 33:
                    this.f29132d = Double.valueOf(nyt.m37104b());
                    continue;
                case 41:
                    this.f29133e = Double.valueOf(nyt.m37104b());
                    continue;
                case 49:
                    this.f29134f = Double.valueOf(nyt.m37104b());
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
