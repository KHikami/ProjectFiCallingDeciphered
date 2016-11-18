package p000;

public final class lzo extends nyx<lzo> {
    public Integer f27020a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31305b(nyt);
    }

    public lzo() {
        m31306d();
    }

    private lzo m31306d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27020a != null) {
            nyu.a(1, this.f27020a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27020a != null) {
            return b + nyu.f(1, this.f27020a.intValue());
        }
        return b;
    }

    private lzo m31305b(nyt nyt) {
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
                            this.f27020a = Integer.valueOf(a);
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
