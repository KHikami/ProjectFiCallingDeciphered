package defpackage;

public final class oxq extends nyx<oxq> {
    public String a;
    public String b;
    public String c;
    public Long d;
    public nzp e;
    public String f;
    public String g;
    public String h;
    public String i;
    public Integer j;
    public Boolean k;
    public String l;
    public String m;
    public ofg n;
    public String o;
    public oxz p;
    public oxr q;
    public oxs r;
    public ofj s;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oxq() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.o = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d.longValue());
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.a(6, this.f);
        }
        if (this.g != null) {
            nyu.a(7, this.g);
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        if (this.i != null) {
            nyu.a(9, this.i);
        }
        if (this.j != null) {
            nyu.a(10, this.j.intValue());
        }
        if (this.k != null) {
            nyu.a(11, this.k.booleanValue());
        }
        if (this.l != null) {
            nyu.a(12, this.l);
        }
        if (this.m != null) {
            nyu.a(13, this.m);
        }
        if (this.n != null) {
            nyu.b(14, this.n);
        }
        if (this.o != null) {
            nyu.a(15, this.o);
        }
        if (this.p != null) {
            nyu.b(16, this.p);
        }
        if (this.q != null) {
            nyu.b(17, this.q);
        }
        if (this.r != null) {
            nyu.b(18, this.r);
        }
        if (this.s != null) {
            nyu.b(20, this.s);
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
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.e(4, this.d.longValue());
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.f != null) {
            b += nyu.b(6, this.f);
        }
        if (this.g != null) {
            b += nyu.b(7, this.g);
        }
        if (this.h != null) {
            b += nyu.b(8, this.h);
        }
        if (this.i != null) {
            b += nyu.b(9, this.i);
        }
        if (this.j != null) {
            b += nyu.f(10, this.j.intValue());
        }
        if (this.k != null) {
            this.k.booleanValue();
            b += nyu.h(11) + 1;
        }
        if (this.l != null) {
            b += nyu.b(12, this.l);
        }
        if (this.m != null) {
            b += nyu.b(13, this.m);
        }
        if (this.n != null) {
            b += nyu.d(14, this.n);
        }
        if (this.o != null) {
            b += nyu.b(15, this.o);
        }
        if (this.p != null) {
            b += nyu.d(16, this.p);
        }
        if (this.q != null) {
            b += nyu.d(17, this.q);
        }
        if (this.r != null) {
            b += nyu.d(18, this.r);
        }
        if (this.s != null) {
            return b + nyu.d(20, this.s);
        }
        return b;
    }

    private oxq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 32:
                    this.d = Long.valueOf(nyt.d());
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new nzp();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 58:
                    this.g = nyt.j();
                    continue;
                case 66:
                    this.h = nyt.j();
                    continue;
                case 74:
                    this.i = nyt.j();
                    continue;
                case 80:
                    this.j = Integer.valueOf(nyt.f());
                    continue;
                case 88:
                    this.k = Boolean.valueOf(nyt.i());
                    continue;
                case 98:
                    this.l = nyt.j();
                    continue;
                case 106:
                    this.m = nyt.j();
                    continue;
                case 114:
                    if (this.n == null) {
                        this.n = new ofg();
                    }
                    nyt.a(this.n);
                    continue;
                case 122:
                    this.o = nyt.j();
                    continue;
                case 130:
                    if (this.p == null) {
                        this.p = new oxz();
                    }
                    nyt.a(this.p);
                    continue;
                case 138:
                    if (this.q == null) {
                        this.q = new oxr();
                    }
                    nyt.a(this.q);
                    continue;
                case 146:
                    if (this.r == null) {
                        this.r = new oxs();
                    }
                    nyt.a(this.r);
                    continue;
                case 162:
                    if (this.s == null) {
                        this.s = new ofj();
                    }
                    nyt.a(this.s);
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
