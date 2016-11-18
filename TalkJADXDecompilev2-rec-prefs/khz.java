package p000;

public final class khz extends nyx<khz> {
    public String f21809a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25922b(nyt);
    }

    public khz() {
        this.f21809a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21809a != null) {
            nyu.a(1, this.f21809a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21809a != null) {
            return b + nyu.b(1, this.f21809a);
        }
        return b;
    }

    private khz m25922b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21809a = nyt.j();
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
