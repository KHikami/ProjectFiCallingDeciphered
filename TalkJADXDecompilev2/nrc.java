package defpackage;

public final class nrc extends nyx<nrc> {
    public Boolean a;
    public noy b;
    public nce c;
    public ncg d;
    public nda e;
    public ndh f;
    public nqt g;
    public noq h;
    public ndp i;
    public nqy j;
    public ntn k;
    public nre l;
    public nqv m;
    public nri n;
    public nsi o;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nrc() {
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
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null) {
            nyu.b(15, this.h);
        }
        if (this.k != null) {
            nyu.b(16, this.k);
        }
        if (this.l != null) {
            nyu.b(17, this.l);
        }
        if (this.m != null) {
            nyu.b(19, this.m);
        }
        if (this.n != null) {
            nyu.b(20, this.n);
        }
        if (this.o != null) {
            nyu.b(21, this.o);
        }
        if (this.i != null) {
            nyu.b(25, this.i);
        }
        if (this.j != null) {
            nyu.b(27, this.j);
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
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null) {
            b += nyu.d(15, this.h);
        }
        if (this.k != null) {
            b += nyu.d(16, this.k);
        }
        if (this.l != null) {
            b += nyu.d(17, this.l);
        }
        if (this.m != null) {
            b += nyu.d(19, this.m);
        }
        if (this.n != null) {
            b += nyu.d(20, this.n);
        }
        if (this.o != null) {
            b += nyu.d(21, this.o);
        }
        if (this.i != null) {
            b += nyu.d(25, this.i);
        }
        if (this.j != null) {
            return b + nyu.d(27, this.j);
        }
        return b;
    }

    private nrc b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.b == null) {
                        this.b = new noy();
                    }
                    nyt.a(this.b);
                    continue;
                case 16:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new nce();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new ncg();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new nda();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new ndh();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new nqt();
                    }
                    nyt.a(this.g);
                    continue;
                case 122:
                    if (this.h == null) {
                        this.h = new noq();
                    }
                    nyt.a(this.h);
                    continue;
                case 130:
                    if (this.k == null) {
                        this.k = new ntn();
                    }
                    nyt.a(this.k);
                    continue;
                case 138:
                    if (this.l == null) {
                        this.l = new nre();
                    }
                    nyt.a(this.l);
                    continue;
                case 154:
                    if (this.m == null) {
                        this.m = new nqv();
                    }
                    nyt.a(this.m);
                    continue;
                case 162:
                    if (this.n == null) {
                        this.n = new nri();
                    }
                    nyt.a(this.n);
                    continue;
                case 170:
                    if (this.o == null) {
                        this.o = new nsi();
                    }
                    nyt.a(this.o);
                    continue;
                case 202:
                    if (this.i == null) {
                        this.i = new ndp();
                    }
                    nyt.a(this.i);
                    continue;
                case 218:
                    if (this.j == null) {
                        this.j = new nqy();
                    }
                    nyt.a(this.j);
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
