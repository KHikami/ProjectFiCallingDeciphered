package p000;

public final class kmv extends nyx<kmv> {
    public ley f22407a;
    public kmt apiHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26595b(nyt);
    }

    public kmv() {
        m26596d();
    }

    private kmv m26596d() {
        this.apiHeader = null;
        this.f22407a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.apiHeader != null) {
            nyu.b(1, this.apiHeader);
        }
        if (this.f22407a != null) {
            nyu.b(2, this.f22407a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.apiHeader != null) {
            b += nyu.d(1, this.apiHeader);
        }
        if (this.f22407a != null) {
            return b + nyu.d(2, this.f22407a);
        }
        return b;
    }

    private kmv m26595b(nyt nyt) {
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
                    if (this.f22407a == null) {
                        this.f22407a = new ley();
                    }
                    nyt.a(this.f22407a);
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
