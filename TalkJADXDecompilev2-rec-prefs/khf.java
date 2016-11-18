package p000;

public final class khf extends nyx<khf> {
    public Long f21739a;
    public String f21740b;
    public Integer f21741c;
    public String f21742d;
    public Boolean f21743e;
    public String f21744f;
    public String f21745g;
    public Boolean f21746h;
    public Boolean f21747i;
    public Boolean f21748j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25822b(nyt);
    }

    public khf() {
        m25823d();
    }

    private khf m25823d() {
        this.f21739a = null;
        this.f21740b = null;
        this.f21742d = null;
        this.f21743e = null;
        this.f21744f = null;
        this.f21745g = null;
        this.f21746h = null;
        this.f21747i = null;
        this.f21748j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.b(1, this.f21739a.longValue());
        nyu.a(2, this.f21740b);
        if (this.f21741c != null) {
            nyu.a(3, this.f21741c.intValue());
        }
        if (this.f21742d != null) {
            nyu.a(4, this.f21742d);
        }
        if (this.f21743e != null) {
            nyu.a(5, this.f21743e.booleanValue());
        }
        if (this.f21744f != null) {
            nyu.a(6, this.f21744f);
        }
        if (this.f21745g != null) {
            nyu.a(7, this.f21745g);
        }
        if (this.f21746h != null) {
            nyu.a(8, this.f21746h.booleanValue());
        }
        if (this.f21747i != null) {
            nyu.a(9, this.f21747i.booleanValue());
        }
        if (this.f21748j != null) {
            nyu.a(10, this.f21748j.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.f(1, this.f21739a.longValue())) + nyu.b(2, this.f21740b);
        if (this.f21741c != null) {
            b += nyu.f(3, this.f21741c.intValue());
        }
        if (this.f21742d != null) {
            b += nyu.b(4, this.f21742d);
        }
        if (this.f21743e != null) {
            this.f21743e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f21744f != null) {
            b += nyu.b(6, this.f21744f);
        }
        if (this.f21745g != null) {
            b += nyu.b(7, this.f21745g);
        }
        if (this.f21746h != null) {
            this.f21746h.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.f21747i != null) {
            this.f21747i.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.f21748j == null) {
            return b;
        }
        this.f21748j.booleanValue();
        return b + (nyu.h(10) + 1);
    }

    private khf m25822b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f21739a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    this.f21740b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f21741c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.f21742d = nyt.j();
                    continue;
                case 40:
                    this.f21743e = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    this.f21744f = nyt.j();
                    continue;
                case 58:
                    this.f21745g = nyt.j();
                    continue;
                case 64:
                    this.f21746h = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    this.f21747i = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    this.f21748j = Boolean.valueOf(nyt.i());
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
