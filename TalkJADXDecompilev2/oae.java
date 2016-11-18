package defpackage;

public final class oae extends nyx<oae> {
    public static final nyy<nzs, oae> a = nyy.a(11, oae.class, 222624570);
    private static final oae[] z = new oae[0];
    public ocd b;
    public String c;
    public String d;
    public oao[] e;
    public int f;
    public Boolean g;
    public Integer h;
    public String i;
    public String j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public String n;
    public String o;
    public oaf[] p;
    public String q;
    public Integer r;
    public nzs[] s;
    public Integer t;
    public nzs u;
    public String[] v;
    public int[] w;
    public nzs[] x;
    public Long y;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oae() {
        this.c = null;
        this.d = null;
        this.e = oao.b;
        this.f = nzf.UNSET_ENUM_VALUE;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = oaf.d();
        this.q = null;
        this.r = null;
        this.s = nzs.d();
        this.t = null;
        this.v = nzl.f;
        this.w = nzl.a;
        this.x = nzs.d();
        this.y = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.b != null) {
            nyu.b(1, this.b);
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            for (nzf nzf : this.e) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.f != nzf.UNSET_ENUM_VALUE) {
            nyu.a(5, this.f);
        }
        if (this.g != null) {
            nyu.a(6, this.g.booleanValue());
        }
        if (this.h != null) {
            nyu.a(7, this.h.intValue());
        }
        if (this.i != null) {
            nyu.a(8, this.i);
        }
        if (this.j != null) {
            nyu.a(9, this.j);
        }
        if (this.k != null) {
            nyu.a(10, this.k.booleanValue());
        }
        if (this.l != null) {
            nyu.a(11, this.l.booleanValue());
        }
        if (this.m != null) {
            nyu.a(12, this.m.booleanValue());
        }
        if (this.n != null) {
            nyu.a(13, this.n);
        }
        if (this.o != null) {
            nyu.a(14, this.o);
        }
        if (this.p != null && this.p.length > 0) {
            for (nzf nzf2 : this.p) {
                if (nzf2 != null) {
                    nyu.b(15, nzf2);
                }
            }
        }
        if (this.q != null) {
            nyu.a(16, this.q);
        }
        if (this.r != null) {
            nyu.a(17, this.r.intValue());
        }
        if (this.s != null && this.s.length > 0) {
            for (nzf nzf22 : this.s) {
                if (nzf22 != null) {
                    nyu.b(18, nzf22);
                }
            }
        }
        if (this.t != null) {
            nyu.a(19, this.t.intValue());
        }
        if (this.u != null) {
            nyu.b(20, this.u);
        }
        if (this.v != null && this.v.length > 0) {
            for (String str : this.v) {
                if (str != null) {
                    nyu.a(21, str);
                }
            }
        }
        if (this.w != null && this.w.length > 0) {
            for (int a : this.w) {
                nyu.a(22, a);
            }
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
        if (this.y != null) {
            nyu.b(24, this.y.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.b != null) {
            b += nyu.d(1, this.b);
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            i = b;
            for (nzf nzf : this.e) {
                if (nzf != null) {
                    i += nyu.d(4, nzf);
                }
            }
            b = i;
        }
        if (this.f != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(5, this.f);
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.h != null) {
            b += nyu.f(7, this.h.intValue());
        }
        if (this.i != null) {
            b += nyu.b(8, this.i);
        }
        if (this.j != null) {
            b += nyu.b(9, this.j);
        }
        if (this.k != null) {
            this.k.booleanValue();
            b += nyu.h(10) + 1;
        }
        if (this.l != null) {
            this.l.booleanValue();
            b += nyu.h(11) + 1;
        }
        if (this.m != null) {
            this.m.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.n != null) {
            b += nyu.b(13, this.n);
        }
        if (this.o != null) {
            b += nyu.b(14, this.o);
        }
        if (this.p != null && this.p.length > 0) {
            i = b;
            for (nzf nzf2 : this.p) {
                if (nzf2 != null) {
                    i += nyu.d(15, nzf2);
                }
            }
            b = i;
        }
        if (this.q != null) {
            b += nyu.b(16, this.q);
        }
        if (this.r != null) {
            b += nyu.f(17, this.r.intValue());
        }
        if (this.s != null && this.s.length > 0) {
            i = b;
            for (nzf nzf22 : this.s) {
                if (nzf22 != null) {
                    i += nyu.d(18, nzf22);
                }
            }
            b = i;
        }
        if (this.t != null) {
            b += nyu.f(19, this.t.intValue());
        }
        if (this.u != null) {
            b += nyu.d(20, this.u);
        }
        if (this.v != null && this.v.length > 0) {
            i2 = 0;
            i3 = 0;
            for (String str : this.v) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 2);
        }
        if (this.w != null && this.w.length > 0) {
            i2 = 0;
            for (int i32 : this.w) {
                i2 += nyu.g(i32);
            }
            b = (b + i2) + (this.w.length * 2);
        }
        if (this.x != null && this.x.length > 0) {
            while (i4 < this.x.length) {
                nzf nzf3 = this.x[i4];
                if (nzf3 != null) {
                    b += nyu.d(23, nzf3);
                }
                i4++;
            }
        }
        if (this.y != null) {
            return b + nyu.f(24, this.y.longValue());
        }
        return b;
    }

