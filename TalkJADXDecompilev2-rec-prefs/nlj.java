package p000;

public final class nlj extends nyx<nlj> {
    public String f30113a;
    public Boolean f30114b;
    public Long f30115c;
    public String f30116d;

    public /* synthetic */ nzf m35501a(nyt nyt) {
        return m35499b(nyt);
    }

    public nlj() {
        m35500d();
    }

    private nlj m35500d() {
        this.f30113a = null;
        this.f30114b = null;
        this.f30115c = null;
        this.f30116d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35502a(nyu nyu) {
        if (this.f30113a != null) {
            nyu.m37170a(1, this.f30113a);
        }
        if (this.f30115c != null) {
            nyu.m37181b(2, this.f30115c.longValue());
        }
        if (this.f30116d != null) {
            nyu.m37170a(3, this.f30116d);
        }
        if (this.f30114b != null) {
            nyu.m37172a(4, this.f30114b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35503b() {
        int b = super.b();
        if (this.f30113a != null) {
            b += nyu.m37137b(1, this.f30113a);
        }
        if (this.f30115c != null) {
            b += nyu.m37148f(2, this.f30115c.longValue());
        }
        if (this.f30116d != null) {
            b += nyu.m37137b(3, this.f30116d);
        }
        if (this.f30114b == null) {
            return b;
        }
        this.f30114b.booleanValue();
        return b + (nyu.m37154h(4) + 1);
    }

    private nlj m35499b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30113a = nyt.m37117j();
                    continue;
                case 16:
                    this.f30115c = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dx /*26*/:
                    this.f30116d = nyt.m37117j();
                    continue;
                case 32:
                    this.f30114b = Boolean.valueOf(nyt.m37116i());
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
