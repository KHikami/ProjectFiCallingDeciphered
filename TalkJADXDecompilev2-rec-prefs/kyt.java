package p000;

public final class kyt extends nyx<kyt> {
    public Integer f24106a;
    public Integer f24107b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28123b(nyt);
    }

    public kyt() {
        m28124d();
    }

    private kyt m28124d() {
        this.f24107b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24106a != null) {
            nyu.a(1, this.f24106a.intValue());
        }
        if (this.f24107b != null) {
            nyu.a(2, this.f24107b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24106a != null) {
            b += nyu.f(1, this.f24106a.intValue());
        }
        if (this.f24107b != null) {
            return b + nyu.f(2, this.f24107b.intValue());
        }
        return b;
    }

    private kyt m28123b(nyt nyt) {
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
                            this.f24106a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f24107b = Integer.valueOf(nyt.f());
                    continue;
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
