package p000;

public final class kiu extends nyx<kiu> {
    public kji f21884a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26015b(nyt);
    }

    public kiu() {
        m26016d();
    }

    private kiu m26016d() {
        this.f21884a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21884a != null) {
            nyu.b(1, this.f21884a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21884a != null) {
            return b + nyu.d(1, this.f21884a);
        }
        return b;
    }

    private kiu m26015b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f21884a == null) {
                        this.f21884a = new kji();
                    }
                    nyt.a(this.f21884a);
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
