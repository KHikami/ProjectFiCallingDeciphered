package p000;

public final class neq extends nyx<neq> {
    public Boolean f29633a;

    public /* synthetic */ nzf m34588a(nyt nyt) {
        return m34586b(nyt);
    }

    public neq() {
        m34587d();
    }

    private neq m34587d() {
        this.f29633a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34589a(nyu nyu) {
        if (this.f29633a != null) {
            nyu.m37172a(1, this.f29633a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34590b() {
        int b = super.b();
        if (this.f29633a == null) {
            return b;
        }
        this.f29633a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private neq m34586b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29633a = Boolean.valueOf(nyt.m37116i());
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