    private oae b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.b == null) {
                        this.b = new ocd();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new oao[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oao();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oao();
                    nyt.a(obj[a]);
                    this.e = obj;
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f = a;
                            break;
                        default:
                            continue;
                    }
                case 48:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.h = Integer.valueOf(nyt.f());
                    continue;
                case 66:
                    this.i = nyt.j();
                    continue;
                case 74:
                    this.j = nyt.j();
                    continue;
                case 80:
                    this.k = Boolean.valueOf(nyt.i());
                    continue;
                case 88:
                    this.l = Boolean.valueOf(nyt.i());
                    continue;
                case 96:
                    this.m = Boolean.valueOf(nyt.i());
                    continue;
                case 106:
                    this.n = nyt.j();
                    continue;
                case 114:
                    this.o = nyt.j();
                    continue;
                case 122:
                    b = nzl.b(nyt, 122);
                    if (this.p == null) {
                        a = 0;
                    } else {
                        a = this.p.length;
                    }
                    obj = new oaf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.p, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oaf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oaf();
                    nyt.a(obj[a]);
                    this.p = obj;
                    continue;
                case 130:
                    this.q = nyt.j();
                    continue;
                case 136:
                    this.r = Integer.valueOf(nyt.f());
                    continue;
                case 146:
                    b = nzl.b(nyt, 146);
                    if (this.s == null) {
                        a = 0;
                    } else {
                        a = this.s.length;
                    }
                    obj = new nzs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.s, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nzs();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nzs();
                    nyt.a(obj[a]);
                    this.s = obj;
                    continue;
                case 152:
                    this.t = Integer.valueOf(nyt.f());
                    continue;
                case 162:
                    if (this.u == null) {
                        this.u = new nzs();
                    }
                    nyt.a(this.u);
                    continue;
                case 170:
                    b = nzl.b(nyt, 170);
                    a = this.v == null ? 0 : this.v.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.v, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.v = obj;
                    continue;
                case 176:
                    int b2 = nzl.b(nyt, 176);
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
                        a = this.w == null ? 0 : this.w.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.w, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.w = obj3;
                            break;
                        }
                        this.w = obj2;
                        break;
                    }
                    continue;
                case 178:
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
                        if (this.w == null) {
                            b = 0;
                        } else {
                            b = this.w.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.w, 0, obj4, 0, b);
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
                        this.w = obj4;
                    }
                    nyt.e(i);
                    continue;
                case 186:
                    b = nzl.b(nyt, 186);
                    if (this.x == null) {
                        a = 0;
                    } else {
                        a = this.x.length;
                    }
                    obj = new nzs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.x, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nzs();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nzs();
                    nyt.a(obj[a]);
                    this.x = obj;
                    continue;
                case 192:
                    this.y = Long.valueOf(nyt.e());
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
