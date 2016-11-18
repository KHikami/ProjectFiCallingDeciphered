package p000;

public final class khk extends nyx<khk> {
    public Integer f21764a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25849b(nyt);
    }

    public khk() {
        m25850d();
    }

    private khk m25850d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21764a != null) {
            nyu.a(1, this.f21764a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21764a != null) {
            return b + nyu.f(1, this.f21764a.intValue());
        }
        return b;
    }

    private khk m25849b(nyt nyt) {
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
                            this.f21764a = Integer.valueOf(a);
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
