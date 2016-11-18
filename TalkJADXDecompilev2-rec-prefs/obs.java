package p000;

public final class obs extends nyx<obs> {
    public String f32050a;
    public Integer f32051b;
    public Integer f32052c;
    public Boolean f32053d;
    public Boolean f32054e;
    public Boolean f32055f;
    public String f32056g;
    public Integer f32057h;
    public obn f32058i;

    public /* synthetic */ nzf m37667a(nyt nyt) {
        return m37666b(nyt);
    }

    public obs() {
        this.f32050a = null;
        this.f32051b = null;
        this.f32052c = null;
        this.f32053d = null;
        this.f32054e = null;
        this.f32055f = null;
        this.f32056g = null;
        this.f32057h = null;
        this.cachedSize = -1;
    }

    public void m37668a(nyu nyu) {
        if (this.f32050a != null) {
            nyu.m37170a(1, this.f32050a);
        }
        if (this.f32051b != null) {
            nyu.m37168a(2, this.f32051b.intValue());
        }
        if (this.f32052c != null) {
            nyu.m37168a(3, this.f32052c.intValue());
        }
        if (this.f32053d != null) {
            nyu.m37172a(4, this.f32053d.booleanValue());
        }
        if (this.f32054e != null) {
            nyu.m37172a(5, this.f32054e.booleanValue());
        }
        if (this.f32055f != null) {
            nyu.m37172a(6, this.f32055f.booleanValue());
        }
        if (this.f32056g != null) {
            nyu.m37170a(7, this.f32056g);
        }
        if (this.f32057h != null) {
            nyu.m37168a(8, this.f32057h.intValue());
        }
        if (this.f32058i != null) {
            nyu.m37182b(9, this.f32058i);
        }
        super.a(nyu);
    }

    protected int m37669b() {
        int b = super.b();
        if (this.f32050a != null) {
            b += nyu.m37137b(1, this.f32050a);
        }
        if (this.f32051b != null) {
            b += nyu.m37147f(2, this.f32051b.intValue());
        }
        if (this.f32052c != null) {
            b += nyu.m37147f(3, this.f32052c.intValue());
        }
        if (this.f32053d != null) {
            this.f32053d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f32054e != null) {
            this.f32054e.booleanValue();
            b += nyu.m37154h(5) + 1;
        }
        if (this.f32055f != null) {
            this.f32055f.booleanValue();
            b += nyu.m37154h(6) + 1;
        }
        if (this.f32056g != null) {
            b += nyu.m37137b(7, this.f32056g);
        }
        if (this.f32057h != null) {
            b += nyu.m37147f(8, this.f32057h.intValue());
        }
        if (this.f32058i != null) {
            return b + nyu.m37145d(9, this.f32058i);
        }
        return b;
    }

    private obs m37666b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32050a = nyt.m37117j();
                    continue;
                case 16:
                    this.f32051b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f32052c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f32053d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 40:
                    this.f32054e = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 48:
                    this.f32055f = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 58:
                    this.f32056g = nyt.m37117j();
                    continue;
                case 64:
                    this.f32057h = Integer.valueOf(nyt.m37112f());
                    continue;
                case 74:
                    if (this.f32058i == null) {
                        this.f32058i = new obn();
                    }
                    nyt.m37101a(this.f32058i);
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
