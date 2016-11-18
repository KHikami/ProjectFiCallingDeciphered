package p000;

public final class ncf extends nyx<ncf> {
    private static volatile ncf[] f29490d;
    public int f29491a;
    public Boolean f29492b;
    public Boolean f29493c;

    public /* synthetic */ nzf m34293a(nyt nyt) {
        return m34291b(nyt);
    }

    public static ncf[] m34292d() {
        if (f29490d == null) {
            synchronized (nzc.f31309c) {
                if (f29490d == null) {
                    f29490d = new ncf[0];
                }
            }
        }
        return f29490d;
    }

    public ncf() {
        this.f29491a = nzf.UNSET_ENUM_VALUE;
        this.f29492b = null;
        this.f29493c = null;
        this.cachedSize = -1;
    }

    public void m34294a(nyu nyu) {
        if (this.f29491a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29491a);
        }
        if (this.f29493c != null) {
            nyu.m37172a(2, this.f29493c.booleanValue());
        }
        if (this.f29492b != null) {
            nyu.m37172a(3, this.f29492b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34295b() {
        int b = super.b();
        if (this.f29491a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f29491a);
        }
        if (this.f29493c != null) {
            this.f29493c.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f29492b == null) {
            return b;
        }
        this.f29492b.booleanValue();
        return b + (nyu.m37154h(3) + 1);
    }

    private ncf m34291b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
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
                        case 12:
                        case 13:
                        case 14:
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
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                            this.f29491a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f29493c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f29492b = Boolean.valueOf(nyt.m37116i());
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
