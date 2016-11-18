package p000;

public final class krv extends nyx<krv> {
    public int f22937a;
    public krw f22938b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27250b(nyt);
    }

    public krv() {
        this.f22937a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22937a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f22937a);
        }
        if (this.f22938b != null) {
            nyu.b(2, this.f22938b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22937a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f22937a);
        }
        if (this.f22938b != null) {
            return b + nyu.d(2, this.f22938b);
        }
        return b;
    }

    private krv m27250b(nyt nyt) {
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
                        case 3:
                        case 4:
                        case 5:
                            this.f22937a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f22938b == null) {
                        this.f22938b = new krw();
                    }
                    nyt.a(this.f22938b);
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
