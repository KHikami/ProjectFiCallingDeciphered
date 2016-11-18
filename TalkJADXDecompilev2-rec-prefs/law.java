package p000;

public final class law extends nyx<law> {
    public String f24425a;
    public lax f24426b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28418b(nyt);
    }

    public law() {
        this.f24425a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24425a != null) {
            nyu.a(1, this.f24425a);
        }
        if (this.f24426b != null) {
            nyu.b(2, this.f24426b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24425a != null) {
            b += nyu.b(1, this.f24425a);
        }
        if (this.f24426b != null) {
            return b + nyu.d(2, this.f24426b);
        }
        return b;
    }

    private law m28418b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24425a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f24426b == null) {
                        this.f24426b = new lax();
                    }
                    nyt.a(this.f24426b);
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
