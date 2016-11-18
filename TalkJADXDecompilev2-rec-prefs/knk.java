package p000;

public final class knk extends nyx<knk> {
    public knu f22424a;
    public kmu apiHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26673b(nyt);
    }

    public knk() {
        m26674d();
    }

    private knk m26674d() {
        this.apiHeader = null;
        this.f22424a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.apiHeader != null) {
            nyu.b(1, this.apiHeader);
        }
        if (this.f22424a != null) {
            nyu.b(2, this.f22424a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.apiHeader != null) {
            b += nyu.d(1, this.apiHeader);
        }
        if (this.f22424a != null) {
            return b + nyu.d(2, this.f22424a);
        }
        return b;
    }

    private knk m26673b(nyt nyt) {
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
                    if (this.f22424a == null) {
                        this.f22424a = new knu();
                    }
                    nyt.a(this.f22424a);
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
