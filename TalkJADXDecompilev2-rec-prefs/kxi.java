package p000;

public final class kxi extends nyx<kxi> {
    public int f23846a;
    public Integer f23847b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27922b(nyt);
    }

    public kxi() {
        this.f23846a = nzf.UNSET_ENUM_VALUE;
        this.f23847b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23846a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f23846a);
        }
        if (this.f23847b != null) {
            nyu.a(2, this.f23847b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23846a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f23846a);
        }
        if (this.f23847b != null) {
            return b + nyu.f(2, this.f23847b.intValue());
        }
        return b;
    }

    private kxi m27922b(nyt nyt) {
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
                            this.f23846a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f23847b = Integer.valueOf(nyt.f());
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
