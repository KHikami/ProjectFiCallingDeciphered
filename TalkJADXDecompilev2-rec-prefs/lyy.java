package p000;

public final class lyy extends nyx<lyy> {
    public lyh f26965a;
    public lzj f26966b;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31219b(nyt);
    }

    public lyy() {
        m31220d();
    }

    private lyy m31220d() {
        this.responseHeader = null;
        this.f26965a = null;
        this.f26966b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26965a != null) {
            nyu.b(2, this.f26965a);
        }
        if (this.f26966b != null) {
            nyu.b(3, this.f26966b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26965a != null) {
            b += nyu.d(2, this.f26965a);
        }
        if (this.f26966b != null) {
            return b + nyu.d(3, this.f26966b);
        }
        return b;
    }

    private lyy m31219b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26965a == null) {
                        this.f26965a = new lyh();
                    }
                    nyt.a(this.f26965a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26966b == null) {
                        this.f26966b = new lzj();
                    }
                    nyt.a(this.f26966b);
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
