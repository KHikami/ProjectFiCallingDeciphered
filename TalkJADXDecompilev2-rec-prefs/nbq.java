package p000;

public final class nbq extends nyx<nbq> {
    public String f29453a;
    public String f29454b;

    public /* synthetic */ nzf m34213a(nyt nyt) {
        return m34212b(nyt);
    }

    public nbq() {
        this.f29453a = null;
        this.f29454b = null;
        this.cachedSize = -1;
    }

    public void m34214a(nyu nyu) {
        if (this.f29453a != null) {
            nyu.m37170a(1, this.f29453a);
        }
        if (this.f29454b != null) {
            nyu.m37170a(2, this.f29454b);
        }
        super.a(nyu);
    }

    protected int m34215b() {
        int b = super.b();
        if (this.f29453a != null) {
            b += nyu.m37137b(1, this.f29453a);
        }
        if (this.f29454b != null) {
            return b + nyu.m37137b(2, this.f29454b);
        }
        return b;
    }

    private nbq m34212b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29453a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f29454b = nyt.m37117j();
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
