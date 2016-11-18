package defpackage;

public final class nfo extends nyx<nfo> {
    public String a;
    public nfv b;
    public nhx c;
    public nhx d;
    public String e;
    public ngb f;
    public Integer g;
    public nfw h;
    public Integer i;
    public Integer j;
    public nga k;
    public nhy[] l;
    public nfi m;
    public nhz[] n;
    public nif o;
    public String p;
    public String q;
    public nit r;
    public nfq s;
    public ndt[] t;
    public nfr u;
    public nfy v;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nfo() {
        d();
    }

    private nfo d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.j = null;
        this.k = null;
        this.l = nhy.d();
        this.m = null;
        this.n = nhz.d();
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = ndt.d();
        this.u = null;
        this.v = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null) {
            nyu.a(7, this.g.intValue());
        }
        if (this.i != null) {
            nyu.a(8, this.i.intValue());
        }
        if (this.j != null) {
            nyu.a(9, this.j.intValue());
        }
        if (this.k != null) {
            nyu.b(10, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            for (nzf nzf : this.l) {
                if (nzf != null) {
                    nyu.b(11, nzf);
                }
            }
        }
        if (this.m != null) {
            nyu.b(12, this.m);
        }
        if (this.n != null && this.n.length > 0) {
            for (nzf nzf2 : this.n) {
                if (nzf2 != null) {
                    nyu.b(13, nzf2);
                }
            }
        }
        if (this.o != null) {
            nyu.b(14, this.o);
        }
        if (this.p != null) {
            nyu.a(15, this.p);
        }
        if (this.q != null) {
            nyu.a(16, this.q);
        }
        if (this.r != null) {
            nyu.b(17, this.r);
        }
        if (this.s != null) {
            nyu.b(18, this.s);
        }
        if (this.t != null && this.t.length > 0) {
            while (i < this.t.length) {
                nzf nzf3 = this.t[i];
                if (nzf3 != null) {
                    nyu.b(19, nzf3);
                }
                i++;
            }
        }
        if (this.u != null) {
            nyu.b(20, this.u);
        }
        if (this.v != null) {
            nyu.b(21, this.v);
        }
        if (this.h != null) {
            nyu.b(22, this.h);
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null) {
            b += nyu.f(7, this.g.intValue());
        }
        if (this.i != null) {
            b += nyu.f(8, this.i.intValue());
        }
        if (this.j != null) {
            b += nyu.f(9, this.j.intValue());
        }
        if (this.k != null) {
            b += nyu.d(10, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            i = b;
            for (nzf nzf : this.l) {
                if (nzf != null) {
                    i += nyu.d(11, nzf);
                }
            }
            b = i;
        }
        if (this.m != null) {
            b += nyu.d(12, this.m);
        }
        if (this.n != null && this.n.length > 0) {
            i = b;
            for (nzf nzf2 : this.n) {
                if (nzf2 != null) {
                    i += nyu.d(13, nzf2);
                }
            }
            b = i;
        }
        if (this.o != null) {
            b += nyu.d(14, this.o);
        }
        if (this.p != null) {
            b += nyu.b(15, this.p);
        }
        if (this.q != null) {
            b += nyu.b(16, this.q);
        }
        if (this.r != null) {
            b += nyu.d(17, this.r);
        }
        if (this.s != null) {
            b += nyu.d(18, this.s);
        }
        if (this.t != null && this.t.length > 0) {
            while (i2 < this.t.length) {
                nzf nzf3 = this.t[i2];
                if (nzf3 != null) {
                    b += nyu.d(19, nzf3);
                }
                i2++;
            }
        }
        if (this.u != null) {
            b += nyu.d(20, this.u);
        }
        if (this.v != null) {
            b += nyu.d(21, this.v);
        }
        if (this.h != null) {
            return b + nyu.d(22, this.h);
        }
        return b;
    }

    private nfo b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new nfv();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new nhx();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new nhx();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new ngb();
                    }
                    nyt.a(this.f);
                    continue;
                case 56:
                    this.g = Integer.valueOf(nyt.f());
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 72:
                    this.j = Integer.valueOf(nyt.f());
                    continue;
                case 82:
                    if (this.k == null) {
                        this.k = new nga();
                    }
                    nyt.a(this.k);
                    continue;
                case 90:
                    b = nzl.b(nyt, 90);
                    if (this.l == null) {
                        a = 0;
                    } else {
                        a = this.l.length;
                    }
                    obj = new nhy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nhy();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nhy();
                    nyt.a(obj[a]);
                    this.l = obj;
                    continue;
                case 98:
                    if (this.m == null) {
                        this.m = new nfi();
                    }
                    nyt.a(this.m);
                    continue;
                case 106:
                    b = nzl.b(nyt, 106);
                    if (this.n == null) {
                        a = 0;
                    } else {
                        a = this.n.length;
                    }
                    obj = new nhz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nhz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nhz();
                    nyt.a(obj[a]);
                    this.n = obj;
                    continue;
                case 114:
                    if (this.o == null) {
                        this.o = new nif();
                    }
                    nyt.a(this.o);
                    continue;
                case 122:
                    this.p = nyt.j();
                    continue;
                case 130:
                    this.q = nyt.j();
                    continue;
                case 138:
                    if (this.r == null) {
                        this.r = new nit();
                    }
                    nyt.a(this.r);
                    continue;
                case 146:
                    if (this.s == null) {
                        this.s = new nfq();
                    }
                    nyt.a(this.s);
                    continue;
                case 154:
                    b = nzl.b(nyt, 154);
                    if (this.t == null) {
                        a = 0;
                    } else {
                        a = this.t.length;
                    }
                    obj = new ndt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.t, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ndt();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ndt();
                    nyt.a(obj[a]);
                    this.t = obj;
                    continue;
                case 162:
                    if (this.u == null) {
                        this.u = new nfr();
                    }
                    nyt.a(this.u);
                    continue;
                case 170:
                    if (this.v == null) {
                        this.v = new nfy();
                    }
                    nyt.a(this.v);
                    continue;
                case 178:
                    if (this.h == null) {
                        this.h = new nfw();
                    }
                    nyt.a(this.h);
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
