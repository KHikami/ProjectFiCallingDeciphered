package p000;

public final class ncd extends nyx<ncd> {
    public String f29488a;

    public /* synthetic */ nzf m34284a(nyt nyt) {
        return m34283b(nyt);
    }

    public ncd() {
        this.f29488a = null;
        this.cachedSize = -1;
    }

    public void m34285a(nyu nyu) {
        if (this.f29488a != null) {
            nyu.m37170a(1, this.f29488a);
        }
        super.a(nyu);
    }

    protected int m34286b() {
        int b = super.b();
        if (this.f29488a != null) {
            return b + nyu.m37137b(1, this.f29488a);
        }
        return b;
    }

    private ncd m34283b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29488a = nyt.m37117j();
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
