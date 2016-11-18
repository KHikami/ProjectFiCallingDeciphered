package p000;

public final class kpu extends nyx<kpu> {
    public kqd f22697a;
    public Long f22698b;
    public Long f22699c;
    public Integer f22700d;
    public Boolean f22701e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26974b(nyt);
    }

    public kpu() {
        m26975d();
    }

    private kpu m26975d() {
        this.f22697a = null;
        this.f22698b = null;
        this.f22699c = null;
        this.f22701e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22697a != null) {
            nyu.b(1, this.f22697a);
        }
        if (this.f22698b != null) {
            nyu.b(2, this.f22698b.longValue());
        }
        if (this.f22699c != null) {
            nyu.b(3, this.f22699c.longValue());
        }
        if (this.f22700d != null) {
            nyu.a(4, this.f22700d.intValue());
        }
        if (this.f22701e != null) {
            nyu.a(5, this.f22701e.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22697a != null) {
            b += nyu.d(1, this.f22697a);
        }
        if (this.f22698b != null) {
            b += nyu.f(2, this.f22698b.longValue());
        }
        if (this.f22699c != null) {
            b += nyu.f(3, this.f22699c.longValue());
        }
        if (this.f22700d != null) {
            b += nyu.f(4, this.f22700d.intValue());
        }
        if (this.f22701e == null) {
            return b;
        }
        this.f22701e.booleanValue();
        return b + (nyu.h(5) + 1);
    }

    private kpu m26974b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22697a == null) {
                        this.f22697a = new kqd();
                    }
                    nyt.a(this.f22697a);
                    continue;
                case 16:
                    this.f22698b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.f22699c = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f22700d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    this.f22701e = Boolean.valueOf(nyt.i());
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
