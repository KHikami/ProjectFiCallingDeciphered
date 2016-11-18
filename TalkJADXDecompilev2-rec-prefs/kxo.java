package p000;

public final class kxo extends nyx<kxo> {
    public int f23864a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27948b(nyt);
    }

    public kxo() {
        this.f23864a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23864a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f23864a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23864a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(1, this.f23864a);
        }
        return b;
    }

    private kxo m27948b(nyt nyt) {
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
                            this.f23864a = a;
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
