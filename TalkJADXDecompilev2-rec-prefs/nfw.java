package p000;

public final class nfw extends nyx<nfw> {
    public Integer f29737a;

    public /* synthetic */ nzf m34751a(nyt nyt) {
        return m34749b(nyt);
    }

    public nfw() {
        m34750d();
    }

    private nfw m34750d() {
        this.f29737a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34752a(nyu nyu) {
        if (this.f29737a != null) {
            nyu.m37168a(1, this.f29737a.intValue());
        }
        super.a(nyu);
    }

    protected int m34753b() {
        int b = super.b();
        if (this.f29737a != null) {
            return b + nyu.m37147f(1, this.f29737a.intValue());
        }
        return b;
    }

    private nfw m34749b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29737a = Integer.valueOf(nyt.m37112f());
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
