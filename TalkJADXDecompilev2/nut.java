package defpackage;

public final class nut extends nyx<nut> {
    private static volatile nut[] H;
    public Float A;
    public Float B;
    public Float C;
    public byte[] D;
    public nvg[] E;
    public byte[] F;
    public nux G;
    public nuu a;
    public nuu b;
    public nvf c;
    public nuw[] d;
    public nuv[] e;
    public Float f;
    public Float g;
    public Float h;
    public Float i;
    public Float j;
    public Float k;
    public Float l;
    public Float m;
    public Float n;
    public Float o;
    public Float p;
    public Float q;
    public Float r;
    public Float s;
    public Float t;
    public Float u;
    public Float v;
    public Float w;
    public Float x;
    public Float y;
    public Float z;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nut[] d() {
        if (H == null) {
            synchronized (nzc.c) {
                if (H == null) {
                    H = new nut[0];
                }
            }
        }
        return H;
    }

    public nut() {
        this.d = nuw.d();
        this.e = nuv.d();
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
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = nvg.d();
        this.F = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f != null) {
            nyu.a(3, this.f.floatValue());
        }
        if (this.g != null) {
            nyu.a(4, this.g.floatValue());
        }
        if (this.h != null) {
            nyu.a(5, this.h.floatValue());
        }
        if (this.j != null) {
            nyu.a(6, this.j.floatValue());
        }
        if (this.k != null) {
            nyu.a(7, this.k.floatValue());
        }
        if (this.D != null) {
            nyu.a(8, this.D);
        }
        if (this.i != null) {
            nyu.a(9, this.i.floatValue());
        }
        if (this.l != null) {
            nyu.a(10, this.l.floatValue());
        }
        if (this.m != null) {
            nyu.a(11, this.m.floatValue());
        }
        if (this.n != null) {
            nyu.a(12, this.n.floatValue());
        }
        if (this.o != null) {
            nyu.a(13, this.o.floatValue());
        }
        if (this.p != null) {
            nyu.a(14, this.p.floatValue());
        }
        if (this.q != null) {
            nyu.a(15, this.q.floatValue());
        }
        if (this.r != null) {
            nyu.a(16, this.r.floatValue());
        }
        if (this.s != null) {
            nyu.a(17, this.s.floatValue());
        }
        if (this.t != null) {
            nyu.a(18, this.t.floatValue());
        }
        if (this.u != null) {
            nyu.a(19, this.u.floatValue());
        }
        if (this.F != null) {
            nyu.a(20, this.F);
        }
        if (this.e != null && this.e.length > 0) {
            for (nzf nzf2 : this.e) {
                if (nzf2 != null) {
                    nyu.b(21, nzf2);
                }
            }
        }
        if (this.b != null) {
            nyu.b(22, this.b);
        }
        if (this.E != null && this.E.length > 0) {
            while (i < this.E.length) {
                nzf nzf3 = this.E[i];
                if (nzf3 != null) {
                    nyu.b(23, nzf3);
                }
                i++;
            }
        }
        if (this.C != null) {
            nyu.a(24, this.C.floatValue());
        }
        if (this.c != null) {
            nyu.b(25, this.c);
        }
        if (this.G != null) {
            nyu.b(26, this.G);
        }
        if (this.v != null) {
            nyu.a(27, this.v.floatValue());
        }
        if (this.w != null) {
            nyu.a(28, this.w.floatValue());
        }
        if (this.x != null) {
            nyu.a(29, this.x.floatValue());
        }
        if (this.y != null) {
            nyu.a(30, this.y.floatValue());
        }
        if (this.z != null) {
            nyu.a(31, this.z.floatValue());
        }
        if (this.A != null) {
            nyu.a(33, this.A.floatValue());
        }
        if (this.B != null) {
            nyu.a(34, this.B.floatValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.d != null && this.d.length > 0) {
            i = b;
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f != null) {
            this.f.floatValue();
            b += nyu.h(3) + 4;
        }
        if (this.g != null) {
            this.g.floatValue();
            b += nyu.h(4) + 4;
        }
        if (this.h != null) {
            this.h.floatValue();
            b += nyu.h(5) + 4;
        }
        if (this.j != null) {
            this.j.floatValue();
            b += nyu.h(6) + 4;
        }
        if (this.k != null) {
            this.k.floatValue();
            b += nyu.h(7) + 4;
        }
        if (this.D != null) {
            b += nyu.b(8, this.D);
        }
        if (this.i != null) {
            this.i.floatValue();
            b += nyu.h(9) + 4;
        }
        if (this.l != null) {
            this.l.floatValue();
            b += nyu.h(10) + 4;
        }
        if (this.m != null) {
            this.m.floatValue();
            b += nyu.h(11) + 4;
        }
        if (this.n != null) {
            this.n.floatValue();
            b += nyu.h(12) + 4;
        }
        if (this.o != null) {
            this.o.floatValue();
            b += nyu.h(13) + 4;
        }
        if (this.p != null) {
            this.p.floatValue();
            b += nyu.h(14) + 4;
        }
        if (this.q != null) {
            this.q.floatValue();
            b += nyu.h(15) + 4;
        }
        if (this.r != null) {
            this.r.floatValue();
            b += nyu.h(16) + 4;
        }
        if (this.s != null) {
            this.s.floatValue();
            b += nyu.h(17) + 4;
        }
        if (this.t != null) {
            this.t.floatValue();
            b += nyu.h(18) + 4;
        }
        if (this.u != null) {
            this.u.floatValue();
            b += nyu.h(19) + 4;
        }
        if (this.F != null) {
            b += nyu.b(20, this.F);
        }
        if (this.e != null && this.e.length > 0) {
            i = b;
            for (nzf nzf2 : this.e) {
                if (nzf2 != null) {
                    i += nyu.d(21, nzf2);
                }
            }
            b = i;
        }
        if (this.b != null) {
            b += nyu.d(22, this.b);
        }
        if (this.E != null && this.E.length > 0) {
            while (i2 < this.E.length) {
                nzf nzf3 = this.E[i2];
                if (nzf3 != null) {
                    b += nyu.d(23, nzf3);
                }
                i2++;
            }
        }
        if (this.C != null) {
            this.C.floatValue();
            b += nyu.h(24) + 4;
        }
        if (this.c != null) {
            b += nyu.d(25, this.c);
        }
        if (this.G != null) {
            b += nyu.d(26, this.G);
        }
        if (this.v != null) {
            this.v.floatValue();
            b += nyu.h(27) + 4;
        }
        if (this.w != null) {
            this.w.floatValue();
            b += nyu.h(28) + 4;
        }
        if (this.x != null) {
            this.x.floatValue();
            b += nyu.h(29) + 4;
        }
        if (this.y != null) {
            this.y.floatValue();
            b += nyu.h(30) + 4;
        }
        if (this.z != null) {
            this.z.floatValue();
            b += nyu.h(31) + 4;
        }
        if (this.A != null) {
            this.A.floatValue();
            b += nyu.h(33) + 4;
        }
        if (this.B == null) {
            return b;
        }
        this.B.floatValue();
        return b + (nyu.h(34) + 4);
    }

