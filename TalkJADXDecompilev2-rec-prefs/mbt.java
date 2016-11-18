package p000;

public final class mbt extends nyx<mbt> {
    public mbq f27270a;
    public lzj f27271b;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31629b(nyt);
    }

    public mbt() {
        m31630d();
    }

    private mbt m31630d() {
        this.requestHeader = null;
        this.f27270a = null;
        this.f27271b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f27270a != null) {
            nyu.b(2, this.f27270a);
        }
        if (this.f27271b != null) {
            nyu.b(3, this.f27271b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f27270a != null) {
            b += nyu.d(2, this.f27270a);
        }
        if (this.f27271b != null) {
            return b + nyu.d(3, this.f27271b);
        }
        return b;
    }

    private mbt m31629b(nyt nyt) {
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
                    if (this.f27270a == null) {
                        this.f27270a = new mbq();
                    }
                    nyt.a(this.f27270a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f27271b == null) {
                        this.f27271b = new lzj();
                    }
                    nyt.a(this.f27271b);
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
