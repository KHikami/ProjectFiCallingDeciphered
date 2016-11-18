package p000;

public final class mcl extends nyx<mcl> {
    public Boolean f27334a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31722b(nyt);
    }

    public mcl() {
        m31723d();
    }

    private mcl m31723d() {
        this.f27334a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27334a != null) {
            nyu.a(1, this.f27334a.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27334a == null) {
            return b;
        }
        this.f27334a.booleanValue();
        return b + (nyu.h(1) + 1);
    }

    private mcl m31722b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27334a = Boolean.valueOf(nyt.i());
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
