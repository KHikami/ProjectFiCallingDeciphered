package p000;

public final class ncp extends nyx<ncp> {
    public nce f29517a;
    public nce f29518b;

    public /* synthetic */ nzf m34335a(nyt nyt) {
        return m34334b(nyt);
    }

    public ncp() {
        this.cachedSize = -1;
    }

    public void m34336a(nyu nyu) {
        if (this.f29517a != null) {
            nyu.m37182b(1, this.f29517a);
        }
        if (this.f29518b != null) {
            nyu.m37182b(2, this.f29518b);
        }
        super.a(nyu);
    }

    protected int m34337b() {
        int b = super.b();
        if (this.f29517a != null) {
            b += nyu.m37145d(1, this.f29517a);
        }
        if (this.f29518b != null) {
            return b + nyu.m37145d(2, this.f29518b);
        }
        return b;
    }

    private ncp m34334b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29517a == null) {
                        this.f29517a = new nce();
                    }
                    nyt.m37101a(this.f29517a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29518b == null) {
                        this.f29518b = new nce();
                    }
                    nyt.m37101a(this.f29518b);
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
