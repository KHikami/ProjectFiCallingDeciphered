public final class lln extends nyx<lln> {
    private static volatile lln[] g;
    public int a;
    public Integer b;
    public llo c;
    public int d;
    public int e;
    public llp f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lln[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new lln[0];
                }
            }
        }
        return g;
    }

    public lln() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.b = null;
        this.d = nzf.UNSET_ENUM_VALUE;
        this.e = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != nzf.UNSET_ENUM_VALUE) {
            nyu.a(4, this.d);
        }
        if (this.e != nzf.UNSET_ENUM_VALUE) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.a);
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(4, this.d);
        }
        if (this.e != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(5, this.e);
        }
        if (this.f != null) {
            return b + nyu.d(6, this.f);
        }
        return b;
    }

    private lln b(nyt nyt) {
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
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                        case wi.q /*7*/:
                        case wi.m /*8*/:
                        case wi.n /*9*/:
                        case wi.dr /*10*/:
                        case wi.dB /*11*/:
                        case wi.dM /*12*/:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dI /*16*/:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new llo();
                    }
                    nyt.a(this.c);
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.d = a;
                            break;
                        default:
                            continue;
                    }
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                            this.e = a;
                            break;
                        default:
                            continue;
                    }
                case 50:
                    if (this.f == null) {
                        this.f = new llp();
                    }
                    nyt.a(this.f);
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
