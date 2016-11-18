package p000;

public final class lyx extends nyx<lyx> {
    public String f26963a;
    public lzj f26964b;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31214b(nyt);
    }

    public lyx() {
        m31215d();
    }

    private lyx m31215d() {
        this.requestHeader = null;
        this.f26963a = null;
        this.f26964b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26963a != null) {
            nyu.a(2, this.f26963a);
        }
        if (this.f26964b != null) {
            nyu.b(3, this.f26964b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26963a != null) {
            b += nyu.b(2, this.f26963a);
        }
        if (this.f26964b != null) {
            return b + nyu.d(3, this.f26964b);
        }
        return b;
    }

    private lyx m31214b(nyt nyt) {
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
                    this.f26963a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f26964b == null) {
                        this.f26964b = new lzj();
                    }
                    nyt.a(this.f26964b);
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
