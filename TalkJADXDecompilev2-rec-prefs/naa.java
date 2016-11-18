package p000;

public final class naa extends nyx<naa> {
    public nag f29308a;

    public /* synthetic */ nzf m34007a(nyt nyt) {
        return m34005b(nyt);
    }

    public naa() {
        m34006d();
    }

    private naa m34006d() {
        this.f29308a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34008a(nyu nyu) {
        if (this.f29308a != null) {
            nyu.m37182b(1, this.f29308a);
        }
        super.a(nyu);
    }

    protected int m34009b() {
        int b = super.b();
        if (this.f29308a != null) {
            return b + nyu.m37145d(1, this.f29308a);
        }
        return b;
    }

    private naa m34005b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29308a == null) {
                        this.f29308a = new nag();
                    }
                    nyt.m37101a(this.f29308a);
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
