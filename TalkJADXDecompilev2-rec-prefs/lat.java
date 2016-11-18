package p000;

public final class lat extends nyx<lat> {
    public String f24417a;
    public String f24418b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28405b(nyt);
    }

    public lat() {
        this.f24417a = null;
        this.f24418b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24417a != null) {
            nyu.a(1, this.f24417a);
        }
        if (this.f24418b != null) {
            nyu.a(2, this.f24418b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24417a != null) {
            b += nyu.b(1, this.f24417a);
        }
        if (this.f24418b != null) {
            return b + nyu.b(2, this.f24418b);
        }
        return b;
    }

    private lat m28405b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24417a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24418b = nyt.j();
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
