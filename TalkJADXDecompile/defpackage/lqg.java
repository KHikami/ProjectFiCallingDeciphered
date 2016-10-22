package defpackage;

import nyt;
import nyu;
import nzc;

/* renamed from: lqg */
public final class lqg extends nyx<lqg> {
    private static volatile lqg[] z;
    public lor a;
    public ltr b;
    public Long c;
    public String d;
    public lqh e;
    public Integer f;
    public lob g;
    public lta h;
    public lou i;
    public lrv j;
    public ltq k;
    public lua l;
    public ltm m;
    public lru n;
    public Long o;
    public Boolean p;
    public Integer q;
    public Boolean r;
    public lpk s;
    public lqi t;
    public Integer u;
    public Long v;
    public lnw w;
    public Long x;
    public Integer y;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lqg[] d() {
        if (z == null) {
            synchronized (nzc.c) {
                if (z == null) {
                    z = new lqg[0];
                }
            }
        }
        return z;
    }

    public lqg() {
        g();
    }

    private lqg g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
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
        this.r = null;
        this.s = null;
        this.t = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c.longValue());
        }
        if (this.e != null) {
            nyu.b(4, this.e);
        }
        if (this.f != null) {
            nyu.a(6, this.f.intValue());
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null) {
            nyu.b(9, this.h);
        }
        if (this.i != null) {
            nyu.b(10, this.i);
        }
        if (this.j != null) {
            nyu.b(11, this.j);
        }
        if (this.d != null) {
            nyu.a(12, this.d);
        }
        if (this.o != null) {
            nyu.b(13, this.o.longValue());
        }
        if (this.k != null) {
            nyu.b(14, this.k);
        }
        if (this.p != null) {
            nyu.a(15, this.p.booleanValue());
        }
        if (this.q != null) {
            nyu.a(16, this.q.intValue());
        }
        if (this.r != null) {
            nyu.a(17, this.r.booleanValue());
        }
        if (this.s != null) {
            nyu.b(20, this.s);
        }
        if (this.t != null) {
            nyu.b(21, this.t);
        }
        if (this.l != null) {
            nyu.b(22, this.l);
        }
        if (this.u != null) {
            nyu.a(23, this.u.intValue());
        }
        if (this.v != null) {
            nyu.a(24, this.v.longValue());
        }
        if (this.w != null) {
            nyu.b(26, this.w);
        }
        if (this.x != null) {
            nyu.b(27, this.x.longValue());
        }
        if (this.y != null) {
            nyu.a(28, this.y.intValue());
        }
        if (this.m != null) {
            nyu.b(29, this.m);
        }
        if (this.n != null) {
            nyu.b(31, this.n);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.e(3, this.c.longValue());
        }
        if (this.e != null) {
            b += nyu.d(4, this.e);
        }
        if (this.f != null) {
            b += nyu.f(6, this.f.intValue());
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null) {
            b += nyu.d(9, this.h);
        }
        if (this.i != null) {
            b += nyu.d(10, this.i);
        }
        if (this.j != null) {
            b += nyu.d(11, this.j);
        }
        if (this.d != null) {
            b += nyu.b(12, this.d);
        }
        if (this.o != null) {
            b += nyu.f(13, this.o.longValue());
        }
        if (this.k != null) {
            b += nyu.d(14, this.k);
        }
        if (this.p != null) {
            this.p.booleanValue();
            b += nyu.h(15) + 1;
        }
        if (this.q != null) {
            b += nyu.f(16, this.q.intValue());
        }
        if (this.r != null) {
            this.r.booleanValue();
            b += nyu.h(17) + 1;
        }
        if (this.s != null) {
            b += nyu.d(20, this.s);
        }
        if (this.t != null) {
            b += nyu.d(21, this.t);
        }
        if (this.l != null) {
            b += nyu.d(22, this.l);
        }
        if (this.u != null) {
            b += nyu.f(23, this.u.intValue());
        }
        if (this.v != null) {
            b += nyu.e(24, this.v.longValue());
        }
        if (this.w != null) {
            b += nyu.d(26, this.w);
        }
        if (this.x != null) {
            b += nyu.f(27, this.x.longValue());
        }
        if (this.y != null) {
            b += nyu.f(28, this.y.intValue());
        }
        if (this.m != null) {
            b += nyu.d(29, this.m);
        }
        if (this.n != null) {
            return b + nyu.d(31, this.n);
        }
        return b;
    }

    private lqg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new lor();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new ltr();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.d());
                    continue;
                case 34:
                    if (this.e == null) {
                        this.e = new lqh();
                    }
                    nyt.a(this.e);
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 58:
                    if (this.g == null) {
                        this.g = new lob();
                    }
                    nyt.a(this.g);
                    continue;
                case 74:
                    if (this.h == null) {
                        this.h = new lta();
                    }
                    nyt.a(this.h);
                    continue;
                case 82:
                    if (this.i == null) {
                        this.i = new lou();
                    }
                    nyt.a(this.i);
                    continue;
                case 90:
                    if (this.j == null) {
                        this.j = new lrv();
                    }
                    nyt.a(this.j);
                    continue;
                case 98:
                    this.d = nyt.j();
                    continue;
                case 104:
                    this.o = Long.valueOf(nyt.e());
                    continue;
                case 114:
                    if (this.k == null) {
                        this.k = new ltq();
                    }
                    nyt.a(this.k);
                    continue;
                case 120:
                    this.p = Boolean.valueOf(nyt.i());
                    continue;
                case 128:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.q = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 136:
                    this.r = Boolean.valueOf(nyt.i());
                    continue;
                case 162:
                    if (this.s == null) {
                        this.s = new lpk();
                    }
                    nyt.a(this.s);
                    continue;
                case 170:
                    if (this.t == null) {
                        this.t = new lqi();
                    }
                    nyt.a(this.t);
                    continue;
                case 178:
                    if (this.l == null) {
                        this.l = new lua();
                    }
                    nyt.a(this.l);
                    continue;
                case 184:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
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
                        case wi.g /*14*/:
                            this.u = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 192:
                    this.v = Long.valueOf(nyt.d());
                    continue;
                case 210:
                    if (this.w == null) {
                        this.w = new lnw();
                    }
                    nyt.a(this.w);
                    continue;
                case 216:
                    this.x = Long.valueOf(nyt.e());
                    continue;
                case 224:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.y = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 234:
                    if (this.m == null) {
                        this.m = new ltm();
                    }
                    nyt.a(this.m);
                    continue;
                case 250:
                    if (this.n == null) {
                        this.n = new lru();
                    }
                    nyt.a(this.n);
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
