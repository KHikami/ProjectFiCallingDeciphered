package p000;

public final class lnq extends nyx<lnq> {
    private static volatile lnq[] f25803q;
    public Integer f25804a;
    public Long f25805b;
    public String f25806c;
    public Boolean f25807d;
    public Boolean f25808e;
    public Boolean f25809f;
    public Boolean f25810g;
    public Boolean f25811h;
    public Integer f25812i;
    public Integer f25813j;
    public Long f25814k;
    public String f25815l;
    public Long f25816m;
    public Integer f25817n;
    public Integer f25818o;
    public Integer f25819p;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29647b(nyt);
    }

    public static lnq[] m29648d() {
        if (f25803q == null) {
            synchronized (nzc.c) {
                if (f25803q == null) {
                    f25803q = new lnq[0];
                }
            }
        }
        return f25803q;
    }

    public lnq() {
        m29649g();
    }

    private lnq m29649g() {
        this.f25805b = null;
        this.f25806c = null;
        this.f25807d = null;
        this.f25808e = null;
        this.f25809f = null;
        this.f25810g = null;
        this.f25811h = null;
        this.f25814k = null;
        this.f25815l = null;
        this.f25816m = null;
        this.f25818o = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25804a != null) {
            nyu.a(1, this.f25804a.intValue());
        }
        if (this.f25805b != null) {
            nyu.b(2, this.f25805b.longValue());
        }
        if (this.f25806c != null) {
            nyu.a(3, this.f25806c);
        }
        if (this.f25807d != null) {
            nyu.a(4, this.f25807d.booleanValue());
        }
        if (this.f25808e != null) {
            nyu.a(5, this.f25808e.booleanValue());
        }
        if (this.f25809f != null) {
            nyu.a(6, this.f25809f.booleanValue());
        }
        if (this.f25810g != null) {
            nyu.a(7, this.f25810g.booleanValue());
        }
        if (this.f25811h != null) {
            nyu.a(8, this.f25811h.booleanValue());
        }
        if (this.f25812i != null) {
            nyu.a(9, this.f25812i.intValue());
        }
        if (this.f25813j != null) {
            nyu.a(10, this.f25813j.intValue());
        }
        if (this.f25814k != null) {
            nyu.a(11, this.f25814k.longValue());
        }
        if (this.f25815l != null) {
            nyu.a(12, this.f25815l);
        }
        if (this.f25816m != null) {
            nyu.a(13, this.f25816m.longValue());
        }
        if (this.f25817n != null) {
            nyu.a(14, this.f25817n.intValue());
        }
        if (this.f25818o != null) {
            nyu.a(15, this.f25818o.intValue());
        }
        if (this.f25819p != null) {
            nyu.a(16, this.f25819p.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25804a != null) {
            b += nyu.f(1, this.f25804a.intValue());
        }
        if (this.f25805b != null) {
            b += nyu.f(2, this.f25805b.longValue());
        }
        if (this.f25806c != null) {
            b += nyu.b(3, this.f25806c);
        }
        if (this.f25807d != null) {
            this.f25807d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f25808e != null) {
            this.f25808e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f25809f != null) {
            this.f25809f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f25810g != null) {
            this.f25810g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f25811h != null) {
            this.f25811h.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.f25812i != null) {
            b += nyu.f(9, this.f25812i.intValue());
        }
        if (this.f25813j != null) {
            b += nyu.f(10, this.f25813j.intValue());
        }
        if (this.f25814k != null) {
            b += nyu.e(11, this.f25814k.longValue());
        }
        if (this.f25815l != null) {
            b += nyu.b(12, this.f25815l);
        }
        if (this.f25816m != null) {
            b += nyu.e(13, this.f25816m.longValue());
        }
        if (this.f25817n != null) {
            b += nyu.f(14, this.f25817n.intValue());
        }
        if (this.f25818o != null) {
            b += nyu.f(15, this.f25818o.intValue());
        }
        if (this.f25819p != null) {
            return b + nyu.f(16, this.f25819p.intValue());
        }
        return b;
    }

    private lnq m29647b(nyt nyt) {
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
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.f25804a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f25805b = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    this.f25806c = nyt.j();
                    continue;
                case 32:
                    this.f25807d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.f25808e = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f25809f = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.f25810g = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.f25811h = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25812i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case 10:
                        case 20:
                        case wi.dz /*25*/:
                        case 30:
                        case 100:
                            this.f25813j = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 88:
                    this.f25814k = Long.valueOf(nyt.d());
                    continue;
                case 98:
                    this.f25815l = nyt.j();
                    continue;
                case 104:
                    this.f25816m = Long.valueOf(nyt.d());
                    continue;
                case 112:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 100:
                        case 101:
                        case 701:
                        case 702:
                        case 703:
                        case 704:
                        case 705:
                        case 706:
                            this.f25817n = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 120:
                    this.f25818o = Integer.valueOf(nyt.f());
                    continue;
                case 128:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f25819p = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
