package p000;

public final class nbk extends nyx<nbk> {
    public String f29434a;

    public /* synthetic */ nzf m34187a(nyt nyt) {
        return m34186b(nyt);
    }

    public nbk() {
        this.f29434a = null;
        this.cachedSize = -1;
    }

    public void m34188a(nyu nyu) {
        if (this.f29434a != null) {
            nyu.m37170a(1, this.f29434a);
        }
        super.a(nyu);
    }

    protected int m34189b() {
        int b = super.b();
        if (this.f29434a != null) {
            return b + nyu.m37137b(1, this.f29434a);
        }
        return b;
    }

    private nbk m34186b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29434a = nyt.m37117j();
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
