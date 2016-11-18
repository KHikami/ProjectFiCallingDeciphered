package p000;

public final class kio extends nyx<kio> {
    public String f21871a;
    public int f21872b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25991b(nyt);
    }

    public kio() {
        this.f21871a = null;
        this.f21872b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21871a != null) {
            nyu.a(1, this.f21871a);
        }
        if (this.f21872b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f21872b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21871a != null) {
            b += nyu.b(1, this.f21871a);
        }
        if (this.f21872b != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(2, this.f21872b);
        }
        return b;
    }

    private kio m25991b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21871a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f21872b = a;
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
