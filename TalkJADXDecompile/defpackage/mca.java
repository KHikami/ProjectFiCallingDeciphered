package defpackage;

import nyt;
import nyu;

/* renamed from: mca */
public final class mca extends nyx<mca> {
    public Integer a;
    public Integer b;
    public mci c;
    public mcb d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mca() {
        d();
    }

    private mca d() {
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.intValue());
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b() + nyu.f(1, this.a.intValue());
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            return b + nyu.d(4, this.d);
        }
        return b;
    }

    private mca b(nyt nyt) {
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
                        case 49:
                        case 50:
                        case 51:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dI /*16*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new mci();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new mcb();
                    }
                    nyt.a(this.d);
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
