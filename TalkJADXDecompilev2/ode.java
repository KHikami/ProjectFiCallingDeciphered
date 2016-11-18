package defpackage;

public final class ode extends nyx<ode> {
    private static volatile ode[] F;
    public Float A;
    public Float B;
    public Float C;
    public Float D;
    public byte[] E;
    public odf a;
    public odf b;
    public Integer c;
    public Integer d;
    public odh[] e;
    public odg[] f;
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

    public static ode[] d() {
        if (F == null) {
            synchronized (nzc.c) {
                if (F == null) {
                    F = new ode[0];
                }
            }
        }
        return F;
    }

    public ode() {
        this.c = null;
        this.d = null;
        this.e = odh.d();
        this.f = odg.d();
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
        this.E = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (nzf nzf : this.e) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf2 = this.f[i];
                if (nzf2 != null) {
                    nyu.b(6, nzf2);
                }
                i++;
            }
        }
        if (this.g != null) {
            nyu.a(7, this.g.floatValue());
        }
        if (this.h != null) {
            nyu.a(8, this.h.floatValue());
        }
        if (this.i != null) {
            nyu.a(9, this.i.floatValue());
        }
        if (this.j != null) {
            nyu.a(10, this.j.floatValue());
        }
        if (this.k != null) {
            nyu.a(11, this.k.floatValue());
        }
        if (this.l != null) {
            nyu.a(12, this.l.floatValue());
        }
        if (this.m != null) {
            nyu.a(13, this.m.floatValue());
        }
        if (this.n != null) {
            nyu.a(14, this.n.floatValue());
        }
        if (this.o != null) {
            nyu.a(15, this.o.floatValue());
        }
        if (this.p != null) {
            nyu.a(16, this.p.floatValue());
        }
        if (this.q != null) {
            nyu.a(17, this.q.floatValue());
        }
        if (this.r != null) {
            nyu.a(18, this.r.floatValue());
        }
        if (this.s != null) {
            nyu.a(19, this.s.floatValue());
        }
        if (this.t != null) {
            nyu.a(20, this.t.floatValue());
        }
        if (this.u != null) {
            nyu.a(21, this.u.floatValue());
        }
        if (this.v != null) {
            nyu.a(22, this.v.floatValue());
        }
        if (this.D != null) {
            nyu.a(23, this.D.floatValue());
        }
        if (this.w != null) {
            nyu.a(24, this.w.floatValue());
        }
        if (this.x != null) {
            nyu.a(25, this.x.floatValue());
        }
        if (this.y != null) {
            nyu.a(26, this.y.floatValue());
        }
        if (this.z != null) {
            nyu.a(27, this.z.floatValue());
        }
        if (this.A != null) {
            nyu.a(28, this.A.floatValue());
        }
        if (this.B != null) {
            nyu.a(29, this.B.floatValue());
        }
        if (this.C != null) {
            nyu.a(30, this.C.floatValue());
        }
        if (this.E != null) {
            nyu.a(31, this.E);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            int i2 = b;
            for (nzf nzf : this.e) {
                if (nzf != null) {
                    i2 += nyu.d(5, nzf);
                }
            }
            b = i2;
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf2 = this.f[i];
                if (nzf2 != null) {
                    b += nyu.d(6, nzf2);
                }
                i++;
            }
        }
        if (this.g != null) {
            this.g.floatValue();
            b += nyu.h(7) + 4;
        }
        if (this.h != null) {
            this.h.floatValue();
            b += nyu.h(8) + 4;
        }
        if (this.i != null) {
            this.i.floatValue();
            b += nyu.h(9) + 4;
        }
        if (this.j != null) {
            this.j.floatValue();
            b += nyu.h(10) + 4;
        }
        if (this.k != null) {
            this.k.floatValue();
            b += nyu.h(11) + 4;
        }
        if (this.l != null) {
            this.l.floatValue();
            b += nyu.h(12) + 4;
        }
        if (this.m != null) {
            this.m.floatValue();
            b += nyu.h(13) + 4;
        }
        if (this.n != null) {
            this.n.floatValue();
            b += nyu.h(14) + 4;
        }
        if (this.o != null) {
            this.o.floatValue();
            b += nyu.h(15) + 4;
        }
        if (this.p != null) {
            this.p.floatValue();
            b += nyu.h(16) + 4;
        }
        if (this.q != null) {
            this.q.floatValue();
            b += nyu.h(17) + 4;
        }
        if (this.r != null) {
            this.r.floatValue();
            b += nyu.h(18) + 4;
        }
        if (this.s != null) {
            this.s.floatValue();
            b += nyu.h(19) + 4;
        }
        if (this.t != null) {
            this.t.floatValue();
            b += nyu.h(20) + 4;
        }
        if (this.u != null) {
            this.u.floatValue();
            b += nyu.h(21) + 4;
        }
        if (this.v != null) {
            this.v.floatValue();
            b += nyu.h(22) + 4;
        }
        if (this.D != null) {
            this.D.floatValue();
            b += nyu.h(23) + 4;
        }
        if (this.w != null) {
            this.w.floatValue();
            b += nyu.h(24) + 4;
        }
        if (this.x != null) {
            this.x.floatValue();
            b += nyu.h(25) + 4;
        }
        if (this.y != null) {
            this.y.floatValue();
            b += nyu.h(26) + 4;
        }
        if (this.z != null) {
            this.z.floatValue();
            b += nyu.h(27) + 4;
        }
        if (this.A != null) {
            this.A.floatValue();
            b += nyu.h(28) + 4;
        }
        if (this.B != null) {
            this.B.floatValue();
            b += nyu.h(29) + 4;
        }
        if (this.C != null) {
            this.C.floatValue();
            b += nyu.h(30) + 4;
        }
        if (this.E != null) {
            return b + nyu.b(31, this.E);
        }
        return b;
    }

    private ode b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new odf();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new odf();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new odh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new odh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new odh();
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
                    obj = new odg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new odg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new odg();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 61:
                    this.g = Float.valueOf(nyt.c());
                    continue;
                case 69:
                    this.h = Float.valueOf(nyt.c());
                    continue;
                case 77:
                    this.i = Float.valueOf(nyt.c());
                    continue;
                case 85:
                    this.j = Float.valueOf(nyt.c());
                    continue;
                case 93:
                    this.k = Float.valueOf(nyt.c());
                    continue;
                case 101:
                    this.l = Float.valueOf(nyt.c());
                    continue;
                case 109:
                    this.m = Float.valueOf(nyt.c());
                    continue;
                case 117:
                    this.n = Float.valueOf(nyt.c());
                    continue;
                case 125:
                    this.o = Float.valueOf(nyt.c());
                    continue;
                case 133:
                    this.p = Float.valueOf(nyt.c());
                    continue;
                case 141:
                    this.q = Float.valueOf(nyt.c());
                    continue;
                case 149:
                    this.r = Float.valueOf(nyt.c());
                    continue;
                case 157:
                    this.s = Float.valueOf(nyt.c());
                    continue;
                case 165:
                    this.t = Float.valueOf(nyt.c());
                    continue;
                case 173:
                    this.u = Float.valueOf(nyt.c());
                    continue;
                case 181:
                    this.v = Float.valueOf(nyt.c());
                    continue;
                case 189:
                    this.D = Float.valueOf(nyt.c());
                    continue;
                case 197:
                    this.w = Float.valueOf(nyt.c());
                    continue;
                case 205:
                    this.x = Float.valueOf(nyt.c());
                    continue;
                case 213:
                    this.y = Float.valueOf(nyt.c());
                    continue;
                case 221:
                    this.z = Float.valueOf(nyt.c());
                    continue;
                case 229:
                    this.A = Float.valueOf(nyt.c());
                    continue;
                case 237:
                    this.B = Float.valueOf(nyt.c());
                    continue;
                case 245:
                    this.C = Float.valueOf(nyt.c());
                    continue;
                case 250:
                    this.E = nyt.k();
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
