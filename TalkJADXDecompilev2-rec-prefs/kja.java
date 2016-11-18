package p000;

public final class kja extends nyx<kja> {
    public Boolean f21899a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26046b(nyt);
    }

    public kja() {
        m26047d();
    }

    private kja m26047d() {
        this.f21899a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21899a != null) {
            nyu.a(2, this.f21899a.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21899a == null) {
            return b;
        }
        this.f21899a.booleanValue();
        return b + (nyu.h(2) + 1);
    }

    private kja m26046b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    this.f21899a = Boolean.valueOf(nyt.i());
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
