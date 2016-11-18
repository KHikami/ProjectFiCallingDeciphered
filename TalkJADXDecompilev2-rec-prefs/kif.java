package p000;

public final class kif extends nyx<kif> {
    public String f21837a;
    public Integer f21838b;
    public kig f21839c;
    public String f21840d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25950b(nyt);
    }

    public kif() {
        m25951d();
    }

    private kif m25951d() {
        this.f21837a = null;
        this.f21839c = null;
        this.f21840d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21837a != null) {
            nyu.a(1, this.f21837a);
        }
        if (this.f21838b != null) {
            nyu.a(2, this.f21838b.intValue());
        }
        if (this.f21839c != null) {
            nyu.b(3, this.f21839c);
        }
        if (this.f21840d != null) {
            nyu.a(4, this.f21840d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21837a != null) {
            b += nyu.b(1, this.f21837a);
        }
        if (this.f21838b != null) {
            b += nyu.f(2, this.f21838b.intValue());
        }
        if (this.f21839c != null) {
            b += nyu.d(3, this.f21839c);
        }
        if (this.f21840d != null) {
            return b + nyu.b(4, this.f21840d);
        }
        return b;
    }

    private kif m25950b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21837a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f21838b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f21839c == null) {
                        this.f21839c = new kig();
                    }
                    nyt.a(this.f21839c);
                    continue;
                case 34:
                    this.f21840d = nyt.j();
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
