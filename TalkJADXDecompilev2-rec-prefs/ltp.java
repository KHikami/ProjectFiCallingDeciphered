package p000;

public final class ltp extends nyx<ltp> {
    public lor f26395a;
    public lqg f26396b;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30481b(nyt);
    }

    public ltp() {
        m30482d();
    }

    private ltp m30482d() {
        this.responseHeader = null;
        this.f26395a = null;
        this.f26396b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26395a != null) {
            nyu.b(2, this.f26395a);
        }
        if (this.f26396b != null) {
            nyu.b(3, this.f26396b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26395a != null) {
            b += nyu.d(2, this.f26395a);
        }
        if (this.f26396b != null) {
            return b + nyu.d(3, this.f26396b);
        }
        return b;
    }

    private ltp m30481b(nyt nyt) {
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
                    if (this.f26395a == null) {
                        this.f26395a = new lor();
                    }
                    nyt.a(this.f26395a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26396b == null) {
                        this.f26396b = new lqg();
                    }
                    nyt.a(this.f26396b);
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
