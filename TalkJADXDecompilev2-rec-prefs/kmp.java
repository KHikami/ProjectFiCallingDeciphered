package p000;

public final class kmp extends nyx<kmp> {
    public String f22379a;
    public String f22380b;
    public Integer f22381c;
    public String f22382d;
    public Boolean f22383e;
    public Integer f22384f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26567b(nyt);
    }

    public kmp() {
        m26568d();
    }

    private kmp m26568d() {
        this.f22379a = null;
        this.f22380b = null;
        this.f22381c = null;
        this.f22382d = null;
        this.f22383e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22379a != null) {
            nyu.a(1, this.f22379a);
        }
        if (this.f22380b != null) {
            nyu.a(2, this.f22380b);
        }
        if (this.f22381c != null) {
            nyu.a(3, this.f22381c.intValue());
        }
        if (this.f22382d != null) {
            nyu.a(4, this.f22382d);
        }
        if (this.f22383e != null) {
            nyu.a(5, this.f22383e.booleanValue());
        }
        if (this.f22384f != null) {
            nyu.a(6, this.f22384f.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22379a != null) {
            b += nyu.b(1, this.f22379a);
        }
        if (this.f22380b != null) {
            b += nyu.b(2, this.f22380b);
        }
        if (this.f22381c != null) {
            b += nyu.f(3, this.f22381c.intValue());
        }
        if (this.f22382d != null) {
            b += nyu.b(4, this.f22382d);
        }
        if (this.f22383e != null) {
            this.f22383e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f22384f != null) {
            return b + nyu.f(6, this.f22384f.intValue());
        }
        return b;
    }

    private kmp m26567b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22379a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22380b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f22381c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f22382d = nyt.j();
                    continue;
                case 40:
                    this.f22383e = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 99:
                            this.f22384f = Integer.valueOf(a);
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
