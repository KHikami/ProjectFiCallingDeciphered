package p000;

public final class now extends nyx<now> {
    public String f30403a;
    public int f30404b;
    public String f30405c;

    public /* synthetic */ nzf m35962a(nyt nyt) {
        return m35961b(nyt);
    }

    public now() {
        this.f30403a = null;
        this.f30404b = nzf.UNSET_ENUM_VALUE;
        this.f30405c = null;
        this.cachedSize = -1;
    }

    public void m35963a(nyu nyu) {
        if (this.f30403a != null) {
            nyu.m37170a(1, this.f30403a);
        }
        if (this.f30404b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f30404b);
        }
        if (this.f30405c != null) {
            nyu.m37170a(3, this.f30405c);
        }
        super.a(nyu);
    }

    protected int m35964b() {
        int b = super.b();
        if (this.f30403a != null) {
            b += nyu.m37137b(1, this.f30403a);
        }
        if (this.f30404b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(2, this.f30404b);
        }
        if (this.f30405c != null) {
            return b + nyu.m37137b(3, this.f30405c);
        }
        return b;
    }

    private now m35961b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30403a = nyt.m37117j();
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 6:
                        case 10:
                            this.f30404b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f30405c = nyt.m37117j();
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
