package p000;

public final class lvl extends nyx<lvl> {
    public lor f26596a;
    public lwt f26597b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30743b(nyt);
    }

    public lvl() {
        m30744d();
    }

    private lvl m30744d() {
        this.f26596a = null;
        this.f26597b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26596a != null) {
            nyu.b(1, this.f26596a);
        }
        if (this.f26597b != null) {
            nyu.b(2, this.f26597b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26596a != null) {
            b += nyu.d(1, this.f26596a);
        }
        if (this.f26597b != null) {
            return b + nyu.d(2, this.f26597b);
        }
        return b;
    }

    private lvl m30743b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26596a == null) {
                        this.f26596a = new lor();
                    }
                    nyt.a(this.f26596a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26597b == null) {
                        this.f26597b = new lwt();
                    }
                    nyt.a(this.f26597b);
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
