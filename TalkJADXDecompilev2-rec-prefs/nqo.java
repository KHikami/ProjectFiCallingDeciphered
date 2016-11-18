package p000;

public final class nqo extends nyx<nqo> {
    private static volatile nqo[] f30513b;
    public int f30514a;

    public /* synthetic */ nzf m36173a(nyt nyt) {
        return m36171b(nyt);
    }

    public static nqo[] m36172d() {
        if (f30513b == null) {
            synchronized (nzc.f31309c) {
                if (f30513b == null) {
                    f30513b = new nqo[0];
                }
            }
        }
        return f30513b;
    }

    public nqo() {
        this.f30514a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36174a(nyu nyu) {
        if (this.f30514a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f30514a);
        }
        super.a(nyu);
    }

    protected int m36175b() {
        int b = super.b();
        if (this.f30514a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(1, this.f30514a);
        }
        return b;
    }

    private nqo m36171b(nyt nyt) {
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
                            this.f30514a = a;
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
