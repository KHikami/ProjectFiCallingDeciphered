package p000;

public final class lkq extends nyx<lkq> {
    private static volatile lkq[] f25179s;
    public Integer f25180a;
    public Integer f25181b;
    public Integer f25182c;
    public lkt[] f25183d;
    public lkr[] f25184e;
    public Integer f25185f;
    public Integer f25186g;
    public Integer f25187h;
    public Integer f25188i;
    public Integer f25189j;
    public Integer f25190k;
    public Integer f25191l;
    public Integer f25192m;
    public Float f25193n;
    public Integer f25194o;
    public Integer f25195p;
    public Boolean f25196q;
    public Integer f25197r;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29248b(nyt);
    }

    public static lkq[] m29249d() {
        if (f25179s == null) {
            synchronized (nzc.c) {
                if (f25179s == null) {
                    f25179s = new lkq[0];
                }
            }
        }
        return f25179s;
    }

    public lkq() {
        m29250g();
    }

    private lkq m29250g() {
        this.f25180a = null;
        this.f25181b = null;
        this.f25182c = null;
        this.f25183d = lkt.m29266d();
        this.f25184e = lkr.m29255d();
        this.f25185f = null;
        this.f25186g = null;
        this.f25187h = null;
        this.f25188i = null;
        this.f25189j = null;
        this.f25190k = null;
        this.f25191l = null;
        this.f25193n = null;
        this.f25194o = null;
        this.f25195p = null;
        this.f25196q = null;
        this.f25197r = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        nyu.a(6, this.f25180a.intValue());
        if (this.f25183d != null && this.f25183d.length > 0) {
            for (nzf nzf : this.f25183d) {
                if (nzf != null) {
                    nyu.a(7, nzf);
                }
            }
        }
        if (this.f25184e != null && this.f25184e.length > 0) {
            while (i < this.f25184e.length) {
                nzf nzf2 = this.f25184e[i];
                if (nzf2 != null) {
                    nyu.a(18, nzf2);
                }
                i++;
            }
        }
        if (this.f25185f != null) {
            nyu.a(39, this.f25185f.intValue());
        }
        if (this.f25189j != null) {
            nyu.a(40, this.f25189j.intValue());
        }
        if (this.f25190k != null) {
            nyu.a(41, this.f25190k.intValue());
        }
        if (this.f25191l != null) {
            nyu.a(59, this.f25191l.intValue());
        }
        if (this.f25192m != null) {
            nyu.a(71, this.f25192m.intValue());
        }
        if (this.f25193n != null) {
            nyu.a(76, this.f25193n.floatValue());
        }
        if (this.f25194o != null) {
            nyu.a(77, this.f25194o.intValue());
        }
        if (this.f25195p != null) {
            nyu.a(78, this.f25195p.intValue());
        }
        if (this.f25196q != null) {
            nyu.a(79, this.f25196q.booleanValue());
        }
        if (this.f25197r != null) {
            nyu.a(80, this.f25197r.intValue());
        }
        if (this.f25186g != null) {
            nyu.a(97, this.f25186g.intValue());
        }
        if (this.f25188i != null) {
            nyu.a(98, this.f25188i.intValue());
        }
        if (this.f25187h != null) {
            nyu.a(99, this.f25187h.intValue());
        }
        if (this.f25181b != null) {
            nyu.a(118, this.f25181b.intValue());
        }
        if (this.f25182c != null) {
            nyu.a(123, this.f25182c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b() + nyu.f(6, this.f25180a.intValue());
        if (this.f25183d != null && this.f25183d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f25183d) {
                if (nzf != null) {
                    i2 += nyu.c(7, nzf);
                }
            }
            b = i2;
        }
        if (this.f25184e != null && this.f25184e.length > 0) {
            while (i < this.f25184e.length) {
                nzf nzf2 = this.f25184e[i];
                if (nzf2 != null) {
                    b += nyu.c(18, nzf2);
                }
                i++;
            }
        }
        if (this.f25185f != null) {
            b += nyu.f(39, this.f25185f.intValue());
        }
        if (this.f25189j != null) {
            b += nyu.f(40, this.f25189j.intValue());
        }
        if (this.f25190k != null) {
            b += nyu.f(41, this.f25190k.intValue());
        }
        if (this.f25191l != null) {
            b += nyu.f(59, this.f25191l.intValue());
        }
        if (this.f25192m != null) {
            b += nyu.f(71, this.f25192m.intValue());
        }
        if (this.f25193n != null) {
            this.f25193n.floatValue();
            b += nyu.h(76) + 4;
        }
        if (this.f25194o != null) {
            b += nyu.f(77, this.f25194o.intValue());
        }
        if (this.f25195p != null) {
            b += nyu.f(78, this.f25195p.intValue());
        }
        if (this.f25196q != null) {
            this.f25196q.booleanValue();
            b += nyu.h(79) + 1;
        }
        if (this.f25197r != null) {
            b += nyu.f(80, this.f25197r.intValue());
        }
        if (this.f25186g != null) {
            b += nyu.f(97, this.f25186g.intValue());
        }
        if (this.f25188i != null) {
            b += nyu.f(98, this.f25188i.intValue());
        }
        if (this.f25187h != null) {
            b += nyu.f(99, this.f25187h.intValue());
        }
        if (this.f25181b != null) {
            b += nyu.f(118, this.f25181b.intValue());
        }
        if (this.f25182c != null) {
            return b + nyu.f(123, this.f25182c.intValue());
        }
        return b;
    }

    private lkq m29248b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 48:
                    this.f25180a = Integer.valueOf(nyt.f());
                    continue;
                case 59:
                    b = nzl.b(nyt, 59);
                    if (this.f25183d == null) {
                        a = 0;
                    } else {
                        a = this.f25183d.length;
                    }
                    obj = new lkt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25183d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lkt();
                        nyt.a(obj[a], 7);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lkt();
                    nyt.a(obj[a], 7);
                    this.f25183d = obj;
                    continue;
                case 147:
                    b = nzl.b(nyt, 147);
                    if (this.f25184e == null) {
                        a = 0;
                    } else {
                        a = this.f25184e.length;
                    }
                    obj = new lkr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25184e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lkr();
                        nyt.a(obj[a], 18);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lkr();
                    nyt.a(obj[a], 18);
                    this.f25184e = obj;
                    continue;
                case 312:
                    this.f25185f = Integer.valueOf(nyt.f());
                    continue;
                case 320:
                    this.f25189j = Integer.valueOf(nyt.f());
                    continue;
                case 328:
                    this.f25190k = Integer.valueOf(nyt.f());
                    continue;
                case 472:
                    this.f25191l = Integer.valueOf(nyt.f());
                    continue;
                case 568:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f25192m = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 613:
                    this.f25193n = Float.valueOf(nyt.c());
                    continue;
                case 616:
                    this.f25194o = Integer.valueOf(nyt.f());
                    continue;
                case 624:
                    this.f25195p = Integer.valueOf(nyt.f());
                    continue;
                case 632:
                    this.f25196q = Boolean.valueOf(nyt.i());
                    continue;
                case 640:
                    this.f25197r = Integer.valueOf(nyt.f());
                    continue;
                case 776:
                    this.f25186g = Integer.valueOf(nyt.f());
                    continue;
                case 784:
                    this.f25188i = Integer.valueOf(nyt.f());
                    continue;
                case 792:
                    this.f25187h = Integer.valueOf(nyt.f());
                    continue;
                case 944:
                    this.f25181b = Integer.valueOf(nyt.f());
                    continue;
                case 984:
                    this.f25182c = Integer.valueOf(nyt.f());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
