package p000;

public final class kjf extends nyx<kjf> {
    public Boolean f21921a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26071b(nyt);
    }

    public kjf() {
        m26072d();
    }

    private kjf m26072d() {
        this.f21921a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21921a != null) {
            nyu.a(1, this.f21921a.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21921a == null) {
            return b;
        }
        this.f21921a.booleanValue();
        return b + (nyu.h(1) + 1);
    }

    private kjf m26071b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f21921a = Boolean.valueOf(nyt.i());
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
