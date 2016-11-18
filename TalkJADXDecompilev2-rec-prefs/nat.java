package p000;

public final class nat extends nyx<nat> {
    public String f29392a;

    public /* synthetic */ nzf m34104a(nyt nyt) {
        return m34102b(nyt);
    }

    public nat() {
        m34103d();
    }

    private nat m34103d() {
        this.f29392a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34105a(nyu nyu) {
        if (this.f29392a != null) {
            nyu.m37170a(1, this.f29392a);
        }
        super.a(nyu);
    }

    protected int m34106b() {
        int b = super.b();
        if (this.f29392a != null) {
            return b + nyu.m37137b(1, this.f29392a);
        }
        return b;
    }

    private nat m34102b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29392a = nyt.m37117j();
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
