package p000;

public final class kiq extends nyx<kiq> {
    public String f21875a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25999b(nyt);
    }

    public kiq() {
        this.f21875a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21875a != null) {
            nyu.a(1, this.f21875a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21875a != null) {
            return b + nyu.b(1, this.f21875a);
        }
        return b;
    }

    private kiq m25999b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21875a = nyt.j();
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
