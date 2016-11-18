package defpackage;

public final class lkq extends nyx<lkq> {
    private static volatile lkq[] s;
    public Integer a;
    public Integer b;
    public Integer c;
    public lkt[] d;
    public lkr[] e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Float n;
    public Integer o;
    public Integer p;
    public Boolean q;
    public Integer r;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lkq[] d() {
        if (s == null) {
            synchronized (nzc.c) {
                if (s == null) {
                    s = new lkq[0];
                }
            }
        }
        return s;
    }

    public lkq() {
        g();
    }

    private lkq g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = lkt.d();
        this.e = lkr.d();
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        nyu.a(6, this.a.intValue());
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.a(7, nzf);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf2 = this.e[i];
                if (nzf2 != null) {
                    nyu.a(18, nzf2);
                }
                i++;
            }
        }
        if (this.f != null) {
            nyu.a(39, this.f.intValue());
        }
        if (this.j != null) {
            nyu.a(40, this.j.intValue());
        }
        if (this.k != null) {
            nyu.a(41, this.k.intValue());
        }
        if (this.l != null) {
            nyu.a(59, this.l.intValue());
        }
        if (this.m != null) {
            nyu.a(71, this.m.intValue());
        }
        if (this.n != null) {
            nyu.a(76, this.n.floatValue());
        }
        if (this.o != null) {
            nyu.a(77, this.o.intValue());
        }
        if (this.p != null) {
            nyu.a(78, this.p.intValue());
        }
        if (this.q != null) {
            nyu.a(79, this.q.booleanValue());
        }
        if (this.r != null) {
            nyu.a(80, this.r.intValue());
        }
        if (this.g != null) {
            nyu.a(97, this.g.intValue());
        }
        if (this.i != null) {
            nyu.a(98, this.i.intValue());
        }
        if (this.h != null) {
            nyu.a(99, this.h.intValue());
        }
        if (this.b != null) {
            nyu.a(118, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(123, this.c.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b() + nyu.f(6, this.a.intValue());
        if (this.d != null && this.d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    i2 += nyu.c(7, nzf);
                }
            }
            b = i2;
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf2 = this.e[i];
                if (nzf2 != null) {
                    b += nyu.c(18, nzf2);
                }
                i++;
            }
        }
        if (this.f != null) {
            b += nyu.f(39, this.f.intValue());
        }
        if (this.j != null) {
            b += nyu.f(40, this.j.intValue());
        }
        if (this.k != null) {
            b += nyu.f(41, this.k.intValue());
        }
        if (this.l != null) {
            b += nyu.f(59, this.l.intValue());
        }
        if (this.m != null) {
            b += nyu.f(71, this.m.intValue());
        }
        if (this.n != null) {
            this.n.floatValue();
            b += nyu.h(76) + 4;
        }
        if (this.o != null) {
            b += nyu.f(77, this.o.intValue());
        }
        if (this.p != null) {
            b += nyu.f(78, this.p.intValue());
        }
        if (this.q != null) {
            this.q.booleanValue();
            b += nyu.h(79) + 1;
        }
        if (this.r != null) {
            b += nyu.f(80, this.r.intValue());
        }
        if (this.g != null) {
            b += nyu.f(97, this.g.intValue());
        }
        if (this.i != null) {
            b += nyu.f(98, this.i.intValue());
        }
        if (this.h != null) {
            b += nyu.f(99, this.h.intValue());
        }
        if (this.b != null) {
            b += nyu.f(118, this.b.intValue());
        }
        if (this.c != null) {
            return b + nyu.f(123, this.c.intValue());
        }
        return b;
    }

    private lkq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 48:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case 59:
                    b = nzl.b(nyt, 59);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new lkt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lkt();
                        nyt.a(obj[a], 7);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lkt();
                    nyt.a(obj[a], 7);
                    this.d = obj;
                    continue;
                case 147:
                    b = nzl.b(nyt, 147);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new lkr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lkr();
                        nyt.a(obj[a], 18);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lkr();
                    nyt.a(obj[a], 18);
                    this.e = obj;
                    continue;
                case 312:
                    this.f = Integer.valueOf(nyt.f());
                    continue;
                case 320:
                    this.j = Integer.valueOf(nyt.f());
                    continue;
                case 328:
                    this.k = Integer.valueOf(nyt.f());
                    continue;
                case 472:
                    this.l = Integer.valueOf(nyt.f());
                    continue;
                case 568:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.m = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 613:
                    this.n = Float.valueOf(nyt.c());
                    continue;
                case 616:
                    this.o = Integer.valueOf(nyt.f());
                    continue;
                case 624:
                    this.p = Integer.valueOf(nyt.f());
                    continue;
                case 632:
                    this.q = Boolean.valueOf(nyt.i());
                    continue;
                case 640:
                    this.r = Integer.valueOf(nyt.f());
                    continue;
                case 776:
                    this.g = Integer.valueOf(nyt.f());
                    continue;
                case 784:
                    this.i = Integer.valueOf(nyt.f());
                    continue;
                case 792:
                    this.h = Integer.valueOf(nyt.f());
                    continue;
                case 944:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case 984:
                    this.c = Integer.valueOf(nyt.f());
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
