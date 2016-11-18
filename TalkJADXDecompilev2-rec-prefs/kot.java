package p000;

public final class kot extends nyx<kot> {
    public Integer f22577a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26833b(nyt);
    }

    public kot() {
        this.f22577a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22577a != null) {
            nyu.a(1, this.f22577a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22577a != null) {
            return b + nyu.f(1, this.f22577a.intValue());
        }
        return b;
    }

    private kot m26833b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22577a = Integer.valueOf(nyt.f());
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
