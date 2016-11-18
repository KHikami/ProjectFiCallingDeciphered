package p000;

public final class kxm extends nyx<kxm> {
    public String f23855a;
    public String f23856b;
    public String f23857c;
    public String f23858d;
    public int f23859e;
    public int f23860f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27939b(nyt);
    }

    public kxm() {
        this.f23855a = null;
        this.f23856b = null;
        this.f23857c = null;
        this.f23858d = null;
        this.f23859e = nzf.UNSET_ENUM_VALUE;
        this.f23860f = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23855a != null) {
            nyu.a(1, this.f23855a);
        }
        if (this.f23856b != null) {
            nyu.a(2, this.f23856b);
        }
        if (this.f23857c != null) {
            nyu.a(3, this.f23857c);
        }
        if (this.f23858d != null) {
            nyu.a(4, this.f23858d);
        }
        if (this.f23859e != nzf.UNSET_ENUM_VALUE) {
            nyu.a(5, this.f23859e);
        }
        if (this.f23860f != nzf.UNSET_ENUM_VALUE) {
            nyu.a(6, this.f23860f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23855a != null) {
            b += nyu.b(1, this.f23855a);
        }
        if (this.f23856b != null) {
            b += nyu.b(2, this.f23856b);
        }
        if (this.f23857c != null) {
            b += nyu.b(3, this.f23857c);
        }
        if (this.f23858d != null) {
            b += nyu.b(4, this.f23858d);
        }
        if (this.f23859e != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(5, this.f23859e);
        }
        if (this.f23860f != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(6, this.f23860f);
        }
        return b;
    }

    private kxm m27939b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23855a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23856b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23857c = nyt.j();
                    continue;
                case 34:
                    this.f23858d = nyt.j();
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f23859e = a;
                            break;
                        default:
                            continue;
                    }
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f23860f = a;
                            break;
                        default:
                            continue;
                    }
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
