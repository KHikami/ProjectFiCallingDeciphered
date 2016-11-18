package p000;

public final class lva extends nyx<lva> {
    public ltn f26572a;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30688b(nyt);
    }

    public lva() {
        m30689d();
    }

    private lva m30689d() {
        this.requestHeader = null;
        this.f26572a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26572a != null) {
            nyu.b(2, this.f26572a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26572a != null) {
            return b + nyu.d(2, this.f26572a);
        }
        return b;
    }

    private lva m30688b(nyt nyt) {
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
                    if (this.f26572a == null) {
                        this.f26572a = new ltn();
                    }
                    nyt.a(this.f26572a);
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
