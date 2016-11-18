package p000;

public final class lqc extends nyx<lqc> {
    private static volatile lqc[] f26060r;
    public Integer f26061a;
    public Boolean f26062b;
    public ltr f26063c;
    public lqe f26064d;
    public lpw f26065e;
    public ltv f26066f;
    public Boolean f26067g;
    public Boolean f26068h;
    public Boolean f26069i;
    public Integer f26070j;
    public Integer f26071k;
    public Integer f26072l;
    public byte[] f26073m;
    public byte[] f26074n;
    public byte[] f26075o;
    public byte[] f26076p;
    public byte[] f26077q;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30001b(nyt);
    }

    public static lqc[] m30002d() {
        if (f26060r == null) {
            synchronized (nzc.c) {
                if (f26060r == null) {
                    f26060r = new lqc[0];
                }
            }
        }
        return f26060r;
    }

    public lqc() {
        m30003g();
    }

    private lqc m30003g() {
        this.f26062b = null;
        this.f26063c = null;
        this.f26064d = null;
        this.f26065e = null;
        this.f26066f = null;
        this.f26067g = null;
        this.f26068h = null;
        this.f26069i = null;
        this.f26073m = null;
        this.f26074n = null;
        this.f26075o = null;
        this.f26076p = null;
        this.f26077q = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26073m != null) {
            nyu.a(1, this.f26073m);
        }
        if (this.f26074n != null) {
            nyu.a(2, this.f26074n);
        }
        if (this.f26075o != null) {
            nyu.a(3, this.f26075o);
        }
        if (this.f26076p != null) {
            nyu.a(4, this.f26076p);
        }
        if (this.f26077q != null) {
            nyu.a(5, this.f26077q);
        }
        if (this.f26067g != null) {
            nyu.a(7, this.f26067g.booleanValue());
        }
        if (this.f26066f != null) {
            nyu.b(8, this.f26066f);
        }
        if (this.f26063c != null) {
            nyu.b(9, this.f26063c);
        }
        if (this.f26064d != null) {
            nyu.b(10, this.f26064d);
        }
        if (this.f26068h != null) {
            nyu.a(11, this.f26068h.booleanValue());
        }
        if (this.f26065e != null) {
            nyu.b(12, this.f26065e);
        }
        if (this.f26061a != null) {
            nyu.a(13, this.f26061a.intValue());
        }
        if (this.f26069i != null) {
            nyu.a(14, this.f26069i.booleanValue());
        }
        if (this.f26070j != null) {
            nyu.a(15, this.f26070j.intValue());
        }
        if (this.f26071k != null) {
            nyu.a(16, this.f26071k.intValue());
        }
        if (this.f26072l != null) {
            nyu.a(17, this.f26072l.intValue());
        }
        if (this.f26062b != null) {
            nyu.a(18, this.f26062b.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26073m != null) {
            b += nyu.b(1, this.f26073m);
        }
        if (this.f26074n != null) {
            b += nyu.b(2, this.f26074n);
        }
        if (this.f26075o != null) {
            b += nyu.b(3, this.f26075o);
        }
        if (this.f26076p != null) {
            b += nyu.b(4, this.f26076p);
        }
        if (this.f26077q != null) {
            b += nyu.b(5, this.f26077q);
        }
        if (this.f26067g != null) {
            this.f26067g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f26066f != null) {
            b += nyu.d(8, this.f26066f);
        }
        if (this.f26063c != null) {
            b += nyu.d(9, this.f26063c);
        }
        if (this.f26064d != null) {
            b += nyu.d(10, this.f26064d);
        }
        if (this.f26068h != null) {
            this.f26068h.booleanValue();
            b += nyu.h(11) + 1;
        }
        if (this.f26065e != null) {
            b += nyu.d(12, this.f26065e);
        }
        if (this.f26061a != null) {
            b += nyu.f(13, this.f26061a.intValue());
        }
        if (this.f26069i != null) {
            this.f26069i.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.f26070j != null) {
            b += nyu.f(15, this.f26070j.intValue());
        }
        if (this.f26071k != null) {
            b += nyu.f(16, this.f26071k.intValue());
        }
        if (this.f26072l != null) {
            b += nyu.f(17, this.f26072l.intValue());
        }
        if (this.f26062b == null) {
            return b;
        }
        this.f26062b.booleanValue();
        return b + (nyu.h(18) + 1);
    }

    private lqc m30001b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26073m = nyt.k();
                    continue;
                case wi.dH /*18*/:
                    this.f26074n = nyt.k();
                    continue;
                case wi.dx /*26*/:
                    this.f26075o = nyt.k();
                    continue;
                case 34:
                    this.f26076p = nyt.k();
                    continue;
                case 42:
                    this.f26077q = nyt.k();
                    continue;
                case 56:
                    this.f26067g = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    if (this.f26066f == null) {
                        this.f26066f = new ltv();
                    }
                    nyt.a(this.f26066f);
                    continue;
                case 74:
                    if (this.f26063c == null) {
                        this.f26063c = new ltr();
                    }
                    nyt.a(this.f26063c);
                    continue;
                case 82:
                    if (this.f26064d == null) {
                        this.f26064d = new lqe();
                    }
                    nyt.a(this.f26064d);
                    continue;
                case 88:
                    this.f26068h = Boolean.valueOf(nyt.i());
                    continue;
                case 98:
                    if (this.f26065e == null) {
                        this.f26065e = new lpw();
                    }
                    nyt.a(this.f26065e);
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
                            this.f26061a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 112:
                    this.f26069i = Boolean.valueOf(nyt.i());
                    continue;
                case 120:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26070j = Integer.valueOf(a);
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
                            this.f26071k = Integer.valueOf(a);
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
                            this.f26072l = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 144:
                    this.f26062b = Boolean.valueOf(nyt.i());
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
