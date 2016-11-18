package p000;

public final class knc extends nyx<knc> {
    public krr f22416a;
    public kmu apiHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26633b(nyt);
    }

    public knc() {
        m26634d();
    }

    private knc m26634d() {
        this.apiHeader = null;
        this.f22416a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.apiHeader != null) {
            nyu.b(1, this.apiHeader);
        }
        if (this.f22416a != null) {
            nyu.b(2, this.f22416a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.apiHeader != null) {
            b += nyu.d(1, this.apiHeader);
        }
        if (this.f22416a != null) {
            return b + nyu.d(2, this.f22416a);
        }
        return b;
    }

    private knc m26633b(nyt nyt) {
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
                    if (this.f22416a == null) {
                        this.f22416a = new krr();
                    }
                    nyt.a(this.f22416a);
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
