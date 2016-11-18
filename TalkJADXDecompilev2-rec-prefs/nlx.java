package p000;

public final class nlx extends nyx<nlx> {
    public Long f30189a;
    public Long f30190b;

    public /* synthetic */ nzf m35574a(nyt nyt) {
        return m35572b(nyt);
    }

    public nlx() {
        m35573d();
    }

    private nlx m35573d() {
        this.f30189a = null;
        this.f30190b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35575a(nyu nyu) {
        if (this.f30189a != null) {
            nyu.m37187c(1, this.f30189a.longValue());
        }
        if (this.f30190b != null) {
            nyu.m37187c(2, this.f30190b.longValue());
        }
        super.a(nyu);
    }

    protected int m35576b() {
        int b = super.b();
        if (this.f30189a != null) {
            this.f30189a.longValue();
            b += nyu.m37154h(1) + 8;
        }
        if (this.f30190b == null) {
            return b;
        }
        this.f30190b.longValue();
        return b + (nyu.m37154h(2) + 8);
    }

    private nlx m35572b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f30189a = Long.valueOf(nyt.m37114g());
                    continue;
                case wi.dK /*17*/:
                    this.f30190b = Long.valueOf(nyt.m37114g());
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
