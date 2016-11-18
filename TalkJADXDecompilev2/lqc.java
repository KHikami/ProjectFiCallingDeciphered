package defpackage;

public final class lqc extends nyx<lqc> {
    private static volatile lqc[] r;
    public Integer a;
    public Boolean b;
    public ltr c;
    public lqe d;
    public lpw e;
    public ltv f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Integer j;
    public Integer k;
    public Integer l;
    public byte[] m;
    public byte[] n;
    public byte[] o;
    public byte[] p;
    public byte[] q;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lqc[] d() {
        if (r == null) {
            synchronized (nzc.c) {
                if (r == null) {
                    r = new lqc[0];
                }
            }
        }
        return r;
    }

    public lqc() {
        g();
    }

    private lqc g() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.m != null) {
            nyu.a(1, this.m);
        }
        if (this.n != null) {
            nyu.a(2, this.n);
        }
        if (this.o != null) {
            nyu.a(3, this.o);
        }
        if (this.p != null) {
            nyu.a(4, this.p);
        }
        if (this.q != null) {
            nyu.a(5, this.q);
        }
        if (this.g != null) {
            nyu.a(7, this.g.booleanValue());
        }
        if (this.f != null) {
            nyu.b(8, this.f);
        }
        if (this.c != null) {
            nyu.b(9, this.c);
        }
        if (this.d != null) {
            nyu.b(10, this.d);
        }
        if (this.h != null) {
            nyu.a(11, this.h.booleanValue());
        }
        if (this.e != null) {
            nyu.b(12, this.e);
        }
        if (this.a != null) {
            nyu.a(13, this.a.intValue());
        }
        if (this.i != null) {
            nyu.a(14, this.i.booleanValue());
        }
        if (this.j != null) {
            nyu.a(15, this.j.intValue());
        }
        if (this.k != null) {
            nyu.a(16, this.k.intValue());
        }
        if (this.l != null) {
            nyu.a(17, this.l.intValue());
        }
        if (this.b != null) {
            nyu.a(18, this.b.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.m != null) {
            b += nyu.b(1, this.m);
        }
        if (this.n != null) {
            b += nyu.b(2, this.n);
        }
        if (this.o != null) {
            b += nyu.b(3, this.o);
        }
        if (this.p != null) {
            b += nyu.b(4, this.p);
        }
        if (this.q != null) {
            b += nyu.b(5, this.q);
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f != null) {
            b += nyu.d(8, this.f);
        }
        if (this.c != null) {
            b += nyu.d(9, this.c);
        }
        if (this.d != null) {
            b += nyu.d(10, this.d);
        }
        if (this.h != null) {
            this.h.booleanValue();
            b += nyu.h(11) + 1;
        }
        if (this.e != null) {
            b += nyu.d(12, this.e);
        }
        if (this.a != null) {
            b += nyu.f(13, this.a.intValue());
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.j != null) {
            b += nyu.f(15, this.j.intValue());
        }
        if (this.k != null) {
            b += nyu.f(16, this.k.intValue());
        }
        if (this.l != null) {
            b += nyu.f(17, this.l.intValue());
        }
        if (this.b == null) {
            return b;
        }
        this.b.booleanValue();
        return b + (nyu.h(18) + 1);
    }

    private lqc b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.m = nyt.k();
                    continue;
                case wi.dH /*18*/:
                    this.n = nyt.k();
                    continue;
                case wi.dx /*26*/:
                    this.o = nyt.k();
                    continue;
                case 34:
                    this.p = nyt.k();
                    continue;
                case 42:
                    this.q = nyt.k();
                    continue;
                case 56:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    if (this.f == null) {
                        this.f = new ltv();
                    }
                    nyt.a(this.f);
                    continue;
                case 74:
                    if (this.c == null) {
                        this.c = new ltr();
                    }
                    nyt.a(this.c);
                    continue;
                case 82:
                    if (this.d == null) {
                        this.d = new lqe();
                    }
                    nyt.a(this.d);
                    continue;
                case 88:
                    this.h = Boolean.valueOf(nyt.i());
                    continue;
                case 98:
                    if (this.e == null) {
                        this.e = new lpw();
                    }
                    nyt.a(this.e);
                    continue;
                case 104:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 112:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 120:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.j = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 128:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.k = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 136:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.l = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 144:
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
