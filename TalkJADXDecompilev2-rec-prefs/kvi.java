package p000;

public final class kvi extends nyx<kvi> {
    public int f23606a;
    public lew f23607b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27686b(nyt);
    }

    public kvi() {
        this.f23606a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23606a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f23606a);
        }
        if (this.f23607b != null) {
            nyu.b(2, this.f23607b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23606a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f23606a);
        }
        if (this.f23607b != null) {
            return b + nyu.d(2, this.f23607b);
        }
        return b;
    }

    private kvi m27686b(nyt nyt) {
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
                        case 3:
                        case 4:
                        case 5:
                            this.f23606a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f23607b == null) {
                        this.f23607b = new lew();
                    }
                    nyt.a(this.f23607b);
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
