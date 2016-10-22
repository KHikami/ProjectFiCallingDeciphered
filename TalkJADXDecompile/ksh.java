public final class ksh extends nyx<ksh> {
    public String a;
    public String b;
    public Integer c;
    public Float d;
    public Float e;
    public Float f;
    public Long g;
    public Float h;
    public Boolean i;
    public Float j;
    public String k;
    public Long l;
    public Integer m;
    public Integer n;
    public Integer o;
    public String p;
    public String q;
    public String r;
    public String s;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ksh() {
        d();
    }

    private ksh d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.floatValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.floatValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.floatValue());
        }
        if (this.g != null) {
            nyu.b(7, this.g.longValue());
        }
        if (this.h != null) {
            nyu.a(8, this.h.floatValue());
        }
        if (this.i != null) {
            nyu.a(9, this.i.booleanValue());
        }
        if (this.j != null) {
            nyu.a(10, this.j.floatValue());
        }
        if (this.k != null) {
            nyu.a(11, this.k);
        }
        if (this.l != null) {
            nyu.b(12, this.l.longValue());
        }
        if (this.m != null) {
            nyu.a(13, this.m.intValue());
        }
        if (this.n != null) {
            nyu.a(14, this.n.intValue());
        }
        if (this.o != null) {
            nyu.a(15, this.o.intValue());
        }
        if (this.p != null) {
            nyu.a(16, this.p);
        }
        if (this.q != null) {
            nyu.a(17, this.q);
        }
        if (this.r != null) {
            nyu.a(18, this.r);
        }
        if (this.s != null) {
            nyu.a(19, this.s);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null) {
            this.d.floatValue();
            b += nyu.h(4) + 4;
        }
        if (this.e != null) {
            this.e.floatValue();
            b += nyu.h(5) + 4;
        }
        if (this.f != null) {
            this.f.floatValue();
            b += nyu.h(6) + 4;
        }
        if (this.g != null) {
            b += nyu.f(7, this.g.longValue());
        }
        if (this.h != null) {
            this.h.floatValue();
            b += nyu.h(8) + 4;
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.j != null) {
            this.j.floatValue();
            b += nyu.h(10) + 4;
        }
        if (this.k != null) {
            b += nyu.b(11, this.k);
        }
        if (this.l != null) {
            b += nyu.f(12, this.l.longValue());
        }
        if (this.m != null) {
            b += nyu.f(13, this.m.intValue());
        }
        if (this.n != null) {
            b += nyu.f(14, this.n.intValue());
        }
        if (this.o != null) {
            b += nyu.f(15, this.o.intValue());
        }
        if (this.p != null) {
            b += nyu.b(16, this.p);
        }
        if (this.q != null) {
            b += nyu.b(17, this.q);
        }
        if (this.r != null) {
            b += nyu.b(18, this.r);
        }
        if (this.s != null) {
            return b + nyu.b(19, this.s);
        }
        return b;
    }

    private ksh b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 37:
                    this.d = Float.valueOf(nyt.c());
                    continue;
                case 45:
                    this.e = Float.valueOf(nyt.c());
                    continue;
                case 53:
                    this.f = Float.valueOf(nyt.c());
                    continue;
                case 56:
                    this.g = Long.valueOf(nyt.e());
                    continue;
                case 69:
                    this.h = Float.valueOf(nyt.c());
                    continue;
                case 72:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 85:
                    this.j = Float.valueOf(nyt.c());
                    continue;
                case 90:
                    this.k = nyt.j();
                    continue;
                case 96:
                    this.l = Long.valueOf(nyt.e());
                    continue;
                case 104:
                    this.m = Integer.valueOf(nyt.f());
                    continue;
                case 112:
                    this.n = Integer.valueOf(nyt.f());
                    continue;
                case 120:
                    this.o = Integer.valueOf(nyt.f());
                    continue;
                case 130:
                    this.p = nyt.j();
                    continue;
                case 138:
                    this.q = nyt.j();
                    continue;
                case 146:
                    this.r = nyt.j();
                    continue;
                case 154:
                    this.s = nyt.j();
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
