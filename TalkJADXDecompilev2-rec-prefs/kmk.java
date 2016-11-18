package p000;

public final class kmk extends nyx<kmk> {
    public Boolean f22361a;
    public Boolean f22362b;
    public Boolean f22363c;
    public Integer f22364d;
    public Integer f22365e;
    public Integer f22366f;
    public Boolean f22367g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26542b(nyt);
    }

    public kmk() {
        m26543d();
    }

    private kmk m26543d() {
        this.f22361a = null;
        this.f22362b = null;
        this.f22363c = null;
        this.f22367g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22361a != null) {
            nyu.a(1, this.f22361a.booleanValue());
        }
        if (this.f22362b != null) {
            nyu.a(2, this.f22362b.booleanValue());
        }
        if (this.f22363c != null) {
            nyu.a(3, this.f22363c.booleanValue());
        }
        if (this.f22364d != null) {
            nyu.a(5, this.f22364d.intValue());
        }
        if (this.f22365e != null) {
            nyu.a(6, this.f22365e.intValue());
        }
        if (this.f22366f != null) {
            nyu.a(7, this.f22366f.intValue());
        }
        if (this.f22367g != null) {
            nyu.a(8, this.f22367g.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22361a != null) {
            this.f22361a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f22362b != null) {
            this.f22362b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f22363c != null) {
            this.f22363c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f22364d != null) {
            b += nyu.f(5, this.f22364d.intValue());
        }
        if (this.f22365e != null) {
            b += nyu.f(6, this.f22365e.intValue());
        }
        if (this.f22366f != null) {
            b += nyu.f(7, this.f22366f.intValue());
        }
        if (this.f22367g == null) {
            return b;
        }
        this.f22367g.booleanValue();
        return b + (nyu.h(8) + 1);
    }

    private kmk m26542b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22361a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f22362b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f22363c = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22364d = Integer.valueOf(a);
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
                        case 3:
                            this.f22365e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f22366f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 64:
                    this.f22367g = Boolean.valueOf(nyt.i());
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
