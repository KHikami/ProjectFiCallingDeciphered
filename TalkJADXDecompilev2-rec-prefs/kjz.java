package p000;

public final class kjz extends nyx<kjz> {
    public Long f22019a;
    public Integer f22020b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26185b(nyt);
    }

    public kjz() {
        m26186d();
    }

    private kjz m26186d() {
        this.f22019a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22019a != null) {
            nyu.b(1, this.f22019a.longValue());
        }
        if (this.f22020b != null) {
            nyu.a(2, this.f22020b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22019a != null) {
            b += nyu.f(1, this.f22019a.longValue());
        }
        if (this.f22020b != null) {
            return b + nyu.f(2, this.f22020b.intValue());
        }
        return b;
    }

    private kjz m26185b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22019a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f22020b = Integer.valueOf(a);
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
