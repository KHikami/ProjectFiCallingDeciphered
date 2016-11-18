package p000;

public final class kys extends nyx<kys> {
    public Integer f24104a;
    public Integer f24105b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28118b(nyt);
    }

    public kys() {
        m28119d();
    }

    private kys m28119d() {
        this.f24104a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24104a != null) {
            nyu.a(1, this.f24104a.intValue());
        }
        if (this.f24105b != null) {
            nyu.a(2, this.f24105b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24104a != null) {
            b += nyu.f(1, this.f24104a.intValue());
        }
        if (this.f24105b != null) {
            return b + nyu.f(2, this.f24105b.intValue());
        }
        return b;
    }

    private kys m28118b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24104a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f24105b = Integer.valueOf(a);
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
