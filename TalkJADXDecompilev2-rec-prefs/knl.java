package p000;

public final class knl extends nyx<knl> {
    public kop f22425a;
    public kmt apiHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26678b(nyt);
    }

    public knl() {
        m26679d();
    }

    private knl m26679d() {
        this.apiHeader = null;
        this.f22425a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.apiHeader != null) {
            nyu.b(1, this.apiHeader);
        }
        if (this.f22425a != null) {
            nyu.b(2, this.f22425a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.apiHeader != null) {
            b += nyu.d(1, this.apiHeader);
        }
        if (this.f22425a != null) {
            return b + nyu.d(2, this.f22425a);
        }
        return b;
    }

    private knl m26678b(nyt nyt) {
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
                    if (this.f22425a == null) {
                        this.f22425a = new kop();
                    }
                    nyt.a(this.f22425a);
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
