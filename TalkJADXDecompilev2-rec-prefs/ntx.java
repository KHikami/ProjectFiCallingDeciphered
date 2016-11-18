package p000;

public final class ntx extends nyx<ntx> {
    public Boolean f30799a;
    public Boolean f30800b;

    public /* synthetic */ nzf m36537a(nyt nyt) {
        return m36536b(nyt);
    }

    public ntx() {
        this.f30799a = null;
        this.f30800b = null;
        this.cachedSize = -1;
    }

    public void m36538a(nyu nyu) {
        if (this.f30799a != null) {
            nyu.m37172a(1, this.f30799a.booleanValue());
        }
        if (this.f30800b != null) {
            nyu.m37172a(2, this.f30800b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36539b() {
        int b = super.b();
        if (this.f30799a != null) {
            this.f30799a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30800b == null) {
            return b;
        }
        this.f30800b.booleanValue();
        return b + (nyu.m37154h(2) + 1);
    }

    private ntx m36536b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30799a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f30800b = Boolean.valueOf(nyt.m37116i());
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
