package defpackage;

public final class nsc extends nyx<nsc> {
    public Boolean a;
    public nrc b;
    public nrk c;
    public ncr d;
    public nsp e;
    public npf f;
    public nqh g;
    public npk h;
    public nqr i;
    public nsm j;
    public nro k;
    public nro l;
    public nrx m;
    public nsx n;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nsc() {
        this.a = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.b(1, this.b);
        }
        if (this.a != null) {
            nyu.a(2, this.a.booleanValue());
        }
        if (this.e != null) {
            nyu.b(3, this.e);
        }
        if (this.f != null) {
            nyu.b(4, this.f);
        }
        if (this.c != null) {
            nyu.b(5, this.c);
        }
        if (this.d != null) {
            nyu.b(6, this.d);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null) {
            nyu.b(8, this.h);
        }
        if (this.i != null) {
            nyu.b(9, this.i);
        }
        if (this.j != null) {
            nyu.b(10, this.j);
        }
        if (this.k != null) {
            nyu.b(11, this.k);
        }
        if (this.m != null) {
            nyu.b(12, this.m);
        }
        if (this.n != null) {
            nyu.b(13, this.n);
        }
        if (this.l != null) {
            nyu.b(14, this.l);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.d(1, this.b);
        }
        if (this.a != null) {
            this.a.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.e != null) {
            b += nyu.d(3, this.e);
        }
        if (this.f != null) {
            b += nyu.d(4, this.f);
        }
        if (this.c != null) {
            b += nyu.d(5, this.c);
        }
        if (this.d != null) {
            b += nyu.d(6, this.d);
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null) {
            b += nyu.d(8, this.h);
        }
        if (this.i != null) {
            b += nyu.d(9, this.i);
        }
        if (this.j != null) {
            b += nyu.d(10, this.j);
        }
        if (this.k != null) {
            b += nyu.d(11, this.k);
        }
        if (this.m != null) {
            b += nyu.d(12, this.m);
        }
        if (this.n != null) {
            b += nyu.d(13, this.n);
        }
        if (this.l != null) {
            return b + nyu.d(14, this.l);
        }
        return b;
    }

    private nsc b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.b == null) {
                        this.b = new nrc();
                    }
                    nyt.a(this.b);
                    continue;
                case 16:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.e == null) {
                        this.e = new nsp();
                    }
                    nyt.a(this.e);
                    continue;
                case 34:
                    if (this.f == null) {
                        this.f = new npf();
                    }
                    nyt.a(this.f);
                    continue;
                case 42:
                    if (this.c == null) {
                        this.c = new nrk();
                    }
                    nyt.a(this.c);
                    continue;
                case 50:
                    if (this.d == null) {
                        this.d = new ncr();
                    }
                    nyt.a(this.d);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new nqh();
                    }
                    nyt.a(this.g);
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new npk();
                    }
                    nyt.a(this.h);
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new nqr();
                    }
                    nyt.a(this.i);
                    continue;
                case 82:
                    if (this.j == null) {
                        this.j = new nsm();
                    }
                    nyt.a(this.j);
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new nro();
                    }
                    nyt.a(this.k);
                    continue;
                case 98:
                    if (this.m == null) {
                        this.m = new nrx();
                    }
                    nyt.a(this.m);
                    continue;
                case 106:
                    if (this.n == null) {
                        this.n = new nsx();
                    }
                    nyt.a(this.n);
                    continue;
                case 114:
                    if (this.l == null) {
                        this.l = new nro();
                    }
                    nyt.a(this.l);
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
