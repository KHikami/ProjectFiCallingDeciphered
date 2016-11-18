package p000;

public final class kqe extends nyx<kqe> {
    public kqd f22750a;
    public String f22751b;
    public String f22752c;
    public String f22753d;
    public Boolean f22754e;
    public Long f22755f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27028b(nyt);
    }

    public kqe() {
        m27029d();
    }

    private kqe m27029d() {
        this.f22750a = null;
        this.f22751b = null;
        this.f22752c = null;
        this.f22753d = null;
        this.f22754e = null;
        this.f22755f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22750a != null) {
            nyu.b(1, this.f22750a);
        }
        if (this.f22751b != null) {
            nyu.a(2, this.f22751b);
        }
        if (this.f22752c != null) {
            nyu.a(3, this.f22752c);
        }
        if (this.f22753d != null) {
            nyu.a(4, this.f22753d);
        }
        if (this.f22754e != null) {
            nyu.a(5, this.f22754e.booleanValue());
        }
        if (this.f22755f != null) {
            nyu.b(6, this.f22755f.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22750a != null) {
            b += nyu.d(1, this.f22750a);
        }
        if (this.f22751b != null) {
            b += nyu.b(2, this.f22751b);
        }
        if (this.f22752c != null) {
            b += nyu.b(3, this.f22752c);
        }
        if (this.f22753d != null) {
            b += nyu.b(4, this.f22753d);
        }
        if (this.f22754e != null) {
            this.f22754e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f22755f != null) {
            return b + nyu.f(6, this.f22755f.longValue());
        }
        return b;
    }

    private kqe m27028b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22750a == null) {
                        this.f22750a = new kqd();
                    }
                    nyt.a(this.f22750a);
                    continue;
                case wi.dH /*18*/:
                    this.f22751b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22752c = nyt.j();
                    continue;
                case 34:
                    this.f22753d = nyt.j();
                    continue;
                case 40:
                    this.f22754e = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f22755f = Long.valueOf(nyt.e());
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
