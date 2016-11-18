package p000;

public final class lah extends nyx<lah> {
    public String f24352a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28348b(nyt);
    }

    public lah() {
        this.f24352a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24352a != null) {
            nyu.a(1, this.f24352a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24352a != null) {
            return b + nyu.b(1, this.f24352a);
        }
        return b;
    }

    private lah m28348b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24352a = nyt.j();
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
