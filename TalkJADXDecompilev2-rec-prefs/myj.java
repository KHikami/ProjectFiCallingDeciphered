package p000;

public final class myj extends nyx<myj> {
    public String f29148a;
    public String f29149b;
    public Long f29150c;

    public /* synthetic */ nzf m33810a(nyt nyt) {
        return m33809b(nyt);
    }

    public myj() {
        this.f29148a = null;
        this.f29149b = null;
        this.f29150c = null;
        this.cachedSize = -1;
    }

    public void m33811a(nyu nyu) {
        if (this.f29148a != null) {
            nyu.m37170a(1, this.f29148a);
        }
        if (this.f29149b != null) {
            nyu.m37170a(2, this.f29149b);
        }
        if (this.f29150c != null) {
            nyu.m37187c(3, this.f29150c.longValue());
        }
        super.a(nyu);
    }

    protected int m33812b() {
        int b = super.b();
        if (this.f29148a != null) {
            b += nyu.m37137b(1, this.f29148a);
        }
        if (this.f29149b != null) {
            b += nyu.m37137b(2, this.f29149b);
        }
        if (this.f29150c == null) {
            return b;
        }
        this.f29150c.longValue();
        return b + (nyu.m37154h(3) + 8);
    }

    private myj m33809b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29148a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f29149b = nyt.m37117j();
                    continue;
                case wi.dz /*25*/:
                    this.f29150c = Long.valueOf(nyt.m37114g());
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
