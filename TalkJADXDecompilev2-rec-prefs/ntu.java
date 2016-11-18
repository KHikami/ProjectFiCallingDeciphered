package p000;

public final class ntu extends nyx<ntu> {
    private static volatile ntu[] f30787d;
    public int f30788a;
    public int f30789b;
    public int f30790c;

    public /* synthetic */ nzf m36524a(nyt nyt) {
        return m36522b(nyt);
    }

    public static ntu[] m36523d() {
        if (f30787d == null) {
            synchronized (nzc.f31309c) {
                if (f30787d == null) {
                    f30787d = new ntu[0];
                }
            }
        }
        return f30787d;
    }

    public ntu() {
        this.f30788a = nzf.UNSET_ENUM_VALUE;
        this.f30789b = nzf.UNSET_ENUM_VALUE;
        this.f30790c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36525a(nyu nyu) {
        if (this.f30788a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f30788a);
        }
        if (this.f30789b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f30789b);
        }
        if (this.f30790c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(3, this.f30790c);
        }
        super.a(nyu);
    }

    protected int m36526b() {
        int b = super.b();
        if (this.f30788a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f30788a);
        }
        if (this.f30789b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(2, this.f30789b);
        }
        if (this.f30790c != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(3, this.f30790c);
        }
        return b;
    }

    private ntu m36522b(nyt nyt) {
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
                            this.f30788a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f30789b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f30790c = a;
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
