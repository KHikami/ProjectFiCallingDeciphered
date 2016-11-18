package p000;

public final class mac extends nyx<mac> {
    public String f27090a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31393b(nyt);
    }

    public mac() {
        m31394d();
    }

    private mac m31394d() {
        this.f27090a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f27090a);
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return super.mo147b() + nyu.b(1, this.f27090a);
    }

    private mac m31393b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27090a = nyt.j();
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
