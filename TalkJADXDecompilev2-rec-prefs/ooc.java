package p000;

public final class ooc extends nyx<ooc> {
    public Long f33361a;
    public Long f33362b;
    public Long f33363c;
    public Long f33364d;
    public Long f33365e;
    public Long f33366f;
    public Long f33367g;
    public Long f33368h;
    public String f33369i;

    public /* synthetic */ nzf m38880a(nyt nyt) {
        return m38879b(nyt);
    }

    public ooc() {
        this.f33361a = null;
        this.f33362b = null;
        this.f33363c = null;
        this.f33364d = null;
        this.f33365e = null;
        this.f33366f = null;
        this.f33367g = null;
        this.f33368h = null;
        this.f33369i = null;
        this.cachedSize = -1;
    }

    public void m38881a(nyu nyu) {
        if (this.f33361a != null) {
            nyu.m37181b(1, this.f33361a.longValue());
        }
        if (this.f33362b != null) {
            nyu.m37181b(2, this.f33362b.longValue());
        }
        if (this.f33363c != null) {
            nyu.m37181b(3, this.f33363c.longValue());
        }
        if (this.f33364d != null) {
            nyu.m37181b(4, this.f33364d.longValue());
        }
        if (this.f33365e != null) {
            nyu.m37181b(5, this.f33365e.longValue());
        }
        if (this.f33366f != null) {
            nyu.m37181b(6, this.f33366f.longValue());
        }
        if (this.f33367g != null) {
            nyu.m37181b(7, this.f33367g.longValue());
        }
        if (this.f33368h != null) {
            nyu.m37181b(8, this.f33368h.longValue());
        }
        if (this.f33369i != null) {
            nyu.m37170a(9, this.f33369i);
        }
        super.a(nyu);
    }

    protected int m38882b() {
        int b = super.b();
        if (this.f33361a != null) {
            b += nyu.m37148f(1, this.f33361a.longValue());
        }
        if (this.f33362b != null) {
            b += nyu.m37148f(2, this.f33362b.longValue());
        }
        if (this.f33363c != null) {
            b += nyu.m37148f(3, this.f33363c.longValue());
        }
        if (this.f33364d != null) {
            b += nyu.m37148f(4, this.f33364d.longValue());
        }
        if (this.f33365e != null) {
            b += nyu.m37148f(5, this.f33365e.longValue());
        }
        if (this.f33366f != null) {
            b += nyu.m37148f(6, this.f33366f.longValue());
        }
        if (this.f33367g != null) {
            b += nyu.m37148f(7, this.f33367g.longValue());
        }
        if (this.f33368h != null) {
            b += nyu.m37148f(8, this.f33368h.longValue());
        }
        if (this.f33369i != null) {
            return b + nyu.m37137b(9, this.f33369i);
        }
        return b;
    }

    private ooc m38879b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33361a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f33362b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dA /*24*/:
                    this.f33363c = Long.valueOf(nyt.m37110e());
                    continue;
                case 32:
                    this.f33364d = Long.valueOf(nyt.m37110e());
                    continue;
                case 40:
                    this.f33365e = Long.valueOf(nyt.m37110e());
                    continue;
                case 48:
                    this.f33366f = Long.valueOf(nyt.m37110e());
                    continue;
                case 56:
                    this.f33367g = Long.valueOf(nyt.m37110e());
                    continue;
                case 64:
                    this.f33368h = Long.valueOf(nyt.m37110e());
                    continue;
                case 74:
                    this.f33369i = nyt.m37117j();
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
