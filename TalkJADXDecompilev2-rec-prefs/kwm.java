package p000;

public final class kwm extends nyx<kwm> {
    public Integer f23777a;
    public int f23778b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27813b(nyt);
    }

    public kwm() {
        this.f23777a = null;
        this.f23778b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23777a != null) {
            nyu.a(1, this.f23777a.intValue());
        }
        if (this.f23778b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f23778b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23777a != null) {
            b += nyu.f(1, this.f23777a.intValue());
        }
        if (this.f23778b != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(2, this.f23778b);
        }
        return b;
    }

    private kwm m27813b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23777a = Integer.valueOf(nyt.f());
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
                            this.f23778b = a;
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
