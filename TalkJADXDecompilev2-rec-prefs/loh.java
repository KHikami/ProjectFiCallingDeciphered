package p000;

public final class loh extends nyx<loh> {
    public Integer f25866a;
    public Integer f25867b;
    public String f25868c;
    public Long f25869d;
    public String f25870e;
    public String f25871f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29738b(nyt);
    }

    public loh() {
        m29739d();
    }

    private loh m29739d() {
        this.f25868c = null;
        this.f25869d = null;
        this.f25870e = null;
        this.f25871f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25866a != null) {
            nyu.a(1, this.f25866a.intValue());
        }
        if (this.f25867b != null) {
            nyu.a(2, this.f25867b.intValue());
        }
        if (this.f25868c != null) {
            nyu.a(3, this.f25868c);
        }
        if (this.f25869d != null) {
            nyu.b(4, this.f25869d.longValue());
        }
        if (this.f25870e != null) {
            nyu.a(5, this.f25870e);
        }
        if (this.f25871f != null) {
            nyu.a(6, this.f25871f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25866a != null) {
            b += nyu.f(1, this.f25866a.intValue());
        }
        if (this.f25867b != null) {
            b += nyu.f(2, this.f25867b.intValue());
        }
        if (this.f25868c != null) {
            b += nyu.b(3, this.f25868c);
        }
        if (this.f25869d != null) {
            b += nyu.f(4, this.f25869d.longValue());
        }
        if (this.f25870e != null) {
            b += nyu.b(5, this.f25870e);
        }
        if (this.f25871f != null) {
            return b + nyu.b(6, this.f25871f);
        }
        return b;
    }

    private loh m29738b(nyt nyt) {
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
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f25866a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f25867b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f25868c = nyt.j();
                    continue;
                case 32:
                    this.f25869d = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    this.f25870e = nyt.j();
                    continue;
                case 50:
                    this.f25871f = nyt.j();
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
