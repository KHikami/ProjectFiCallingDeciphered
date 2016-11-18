package p000;

public final class kji extends nyx<kji> {
    public Integer f21926a;
    public Integer f21927b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26086b(nyt);
    }

    public kji() {
        m26087d();
    }

    private kji m26087d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21926a != null) {
            nyu.a(1, this.f21926a.intValue());
        }
        if (this.f21927b != null) {
            nyu.a(2, this.f21927b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21926a != null) {
            b += nyu.f(1, this.f21926a.intValue());
        }
        if (this.f21927b != null) {
            return b + nyu.f(2, this.f21927b.intValue());
        }
        return b;
    }

    private kji m26086b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f21926a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f21927b = Integer.valueOf(a);
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
