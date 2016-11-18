package defpackage;

public final class obj extends nyx<obj> {
    public static final nyy<nzs, obj> a = nyy.a(11, obj.class, 221119658);
    static final obj[] b = new obj[0];
    public oai c;
    public String d;
    public String e;
    public String f;
    public String[] g;
    public Boolean h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public int p;
    public nzs q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public obj() {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = nzl.f;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = nzf.UNSET_ENUM_VALUE;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.c != null) {
            nyu.b(1, this.c);
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
        if (this.h != null) {
            nyu.a(5, this.h.booleanValue());
        }
        if (this.i != null) {
            nyu.a(6, this.i);
        }
        if (this.j != null) {
            nyu.a(7, this.j);
        }
        if (this.k != null) {
            nyu.a(8, this.k);
        }
        if (this.l != null) {
            nyu.a(9, this.l);
        }
        if (this.m != null) {
            nyu.a(10, this.m);
        }
        if (this.n != null) {
            nyu.a(11, this.n);
        }
        if (this.o != null) {
            nyu.a(12, this.o);
        }
        if (this.p != nzf.UNSET_ENUM_VALUE) {
            nyu.a(13, this.p);
        }
        if (this.g != null && this.g.length > 0) {
            for (String str : this.g) {
                if (str != null) {
                    nyu.a(14, str);
                }
            }
        }
        if (this.q != null) {
            nyu.b(15, this.q);
        }
        if (this.r != null) {
            nyu.a(16, this.r);
        }
        if (this.s != null) {
            nyu.a(17, this.s);
        }
        if (this.t != null) {
            nyu.a(18, this.t);
        }
        if (this.u != null) {
            nyu.a(19, this.u);
        }
        if (this.v != null) {
            nyu.a(20, this.v);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.c != null) {
            b += nyu.d(1, this.c);
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
        if (this.h != null) {
            this.h.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.i != null) {
            b += nyu.b(6, this.i);
        }
        if (this.j != null) {
            b += nyu.b(7, this.j);
        }
        if (this.k != null) {
            b += nyu.b(8, this.k);
        }
        if (this.l != null) {
            b += nyu.b(9, this.l);
        }
        if (this.m != null) {
            b += nyu.b(10, this.m);
        }
        if (this.n != null) {
            b += nyu.b(11, this.n);
        }
        if (this.o != null) {
            b += nyu.b(12, this.o);
        }
        if (this.p != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(13, this.p);
        }
        if (this.g != null && this.g.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.g.length) {
                String str = this.g[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.q != null) {
            b += nyu.d(15, this.q);
        }
        if (this.r != null) {
            b += nyu.b(16, this.r);
        }
        if (this.s != null) {
            b += nyu.b(17, this.s);
        }
        if (this.t != null) {
            b += nyu.b(18, this.t);
        }
        if (this.u != null) {
            b += nyu.b(19, this.u);
        }
        if (this.v != null) {
            return b + nyu.b(20, this.v);
        }
        return b;
    }

    private obj b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.c == null) {
                        this.c = new oai();
                    }
                    nyt.a(this.c);
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
                case 40:
                    this.h = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    this.i = nyt.j();
                    continue;
                case 58:
                    this.j = nyt.j();
                    continue;
                case 66:
                    this.k = nyt.j();
                    continue;
                case 74:
                    this.l = nyt.j();
                    continue;
                case 82:
                    this.m = nyt.j();
                    continue;
                case 90:
                    this.n = nyt.j();
                    continue;
                case 98:
                    this.o = nyt.j();
                    continue;
                case 104:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.p = a;
                            break;
                        default:
                            continue;
                    }
                case 114:
                    int b = nzl.b(nyt, 114);
                    a = this.g == null ? 0 : this.g.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.g = obj;
                    continue;
                case 122:
                    if (this.q == null) {
                        this.q = new nzs();
                    }
                    nyt.a(this.q);
                    continue;
                case 130:
                    this.r = nyt.j();
                    continue;
                case 138:
                    this.s = nyt.j();
                    continue;
                case 146:
                    this.t = nyt.j();
                    continue;
                case 154:
                    this.u = nyt.j();
                    continue;
                case 162:
                    this.v = nyt.j();
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
