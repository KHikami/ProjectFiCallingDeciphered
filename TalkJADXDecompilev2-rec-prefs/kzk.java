package p000;

public final class kzk extends nyx<kzk> {
    public String f24247a;
    public String f24248b;
    public String f24249c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28237b(nyt);
    }

    public kzk() {
        this.f24247a = null;
        this.f24248b = null;
        this.f24249c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24247a != null) {
            nyu.a(1, this.f24247a);
        }
        if (this.f24248b != null) {
            nyu.a(2, this.f24248b);
        }
        if (this.f24249c != null) {
            nyu.a(3, this.f24249c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24247a != null) {
            b += nyu.b(1, this.f24247a);
        }
        if (this.f24248b != null) {
            b += nyu.b(2, this.f24248b);
        }
        if (this.f24249c != null) {
            return b + nyu.b(3, this.f24249c);
        }
        return b;
    }

    private kzk m28237b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24247a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24248b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24249c = nyt.j();
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
