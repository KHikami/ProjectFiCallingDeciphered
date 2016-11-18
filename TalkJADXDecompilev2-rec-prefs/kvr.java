package p000;

public final class kvr extends nyx<kvr> {
    public int f23662a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27724b(nyt);
    }

    public kvr() {
        this.f23662a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23662a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f23662a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23662a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(1, this.f23662a);
        }
        return b;
    }

    private kvr m27724b(nyt nyt) {
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
                            this.f23662a = a;
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
