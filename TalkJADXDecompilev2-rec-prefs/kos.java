package p000;

public final class kos extends nyx<kos> {
    public mzw f22575a;
    public int f22576b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26829b(nyt);
    }

    public kos() {
        this.f22576b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22575a != null) {
            nyu.b(1, this.f22575a);
        }
        if (this.f22576b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f22576b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22575a != null) {
            b += nyu.d(1, this.f22575a);
        }
        if (this.f22576b != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(2, this.f22576b);
        }
        return b;
    }

    private kos m26829b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22575a == null) {
                        this.f22575a = new mzw();
                    }
                    nyt.a(this.f22575a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22576b = a;
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
