package p000;

public final class kjd extends nyx<kjd> {
    public Integer f21914a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26061b(nyt);
    }

    public kjd() {
        m26062d();
    }

    private kjd m26062d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21914a != null) {
            nyu.a(1, this.f21914a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21914a != null) {
            return b + nyu.f(1, this.f21914a.intValue());
        }
        return b;
    }

    private kjd m26061b(nyt nyt) {
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
                            this.f21914a = Integer.valueOf(a);
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
