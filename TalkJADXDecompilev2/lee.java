package defpackage;

public final class lee extends nyx<lee> {
    public Integer a;
    public Integer b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Double g;
    public String h;
    public Integer i;
    public Integer j;
    public Boolean k;
    public Boolean l;
    public String m;
    public Integer n;
    public Boolean o;
    public Boolean p;
    public String q;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lee() {
        d();
    }

    private lee d() {
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
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.c != null) {
            nyu.a(1, this.c);
        }
        if (this.d != null) {
            nyu.a(2, this.d);
        }
        if (this.e != null) {
            nyu.a(3, this.e);
        }
        if (this.f != null) {
            nyu.a(4, this.f);
        }
        if (this.g != null) {
            nyu.a(5, this.g.doubleValue());
        }
        if (this.h != null) {
            nyu.a(6, this.h);
        }
        if (this.i != null) {
            nyu.a(7, this.i.intValue());
        }
        if (this.j != null) {
            nyu.a(8, this.j.intValue());
        }
        if (this.k != null) {
            nyu.a(9, this.k.booleanValue());
        }
        if (this.a != null) {
            nyu.a(10, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(11, this.b.intValue());
        }
        if (this.l != null) {
            nyu.a(12, this.l.booleanValue());
        }
        if (this.m != null) {
            nyu.a(13, this.m);
        }
        if (this.n != null) {
            nyu.a(14, this.n.intValue());
        }
        if (this.o != null) {
            nyu.a(15, this.o.booleanValue());
        }
        if (this.p != null) {
            nyu.a(16, this.p.booleanValue());
        }
        if (this.q != null) {
            nyu.a(17, this.q);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.c != null) {
            b += nyu.b(1, this.c);
        }
        if (this.d != null) {
            b += nyu.b(2, this.d);
        }
        if (this.e != null) {
            b += nyu.b(3, this.e);
        }
        if (this.f != null) {
            b += nyu.b(4, this.f);
        }
        if (this.g != null) {
            this.g.doubleValue();
            b += nyu.h(5) + 8;
        }
        if (this.h != null) {
            b += nyu.b(6, this.h);
        }
        if (this.i != null) {
            b += nyu.f(7, this.i.intValue());
        }
        if (this.j != null) {
            b += nyu.f(8, this.j.intValue());
        }
        if (this.k != null) {
            this.k.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.a != null) {
            b += nyu.f(10, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(11, this.b.intValue());
        }
        if (this.l != null) {
            this.l.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.m != null) {
            b += nyu.b(13, this.m);
        }
        if (this.n != null) {
            b += nyu.f(14, this.n.intValue());
        }
        if (this.o != null) {
            this.o.booleanValue();
            b += nyu.h(15) + 1;
        }
        if (this.p != null) {
            this.p.booleanValue();
            b += nyu.h(16) + 1;
        }
        if (this.q != null) {
            return b + nyu.b(17, this.q);
        }
        return b;
    }

    private lee b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.c = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.d = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.e = nyt.j();
                    continue;
                case 34:
                    this.f = nyt.j();
                    continue;
                case 41:
                    this.g = Double.valueOf(nyt.b());
                    continue;
                case 50:
                    this.h = nyt.j();
                    continue;
                case 56:
                    this.i = Integer.valueOf(nyt.f());
                    continue;
                case 64:
                    this.j = Integer.valueOf(nyt.f());
                    continue;
                case 72:
                    this.k = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 88:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case 96:
                    this.l = Boolean.valueOf(nyt.i());
                    continue;
                case 106:
                    this.m = nyt.j();
                    continue;
                case 112:
                    this.n = Integer.valueOf(nyt.f());
                    continue;
                case 120:
                    this.o = Boolean.valueOf(nyt.i());
                    continue;
                case 128:
                    this.p = Boolean.valueOf(nyt.i());
                    continue;
                case 138:
                    this.q = nyt.j();
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
