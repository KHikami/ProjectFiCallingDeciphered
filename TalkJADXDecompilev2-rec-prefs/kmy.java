package p000;

public final class kmy extends nyx<kmy> {
    public knt f22410a;
    public kmu apiHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26610b(nyt);
    }

    public kmy() {
        m26611d();
    }

    private kmy m26611d() {
        this.apiHeader = null;
        this.f22410a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.apiHeader != null) {
            nyu.b(1, this.apiHeader);
        }
        if (this.f22410a != null) {
            nyu.b(2, this.f22410a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.apiHeader != null) {
            b += nyu.d(1, this.apiHeader);
        }
        if (this.f22410a != null) {
            return b + nyu.d(2, this.f22410a);
        }
        return b;
    }

    private kmy m26610b(nyt nyt) {
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
                    if (this.f22410a == null) {
                        this.f22410a = new knt();
                    }
                    nyt.a(this.f22410a);
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
