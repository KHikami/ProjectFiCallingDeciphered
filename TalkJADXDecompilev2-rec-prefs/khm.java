package p000;

public final class khm extends nyx<khm> {
    public int f21767a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25859b(nyt);
    }

    public khm() {
        this.f21767a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21767a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f21767a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21767a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(1, this.f21767a);
        }
        return b;
    }

    private khm m25859b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f21767a = a;
                            break;
                        default:
                            continue;
                    }
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
