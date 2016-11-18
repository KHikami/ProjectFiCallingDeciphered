package p000;

public final class mup extends nyx<mup> {
    public Integer f28394a;
    public String f28395b;
    public Long f28396c;
    public Long f28397d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32983b(nyt);
    }

    public mup() {
        m32984d();
    }

    private mup m32984d() {
        this.f28395b = null;
        this.f28396c = null;
        this.f28397d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28394a != null) {
            nyu.a(1, this.f28394a.intValue());
        }
        if (this.f28395b != null) {
            nyu.a(2, this.f28395b);
        }
        if (this.f28396c != null) {
            nyu.b(3, this.f28396c.longValue());
        }
        if (this.f28397d != null) {
            nyu.b(4, this.f28397d.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28394a != null) {
            b += nyu.f(1, this.f28394a.intValue());
        }
        if (this.f28395b != null) {
            b += nyu.b(2, this.f28395b);
        }
        if (this.f28396c != null) {
            b += nyu.f(3, this.f28396c.longValue());
        }
        if (this.f28397d != null) {
            return b + nyu.f(4, this.f28397d.longValue());
        }
        return b;
    }

    private mup m32983b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f28394a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f28395b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f28396c = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    this.f28397d = Long.valueOf(nyt.e());
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
