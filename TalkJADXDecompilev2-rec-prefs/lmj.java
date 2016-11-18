package p000;

public final class lmj extends nyx<lmj> {
    private static volatile lmj[] f25555d;
    public Integer f25556a;
    public Integer f25557b;
    public Integer f25558c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29487b(nyt);
    }

    public static lmj[] m29488d() {
        if (f25555d == null) {
            synchronized (nzc.c) {
                if (f25555d == null) {
                    f25555d = new lmj[0];
                }
            }
        }
        return f25555d;
    }

    public lmj() {
        m29489g();
    }

    private lmj m29489g() {
        this.f25558c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25556a != null) {
            nyu.a(1, this.f25556a.intValue());
        }
        if (this.f25557b != null) {
            nyu.a(2, this.f25557b.intValue());
        }
        if (this.f25558c != null) {
            nyu.a(3, this.f25558c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25556a != null) {
            b += nyu.f(1, this.f25556a.intValue());
        }
        if (this.f25557b != null) {
            b += nyu.f(2, this.f25557b.intValue());
        }
        if (this.f25558c != null) {
            return b + nyu.f(3, this.f25558c.intValue());
        }
        return b;
    }

    private lmj m29487b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case -1:
                        case 0:
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
                        case 13:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                        case 22:
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                        case 27:
                        case 28:
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
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            this.f25556a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f25557b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f25558c = Integer.valueOf(nyt.f());
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
