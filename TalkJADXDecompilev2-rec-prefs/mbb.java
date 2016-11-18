package p000;

public final class mbb extends nyx<mbb> {
    public lzj f27198a;
    public Long f27199b;
    public String f27200c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31535b(nyt);
    }

    public mbb() {
        m31536d();
    }

    private mbb m31536d() {
        this.f27198a = null;
        this.f27199b = null;
        this.f27200c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27198a != null) {
            nyu.b(1, this.f27198a);
        }
        if (this.f27199b != null) {
            nyu.b(2, this.f27199b.longValue());
        }
        if (this.f27200c != null) {
            nyu.a(3, this.f27200c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27198a != null) {
            b += nyu.d(1, this.f27198a);
        }
        if (this.f27199b != null) {
            b += nyu.f(2, this.f27199b.longValue());
        }
        if (this.f27200c != null) {
            return b + nyu.b(3, this.f27200c);
        }
        return b;
    }

    private mbb m31535b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27198a == null) {
                        this.f27198a = new lzj();
                    }
                    nyt.a(this.f27198a);
                    continue;
                case 16:
                    this.f27199b = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    this.f27200c = nyt.j();
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
