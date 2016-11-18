package p000;

public final class knh extends nyx<knh> {
    public nmh f22421a;
    public kmt apiHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26658b(nyt);
    }

    public knh() {
        m26659d();
    }

    private knh m26659d() {
        this.apiHeader = null;
        this.f22421a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.apiHeader != null) {
            nyu.b(1, this.apiHeader);
        }
        if (this.f22421a != null) {
            nyu.b(2, this.f22421a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.apiHeader != null) {
            b += nyu.d(1, this.apiHeader);
        }
        if (this.f22421a != null) {
            return b + nyu.d(2, this.f22421a);
        }
        return b;
    }

    private knh m26658b(nyt nyt) {
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
                    if (this.f22421a == null) {
                        this.f22421a = new nmh();
                    }
                    nyt.a(this.f22421a);
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
