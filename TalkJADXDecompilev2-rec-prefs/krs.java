package p000;

public final class krs extends nyx<krs> {
    public kjc f22931a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27235b(nyt);
    }

    public krs() {
        m27236d();
    }

    private krs m27236d() {
        this.f22931a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22931a != null) {
            nyu.b(1, this.f22931a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22931a != null) {
            return b + nyu.d(1, this.f22931a);
        }
        return b;
    }

    private krs m27235b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22931a == null) {
                        this.f22931a = new kjc();
                    }
                    nyt.a(this.f22931a);
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
