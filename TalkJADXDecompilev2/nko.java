package defpackage;

public final class nko extends nyx<nko> {
    public Boolean a;
    public ngr b;
    public ngg c;
    public ngh d;
    public ngi e;
    public ngo f;
    public nkl g;
    public nkg h;
    public nkf i;
    public nkn j;
    public nky k;
    public nkp l;
    public nkm m;
    public nkq n;
    public nku o;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nko() {
        d();
    }

    private nko d() {
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
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
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

    private nko b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.b == null) {
                        this.b = new ngr();
                    }
                    nyt.a(this.b);
                    continue;
                case 16:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new ngg();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new ngh();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new ngi();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new ngo();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new nkl();
                    }
                    nyt.a(this.g);
                    continue;
                case 122:
                    if (this.h == null) {
                        this.h = new nkg();
                    }
                    nyt.a(this.h);
                    continue;
                case 130:
                    if (this.k == null) {
                        this.k = new nky();
                    }
                    nyt.a(this.k);
                    continue;
                case 138:
                    if (this.l == null) {
                        this.l = new nkp();
                    }
                    nyt.a(this.l);
                    continue;
                case 154:
                    if (this.m == null) {
                        this.m = new nkm();
                    }
                    nyt.a(this.m);
                    continue;
                case 162:
                    if (this.n == null) {
                        this.n = new nkq();
                    }
                    nyt.a(this.n);
                    continue;
                case 170:
                    if (this.o == null) {
                        this.o = new nku();
                    }
                    nyt.a(this.o);
                    continue;
                case 202:
                    if (this.i == null) {
                        this.i = new nkf();
                    }
                    nyt.a(this.i);
                    continue;
                case 218:
                    if (this.j == null) {
                        this.j = new nkn();
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
