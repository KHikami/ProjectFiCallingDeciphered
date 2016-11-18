package p000;

public final class kns extends nyx<kns> {
    public knp f22440a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26710b(nyt);
    }

    public kns() {
        m26711d();
    }

    private kns m26711d() {
        this.f22440a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22440a != null) {
            nyu.b(1, this.f22440a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22440a != null) {
            return b + nyu.d(1, this.f22440a);
        }
        return b;
    }

    private kns m26710b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22440a == null) {
                        this.f22440a = new knp();
                    }
                    nyt.a(this.f22440a);
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
