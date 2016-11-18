package p000;

public final class nit extends nyx<nit> {
    public String f29917a;

    public /* synthetic */ nzf m35147a(nyt nyt) {
        return m35145b(nyt);
    }

    public nit() {
        m35146d();
    }

    private nit m35146d() {
        this.f29917a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35148a(nyu nyu) {
        if (this.f29917a != null) {
            nyu.m37170a(1, this.f29917a);
        }
        super.a(nyu);
    }

    protected int m35149b() {
        int b = super.b();
        if (this.f29917a != null) {
            return b + nyu.m37137b(1, this.f29917a);
        }
        return b;
    }

    private nit m35145b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29917a = nyt.m37117j();
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
