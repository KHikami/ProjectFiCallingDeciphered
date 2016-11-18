package p000;

public final class lxn extends nyx<lxn> {
    public Integer f26794a;
    public Integer f26795b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31023b(nyt);
    }

    public lxn() {
        m31024d();
    }

    private lxn m31024d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26794a != null) {
            nyu.a(1, this.f26794a.intValue());
        }
        if (this.f26795b != null) {
            nyu.a(2, this.f26795b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26794a != null) {
            b += nyu.f(1, this.f26794a.intValue());
        }
        if (this.f26795b != null) {
            return b + nyu.f(2, this.f26795b.intValue());
        }
        return b;
    }

    private lxn m31023b(nyt nyt) {
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
                        case 6:
                            this.f26794a = Integer.valueOf(a);
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
                        case 4:
                        case 5:
                        case 6:
                            this.f26795b = Integer.valueOf(a);
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
