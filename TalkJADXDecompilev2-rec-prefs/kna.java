package p000;

public final class kna extends nyx<kna> {
    public kov f22414a;
    public kmu apiHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26623b(nyt);
    }

    public kna() {
        m26624d();
    }

    private kna m26624d() {
        this.apiHeader = null;
        this.f22414a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.apiHeader != null) {
            nyu.b(1, this.apiHeader);
        }
        if (this.f22414a != null) {
            nyu.b(2, this.f22414a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.apiHeader != null) {
            b += nyu.d(1, this.apiHeader);
        }
        if (this.f22414a != null) {
            return b + nyu.d(2, this.f22414a);
        }
        return b;
    }

    private kna m26623b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.apiHeader == null) {
                        this.apiHeader = new kmu();
                    }
                    nyt.a(this.apiHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22414a == null) {
                        this.f22414a = new kov();
                    }
                    nyt.a(this.f22414a);
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
