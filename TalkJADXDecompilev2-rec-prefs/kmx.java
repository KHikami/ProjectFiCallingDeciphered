package p000;

public final class kmx extends nyx<kmx> {
    public knr f22409a;
    public kmt apiHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26605b(nyt);
    }

    public kmx() {
        m26606d();
    }

    private kmx m26606d() {
        this.apiHeader = null;
        this.f22409a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.apiHeader != null) {
            nyu.b(1, this.apiHeader);
        }
        if (this.f22409a != null) {
            nyu.b(2, this.f22409a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.apiHeader != null) {
            b += nyu.d(1, this.apiHeader);
        }
        if (this.f22409a != null) {
            return b + nyu.d(2, this.f22409a);
        }
        return b;
    }

    private kmx m26605b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.apiHeader == null) {
                        this.apiHeader = new kmt();
                    }
                    nyt.a(this.apiHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22409a == null) {
                        this.f22409a = new knr();
                    }
                    nyt.a(this.f22409a);
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
