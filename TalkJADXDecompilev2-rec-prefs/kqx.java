package p000;

public final class kqx extends nyx<kqx> {
    public kqd f22827a;
    public String f22828b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27126b(nyt);
    }

    public kqx() {
        m27127d();
    }

    private kqx m27127d() {
        this.f22827a = null;
        this.f22828b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22827a != null) {
            nyu.b(1, this.f22827a);
        }
        if (this.f22828b != null) {
            nyu.a(2, this.f22828b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22827a != null) {
            b += nyu.d(1, this.f22827a);
        }
        if (this.f22828b != null) {
            return b + nyu.b(2, this.f22828b);
        }
        return b;
    }

    private kqx m27126b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22827a == null) {
                        this.f22827a = new kqd();
                    }
                    nyt.a(this.f22827a);
                    continue;
                case wi.dH /*18*/:
                    this.f22828b = nyt.j();
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
