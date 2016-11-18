package defpackage;

public final class oqa extends nyx<oqa> {
    private static volatile oqa[] F;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public oox a;
    public Boolean b;
    public Integer c;
    public Boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public osq j;
    public oqb k;
    public oqu l;
    public String[] m;
    public String[] n;
    public String o;
    public String p;
    public Boolean q;
    public oqu r;
    public oqb s;
    public oqd t;
    public ora[] u;
    public oqz[] v;
    public osz w;
    public orx x;
    public orw y;
    public Integer z;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oqa[] d() {
        if (F == null) {
            synchronized (nzc.c) {
                if (F == null) {
                    F = new oqa[0];
                }
            }
        }
        return F;
    }

    public oqa() {
        g();
    }

    private oqa g() {
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
        this.m = nzl.f;
        this.n = nzl.f;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = ora.d();
        this.v = oqz.d();
        this.w = null;
        this.x = null;
        this.y = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.c != null) {
            nyu.a(2, this.c.intValue());
        }
        if (this.e != null) {
            nyu.a(3, this.e);
        }
        if (this.f != null) {
            nyu.a(4, this.f);
        }
        if (this.h != null) {
            nyu.a(5, this.h);
        }
        if (this.i != null) {
            nyu.a(6, this.i);
        }
        if (this.k != null) {
            nyu.b(7, this.k);
        }
        if (this.l != null) {
            nyu.b(8, this.l);
        }
        if (this.m != null && this.m.length > 0) {
            for (String str : this.m) {
                if (str != null) {
                    nyu.a(9, str);
                }
            }
        }
        if (this.n != null && this.n.length > 0) {
            for (String str2 : this.n) {
                if (str2 != null) {
                    nyu.a(10, str2);
                }
            }
        }
        if (this.o != null) {
            nyu.a(11, this.o);
        }
        if (this.p != null) {
            nyu.a(12, this.p);
        }
        if (this.q != null) {
            nyu.a(13, this.q.booleanValue());
        }
        if (this.r != null) {
            nyu.b(14, this.r);
        }
        if (this.s != null) {
            nyu.b(15, this.s);
        }
        if (this.d != null) {
            nyu.a(16, this.d.booleanValue());
        }
        if (this.u != null && this.u.length > 0) {
            for (nzf nzf : this.u) {
                if (nzf != null) {
                    nyu.b(17, nzf);
                }
            }
        }
        if (this.w != null) {
            nyu.b(18, this.w);
        }
        if (this.x != null) {
            nyu.b(19, this.x);
        }
        if (this.y != null) {
            nyu.b(20, this.y);
        }
        if (this.j != null) {
            nyu.b(25, this.j);
        }
        if (this.z != null) {
            nyu.a(26, this.z.intValue());
        }
        if (this.t != null) {
            nyu.b(27, this.t);
        }
        if (this.A != null) {
            nyu.a(28, this.A);
        }
        if (this.v != null && this.v.length > 0) {
            while (i < this.v.length) {
                nzf nzf2 = this.v[i];
                if (nzf2 != null) {
                    nyu.b(29, nzf2);
                }
                i++;
            }
        }
        if (this.B != null) {
            nyu.a(30, this.B);
        }
        if (this.C != null) {
            nyu.a(31, this.C);
        }
        if (this.D != null) {
            nyu.a(32, this.D);
        }
        if (this.g != null) {
            nyu.a(33, this.g);
        }
        if (this.E != null) {
            nyu.a(34, this.E);
        }
        if (this.b != null) {
            nyu.a(35, this.b.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.c != null) {
            b += nyu.f(2, this.c.intValue());
        }
        if (this.e != null) {
            b += nyu.b(3, this.e);
        }
        if (this.f != null) {
            b += nyu.b(4, this.f);
        }
        if (this.h != null) {
            b += nyu.b(5, this.h);
        }
        if (this.i != null) {
            b += nyu.b(6, this.i);
        }
        if (this.k != null) {
            b += nyu.d(7, this.k);
        }
        if (this.l != null) {
            b += nyu.d(8, this.l);
        }
        if (this.m != null && this.m.length > 0) {
            i = 0;
            i2 = 0;
            for (String str : this.m) {
                if (str != null) {
                    i2++;
                    i += nyu.b(str);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.n != null && this.n.length > 0) {
            i = 0;
            i2 = 0;
            for (String str2 : this.n) {
                if (str2 != null) {
                    i2++;
                    i += nyu.b(str2);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.o != null) {
            b += nyu.b(11, this.o);
        }
        if (this.p != null) {
            b += nyu.b(12, this.p);
        }
        if (this.q != null) {
            this.q.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.r != null) {
            b += nyu.d(14, this.r);
        }
        if (this.s != null) {
            b += nyu.d(15, this.s);
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(16) + 1;
        }
        if (this.u != null && this.u.length > 0) {
            i3 = b;
            for (nzf nzf : this.u) {
                if (nzf != null) {
                    i3 += nyu.d(17, nzf);
                }
            }
            b = i3;
        }
        if (this.w != null) {
            b += nyu.d(18, this.w);
        }
        if (this.x != null) {
            b += nyu.d(19, this.x);
        }
        if (this.y != null) {
            b += nyu.d(20, this.y);
        }
        if (this.j != null) {
            b += nyu.d(25, this.j);
        }
        if (this.z != null) {
            b += nyu.f(26, this.z.intValue());
        }
        if (this.t != null) {
            b += nyu.d(27, this.t);
        }
        if (this.A != null) {
            b += nyu.b(28, this.A);
        }
        if (this.v != null && this.v.length > 0) {
            while (i4 < this.v.length) {
                nzf nzf2 = this.v[i4];
                if (nzf2 != null) {
                    b += nyu.d(29, nzf2);
                }
                i4++;
            }
        }
        if (this.B != null) {
            b += nyu.b(30, this.B);
        }
        if (this.C != null) {
            b += nyu.b(31, this.C);
        }
        if (this.D != null) {
            b += nyu.b(32, this.D);
        }
        if (this.g != null) {
            b += nyu.b(33, this.g);
        }
        if (this.E != null) {
            b += nyu.b(34, this.E);
        }
        if (this.b == null) {
            return b;
        }
        this.b.booleanValue();
        return b + (nyu.h(35) + 1);
    }

    private oqa b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new oox();
                    }
                    nyt.a(this.a);
                    continue;
                case 16:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    this.e = nyt.j();
                    continue;
                case 34:
                    this.f = nyt.j();
                    continue;
                case 42:
                    this.h = nyt.j();
                    continue;
                case 50:
                    this.i = nyt.j();
                    continue;
                case 58:
                    if (this.k == null) {
                        this.k = new oqb();
                    }
                    nyt.a(this.k);
                    continue;
                case 66:
                    if (this.l == null) {
                        this.l = new oqu();
                    }
                    nyt.a(this.l);
                    continue;
                case 74:
                    b = nzl.b(nyt, 74);
                    a = this.m == null ? 0 : this.m.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.m = obj;
                    continue;
                case 82:
                    b = nzl.b(nyt, 82);
                    a = this.n == null ? 0 : this.n.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.n = obj;
                    continue;
                case 90:
                    this.o = nyt.j();
                    continue;
                case 98:
                    this.p = nyt.j();
                    continue;
                case 104:
                    this.q = Boolean.valueOf(nyt.i());
                    continue;
                case 114:
                    if (this.r == null) {
                        this.r = new oqu();
                    }
                    nyt.a(this.r);
                    continue;
                case 122:
                    if (this.s == null) {
                        this.s = new oqb();
                    }
                    nyt.a(this.s);
                    continue;
                case 128:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 138:
                    b = nzl.b(nyt, 138);
                    if (this.u == null) {
                        a = 0;
                    } else {
                        a = this.u.length;
                    }
                    obj = new ora[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.u, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ora();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ora();
                    nyt.a(obj[a]);
                    this.u = obj;
                    continue;
                case 146:
                    if (this.w == null) {
                        this.w = new osz();
                    }
                    nyt.a(this.w);
                    continue;
                case 154:
                    if (this.x == null) {
                        this.x = new orx();
                    }
                    nyt.a(this.x);
                    continue;
                case 162:
                    if (this.y == null) {
                        this.y = new orw();
                    }
                    nyt.a(this.y);
                    continue;
                case 202:
                    if (this.j == null) {
                        this.j = new osq();
                    }
                    nyt.a(this.j);
                    continue;
                case 208:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.z = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 218:
                    if (this.t == null) {
                        this.t = new oqd();
                    }
                    nyt.a(this.t);
                    continue;
                case 226:
                    this.A = nyt.j();
                    continue;
                case 234:
                    b = nzl.b(nyt, 234);
                    if (this.v == null) {
                        a = 0;
                    } else {
                        a = this.v.length;
                    }
                    obj = new oqz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.v, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oqz();
                    nyt.a(obj[a]);
                    this.v = obj;
                    continue;
                case 242:
                    this.B = nyt.j();
                    continue;
                case 250:
                    this.C = nyt.j();
                    continue;
                case 258:
                    this.D = nyt.j();
                    continue;
                case 266:
                    this.g = nyt.j();
                    continue;
                case 274:
                    this.E = nyt.j();
                    continue;
                case 280:
                    this.b = Boolean.valueOf(nyt.i());
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
