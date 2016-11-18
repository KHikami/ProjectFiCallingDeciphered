package p000;

public final class kmg extends nyx<kmg> {
    public Integer f22354a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26522b(nyt);
    }

    public kmg() {
        m26523d();
    }

    private kmg m26523d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22354a != null) {
            nyu.a(1, this.f22354a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22354a != null) {
            return b + nyu.f(1, this.f22354a.intValue());
        }
        return b;
    }

    private kmg m26522b(nyt nyt) {
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
                            this.f22354a = Integer.valueOf(a);
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
