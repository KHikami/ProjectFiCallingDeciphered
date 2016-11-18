package p000;

public final class kox extends nyx<kox> {
    public Integer f22591a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26851b(nyt);
    }

    public kox() {
        m26852d();
    }

    private kox m26852d() {
        this.f22591a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22591a != null) {
            nyu.a(1, this.f22591a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22591a != null) {
            return b + nyu.f(1, this.f22591a.intValue());
        }
        return b;
    }

    private kox m26851b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22591a = Integer.valueOf(nyt.f());
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
