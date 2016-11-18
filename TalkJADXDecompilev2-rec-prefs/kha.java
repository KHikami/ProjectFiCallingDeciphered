package p000;

public final class kha extends nyx<kha> {
    public Long f21677a;
    public String f21678b;
    public Long f21679c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25796b(nyt);
    }

    public kha() {
        m25797d();
    }

    private kha m25797d() {
        this.f21677a = null;
        this.f21678b = null;
        this.f21679c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21677a != null) {
            nyu.b(1, this.f21677a.longValue());
        }
        if (this.f21678b != null) {
            nyu.a(2, this.f21678b);
        }
        if (this.f21679c != null) {
            nyu.b(3, this.f21679c.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21677a != null) {
            b += nyu.f(1, this.f21677a.longValue());
        }
        if (this.f21678b != null) {
            b += nyu.b(2, this.f21678b);
        }
        if (this.f21679c != null) {
            return b + nyu.f(3, this.f21679c.longValue());
        }
        return b;
    }

    private kha m25796b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f21677a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    this.f21678b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f21679c = Long.valueOf(nyt.e());
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