    private nut b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new nuu();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new nuw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nuw();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nuw();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 29:
                    this.f = Float.valueOf(nyt.c());
                    continue;
                case 37:
                    this.g = Float.valueOf(nyt.c());
                    continue;
                case 45:
                    this.h = Float.valueOf(nyt.c());
                    continue;
                case 53:
                    this.j = Float.valueOf(nyt.c());
                    continue;
                case 61:
                    this.k = Float.valueOf(nyt.c());
                    continue;
                case 66:
                    this.D = nyt.k();
                    continue;
                case 77:
                    this.i = Float.valueOf(nyt.c());
                    continue;
                case 85:
                    this.l = Float.valueOf(nyt.c());
                    continue;
                case 93:
                    this.m = Float.valueOf(nyt.c());
                    continue;
                case 101:
                    this.n = Float.valueOf(nyt.c());
                    continue;
                case 109:
                    this.o = Float.valueOf(nyt.c());
                    continue;
                case 117:
                    this.p = Float.valueOf(nyt.c());
                    continue;
                case 125:
                    this.q = Float.valueOf(nyt.c());
                    continue;
                case 133:
                    this.r = Float.valueOf(nyt.c());
                    continue;
                case 141:
                    this.s = Float.valueOf(nyt.c());
                    continue;
                case 149:
                    this.t = Float.valueOf(nyt.c());
                    continue;
                case 157:
                    this.u = Float.valueOf(nyt.c());
                    continue;
                case 162:
                    this.F = nyt.k();
                    continue;
                case 170:
                    b = nzl.b(nyt, 170);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new nuv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nuv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nuv();
                    nyt.a(obj[a]);
                    this.e = obj;
                    continue;
                case 178:
                    if (this.b == null) {
                        this.b = new nuu();
                    }
                    nyt.a(this.b);
                    continue;
                case 186:
                    b = nzl.b(nyt, 186);
                    if (this.E == null) {
                        a = 0;
                    } else {
                        a = this.E.length;
                    }
                    obj = new nvg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.E, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nvg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nvg();
                    nyt.a(obj[a]);
                    this.E = obj;
                    continue;
                case 197:
                    this.C = Float.valueOf(nyt.c());
                    continue;
                case 202:
                    if (this.c == null) {
                        this.c = new nvf();
                    }
                    nyt.a(this.c);
                    continue;
                case 210:
                    if (this.G == null) {
                        this.G = new nux();
                    }
                    nyt.a(this.G);
                    continue;
                case 221:
                    this.v = Float.valueOf(nyt.c());
                    continue;
                case 229:
                    this.w = Float.valueOf(nyt.c());
                    continue;
                case 237:
                    this.x = Float.valueOf(nyt.c());
                    continue;
                case 245:
                    this.y = Float.valueOf(nyt.c());
                    continue;
                case 253:
                    this.z = Float.valueOf(nyt.c());
                    continue;
                case 269:
                    this.A = Float.valueOf(nyt.c());
                    continue;
                case 277:
                    this.B = Float.valueOf(nyt.c());
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
