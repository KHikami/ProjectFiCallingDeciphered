package p000;

public final class lyv extends nyx<lyv> {
    public String f26958a;
    public lzj f26959b;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31204b(nyt);
    }

    public lyv() {
        m31205d();
    }

    private lyv m31205d() {
        this.requestHeader = null;
        this.f26958a = null;
        this.f26959b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26958a != null) {
            nyu.a(2, this.f26958a);
        }
        if (this.f26959b != null) {
            nyu.b(3, this.f26959b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26958a != null) {
            b += nyu.b(2, this.f26958a);
        }
        if (this.f26959b != null) {
            return b + nyu.d(3, this.f26959b);
        }
        return b;
    }

    private lyv m31204b(nyt nyt) {
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
                    this.f26958a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f26959b == null) {
                        this.f26959b = new lzj();
                    }
                    nyt.a(this.f26959b);
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
