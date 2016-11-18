package p000;

public final class kvu extends nyx<kvu> {
    public String f23678a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27736b(nyt);
    }

    public kvu() {
        this.f23678a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23678a != null) {
            nyu.a(1, this.f23678a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23678a != null) {
            return b + nyu.b(1, this.f23678a);
        }
        return b;
    }

    private kvu m27736b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23678a = nyt.j();
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
