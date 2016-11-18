package p000;

public final class nqd extends nyx<nqd> {
    public String f30476a;
    public Long f30477b;
    public Long f30478c;

    public /* synthetic */ nzf m36126a(nyt nyt) {
        return m36125b(nyt);
    }

    public nqd() {
        this.f30476a = null;
        this.f30477b = null;
        this.f30478c = null;
        this.cachedSize = -1;
    }

    public void m36127a(nyu nyu) {
        if (this.f30476a != null) {
            nyu.m37170a(1, this.f30476a);
        }
        if (this.f30477b != null) {
            nyu.m37187c(2, this.f30477b.longValue());
        }
        if (this.f30478c != null) {
            nyu.m37181b(3, this.f30478c.longValue());
        }
        super.a(nyu);
    }

    protected int m36128b() {
        int b = super.b();
        if (this.f30476a != null) {
            b += nyu.m37137b(1, this.f30476a);
        }
        if (this.f30477b != null) {
            this.f30477b.longValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f30478c != null) {
            return b + nyu.m37148f(3, this.f30478c.longValue());
        }
        return b;
    }

    private nqd m36125b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30476a = nyt.m37117j();
                    continue;
                case wi.dK /*17*/:
                    this.f30477b = Long.valueOf(nyt.m37114g());
                    continue;
                case wi.dA /*24*/:
                    this.f30478c = Long.valueOf(nyt.m37110e());
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
