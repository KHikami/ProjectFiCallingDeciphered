package defpackage;

public final class lml extends nyx<lml> {
    private static volatile lml[] m;
    public int a;
    public Long b;
    public Long c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Boolean j;
    public Integer k;
    public Boolean l;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lml[] d() {
        if (m == null) {
            synchronized (nzc.c) {
                if (m == null) {
                    m = new lml[0];
                }
            }
        }
        return m;
    }

    public lml() {
        this.a = nzf.UNSET_ENUM_VALUE;
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
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        if (this.b != null) {
            nyu.b(2, this.b.longValue());
        }
        if (this.e != null) {
            nyu.a(4, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(5, this.f.intValue());
        }
        if (this.g != null) {
            nyu.a(6, this.g.booleanValue());
        }
        if (this.h != null) {
            nyu.a(7, this.h.booleanValue());
        }
        if (this.i != null) {
            nyu.a(8, this.i.booleanValue());
        }
        if (this.k != null) {
            nyu.a(11, this.k.intValue());
        }
        if (this.d != null) {
            nyu.a(12, this.d.intValue());
        }
        if (this.j != null) {
            nyu.a(13, this.j.booleanValue());
        }
        if (this.c != null) {
            nyu.b(14, this.c.longValue());
        }
        if (this.l != null) {
            nyu.a(15, this.l.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b() + nyu.f(1, this.a);
        if (this.b != null) {
            b += nyu.f(2, this.b.longValue());
        }
        if (this.e != null) {
            b += nyu.f(4, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.f(5, this.f.intValue());
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.h != null) {
            this.h.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.k != null) {
            b += nyu.f(11, this.k.intValue());
        }
        if (this.d != null) {
            b += nyu.f(12, this.d.intValue());
        }
        if (this.j != null) {
            this.j.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.c != null) {
            b += nyu.f(14, this.c.longValue());
        }
        if (this.l == null) {
            return b;
        }
        this.l.booleanValue();
        return b + (nyu.h(15) + 1);
    }

    private lml b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 6:
                        case 7:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.b = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    this.e = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.h = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 88:
                    this.k = Integer.valueOf(nyt.f());
                    continue;
                case 96:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 104:
                    this.j = Boolean.valueOf(nyt.i());
                    continue;
                case 112:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case 120:
                    this.l = Boolean.valueOf(nyt.i());
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
