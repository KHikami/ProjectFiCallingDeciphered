package p000;

public final class nss extends nyx<nss> {
    private static volatile nss[] f30722b;
    public int f30723a;

    public /* synthetic */ nzf m36404a(nyt nyt) {
        return m36402b(nyt);
    }

    public static nss[] m36403d() {
        if (f30722b == null) {
            synchronized (nzc.f31309c) {
                if (f30722b == null) {
                    f30722b = new nss[0];
                }
            }
        }
        return f30722b;
    }

    public nss() {
        this.f30723a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36405a(nyu nyu) {
        if (this.f30723a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f30723a);
        }
        super.a(nyu);
    }

    protected int m36406b() {
        int b = super.b();
        if (this.f30723a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(1, this.f30723a);
        }
        return b;
    }

    private nss m36402b(nyt nyt) {
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
                            this.f30723a = a;
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
