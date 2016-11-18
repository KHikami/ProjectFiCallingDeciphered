package p000;

public final class lpx extends nyx<lpx> {
    public String f26044a;
    public String f26045b;
    public Integer f26046c;
    public lns f26047d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29971b(nyt);
    }

    public lpx() {
        m29972d();
    }

    private lpx m29972d() {
        this.f26044a = null;
        this.f26045b = null;
        this.f26047d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26044a != null) {
            nyu.a(1, this.f26044a);
        }
        if (this.f26045b != null) {
            nyu.a(2, this.f26045b);
        }
        if (this.f26046c != null) {
            nyu.a(3, this.f26046c.intValue());
        }
        if (this.f26047d != null) {
            nyu.b(4, this.f26047d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26044a != null) {
            b += nyu.b(1, this.f26044a);
        }
        if (this.f26045b != null) {
            b += nyu.b(2, this.f26045b);
        }
        if (this.f26046c != null) {
            b += nyu.f(3, this.f26046c.intValue());
        }
        if (this.f26047d != null) {
            return b + nyu.d(4, this.f26047d);
        }
        return b;
    }

    private lpx m29971b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26044a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26045b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26046c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f26047d == null) {
                        this.f26047d = new lns();
                    }
                    nyt.a(this.f26047d);
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
