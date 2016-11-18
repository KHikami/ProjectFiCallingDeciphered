package p000;

public final class ncw extends nyx<ncw> {
    public String f29536a;
    public Boolean f29537b;
    public Boolean f29538c;

    public /* synthetic */ nzf m34365a(nyt nyt) {
        return m34364b(nyt);
    }

    public ncw() {
        this.f29536a = null;
        this.f29537b = null;
        this.f29538c = null;
        this.cachedSize = -1;
    }

    public void m34366a(nyu nyu) {
        if (this.f29536a != null) {
            nyu.m37170a(1, this.f29536a);
        }
        if (this.f29537b != null) {
            nyu.m37172a(2, this.f29537b.booleanValue());
        }
        if (this.f29538c != null) {
            nyu.m37172a(3, this.f29538c.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34367b() {
        int b = super.b();
        if (this.f29536a != null) {
            b += nyu.m37137b(1, this.f29536a);
        }
        if (this.f29537b != null) {
            this.f29537b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f29538c == null) {
            return b;
        }
        this.f29538c.booleanValue();
        return b + (nyu.m37154h(3) + 1);
    }

    private ncw m34364b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29536a = nyt.m37117j();
                    continue;
                case 16:
                    this.f29537b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f29538c = Boolean.valueOf(nyt.m37116i());
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
