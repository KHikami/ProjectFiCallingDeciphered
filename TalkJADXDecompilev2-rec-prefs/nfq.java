package p000;

public final class nfq extends nyx<nfq> {
    public String f29712a;
    public String f29713b;
    public String f29714c;

    public /* synthetic */ nzf m34719a(nyt nyt) {
        return m34717b(nyt);
    }

    public nfq() {
        m34718d();
    }

    private nfq m34718d() {
        this.f29712a = null;
        this.f29713b = null;
        this.f29714c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34720a(nyu nyu) {
        if (this.f29712a != null) {
            nyu.m37170a(1, this.f29712a);
        }
        if (this.f29714c != null) {
            nyu.m37170a(2, this.f29714c);
        }
        if (this.f29713b != null) {
            nyu.m37170a(3, this.f29713b);
        }
        super.a(nyu);
    }

    protected int m34721b() {
        int b = super.b();
        if (this.f29712a != null) {
            b += nyu.m37137b(1, this.f29712a);
        }
        if (this.f29714c != null) {
            b += nyu.m37137b(2, this.f29714c);
        }
        if (this.f29713b != null) {
            return b + nyu.m37137b(3, this.f29713b);
        }
        return b;
    }

    private nfq m34717b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29712a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f29714c = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f29713b = nyt.m37117j();
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
