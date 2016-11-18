package p000;

public final class lbs extends nyx<lbs> {
    public int f24512a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28515b(nyt);
    }

    public lbs() {
        this.f24512a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24512a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f24512a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24512a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(1, this.f24512a);
        }
        return b;
    }

    private lbs m28515b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                            this.f24512a = a;
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
