package p000;

public final class krn extends nyx<krn> {
    public String f22915a;
    public kro f22916b;
    public int f22917c;
    public krm f22918d;
    public Integer f22919e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27212b(nyt);
    }

    public krn() {
        this.f22915a = null;
        this.f22917c = nzf.UNSET_ENUM_VALUE;
        this.f22919e = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22915a != null) {
            nyu.a(1, this.f22915a);
        }
        if (this.f22916b != null) {
            nyu.b(2, this.f22916b);
        }
        if (this.f22917c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(3, this.f22917c);
        }
        if (this.f22918d != null) {
            nyu.b(4, this.f22918d);
        }
        if (this.f22919e != null) {
            nyu.a(5, this.f22919e.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22915a != null) {
            b += nyu.b(1, this.f22915a);
        }
        if (this.f22916b != null) {
            b += nyu.d(2, this.f22916b);
        }
        if (this.f22917c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(3, this.f22917c);
        }
        if (this.f22918d != null) {
            b += nyu.d(4, this.f22918d);
        }
        if (this.f22919e != null) {
            return b + nyu.f(5, this.f22919e.intValue());
        }
        return b;
    }

    private krn m27212b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22915a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f22916b == null) {
                        this.f22916b = new kro();
                    }
                    nyt.a(this.f22916b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f22917c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f22918d == null) {
                        this.f22918d = new krm();
                    }
                    nyt.a(this.f22918d);
                    continue;
                case 40:
                    this.f22919e = Integer.valueOf(nyt.f());
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
