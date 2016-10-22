public final class lpp extends nyx<lpp> {
    private static volatile lpp[] g;
    public Integer a;
    public Double b;
    public Double c;
    public Long d;
    public Integer e;
    public String f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lpp[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new lpp[0];
                }
            }
        }
        return g;
    }

    public lpp() {
        g();
    }

    private lpp g() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.doubleValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.doubleValue());
        }
        if (this.d != null) {
            nyu.b(4, this.d.longValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            this.b.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.c != null) {
            this.c.doubleValue();
            b += nyu.h(3) + 8;
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.longValue());
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.intValue());
        }
        if (this.f != null) {
            return b + nyu.b(6, this.f);
        }
        return b;
    }

    private lpp b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dK /*17*/:
                    this.b = Double.valueOf(nyt.b());
                    continue;
                case wi.dz /*25*/:
                    this.c = Double.valueOf(nyt.b());
                    continue;
                case 32:
                    this.d = Long.valueOf(nyt.e());
                    continue;
                case 40:
                    this.e = Integer.valueOf(nyt.f());
                    continue;
                case 50:
                    this.f = nyt.j();
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
