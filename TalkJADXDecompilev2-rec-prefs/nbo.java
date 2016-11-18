package p000;

public final class nbo extends nyx<nbo> {
    public String f29451a;

    public /* synthetic */ nzf m34205a(nyt nyt) {
        return m34204b(nyt);
    }

    public nbo() {
        this.f29451a = null;
        this.cachedSize = -1;
    }

    public void m34206a(nyu nyu) {
        if (this.f29451a != null) {
            nyu.m37170a(1, this.f29451a);
        }
        super.a(nyu);
    }

    protected int m34207b() {
        int b = super.b();
        if (this.f29451a != null) {
            return b + nyu.m37137b(1, this.f29451a);
        }
        return b;
    }

    private nbo m34204b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29451a = nyt.m37117j();
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
