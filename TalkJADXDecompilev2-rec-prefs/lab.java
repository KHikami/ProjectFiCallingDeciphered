package p000;

public final class lab extends nyx<lab> {
    public int f24332a;
    public int f24333b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28324b(nyt);
    }

    public lab() {
        this.f24332a = nzf.UNSET_ENUM_VALUE;
        this.f24333b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24332a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f24332a);
        }
        if (this.f24333b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f24333b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24332a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f24332a);
        }
        if (this.f24333b != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(2, this.f24333b);
        }
        return b;
    }

    private lab m28324b(nyt nyt) {
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
                            this.f24332a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f24333b = a;
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
