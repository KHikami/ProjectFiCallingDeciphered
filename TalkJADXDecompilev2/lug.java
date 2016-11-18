package defpackage;

public final class lug extends nyx<lug> {
    public String[] A;
    public Integer B;
    public Integer C;
    public String D;
    public String E;
    public Boolean F;
    public lvy G;
    public Integer a;
    public Integer b;
    public String c;
    public String d;
    public String e;
    public byte[] f;
    public byte[] g;
    public String h;
    public String[] i;
    public String j;
    public Integer k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String[] p;
    public Long q;
    public String r;
    public lup requestHeader;
    public String s;
    public String[] t;
    public String u;
    public String v;
    public Integer w;
    public String[] x;
    public String y;
    public String z;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lug() {
        d();
    }

    private lug d() {
        this.requestHeader = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = nzl.f;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = nzl.f;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = nzl.f;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = nzl.f;
        this.y = null;
        this.z = null;
        this.A = nzl.f;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.a != null) {
            nyu.a(2, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(3, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(4, this.c);
        }
        if (this.d != null) {
            nyu.a(5, this.d);
        }
        if (this.e != null) {
            nyu.a(7, this.e);
        }
        if (this.f != null) {
            nyu.a(8, this.f);
        }
        if (this.q != null) {
            nyu.b(9, this.q.longValue());
        }
        if (this.r != null) {
            nyu.a(10, this.r);
        }
        if (this.i != null && this.i.length > 0) {
            for (String str : this.i) {
                if (str != null) {
                    nyu.a(11, str);
                }
            }
        }
        if (this.t != null && this.t.length > 0) {
            for (String str2 : this.t) {
                if (str2 != null) {
                    nyu.a(12, str2);
                }
            }
        }
        if (this.z != null) {
            nyu.a(13, this.z);
        }
        if (this.A != null && this.A.length > 0) {
            for (String str22 : this.A) {
                if (str22 != null) {
                    nyu.a(14, str22);
                }
            }
        }
        if (this.D != null) {
            nyu.a(15, this.D);
        }
        if (this.u != null) {
            nyu.a(16, this.u);
        }
        if (this.v != null) {
            nyu.a(17, this.v);
        }
        if (this.j != null) {
            nyu.a(18, this.j);
        }
        if (this.x != null && this.x.length > 0) {
            for (String str222 : this.x) {
                if (str222 != null) {
                    nyu.a(19, str222);
                }
            }
        }
        if (this.y != null) {
            nyu.a(20, this.y);
        }
        if (this.E != null) {
            nyu.a(21, this.E);
        }
        if (this.k != null) {
            nyu.a(22, this.k.intValue());
        }
        if (this.w != null) {
            nyu.a(23, this.w.intValue());
        }
        if (this.l != null) {
            nyu.a(24, this.l);
        }
        if (this.m != null) {
            nyu.a(25, this.m);
        }
        if (this.n != null) {
            nyu.a(26, this.n);
        }
        if (this.B != null) {
            nyu.a(27, this.B.intValue());
        }
        if (this.C != null) {
            nyu.a(28, this.C.intValue());
        }
        if (this.o != null) {
            nyu.a(29, this.o);
        }
        if (this.F != null) {
            nyu.a(30, this.F.booleanValue());
        }
        if (this.p != null && this.p.length > 0) {
            while (i < this.p.length) {
                String str3 = this.p[i];
                if (str3 != null) {
                    nyu.a(31, str3);
                }
                i++;
            }
        }
        if (this.G != null) {
            nyu.b(32, this.G);
        }
        if (this.g != null) {
            nyu.a(33, this.g);
        }
        if (this.h != null) {
            nyu.a(34, this.h);
        }
        if (this.s != null) {
            nyu.a(35, this.s);
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.a != null) {
            b += nyu.f(2, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(3, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.b(4, this.c);
        }
        if (this.d != null) {
            b += nyu.b(5, this.d);
        }
        if (this.e != null) {
            b += nyu.b(7, this.e);
        }
        if (this.f != null) {
            b += nyu.b(8, this.f);
        }
        if (this.q != null) {
            b += nyu.f(9, this.q.longValue());
        }
        if (this.r != null) {
            b += nyu.b(10, this.r);
        }
        if (this.i != null && this.i.length > 0) {
            i = 0;
            i2 = 0;
            for (String str : this.i) {
                if (str != null) {
                    i2++;
                    i += nyu.b(str);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.t != null && this.t.length > 0) {
            i = 0;
            i2 = 0;
            for (String str2 : this.t) {
                if (str2 != null) {
                    i2++;
                    i += nyu.b(str2);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.z != null) {
            b += nyu.b(13, this.z);
        }
        if (this.A != null && this.A.length > 0) {
            i = 0;
            i2 = 0;
            for (String str22 : this.A) {
                if (str22 != null) {
                    i2++;
                    i += nyu.b(str22);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.D != null) {
            b += nyu.b(15, this.D);
        }
        if (this.u != null) {
            b += nyu.b(16, this.u);
        }
        if (this.v != null) {
            b += nyu.b(17, this.v);
        }
        if (this.j != null) {
            b += nyu.b(18, this.j);
        }
        if (this.x != null && this.x.length > 0) {
            i = 0;
            i2 = 0;
            for (String str222 : this.x) {
                if (str222 != null) {
                    i2++;
                    i += nyu.b(str222);
                }
            }
            b = (b + i) + (i2 * 2);
        }
        if (this.y != null) {
            b += nyu.b(20, this.y);
        }
        if (this.E != null) {
            b += nyu.b(21, this.E);
        }
        if (this.k != null) {
            b += nyu.f(22, this.k.intValue());
        }
        if (this.w != null) {
            b += nyu.f(23, this.w.intValue());
        }
        if (this.l != null) {
            b += nyu.b(24, this.l);
        }
        if (this.m != null) {
            b += nyu.b(25, this.m);
        }
        if (this.n != null) {
            b += nyu.b(26, this.n);
        }
        if (this.B != null) {
            b += nyu.f(27, this.B.intValue());
        }
        if (this.C != null) {
            b += nyu.f(28, this.C.intValue());
        }
        if (this.o != null) {
            b += nyu.b(29, this.o);
        }
        if (this.F != null) {
            this.F.booleanValue();
            b += nyu.h(30) + 1;
        }
        if (this.p != null && this.p.length > 0) {
            i3 = 0;
            i = 0;
            while (i4 < this.p.length) {
                String str3 = this.p[i4];
                if (str3 != null) {
                    i++;
                    i3 += nyu.b(str3);
                }
                i4++;
            }
            b = (b + i3) + (i * 2);
        }
        if (this.G != null) {
            b += nyu.d(32, this.G);
        }
        if (this.g != null) {
            b += nyu.b(33, this.g);
        }
        if (this.h != null) {
            b += nyu.b(34, this.h);
        }
        if (this.s != null) {
            return b + nyu.b(35, this.s);
        }
        return b;
    }

    private lug b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.c = nyt.j();
                    continue;
                case 42:
                    this.d = nyt.j();
                    continue;
                case 58:
                    this.e = nyt.j();
                    continue;
                case 66:
                    this.f = nyt.k();
                    continue;
                case 72:
                    this.q = Long.valueOf(nyt.e());
                    continue;
                case 82:
                    this.r = nyt.j();
                    continue;
                case 90:
                    b = nzl.b(nyt, 90);
                    a = this.i == null ? 0 : this.i.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.i = obj;
                    continue;
                case 98:
                    b = nzl.b(nyt, 98);
                    a = this.t == null ? 0 : this.t.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.t, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.t = obj;
                    continue;
                case 106:
                    this.z = nyt.j();
                    continue;
                case 114:
                    b = nzl.b(nyt, 114);
                    a = this.A == null ? 0 : this.A.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.A, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.A = obj;
                    continue;
                case 122:
                    this.D = nyt.j();
                    continue;
                case 130:
                    this.u = nyt.j();
                    continue;
                case 138:
                    this.v = nyt.j();
                    continue;
                case 146:
                    this.j = nyt.j();
                    continue;
                case 154:
                    b = nzl.b(nyt, 154);
                    a = this.x == null ? 0 : this.x.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.x, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.x = obj;
                    continue;
                case 162:
                    this.y = nyt.j();
                    continue;
                case 170:
                    this.E = nyt.j();
                    continue;
                case 176:
                    this.k = Integer.valueOf(nyt.f());
                    continue;
                case 184:
                    this.w = Integer.valueOf(nyt.f());
                    continue;
                case 194:
                    this.l = nyt.j();
                    continue;
                case 202:
                    this.m = nyt.j();
                    continue;
                case 210:
                    this.n = nyt.j();
                    continue;
                case 216:
                    this.B = Integer.valueOf(nyt.f());
                    continue;
                case 224:
                    this.C = Integer.valueOf(nyt.f());
                    continue;
                case 234:
                    this.o = nyt.j();
                    continue;
                case 240:
                    this.F = Boolean.valueOf(nyt.i());
                    continue;
                case 250:
                    b = nzl.b(nyt, 250);
                    a = this.p == null ? 0 : this.p.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.p, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.p = obj;
                    continue;
                case 258:
                    if (this.G == null) {
                        this.G = new lvy();
                    }
                    nyt.a(this.G);
                    continue;
                case 266:
                    this.g = nyt.k();
                    continue;
                case 274:
                    this.h = nyt.j();
                    continue;
                case 282:
                    this.s = nyt.j();
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
