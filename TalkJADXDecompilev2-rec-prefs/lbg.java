package p000;

public final class lbg extends nyx<lbg> {
    public Integer f24472a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28461b(nyt);
    }

    public lbg() {
        m28462d();
    }

    private lbg m28462d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f24472a.intValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return super.mo147b() + nyu.f(1, this.f24472a.intValue());
    }

    private lbg m28461b(nyt nyt) {
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
                            this.f24472a = Integer.valueOf(a);
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
