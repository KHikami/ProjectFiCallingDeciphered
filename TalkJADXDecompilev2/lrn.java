package defpackage;

public final class lrn extends nyx<lrn> {
    public lqc a;
    public Boolean b;
    public log[] c;
    public lpu d;
    public lpl e;
    public lpm f;
    public ltt g;
    public loi[] h;
    public Boolean i;
    public Boolean j;
    public lpn k;
    public luu l;
    public Boolean m;
    public Boolean n;
    public Integer o;
    public ltr[] p;
    public Integer q;
    public mut r;
    public luq responseHeader;
    public lqq[] s;
    public lws t;
    public Integer u;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lrn() {
        d();
    }

    private lrn d() {
        this.responseHeader = null;
        this.a = null;
        this.b = null;
        this.c = log.d();
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = loi.d();
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.p = ltr.d();
        this.r = null;
        this.s = lqq.d();
        this.t = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.a != null) {
            nyu.b(2, this.a);
        }
        if (this.b != null) {
            nyu.a(3, this.b.booleanValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.d != null) {
            nyu.b(5, this.d);
        }
        if (this.e != null) {
            nyu.b(6, this.e);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null && this.h.length > 0) {
            for (nzf nzf2 : this.h) {
                if (nzf2 != null) {
                    nyu.b(8, nzf2);
                }
            }
        }
        if (this.f != null) {
            nyu.b(9, this.f);
        }
        if (this.i != null) {
            nyu.a(10, this.i.booleanValue());
        }
        if (this.k != null) {
            nyu.b(11, this.k);
        }
        if (this.l != null) {
            nyu.b(12, this.l);
        }
        if (this.j != null) {
            nyu.a(13, this.j.booleanValue());
        }
        if (this.m != null) {
            nyu.a(14, this.m.booleanValue());
        }
        if (this.n != null) {
            nyu.a(15, this.n.booleanValue());
        }
        if (this.o != null) {
            nyu.a(16, this.o.intValue());
        }
        if (this.p != null && this.p.length > 0) {
            for (nzf nzf22 : this.p) {
                if (nzf22 != null) {
                    nyu.b(17, nzf22);
                }
            }
        }
        if (this.q != null) {
            nyu.a(18, this.q.intValue());
        }
        if (this.r != null) {
            nyu.b(19, this.r);
        }
        if (this.s != null && this.s.length > 0) {
            while (i < this.s.length) {
                nzf nzf3 = this.s[i];
                if (nzf3 != null) {
                    nyu.b(20, nzf3);
                }
                i++;
            }
        }
        if (this.t != null) {
            nyu.b(22, this.t);
        }
        if (this.u != null) {
            nyu.a(24, this.u.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.a != null) {
            b += nyu.d(2, this.a);
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.c != null && this.c.length > 0) {
            i = b;
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    i += nyu.d(4, nzf);
                }
            }
            b = i;
        }
        if (this.d != null) {
            b += nyu.d(5, this.d);
        }
        if (this.e != null) {
            b += nyu.d(6, this.e);
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null && this.h.length > 0) {
            i = b;
            for (nzf nzf2 : this.h) {
                if (nzf2 != null) {
                    i += nyu.d(8, nzf2);
                }
            }
            b = i;
        }
        if (this.f != null) {
            b += nyu.d(9, this.f);
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(10) + 1;
        }
        if (this.k != null) {
            b += nyu.d(11, this.k);
        }
        if (this.l != null) {
            b += nyu.d(12, this.l);
        }
        if (this.j != null) {
            this.j.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.m != null) {
            this.m.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.n != null) {
            this.n.booleanValue();
            b += nyu.h(15) + 1;
        }
        if (this.o != null) {
            b += nyu.f(16, this.o.intValue());
        }
        if (this.p != null && this.p.length > 0) {
            i = b;
            for (nzf nzf22 : this.p) {
                if (nzf22 != null) {
                    i += nyu.d(17, nzf22);
                }
            }
            b = i;
        }
        if (this.q != null) {
            b += nyu.f(18, this.q.intValue());
        }
        if (this.r != null) {
            b += nyu.d(19, this.r);
        }
        if (this.s != null && this.s.length > 0) {
            while (i2 < this.s.length) {
                nzf nzf3 = this.s[i2];
                if (nzf3 != null) {
                    b += nyu.d(20, nzf3);
                }
                i2++;
            }
        }
        if (this.t != null) {
            b += nyu.d(22, this.t);
        }
        if (this.u != null) {
            return b + nyu.f(24, this.u.intValue());
        }
        return b;
    }

    private lrn b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.a == null) {
                        this.a = new lqc();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dA /*24*/:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new log[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new log();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new log();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 42:
                    if (this.d == null) {
                        this.d = new lpu();
                    }
                    nyt.a(this.d);
                    continue;
                case 50:
                    if (this.e == null) {
                        this.e = new lpl();
                    }
                    nyt.a(this.e);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new ltt();
                    }
                    nyt.a(this.g);
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    if (this.h == null) {
                        a = 0;
                    } else {
                        a = this.h.length;
                    }
                    obj = new loi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new loi();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new loi();
                    nyt.a(obj[a]);
                    this.h = obj;
                    continue;
                case 74:
                    if (this.f == null) {
                        this.f = new lpm();
                    }
                    nyt.a(this.f);
                    continue;
                case 80:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new lpn();
                    }
                    nyt.a(this.k);
                    continue;
                case 98:
                    if (this.l == null) {
                        this.l = new luu();
                    }
                    nyt.a(this.l);
                    continue;
                case 104:
                    this.j = Boolean.valueOf(nyt.i());
                    continue;
                case 112:
                    this.m = Boolean.valueOf(nyt.i());
                    continue;
                case 120:
                    this.n = Boolean.valueOf(nyt.i());
                    continue;
                case 128:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.o = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 138:
                    b = nzl.b(nyt, 138);
                    if (this.p == null) {
                        a = 0;
                    } else {
                        a = this.p.length;
                    }
                    obj = new ltr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.p, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltr();
                    nyt.a(obj[a]);
                    this.p = obj;
                    continue;
                case 144:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.q = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 154:
                    if (this.r == null) {
                        this.r = new mut();
                    }
                    nyt.a(this.r);
                    continue;
                case 162:
                    b = nzl.b(nyt, 162);
                    if (this.s == null) {
                        a = 0;
                    } else {
                        a = this.s.length;
                    }
                    obj = new lqq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.s, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqq();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqq();
                    nyt.a(obj[a]);
                    this.s = obj;
                    continue;
                case 178:
                    if (this.t == null) {
                        this.t = new lws();
                    }
                    nyt.a(this.t);
                    continue;
                case 192:
                    a = nyt.f();
                    switch (a) {
                        case 10:
                        case 20:
                        case wi.dz /*25*/:
                        case 30:
                        case 100:
                            this.u = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
