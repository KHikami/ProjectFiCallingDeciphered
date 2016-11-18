package p000;

public final class njk extends nyx<njk> {
    public Long f29990a;
    public Long f29991b;
    public Boolean f29992c;
    public Long f29993d;

    public /* synthetic */ nzf m35234a(nyt nyt) {
        return m35232b(nyt);
    }

    public njk() {
        m35233d();
    }

    private njk m35233d() {
        this.f29990a = null;
        this.f29991b = null;
        this.f29992c = null;
        this.f29993d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35235a(nyu nyu) {
        if (this.f29990a != null) {
            nyu.m37181b(1, this.f29990a.longValue());
        }
        if (this.f29991b != null) {
            nyu.m37181b(2, this.f29991b.longValue());
        }
        if (this.f29992c != null) {
            nyu.m37172a(3, this.f29992c.booleanValue());
        }
        if (this.f29993d != null) {
            nyu.m37181b(4, this.f29993d.longValue());
        }
        super.a(nyu);
    }

    protected int m35236b() {
        int b = super.b();
        if (this.f29990a != null) {
            b += nyu.m37148f(1, this.f29990a.longValue());
        }
        if (this.f29991b != null) {
            b += nyu.m37148f(2, this.f29991b.longValue());
        }
        if (this.f29992c != null) {
            this.f29992c.booleanValue();
            b += nyu.m37154h(3) + 1;
        }
        if (this.f29993d != null) {
            return b + nyu.m37148f(4, this.f29993d.longValue());
        }
        return b;
    }

    private njk m35232b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29990a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f29991b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dA /*24*/:
                    this.f29992c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 32:
                    this.f29993d = Long.valueOf(nyt.m37110e());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
