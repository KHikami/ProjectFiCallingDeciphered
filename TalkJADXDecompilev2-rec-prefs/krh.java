package p000;

public final class krh extends nyx<krh> {
    public koz f22890a;
    public koz f22891b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27183b(nyt);
    }

    public krh() {
        m27184d();
    }

    private krh m27184d() {
        this.f22890a = null;
        this.f22891b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22890a != null) {
            nyu.b(1, this.f22890a);
        }
        if (this.f22891b != null) {
            nyu.b(2, this.f22891b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22890a != null) {
            b += nyu.d(1, this.f22890a);
        }
        if (this.f22891b != null) {
            return b + nyu.d(2, this.f22891b);
        }
        return b;
    }

    private krh m27183b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22890a == null) {
                        this.f22890a = new koz();
                    }
                    nyt.a(this.f22890a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22891b == null) {
                        this.f22891b = new koz();
                    }
                    nyt.a(this.f22891b);
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
