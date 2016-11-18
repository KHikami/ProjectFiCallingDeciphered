package p000;

public final class lpy extends nyx<lpy> {
    public ltr f26048a;
    public lor f26049b;
    public lpx f26050c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29976b(nyt);
    }

    public lpy() {
        m29977d();
    }

    private lpy m29977d() {
        this.f26048a = null;
        this.f26049b = null;
        this.f26050c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26048a != null) {
            nyu.b(1, this.f26048a);
        }
        if (this.f26049b != null) {
            nyu.b(2, this.f26049b);
        }
        if (this.f26050c != null) {
            nyu.b(3, this.f26050c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26048a != null) {
            b += nyu.d(1, this.f26048a);
        }
        if (this.f26049b != null) {
            b += nyu.d(2, this.f26049b);
        }
        if (this.f26050c != null) {
            return b + nyu.d(3, this.f26050c);
        }
        return b;
    }

    private lpy m29976b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26048a == null) {
                        this.f26048a = new ltr();
                    }
                    nyt.a(this.f26048a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26049b == null) {
                        this.f26049b = new lor();
                    }
                    nyt.a(this.f26049b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26050c == null) {
                        this.f26050c = new lpx();
                    }
                    nyt.a(this.f26050c);
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
