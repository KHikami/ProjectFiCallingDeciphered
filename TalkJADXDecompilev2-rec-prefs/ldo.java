package p000;

public final class ldo extends nyx<ldo> {
    public String f24692a;
    public String f24693b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28762b(nyt);
    }

    public ldo() {
        this.f24692a = null;
        this.f24693b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24692a != null) {
            nyu.a(1, this.f24692a);
        }
        if (this.f24693b != null) {
            nyu.a(2, this.f24693b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24692a != null) {
            b += nyu.b(1, this.f24692a);
        }
        if (this.f24693b != null) {
            return b + nyu.b(2, this.f24693b);
        }
        return b;
    }

    private ldo m28762b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24692a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24693b = nyt.j();
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
