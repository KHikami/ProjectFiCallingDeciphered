package p000;

public final class nae extends nyx<nae> {
    public Double f29345a;
    public Double f29346b;
    public Double f29347c;
    public nad[] f29348d;

    public /* synthetic */ nzf m34027a(nyt nyt) {
        return m34025b(nyt);
    }

    public nae() {
        m34026d();
    }

    private nae m34026d() {
        this.f29345a = null;
        this.f29346b = null;
        this.f29347c = null;
        this.f29348d = nad.m34020d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34028a(nyu nyu) {
        if (this.f29345a != null) {
            nyu.m37166a(1, this.f29345a.doubleValue());
        }
        if (this.f29346b != null) {
            nyu.m37166a(2, this.f29346b.doubleValue());
        }
        if (this.f29347c != null) {
            nyu.m37166a(3, this.f29347c.doubleValue());
        }
        if (this.f29348d != null && this.f29348d.length > 0) {
            for (nzf nzf : this.f29348d) {
                if (nzf != null) {
                    nyu.m37182b(4, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34029b() {
        int b = super.b();
        if (this.f29345a != null) {
            this.f29345a.doubleValue();
            b += nyu.m37154h(1) + 8;
        }
        if (this.f29346b != null) {
            this.f29346b.doubleValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f29347c != null) {
            this.f29347c.doubleValue();
            b += nyu.m37154h(3) + 8;
        }
        if (this.f29348d == null || this.f29348d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29348d) {
            if (nzf != null) {
                i += nyu.m37145d(4, nzf);
            }
        }
        return i;
    }

    private nae m34025b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f29345a = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dK /*17*/:
                    this.f29346b = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dz /*25*/:
                    this.f29347c = Double.valueOf(nyt.m37104b());
                    continue;
                case 34:
                    int b = nzl.m37265b(nyt, 34);
                    if (this.f29348d == null) {
                        a = 0;
                    } else {
                        a = this.f29348d.length;
                    }
                    Object obj = new nad[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29348d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nad();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nad();
                    nyt.m37101a(obj[a]);
                    this.f29348d = obj;
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
