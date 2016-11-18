package p000;

public final class mcy extends nyx<mcy> {
    public Integer f27418a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31789b(nyt);
    }

    public mcy() {
        m31790d();
    }

    private mcy m31790d() {
        this.f27418a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27418a != null) {
            nyu.a(1, this.f27418a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27418a != null) {
            return b + nyu.f(1, this.f27418a.intValue());
        }
        return b;
    }

    private mcy m31789b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27418a = Integer.valueOf(nyt.f());
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
