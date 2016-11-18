package p000;

public final class npa extends nyx<npa> {
    private static volatile npa[] f30420b;
    public int f30421a;

    public /* synthetic */ nzf m35996a(nyt nyt) {
        return m35994b(nyt);
    }

    public static npa[] m35995d() {
        if (f30420b == null) {
            synchronized (nzc.f31309c) {
                if (f30420b == null) {
                    f30420b = new npa[0];
                }
            }
        }
        return f30420b;
    }

    public npa() {
        this.f30421a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m35997a(nyu nyu) {
        if (this.f30421a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f30421a);
        }
        super.a(nyu);
    }

    protected int m35998b() {
        int b = super.b();
        if (this.f30421a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(1, this.f30421a);
        }
        return b;
    }

    private npa m35994b(nyt nyt) {
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
                            this.f30421a = a;
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
