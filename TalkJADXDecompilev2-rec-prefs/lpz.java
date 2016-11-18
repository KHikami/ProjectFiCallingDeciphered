package p000;

public final class lpz extends nyx<lpz> {
    public lor f26051a;
    public lpx f26052b;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29981b(nyt);
    }

    public lpz() {
        m29982d();
    }

    private lpz m29982d() {
        this.requestHeader = null;
        this.f26051a = null;
        this.f26052b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26051a != null) {
            nyu.b(2, this.f26051a);
        }
        if (this.f26052b != null) {
            nyu.b(3, this.f26052b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26051a != null) {
            b += nyu.d(2, this.f26051a);
        }
        if (this.f26052b != null) {
            return b + nyu.d(3, this.f26052b);
        }
        return b;
    }

    private lpz m29981b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26051a == null) {
                        this.f26051a = new lor();
                    }
                    nyt.a(this.f26051a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26052b == null) {
                        this.f26052b = new lpx();
                    }
                    nyt.a(this.f26052b);
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
