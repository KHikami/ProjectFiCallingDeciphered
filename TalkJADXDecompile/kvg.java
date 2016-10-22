public final class kvg extends nyx<kvg> {
    public String a;
    public int b;
    public String c;
    public kve d;
    public String e;
    public String f;
    public Double g;
    public kvh h;
    public String i;
    public String j;
    public String k;
    public kvd[] l;
    public Boolean m;
    public Boolean n;
    public String o;
    public String p;
    public String q;
    public Integer r;
    public Integer s;
    public kvf[] t;
    public Boolean u;
    public String v;
    public Boolean w;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kvg() {
        this.a = null;
        this.b = nzf.UNSET_ENUM_VALUE;
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = kvd.d();
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = kvf.d();
        this.u = null;
        this.v = null;
        this.w = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.a(6, this.f);
        }
        if (this.g != null) {
            nyu.a(7, this.g.doubleValue());
        }
        if (this.h != null) {
            nyu.b(8, this.h);
        }
        if (this.i != null) {
            nyu.a(10, this.i);
        }
        if (this.j != null) {
            nyu.a(11, this.j);
        }
        if (this.k != null) {
            nyu.a(12, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            for (nzf nzf : this.l) {
                if (nzf != null) {
                    nyu.b(13, nzf);
                }
            }
        }
        if (this.m != null) {
            nyu.a(14, this.m.booleanValue());
        }
        if (this.o != null) {
            nyu.a(15, this.o);
        }
        if (this.p != null) {
            nyu.a(16, this.p);
        }
        if (this.r != null) {
            nyu.a(17, this.r.intValue());
        }
        if (this.t != null && this.t.length > 0) {
            while (i < this.t.length) {
                nzf nzf2 = this.t[i];
                if (nzf2 != null) {
                    nyu.b(18, nzf2);
                }
                i++;
            }
        }
        if (this.u != null) {
            nyu.a(19, this.u.booleanValue());
        }
        if (this.s != null) {
            nyu.a(20, this.s.intValue());
        }
        if (this.n != null) {
            nyu.a(21, this.n.booleanValue());
        }
        if (this.q != null) {
            nyu.a(22, this.q);
        }
        if (this.v != null) {
            nyu.a(23, this.v);
        }
        if (this.w != null) {
            nyu.a(24, this.w.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            b += nyu.b(6, this.f);
        }
        if (this.g != null) {
            this.g.doubleValue();
            b += nyu.h(7) + 8;
        }
        if (this.h != null) {
            b += nyu.d(8, this.h);
        }
        if (this.i != null) {
            b += nyu.b(10, this.i);
        }
        if (this.j != null) {
            b += nyu.b(11, this.j);
        }
        if (this.k != null) {
            b += nyu.b(12, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            int i2 = b;
            for (nzf nzf : this.l) {
                if (nzf != null) {
                    i2 += nyu.d(13, nzf);
                }
            }
            b = i2;
        }
        if (this.m != null) {
            this.m.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.o != null) {
            b += nyu.b(15, this.o);
        }
        if (this.p != null) {
            b += nyu.b(16, this.p);
        }
        if (this.r != null) {
            b += nyu.f(17, this.r.intValue());
        }
        if (this.t != null && this.t.length > 0) {
            while (i < this.t.length) {
                nzf nzf2 = this.t[i];
                if (nzf2 != null) {
                    b += nyu.d(18, nzf2);
                }
                i++;
            }
        }
        if (this.u != null) {
            this.u.booleanValue();
            b += nyu.h(19) + 1;
        }
        if (this.s != null) {
            b += nyu.f(20, this.s.intValue());
        }
        if (this.n != null) {
            this.n.booleanValue();
            b += nyu.h(21) + 1;
        }
        if (this.q != null) {
            b += nyu.b(22, this.q);
        }
        if (this.v != null) {
            b += nyu.b(23, this.v);
        }
        if (this.w == null) {
            return b;
        }
        this.w.booleanValue();
        return b + (nyu.h(24) + 1);
    }

    private kvg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dI /*16*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                        case wi.q /*7*/:
                        case wi.m /*8*/:
                        case wi.n /*9*/:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new kve();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 57:
                    this.g = Double.valueOf(nyt.b());
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new kvh();
                    }
                    nyt.a(this.h);
                    continue;
                case 82:
                    this.i = nyt.j();
                    continue;
                case 90:
                    this.j = nyt.j();
                    continue;
                case 98:
                    this.k = nyt.j();
                    continue;
                case 106:
                    b = nzl.b(nyt, 106);
                    if (this.l == null) {
                        a = 0;
                    } else {
                        a = this.l.length;
                    }
                    obj = new kvd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kvd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kvd();
                    nyt.a(obj[a]);
                    this.l = obj;
                    continue;
                case 112:
                    this.m = Boolean.valueOf(nyt.i());
                    continue;
                case 122:
                    this.o = nyt.j();
                    continue;
                case 130:
                    this.p = nyt.j();
                    continue;
                case 136:
                    this.r = Integer.valueOf(nyt.f());
                    continue;
                case 146:
                    b = nzl.b(nyt, 146);
                    if (this.t == null) {
                        a = 0;
                    } else {
                        a = this.t.length;
                    }
                    obj = new kvf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.t, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kvf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kvf();
                    nyt.a(obj[a]);
                    this.t = obj;
                    continue;
                case 152:
                    this.u = Boolean.valueOf(nyt.i());
                    continue;
                case 160:
                    this.s = Integer.valueOf(nyt.f());
                    continue;
                case 168:
                    this.n = Boolean.valueOf(nyt.i());
                    continue;
                case 178:
                    this.q = nyt.j();
                    continue;
                case 186:
                    this.v = nyt.j();
                    continue;
                case 192:
                    this.w = Boolean.valueOf(nyt.i());
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
