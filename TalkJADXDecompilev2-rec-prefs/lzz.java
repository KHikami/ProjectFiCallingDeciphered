package p000;

public final class lzz extends nyx<lzz> {
    public String f27075a;
    public mav f27076b;
    public lzj f27077c;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31368b(nyt);
    }

    public lzz() {
        m31369d();
    }

    private lzz m31369d() {
        this.requestHeader = null;
        this.f27075a = null;
        this.f27076b = null;
        this.f27077c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f27075a != null) {
            nyu.a(2, this.f27075a);
        }
        if (this.f27076b != null) {
            nyu.b(3, this.f27076b);
        }
        if (this.f27077c != null) {
            nyu.b(4, this.f27077c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f27075a != null) {
            b += nyu.b(2, this.f27075a);
        }
        if (this.f27076b != null) {
            b += nyu.d(3, this.f27076b);
        }
        if (this.f27077c != null) {
            return b + nyu.d(4, this.f27077c);
        }
        return b;
    }

    private lzz m31368b(nyt nyt) {
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
                    this.f27075a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f27076b == null) {
                        this.f27076b = new mav();
                    }
                    nyt.a(this.f27076b);
                    continue;
                case 34:
                    if (this.f27077c == null) {
                        this.f27077c = new lzj();
                    }
                    nyt.a(this.f27077c);
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
