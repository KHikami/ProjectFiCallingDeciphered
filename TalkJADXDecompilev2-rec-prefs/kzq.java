package p000;

public final class kzq extends nyx<kzq> {
    public lam f24289a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28266b(nyt);
    }

    public kzq() {
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24289a != null) {
            nyu.b(1, this.f24289a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24289a != null) {
            return b + nyu.d(1, this.f24289a);
        }
        return b;
    }

    private kzq m28266b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24289a == null) {
                        this.f24289a = new lam();
                    }
                    nyt.a(this.f24289a);
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
