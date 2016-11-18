package p000;

public final class kok extends nyx<kok> {
    public String f22530a;
    public String f22531b;
    public int f22532c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26795b(nyt);
    }

    public kok() {
        this.f22530a = null;
        this.f22531b = null;
        this.f22532c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22530a != null) {
            nyu.a(1, this.f22530a);
        }
        if (this.f22532c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f22532c);
        }
        if (this.f22531b != null) {
            nyu.a(3, this.f22531b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22530a != null) {
            b += nyu.b(1, this.f22530a);
        }
        if (this.f22532c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.f22532c);
        }
        if (this.f22531b != null) {
            return b + nyu.b(3, this.f22531b);
        }
        return b;
    }

    private kok m26795b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22530a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f22532c = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f22531b = nyt.j();
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
