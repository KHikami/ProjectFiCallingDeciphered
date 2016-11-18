package p000;

public final class llf extends nyx<llf> {
    public Integer f25329a;
    public Integer f25330b;
    public Long f25331c;
    public Long f25332d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29331b(nyt);
    }

    public llf() {
        m29332d();
    }

    private llf m29332d() {
        this.f25329a = null;
        this.f25330b = null;
        this.f25331c = null;
        this.f25332d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25329a != null) {
            nyu.a(1, this.f25329a.intValue());
        }
        if (this.f25330b != null) {
            nyu.a(2, this.f25330b.intValue());
        }
        if (this.f25331c != null) {
            nyu.b(3, this.f25331c.longValue());
        }
        if (this.f25332d != null) {
            nyu.b(4, this.f25332d.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25329a != null) {
            b += nyu.f(1, this.f25329a.intValue());
        }
        if (this.f25330b != null) {
            b += nyu.f(2, this.f25330b.intValue());
        }
        if (this.f25331c != null) {
            b += nyu.f(3, this.f25331c.longValue());
        }
        if (this.f25332d != null) {
            return b + nyu.f(4, this.f25332d.longValue());
        }
        return b;
    }

    private llf m29331b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25329a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f25330b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f25331c = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    this.f25332d = Long.valueOf(nyt.e());
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
