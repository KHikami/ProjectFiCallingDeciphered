package p000;

public final class kom extends nyx<kom> {
    public Boolean f22533a;
    public Boolean f22534b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26801b(nyt);
    }

    public kom() {
        m26802d();
    }

    private kom m26802d() {
        this.f22533a = null;
        this.f22534b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22533a != null) {
            nyu.a(1, this.f22533a.booleanValue());
        }
        if (this.f22534b != null) {
            nyu.a(2, this.f22534b.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22533a != null) {
            this.f22533a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f22534b == null) {
            return b;
        }
        this.f22534b.booleanValue();
        return b + (nyu.h(2) + 1);
    }

    private kom m26801b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22533a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f22534b = Boolean.valueOf(nyt.i());
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
