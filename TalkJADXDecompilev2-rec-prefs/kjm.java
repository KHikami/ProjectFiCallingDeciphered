package p000;

public final class kjm extends nyx<kjm> {
    private static volatile kjm[] f21948h;
    public Integer f21949a;
    public Double f21950b;
    public String f21951c;
    public Integer f21952d;
    public String f21953e;
    public ozo f21954f;
    public ogd f21955g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26108b(nyt);
    }

    public static kjm[] m26109d() {
        if (f21948h == null) {
            synchronized (nzc.c) {
                if (f21948h == null) {
                    f21948h = new kjm[0];
                }
            }
        }
        return f21948h;
    }

    public kjm() {
        m26110g();
    }

    private kjm m26110g() {
        this.f21950b = null;
        this.f21951c = null;
        this.f21953e = null;
        this.f21954f = null;
        this.f21955g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21949a != null) {
            nyu.a(1, this.f21949a.intValue());
        }
        if (this.f21950b != null) {
            nyu.a(2, this.f21950b.doubleValue());
        }
        if (this.f21951c != null) {
            nyu.a(3, this.f21951c);
        }
        if (this.f21952d != null) {
            nyu.a(4, this.f21952d.intValue());
        }
        if (this.f21953e != null) {
            nyu.a(5, this.f21953e);
        }
        if (this.f21954f != null) {
            nyu.b(6, this.f21954f);
        }
        if (this.f21955g != null) {
            nyu.b(7, this.f21955g);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21949a != null) {
            b += nyu.f(1, this.f21949a.intValue());
        }
        if (this.f21950b != null) {
            this.f21950b.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.f21951c != null) {
            b += nyu.b(3, this.f21951c);
        }
        if (this.f21952d != null) {
            b += nyu.f(4, this.f21952d.intValue());
        }
        if (this.f21953e != null) {
            b += nyu.b(5, this.f21953e);
        }
        if (this.f21954f != null) {
            b += nyu.d(6, this.f21954f);
        }
        if (this.f21955g != null) {
            return b + nyu.d(7, this.f21955g);
        }
        return b;
    }

    private kjm m26108b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                            this.f21949a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dK /*17*/:
                    this.f21950b = Double.valueOf(nyt.b());
                    continue;
                case wi.dx /*26*/:
                    this.f21951c = nyt.j();
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            this.f21952d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    this.f21953e = nyt.j();
                    continue;
                case 50:
                    if (this.f21954f == null) {
                        this.f21954f = new ozo();
                    }
                    nyt.a(this.f21954f);
                    continue;
                case 58:
                    if (this.f21955g == null) {
                        this.f21955g = new ogd();
                    }
                    nyt.a(this.f21955g);
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
