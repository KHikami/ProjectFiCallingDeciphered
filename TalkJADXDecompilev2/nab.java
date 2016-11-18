package defpackage;

public final class nab extends nyx<nab> {
    private static volatile nab[] p;
    public Integer a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Float e;
    public Float f;
    public Float g;
    public Float h;
    public Float i;
    public Float j;
    public Float k;
    public Integer l;
    public Float m;
    public Float n;
    public Float o;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nab[] d() {
        if (p == null) {
            synchronized (nzc.c) {
                if (p == null) {
                    p = new nab[0];
                }
            }
        }
        return p;
    }

    public nab() {
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
        this.m = null;
        this.n = null;
        this.o = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.floatValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.floatValue());
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
            nyu.a(12, this.l.intValue());
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
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
        }
        if (this.e != null) {
            this.e.floatValue();
            b += nyu.h(5) + 4;
        }
        if (this.f != null) {
            this.f.floatValue();
            b += nyu.h(6) + 4;
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
            b += nyu.f(12, this.l.intValue());
        }
        if (this.m != null) {
            this.m.floatValue();
            b += nyu.h(13) + 4;
        }
        if (this.n != null) {
            this.n.floatValue();
            b += nyu.h(14) + 4;
        }
        if (this.o == null) {
            return b;
        }
        this.o.floatValue();
        return b + (nyu.h(15) + 4);
    }

    private nab b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 45:
                    this.e = Float.valueOf(nyt.c());
                    continue;
                case 53:
                    this.f = Float.valueOf(nyt.c());
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
                case 96:
                    this.l = Integer.valueOf(nyt.f());
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
