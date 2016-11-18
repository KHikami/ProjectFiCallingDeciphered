package p000;

public final class pbt extends nyx<pbt> {
    private static volatile pbt[] f34975d;
    public Integer f34976a;
    public Integer f34977b;
    public int f34978c;

    public /* synthetic */ nzf m40233a(nyt nyt) {
        return m40231b(nyt);
    }

    public static pbt[] m40232d() {
        if (f34975d == null) {
            synchronized (nzc.f31309c) {
                if (f34975d == null) {
                    f34975d = new pbt[0];
                }
            }
        }
        return f34975d;
    }

    public pbt() {
        this.f34976a = null;
        this.f34977b = null;
        this.f34978c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m40234a(nyu nyu) {
        if (this.f34976a != null) {
            nyu.m37168a(1, this.f34976a.intValue());
        }
        if (this.f34977b != null) {
            nyu.m37168a(2, this.f34977b.intValue());
        }
        if (this.f34978c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(3, this.f34978c);
        }
        super.a(nyu);
    }

    protected int m40235b() {
        int b = super.b();
        if (this.f34976a != null) {
            b += nyu.m37147f(1, this.f34976a.intValue());
        }
        if (this.f34977b != null) {
            b += nyu.m37147f(2, this.f34977b.intValue());
        }
        if (this.f34978c != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(3, this.f34978c);
        }
        return b;
    }

    private pbt m40231b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34976a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f34977b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f34978c = a;
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
