package p000;

public final class lnd extends nyx<lnd> {
    private static volatile lnd[] f25750d;
    public int f25751a;
    public int f25752b;
    public Integer f25753c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29582b(nyt);
    }

    public static lnd[] m29583d() {
        if (f25750d == null) {
            synchronized (nzc.c) {
                if (f25750d == null) {
                    f25750d = new lnd[0];
                }
            }
        }
        return f25750d;
    }

    public lnd() {
        this.f25751a = nzf.UNSET_ENUM_VALUE;
        this.f25752b = nzf.UNSET_ENUM_VALUE;
        this.f25753c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f25751a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f25751a);
        }
        if (this.f25752b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f25752b);
        }
        if (this.f25753c != null) {
            nyu.a(3, this.f25753c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25751a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f25751a);
        }
        if (this.f25752b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.f25752b);
        }
        if (this.f25753c != null) {
            return b + nyu.f(3, this.f25753c.intValue());
        }
        return b;
    }

    private lnd m29582b(nyt nyt) {
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
                            this.f25751a = a;
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
                            this.f25752b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f25753c = Integer.valueOf(nyt.f());
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
