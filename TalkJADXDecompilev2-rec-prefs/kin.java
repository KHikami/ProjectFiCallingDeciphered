package p000;

public final class kin extends nyx<kin> {
    public int f21869a;
    public String f21870b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25987b(nyt);
    }

    public kin() {
        this.f21869a = nzf.UNSET_ENUM_VALUE;
        this.f21870b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21870b != null) {
            nyu.a(1, this.f21870b);
        }
        if (this.f21869a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f21869a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21870b != null) {
            b += nyu.b(1, this.f21870b);
        }
        if (this.f21869a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(2, this.f21869a);
        }
        return b;
    }

    private kin m25987b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21870b = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f21869a = a;
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
