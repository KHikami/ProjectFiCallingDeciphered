package p000;

public final class muv extends nyx<muv> {
    public String f28413a;
    public String f28414b;
    public Integer f28415c;
    public String f28416d;
    public Boolean f28417e;
    public Integer f28418f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33015b(nyt);
    }

    public muv() {
        m33016d();
    }

    private muv m33016d() {
        this.f28413a = null;
        this.f28414b = null;
        this.f28415c = null;
        this.f28416d = null;
        this.f28417e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28413a != null) {
            nyu.a(1, this.f28413a);
        }
        if (this.f28414b != null) {
            nyu.a(2, this.f28414b);
        }
        if (this.f28415c != null) {
            nyu.a(3, this.f28415c.intValue());
        }
        if (this.f28416d != null) {
            nyu.a(4, this.f28416d);
        }
        if (this.f28417e != null) {
            nyu.a(5, this.f28417e.booleanValue());
        }
        if (this.f28418f != null) {
            nyu.a(6, this.f28418f.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28413a != null) {
            b += nyu.b(1, this.f28413a);
        }
        if (this.f28414b != null) {
            b += nyu.b(2, this.f28414b);
        }
        if (this.f28415c != null) {
            b += nyu.f(3, this.f28415c.intValue());
        }
        if (this.f28416d != null) {
            b += nyu.b(4, this.f28416d);
        }
        if (this.f28417e != null) {
            this.f28417e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f28418f != null) {
            return b + nyu.f(6, this.f28418f.intValue());
        }
        return b;
    }

    private muv m33015b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28413a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f28414b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f28415c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f28416d = nyt.j();
                    continue;
                case 40:
                    this.f28417e = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 99:
                            this.f28418f = Integer.valueOf(a);
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
