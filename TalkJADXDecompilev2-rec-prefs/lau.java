package p000;

public final class lau extends nyx<lau> {
    public String f24419a;
    public String f24420b;
    public String f24421c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28409b(nyt);
    }

    public lau() {
        m28410d();
    }

    private lau m28410d() {
        this.f24419a = null;
        this.f24420b = null;
        this.f24421c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24419a != null) {
            nyu.a(1, this.f24419a);
        }
        if (this.f24420b != null) {
            nyu.a(2, this.f24420b);
        }
        if (this.f24421c != null) {
            nyu.a(3, this.f24421c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24419a != null) {
            b += nyu.b(1, this.f24419a);
        }
        if (this.f24420b != null) {
            b += nyu.b(2, this.f24420b);
        }
        if (this.f24421c != null) {
            return b + nyu.b(3, this.f24421c);
        }
        return b;
    }

    private lau m28409b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24419a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24420b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24421c = nyt.j();
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
