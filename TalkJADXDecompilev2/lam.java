package defpackage;

public final class lam extends nyx<lam> {
    public nzs[] A;
    public String[] B;
    public int[] C;
    public String a;
    public String b;
    public String c;
    public lao[] d;
    public lao[] e;
    public String[] f;
    public int g;
    public String h;
    public Boolean i;
    public String j;
    public String k;
    public String l;
    public Boolean m;
    public lan n;
    public Boolean o;
    public String p;
    public String q;
    public int r;
    public Boolean s;
    public Boolean t;
    public String u;
    public String v;
    public Boolean w;
    public oaf[] x;
    public String y;
    public Integer z;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lam() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = lao.d();
        this.e = lao.d();
        this.f = nzl.f;
        this.g = nzf.UNSET_ENUM_VALUE;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = nzf.UNSET_ENUM_VALUE;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = oaf.d();
        this.y = null;
        this.z = null;
        this.A = nzs.d();
        this.B = nzl.f;
        this.C = nzl.a;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.a);
        nyu.a(2, this.b);
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (nzf nzf2 : this.e) {
                if (nzf2 != null) {
                    nyu.b(5, nzf2);
                }
            }
        }
        if (this.f != null && this.f.length > 0) {
            for (String str : this.f) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        if (this.g != nzf.UNSET_ENUM_VALUE) {
            nyu.a(7, this.g);
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        if (this.i != null) {
            nyu.a(9, this.i.booleanValue());
        }
        if (this.j != null) {
            nyu.a(10, this.j);
        }
        if (this.k != null) {
            nyu.a(11, this.k);
        }
        if (this.l != null) {
            nyu.a(12, this.l);
        }
        if (this.m != null) {
            nyu.a(13, this.m.booleanValue());
        }
        if (this.n != null) {
            nyu.b(14, this.n);
        }
        if (this.o != null) {
            nyu.a(15, this.o.booleanValue());
        }
        if (this.p != null) {
            nyu.a(16, this.p);
        }
        if (this.q != null) {
            nyu.a(17, this.q);
        }
        if (this.r != nzf.UNSET_ENUM_VALUE) {
            nyu.a(18, this.r);
        }
        if (this.s != null) {
            nyu.a(19, this.s.booleanValue());
        }
        if (this.t != null) {
            nyu.a(20, this.t.booleanValue());
        }
        if (this.u != null) {
            nyu.a(21, this.u);
        }
        if (this.v != null) {
            nyu.a(22, this.v);
        }
        if (this.w != null) {
            nyu.a(23, this.w.booleanValue());
        }
        if (this.x != null && this.x.length > 0) {
            for (nzf nzf22 : this.x) {
                if (nzf22 != null) {
                    nyu.b(24, nzf22);
                }
            }
        }
        if (this.y != null) {
            nyu.a(25, this.y);
        }
        if (this.z != null) {
            nyu.a(26, this.z.intValue());
        }
        if (this.A != null && this.A.length > 0) {
            for (nzf nzf222 : this.A) {
                if (nzf222 != null) {
                    nyu.b(27, nzf222);
                }
            }
        }
        if (this.B != null && this.B.length > 0) {
            for (String str2 : this.B) {
                if (str2 != null) {
                    nyu.a(28, str2);
                }
            }
        }
        if (this.C != null && this.C.length > 0) {
            while (i < this.C.length) {
                nyu.a(29, this.C[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = (super.b() + nyu.b(1, this.a)) + nyu.b(2, this.b);
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            i = b;
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    i += nyu.d(4, nzf);
                }
            }
            b = i;
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
            i2 = 0;
            i3 = 0;
            for (String str : this.f) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.g != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(7, this.g);
        }
        if (this.h != null) {
            b += nyu.b(8, this.h);
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.j != null) {
            b += nyu.b(10, this.j);
        }
        if (this.k != null) {
            b += nyu.b(11, this.k);
        }
        if (this.l != null) {
            b += nyu.b(12, this.l);
        }
        if (this.m != null) {
            this.m.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.n != null) {
            b += nyu.d(14, this.n);
        }
        if (this.o != null) {
            this.o.booleanValue();
            b += nyu.h(15) + 1;
        }
        if (this.p != null) {
            b += nyu.b(16, this.p);
        }
        if (this.q != null) {
            b += nyu.b(17, this.q);
        }
        if (this.r != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(18, this.r);
        }
        if (this.s != null) {
            this.s.booleanValue();
            b += nyu.h(19) + 1;
        }
        if (this.t != null) {
            this.t.booleanValue();
            b += nyu.h(20) + 1;
        }
        if (this.u != null) {
            b += nyu.b(21, this.u);
        }
        if (this.v != null) {
            b += nyu.b(22, this.v);
        }
        if (this.w != null) {
            this.w.booleanValue();
            b += nyu.h(23) + 1;
        }
        if (this.x != null && this.x.length > 0) {
            i = b;
            for (nzf nzf22 : this.x) {
                if (nzf22 != null) {
                    i += nyu.d(24, nzf22);
                }
            }
            b = i;
        }
        if (this.y != null) {
            b += nyu.b(25, this.y);
        }
        if (this.z != null) {
            b += nyu.f(26, this.z.intValue());
        }
        if (this.A != null && this.A.length > 0) {
            i = b;
            for (nzf nzf222 : this.A) {
                if (nzf222 != null) {
                    i += nyu.d(27, nzf222);
                }
            }
            b = i;
        }
        if (this.B != null && this.B.length > 0) {
            i2 = 0;
            i3 = 0;
            for (String str2 : this.B) {
                if (str2 != null) {
                    i3++;
                    i2 += nyu.b(str2);
                }
            }
            b = (b + i2) + (i3 * 2);
        }
        if (this.C == null || this.C.length <= 0) {
            return b;
        }
        i = 0;
        while (i4 < this.C.length) {
            i += nyu.g(this.C[i4]);
            i4++;
        }
        return (b + i) + (this.C.length * 2);
    }

    private lam b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new lao[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lao();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lao();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new lao[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lao();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lao();
                    nyt.a(obj[a]);
                    this.e = obj;
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.f == null ? 0 : this.f.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f = obj;
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.g = a;
                            break;
                        default:
                            continue;
                    }
                case 66:
                    this.h = nyt.j();
                    continue;
                case 72:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 82:
                    this.j = nyt.j();
                    continue;
                case 90:
                    this.k = nyt.j();
                    continue;
                case 98:
                    this.l = nyt.j();
                    continue;
                case 104:
                    this.m = Boolean.valueOf(nyt.i());
                    continue;
                case 114:
                    if (this.n == null) {
                        this.n = new lan();
                    }
                    nyt.a(this.n);
                    continue;
                case 120:
                    this.o = Boolean.valueOf(nyt.i());
                    continue;
                case 130:
                    this.p = nyt.j();
                    continue;
                case 138:
                    this.q = nyt.j();
                    continue;
                case 144:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.r = a;
                            break;
                        default:
                            continue;
                    }
                case 152:
                    this.s = Boolean.valueOf(nyt.i());
                    continue;
                case 160:
                    this.t = Boolean.valueOf(nyt.i());
                    continue;
                case 170:
                    this.u = nyt.j();
                    continue;
                case 178:
                    this.v = nyt.j();
                    continue;
                case 184:
                    this.w = Boolean.valueOf(nyt.i());
                    continue;
                case 194:
                    b = nzl.b(nyt, 194);
                    if (this.x == null) {
                        a = 0;
                    } else {
                        a = this.x.length;
                    }
                    obj = new oaf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.x, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oaf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oaf();
                    nyt.a(obj[a]);
                    this.x = obj;
                    continue;
                case 202:
                    this.y = nyt.j();
                    continue;
                case 208:
                    this.z = Integer.valueOf(nyt.f());
                    continue;
                case 218:
                    b = nzl.b(nyt, 218);
                    if (this.A == null) {
                        a = 0;
                    } else {
                        a = this.A.length;
                    }
                    obj = new nzs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.A, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nzs();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nzs();
                    nyt.a(obj[a]);
                    this.A = obj;
                    continue;
                case 226:
                    b = nzl.b(nyt, 226);
                    a = this.B == null ? 0 : this.B.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.B, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.B = obj;
                    continue;
                case 232:
                    int b2 = nzl.b(nyt, 232);
                    Object obj2 = new int[b2];
                    i = 0;
                    b = 0;
                    while (i < b2) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case 0:
                            case 1:
                                a = b + 1;
                                obj2[b] = f;
                                break;
                            default:
                                a = b;
                                break;
                        }
                        i++;
                        b = a;
                    }
                    if (b != 0) {
                        a = this.C == null ? 0 : this.C.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.C, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.C = obj3;
                            break;
                        }
                        this.C = obj2;
                        break;
                    }
                    continue;
                case 234:
                    i = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 1:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.C == null) {
                            b = 0;
                        } else {
                            b = this.C.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.C, 0, obj4, 0, b);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.C = obj4;
                    }
                    nyt.e(i);
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
