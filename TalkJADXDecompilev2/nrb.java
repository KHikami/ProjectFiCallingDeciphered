package defpackage;

public final class nrb extends nyx<nrb> {
    public nox[] a;
    public ncd b;
    public String c;
    public String d;
    public ncf[] e;
    public ncu[] f;
    public Long g;
    public int h;
    public Long i;
    public Long j;
    public Long k;
    public Long l;
    public int m;
    public ndg n;
    public nqs o;
    public nop p;
    public ndo q;
    public nqx r;
    public ntm s;
    public nqo[] t;
    public nrd u;
    public nqu v;
    public nrh w;
    public nsg[] x;
    public int y;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nrb() {
        this.a = nox.d();
        this.c = null;
        this.d = null;
        this.e = ncf.d();
        this.f = ncu.d();
        this.g = null;
        this.h = nzf.UNSET_ENUM_VALUE;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = nzf.UNSET_ENUM_VALUE;
        this.t = nqo.d();
        this.x = nsg.d();
        this.y = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            for (nzf nzf2 : this.e) {
                if (nzf2 != null) {
                    nyu.b(5, nzf2);
                }
            }
        }
        if (this.f != null && this.f.length > 0) {
            for (nzf nzf22 : this.f) {
                if (nzf22 != null) {
                    nyu.b(6, nzf22);
                }
            }
        }
        if (this.g != null) {
            nyu.b(7, this.g.longValue());
        }
        if (this.i != null) {
            nyu.b(8, this.i.longValue());
        }
        if (this.j != null) {
            nyu.b(9, this.j.longValue());
        }
        if (this.k != null) {
            nyu.b(10, this.k.longValue());
        }
        if (this.m != nzf.UNSET_ENUM_VALUE) {
            nyu.a(11, this.m);
        }
        if (this.n != null) {
            nyu.b(12, this.n);
        }
        if (this.o != null) {
            nyu.b(13, this.o);
        }
        if (this.p != null) {
            nyu.b(15, this.p);
        }
        if (this.s != null) {
            nyu.b(16, this.s);
        }
        if (this.t != null && this.t.length > 0) {
            for (nzf nzf222 : this.t) {
                if (nzf222 != null) {
                    nyu.b(17, nzf222);
                }
            }
        }
        if (this.u != null) {
            nyu.b(18, this.u);
        }
        if (this.h != nzf.UNSET_ENUM_VALUE) {
            nyu.a(19, this.h);
        }
        if (this.v != null) {
            nyu.b(21, this.v);
        }
        if (this.w != null) {
            nyu.b(22, this.w);
        }
        if (this.x != null && this.x.length > 0) {
            while (i < this.x.length) {
                nzf nzf3 = this.x[i];
                if (nzf3 != null) {
                    nyu.b(23, nzf3);
                }
                i++;
            }
        }
        if (this.y != nzf.UNSET_ENUM_VALUE) {
            nyu.a(24, this.y);
        }
        if (this.q != null) {
            nyu.b(25, this.q);
        }
        if (this.l != null) {
            nyu.b(26, this.l.longValue());
        }
        if (this.r != null) {
            nyu.b(27, this.r);
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            i = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            i = b;
            for (nzf nzf2 : this.e) {
                if (nzf2 != null) {
                    i += nyu.d(5, nzf2);
                }
            }
            b = i;
        }
        if (this.f != null && this.f.length > 0) {
            i = b;
            for (nzf nzf22 : this.f) {
                if (nzf22 != null) {
                    i += nyu.d(6, nzf22);
                }
            }
            b = i;
        }
        if (this.g != null) {
            b += nyu.f(7, this.g.longValue());
        }
        if (this.i != null) {
            b += nyu.f(8, this.i.longValue());
        }
        if (this.j != null) {
            b += nyu.f(9, this.j.longValue());
        }
        if (this.k != null) {
            b += nyu.f(10, this.k.longValue());
        }
        if (this.m != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(11, this.m);
        }
        if (this.n != null) {
            b += nyu.d(12, this.n);
        }
        if (this.o != null) {
            b += nyu.d(13, this.o);
        }
        if (this.p != null) {
            b += nyu.d(15, this.p);
        }
        if (this.s != null) {
            b += nyu.d(16, this.s);
        }
        if (this.t != null && this.t.length > 0) {
            i = b;
            for (nzf nzf222 : this.t) {
                if (nzf222 != null) {
                    i += nyu.d(17, nzf222);
                }
            }
            b = i;
        }
        if (this.u != null) {
            b += nyu.d(18, this.u);
        }
        if (this.h != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(19, this.h);
        }
        if (this.v != null) {
            b += nyu.d(21, this.v);
        }
        if (this.w != null) {
            b += nyu.d(22, this.w);
        }
        if (this.x != null && this.x.length > 0) {
            while (i2 < this.x.length) {
                nzf nzf3 = this.x[i2];
                if (nzf3 != null) {
                    b += nyu.d(23, nzf3);
                }
                i2++;
            }
        }
        if (this.y != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(24, this.y);
        }
        if (this.q != null) {
            b += nyu.d(25, this.q);
        }
        if (this.l != null) {
            b += nyu.f(26, this.l.longValue());
        }
        if (this.r != null) {
            return b + nyu.d(27, this.r);
        }
        return b;
    }

    private nrb b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    obj = new nox[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nox();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nox();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new ncd();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new ncf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ncf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ncf();
                    nyt.a(obj[a]);
                    this.e = obj;
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new ncu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ncu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ncu();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 56:
                    this.g = Long.valueOf(nyt.e());
                    continue;
                case 64:
                    this.i = Long.valueOf(nyt.e());
                    continue;
                case 72:
                    this.j = Long.valueOf(nyt.e());
                    continue;
                case 80:
                    this.k = Long.valueOf(nyt.e());
                    continue;
                case 88:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 10:
                        case 20:
                        case 100:
                            this.m = a;
                            break;
                        default:
                            continue;
                    }
                case 98:
                    if (this.n == null) {
                        this.n = new ndg();
                    }
                    nyt.a(this.n);
                    continue;
                case 106:
                    if (this.o == null) {
                        this.o = new nqs();
                    }
                    nyt.a(this.o);
                    continue;
                case 122:
                    if (this.p == null) {
                        this.p = new nop();
                    }
                    nyt.a(this.p);
                    continue;
                case 130:
                    if (this.s == null) {
                        this.s = new ntm();
                    }
                    nyt.a(this.s);
                    continue;
                case 138:
                    b = nzl.b(nyt, 138);
                    if (this.t == null) {
                        a = 0;
                    } else {
                        a = this.t.length;
                    }
                    obj = new nqo[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.t, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nqo();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nqo();
                    nyt.a(obj[a]);
                    this.t = obj;
                    continue;
                case 146:
                    if (this.u == null) {
                        this.u = new nrd();
                    }
                    nyt.a(this.u);
                    continue;
                case 152:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.h = a;
                            break;
                        default:
                            continue;
                    }
                case 170:
                    if (this.v == null) {
                        this.v = new nqu();
                    }
                    nyt.a(this.v);
                    continue;
                case 178:
                    if (this.w == null) {
                        this.w = new nrh();
                    }
                    nyt.a(this.w);
                    continue;
                case 186:
                    b = nzl.b(nyt, 186);
                    if (this.x == null) {
                        a = 0;
                    } else {
                        a = this.x.length;
                    }
                    obj = new nsg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.x, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nsg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nsg();
                    nyt.a(obj[a]);
                    this.x = obj;
                    continue;
                case 192:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.y = a;
                            break;
                        default:
                            continue;
                    }
                case 202:
                    if (this.q == null) {
                        this.q = new ndo();
                    }
                    nyt.a(this.q);
                    continue;
                case 208:
                    this.l = Long.valueOf(nyt.e());
                    continue;
                case 218:
                    if (this.r == null) {
                        this.r = new nqx();
                    }
                    nyt.a(this.r);
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
