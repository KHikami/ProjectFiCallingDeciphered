package p000;

public final class lvq extends nyx<lvq> {
    public lqg f26610a;
    public lom f26611b;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30768b(nyt);
    }

    public lvq() {
        m30769d();
    }

    private lvq m30769d() {
        this.responseHeader = null;
        this.f26610a = null;
        this.f26611b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26610a != null) {
            nyu.b(2, this.f26610a);
        }
        if (this.f26611b != null) {
            nyu.b(3, this.f26611b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26610a != null) {
            b += nyu.d(2, this.f26610a);
        }
        if (this.f26611b != null) {
            return b + nyu.d(3, this.f26611b);
        }
        return b;
    }

    private lvq m30768b(nyt nyt) {
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
                    if (this.f26610a == null) {
                        this.f26610a = new lqg();
                    }
                    nyt.a(this.f26610a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26611b == null) {
                        this.f26611b = new lom();
                    }
                    nyt.a(this.f26611b);
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
