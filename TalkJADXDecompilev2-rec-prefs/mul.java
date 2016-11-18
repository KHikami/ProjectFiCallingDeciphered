package p000;

public final class mul extends nyx<mul> {
    public Integer f28371a;
    public Integer f28372b;
    public Integer f28373c;
    public Integer f28374d;
    public Integer f28375e;
    public Integer f28376f;
    public Integer f28377g;
    public Integer f28378h;
    public Integer f28379i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32962b(nyt);
    }

    public mul() {
        m32963d();
    }

    private mul m32963d() {
        this.f28371a = null;
        this.f28372b = null;
        this.f28373c = null;
        this.f28374d = null;
        this.f28376f = null;
        this.f28379i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28371a != null) {
            nyu.a(1, this.f28371a.intValue());
        }
        if (this.f28372b != null) {
            nyu.a(2, this.f28372b.intValue());
        }
        if (this.f28373c != null) {
            nyu.a(3, this.f28373c.intValue());
        }
        if (this.f28374d != null) {
            nyu.a(4, this.f28374d.intValue());
        }
        if (this.f28375e != null) {
            nyu.a(5, this.f28375e.intValue());
        }
        if (this.f28376f != null) {
            nyu.a(6, this.f28376f.intValue());
        }
        if (this.f28377g != null) {
            nyu.a(7, this.f28377g.intValue());
        }
        if (this.f28378h != null) {
            nyu.a(8, this.f28378h.intValue());
        }
        if (this.f28379i != null) {
            nyu.a(9, this.f28379i.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28371a != null) {
            b += nyu.f(1, this.f28371a.intValue());
        }
        if (this.f28372b != null) {
            b += nyu.f(2, this.f28372b.intValue());
        }
        if (this.f28373c != null) {
            b += nyu.f(3, this.f28373c.intValue());
        }
        if (this.f28374d != null) {
            b += nyu.f(4, this.f28374d.intValue());
        }
        if (this.f28375e != null) {
            b += nyu.f(5, this.f28375e.intValue());
        }
        if (this.f28376f != null) {
            b += nyu.f(6, this.f28376f.intValue());
        }
        if (this.f28377g != null) {
            b += nyu.f(7, this.f28377g.intValue());
        }
        if (this.f28378h != null) {
            b += nyu.f(8, this.f28378h.intValue());
        }
        if (this.f28379i != null) {
            return b + nyu.f(9, this.f28379i.intValue());
        }
        return b;
    }

    private mul m32962b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28371a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f28372b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f28373c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f28374d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f28375e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    this.f28376f = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f28377g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.f28378h = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 72:
                    this.f28379i = Integer.valueOf(nyt.f());
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
