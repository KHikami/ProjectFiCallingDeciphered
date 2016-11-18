package p000;

public final class nig extends nyx<nig> {
    public String f29879a;

    public /* synthetic */ nzf m35079a(nyt nyt) {
        return m35077b(nyt);
    }

    public nig() {
        m35078d();
    }

    private nig m35078d() {
        this.f29879a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35080a(nyu nyu) {
        if (this.f29879a != null) {
            nyu.m37170a(1, this.f29879a);
        }
        super.a(nyu);
    }

    protected int m35081b() {
        int b = super.b();
        if (this.f29879a != null) {
            return b + nyu.m37137b(1, this.f29879a);
        }
        return b;
    }

    private nig m35077b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29879a = nyt.m37117j();
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
