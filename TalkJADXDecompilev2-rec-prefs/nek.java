package p000;

public final class nek extends nyx<nek> {
    public Boolean f29613a;

    public /* synthetic */ nzf m34558a(nyt nyt) {
        return m34556b(nyt);
    }

    public nek() {
        m34557d();
    }

    private nek m34557d() {
        this.f29613a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34559a(nyu nyu) {
        if (this.f29613a != null) {
            nyu.m37172a(1, this.f29613a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34560b() {
        int b = super.b();
        if (this.f29613a == null) {
            return b;
        }
        this.f29613a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nek m34556b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29613a = Boolean.valueOf(nyt.m37116i());
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
