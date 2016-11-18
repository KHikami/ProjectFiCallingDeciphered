package p000;

public final class nhq extends nyx<nhq> {
    public nhp f29842a;
    public ngg f29843b;

    public /* synthetic */ nzf m34992a(nyt nyt) {
        return m34990b(nyt);
    }

    public nhq() {
        m34991d();
    }

    private nhq m34991d() {
        this.f29842a = null;
        this.f29843b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34993a(nyu nyu) {
        if (this.f29842a != null) {
            nyu.m37182b(1, this.f29842a);
        }
        if (this.f29843b != null) {
            nyu.m37182b(2, this.f29843b);
        }
        super.a(nyu);
    }

    protected int m34994b() {
        int b = super.b();
        if (this.f29842a != null) {
            b += nyu.m37145d(1, this.f29842a);
        }
        if (this.f29843b != null) {
            return b + nyu.m37145d(2, this.f29843b);
        }
        return b;
    }

    private nhq m34990b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29842a == null) {
                        this.f29842a = new nhp();
                    }
                    nyt.m37101a(this.f29842a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29843b == null) {
                        this.f29843b = new ngg();
                    }
                    nyt.m37101a(this.f29843b);
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
