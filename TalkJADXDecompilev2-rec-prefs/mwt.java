package p000;

public final class mwt extends nyx<mwt> {
    public int f28626a;
    public Integer f28627b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33254b(nyt);
    }

    public mwt() {
        this.f28626a = nzf.UNSET_ENUM_VALUE;
        this.f28627b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28626a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f28626a);
        }
        if (this.f28627b != null) {
            nyu.a(2, this.f28627b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28626a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f28626a);
        }
        if (this.f28627b != null) {
            return b + nyu.f(2, this.f28627b.intValue());
        }
        return b;
    }

    private mwt m33254b(nyt nyt) {
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
                            this.f28626a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f28627b = Integer.valueOf(nyt.f());
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
