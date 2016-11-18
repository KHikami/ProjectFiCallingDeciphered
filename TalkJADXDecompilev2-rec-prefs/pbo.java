package p000;

public final class pbo extends nyx<pbo> {
    public Long f34955a;
    public Long f34956b;
    public Long f34957c;

    public /* synthetic */ nzf m40211a(nyt nyt) {
        return m40210b(nyt);
    }

    public pbo() {
        this.f34955a = null;
        this.f34956b = null;
        this.f34957c = null;
        this.cachedSize = -1;
    }

    public void m40212a(nyu nyu) {
        if (this.f34955a != null) {
            nyu.m37181b(1, this.f34955a.longValue());
        }
        if (this.f34956b != null) {
            nyu.m37181b(2, this.f34956b.longValue());
        }
        if (this.f34957c != null) {
            nyu.m37181b(3, this.f34957c.longValue());
        }
        super.a(nyu);
    }

    protected int m40213b() {
        int b = super.b();
        if (this.f34955a != null) {
            b += nyu.m37148f(1, this.f34955a.longValue());
        }
        if (this.f34956b != null) {
            b += nyu.m37148f(2, this.f34956b.longValue());
        }
        if (this.f34957c != null) {
            return b + nyu.m37148f(3, this.f34957c.longValue());
        }
        return b;
    }

    private pbo m40210b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34955a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f34956b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dA /*24*/:
                    this.f34957c = Long.valueOf(nyt.m37110e());
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
