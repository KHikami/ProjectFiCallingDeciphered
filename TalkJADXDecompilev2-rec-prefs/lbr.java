package p000;

public final class lbr extends nyx<lbr> {
    public int f24511a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28511b(nyt);
    }

    public lbr() {
        this.f24511a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f24511a);
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return super.mo147b() + nyu.f(1, this.f24511a);
    }

    private lbr m28511b(nyt nyt) {
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
                            this.f24511a = a;
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
