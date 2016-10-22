public final class mcf extends nyx<mcf> {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Integer d;
    public Long e;
    public String f;
    public Boolean g;
    public Long h;
    public Long i;
    public Long j;
    public Integer k;
    public Integer l;
    public Boolean m;
    public Boolean n;
    public Boolean o;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mcf() {
        d();
    }

    private mcf d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
        }
        if (this.e != null) {
            nyu.b(5, this.e.longValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f);
        }
        if (this.g != null) {
            nyu.a(7, this.g.booleanValue());
        }
        if (this.h != null) {
            nyu.b(8, this.h.longValue());
        }
        if (this.i != null) {
            nyu.b(9, this.i.longValue());
        }
        if (this.j != null) {
            nyu.b(10, this.j.longValue());
        }
        if (this.k != null) {
            nyu.a(11, this.k.intValue());
        }
        if (this.l != null) {
            nyu.a(12, this.l.intValue());
        }
        if (this.m != null) {
            nyu.a(13, this.m.booleanValue());
        }
        if (this.n != null) {
            nyu.a(14, this.n.booleanValue());
        }
        if (this.o != null) {
            nyu.a(15, this.o.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.longValue());
        }
        if (this.f != null) {
            b += nyu.b(6, this.f);
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.h != null) {
            b += nyu.f(8, this.h.longValue());
        }
        if (this.i != null) {
            b += nyu.f(9, this.i.longValue());
        }
        if (this.j != null) {
            b += nyu.f(10, this.j.longValue());
        }
        if (this.k != null) {
            b += nyu.f(11, this.k.intValue());
        }
        if (this.l != null) {
            b += nyu.f(12, this.l.intValue());
        }
        if (this.m != null) {
            this.m.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.n != null) {
            this.n.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.o == null) {
            return b;
        }
        this.o.booleanValue();
        return b + (nyu.h(15) + 1);
    }

    private mcf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dI /*16*/:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case wi.dr /*10*/:
                        case wi.k /*20*/:
                        case wi.dz /*25*/:
                        case 30:
                        case 100:
                            this.d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    this.e = Long.valueOf(nyt.e());
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 56:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.h = Long.valueOf(nyt.e());
                    continue;
                case 72:
                    this.i = Long.valueOf(nyt.e());
                    continue;
                case 80:
                    this.j = Long.valueOf(nyt.e());
                    continue;
                case 88:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.k = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 96:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.l = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 104:
                    this.m = Boolean.valueOf(nyt.i());
                    continue;
                case 112:
                    this.n = Boolean.valueOf(nyt.i());
                    continue;
                case 120:
                    this.o = Boolean.valueOf(nyt.i());
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
