package p000;

public final class nov extends nyx<nov> {
    public String f30400a;
    public Long f30401b;
    public String f30402c;

    public /* synthetic */ nzf m35958a(nyt nyt) {
        return m35957b(nyt);
    }

    public nov() {
        this.f30400a = null;
        this.f30401b = null;
        this.f30402c = null;
        this.cachedSize = -1;
    }

    public void m35959a(nyu nyu) {
        if (this.f30400a != null) {
            nyu.m37170a(1, this.f30400a);
        }
        if (this.f30401b != null) {
            nyu.m37187c(2, this.f30401b.longValue());
        }
        if (this.f30402c != null) {
            nyu.m37170a(3, this.f30402c);
        }
        super.a(nyu);
    }

    protected int m35960b() {
        int b = super.b();
        if (this.f30400a != null) {
            b += nyu.m37137b(1, this.f30400a);
        }
        if (this.f30401b != null) {
            this.f30401b.longValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f30402c != null) {
            return b + nyu.m37137b(3, this.f30402c);
        }
        return b;
    }

    private nov m35957b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30400a = nyt.m37117j();
                    continue;
                case wi.dK /*17*/:
                    this.f30401b = Long.valueOf(nyt.m37114g());
                    continue;
                case wi.dx /*26*/:
                    this.f30402c = nyt.m37117j();
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
