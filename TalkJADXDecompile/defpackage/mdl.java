package defpackage;

import nyt;
import nyu;
import nzc;

/* renamed from: mdl */
public final class mdl extends nyx<mdl> {
    private static volatile mdl[] j;
    public String a;
    public mdm b;
    public mdk c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Long g;
    public Integer h;
    public Long i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mdl[] d() {
        if (j == null) {
            synchronized (nzc.c) {
                if (j == null) {
                    j = new mdl[0];
                }
            }
        }
        return j;
    }

    public mdl() {
        g();
    }

    private mdl g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.g = null;
        this.i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(5, this.c);
        }
        if (this.d != null) {
            nyu.a(6, this.d.intValue());
        }
        if (this.e != null) {
            nyu.a(7, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(8, this.f.intValue());
        }
        if (this.g != null) {
            nyu.a(9, this.g.longValue());
        }
        if (this.h != null) {
            nyu.a(10, this.h.intValue());
        }
        if (this.i != null) {
            nyu.a(11, this.i.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(5, this.c);
        }
        if (this.d != null) {
            b += nyu.f(6, this.d.intValue());
        }
        if (this.e != null) {
            b += nyu.f(7, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.f(8, this.f.intValue());
        }
        if (this.g != null) {
            b += nyu.e(9, this.g.longValue());
        }
        if (this.h != null) {
            b += nyu.f(10, this.h.intValue());
        }
        if (this.i != null) {
            return b + nyu.e(11, this.i.longValue());
        }
        return b;
    }

    private mdl b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new mdm();
                    }
                    nyt.a(this.b);
                    continue;
                case 42:
                    if (this.c == null) {
                        this.c = new mdk();
                    }
                    nyt.a(this.c);
                    continue;
                case 48:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 56:
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
                        case wi.dJ /*15*/:
                        case wi.dI /*16*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case wi.k /*20*/:
                        case wi.f /*21*/:
                            this.e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 64:
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
                        case wi.dJ /*15*/:
                        case wi.dI /*16*/:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case wi.k /*20*/:
                        case wi.f /*21*/:
                        case wi.e /*22*/:
                        case wi.do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                        case wi.i /*27*/:
                        case wi.o /*28*/:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 1001:
                        case 1002:
                            this.f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 72:
                    this.g = Long.valueOf(nyt.d());
                    continue;
                case 80:
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
                            this.h = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 88:
                    this.i = Long.valueOf(nyt.d());
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
