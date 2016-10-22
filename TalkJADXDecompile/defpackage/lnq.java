package defpackage;

import nyt;
import nyu;
import nzc;

/* renamed from: lnq */
public final class lnq extends nyx<lnq> {
    private static volatile lnq[] q;
    public Integer a;
    public Long b;
    public String c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Integer i;
    public Integer j;
    public Long k;
    public String l;
    public Long m;
    public Integer n;
    public Integer o;
    public Integer p;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lnq[] d() {
        if (q == null) {
            synchronized (nzc.c) {
                if (q == null) {
                    q = new lnq[0];
                }
            }
        }
        return q;
    }

    public lnq() {
        g();
    }

    private lnq g() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.o = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b.longValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.booleanValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.booleanValue());
        }
        if (this.g != null) {
            nyu.a(7, this.g.booleanValue());
        }
        if (this.h != null) {
            nyu.a(8, this.h.booleanValue());
        }
        if (this.i != null) {
            nyu.a(9, this.i.intValue());
        }
        if (this.j != null) {
            nyu.a(10, this.j.intValue());
        }
        if (this.k != null) {
            nyu.a(11, this.k.longValue());
        }
        if (this.l != null) {
            nyu.a(12, this.l);
        }
        if (this.m != null) {
            nyu.a(13, this.m.longValue());
        }
        if (this.n != null) {
            nyu.a(14, this.n.intValue());
        }
        if (this.o != null) {
            nyu.a(15, this.o.intValue());
        }
        if (this.p != null) {
            nyu.a(16, this.p.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.longValue());
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f != null) {
            this.f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.h != null) {
            this.h.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.i != null) {
            b += nyu.f(9, this.i.intValue());
        }
        if (this.j != null) {
            b += nyu.f(10, this.j.intValue());
        }
        if (this.k != null) {
            b += nyu.e(11, this.k.longValue());
        }
        if (this.l != null) {
            b += nyu.b(12, this.l);
        }
        if (this.m != null) {
            b += nyu.e(13, this.m.longValue());
        }
        if (this.n != null) {
            b += nyu.f(14, this.n.intValue());
        }
        if (this.o != null) {
            b += nyu.f(15, this.o.intValue());
        }
        if (this.p != null) {
            return b + nyu.f(16, this.p.intValue());
        }
        return b;
    }

    private lnq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                        case wi.q /*7*/:
                        case wi.m /*8*/:
                        case wi.n /*9*/:
                        case wi.dr /*10*/:
                        case wi.dB /*11*/:
                        case wi.dM /*12*/:
                        case wi.dD /*13*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dI /*16*/:
                    this.b = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.h = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case wi.dr /*10*/:
                        case wi.k /*20*/:
                        case wi.dz /*25*/:
                        case 30:
                        case 100:
                            this.j = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 88:
                    this.k = Long.valueOf(nyt.d());
                    continue;
                case 98:
                    this.l = nyt.j();
                    continue;
                case 104:
                    this.m = Long.valueOf(nyt.d());
                    continue;
                case 112:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case 100:
                        case 101:
                        case 701:
                        case 702:
                        case 703:
                        case 704:
                        case 705:
                        case 706:
                            this.n = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 120:
                    this.o = Integer.valueOf(nyt.f());
                    continue;
                case 128:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                            this.p = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
