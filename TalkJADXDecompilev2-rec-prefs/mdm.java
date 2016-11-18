package p000;

public final class mdm extends nyx<mdm> {
    public String f27478a;
    public String f27479b;
    public String f27480c;
    public Integer f27481d;
    public Long f27482e;
    public Boolean f27483f;
    public String f27484g;
    public Integer f27485h;
    public Boolean f27486i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31863b(nyt);
    }

    public mdm() {
        m31864d();
    }

    private mdm m31864d() {
        this.f27478a = null;
        this.f27479b = null;
        this.f27480c = null;
        this.f27482e = null;
        this.f27483f = null;
        this.f27484g = null;
        this.f27486i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27478a != null) {
            nyu.a(1, this.f27478a);
        }
        if (this.f27479b != null) {
            nyu.a(2, this.f27479b);
        }
        if (this.f27480c != null) {
            nyu.a(3, this.f27480c);
        }
        if (this.f27481d != null) {
            nyu.a(4, this.f27481d.intValue());
        }
        if (this.f27482e != null) {
            nyu.b(5, this.f27482e.longValue());
        }
        if (this.f27483f != null) {
            nyu.a(6, this.f27483f.booleanValue());
        }
        if (this.f27484g != null) {
            nyu.a(7, this.f27484g);
        }
        if (this.f27485h != null) {
            nyu.a(8, this.f27485h.intValue());
        }
        if (this.f27486i != null) {
            nyu.a(9, this.f27486i.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27478a != null) {
            b += nyu.b(1, this.f27478a);
        }
        if (this.f27479b != null) {
            b += nyu.b(2, this.f27479b);
        }
        if (this.f27480c != null) {
            b += nyu.b(3, this.f27480c);
        }
        if (this.f27481d != null) {
            b += nyu.f(4, this.f27481d.intValue());
        }
        if (this.f27482e != null) {
            b += nyu.f(5, this.f27482e.longValue());
        }
        if (this.f27483f != null) {
            this.f27483f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f27484g != null) {
            b += nyu.b(7, this.f27484g);
        }
        if (this.f27485h != null) {
            b += nyu.f(8, this.f27485h.intValue());
        }
        if (this.f27486i == null) {
            return b;
        }
        this.f27486i.booleanValue();
        return b + (nyu.h(9) + 1);
    }

    private mdm m31863b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27478a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f27479b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f27480c = nyt.j();
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f27481d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    this.f27482e = Long.valueOf(nyt.e());
                    continue;
                case 48:
                    this.f27483f = Boolean.valueOf(nyt.i());
                    continue;
                case 58:
                    this.f27484g = nyt.j();
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f27485h = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 72:
                    this.f27486i = Boolean.valueOf(nyt.i());
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
