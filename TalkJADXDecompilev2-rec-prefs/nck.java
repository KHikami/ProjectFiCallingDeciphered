package p000;

public final class nck extends nyx<nck> {
    public String f29503a;
    public Long f29504b;
    public Long f29505c;

    public /* synthetic */ nzf m34314a(nyt nyt) {
        return m34313b(nyt);
    }

    public nck() {
        this.f29503a = null;
        this.f29504b = null;
        this.f29505c = null;
        this.cachedSize = -1;
    }

    public void m34315a(nyu nyu) {
        if (this.f29503a != null) {
            nyu.m37170a(1, this.f29503a);
        }
        if (this.f29504b != null) {
            nyu.m37187c(2, this.f29504b.longValue());
        }
        if (this.f29505c != null) {
            nyu.m37187c(3, this.f29505c.longValue());
        }
        super.a(nyu);
    }

    protected int m34316b() {
        int b = super.b();
        if (this.f29503a != null) {
            b += nyu.m37137b(1, this.f29503a);
        }
        if (this.f29504b != null) {
            this.f29504b.longValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f29505c == null) {
            return b;
        }
        this.f29505c.longValue();
        return b + (nyu.m37154h(3) + 8);
    }

    private nck m34313b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29503a = nyt.m37117j();
                    continue;
                case wi.dK /*17*/:
                    this.f29504b = Long.valueOf(nyt.m37114g());
                    continue;
                case wi.dz /*25*/:
                    this.f29505c = Long.valueOf(nyt.m37114g());
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
