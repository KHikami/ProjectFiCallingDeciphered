package p000;

public final class koi extends nyx<koi> {
    public Integer f22527a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26787b(nyt);
    }

    public koi() {
        this.f22527a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22527a != null) {
            nyu.a(1, this.f22527a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22527a != null) {
            return b + nyu.f(1, this.f22527a.intValue());
        }
        return b;
    }

    private koi m26787b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22527a = Integer.valueOf(nyt.f());
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
