package p000;

public final class nnz extends nyx<nnz> {
    public Boolean f30319a;

    public /* synthetic */ nzf m35853a(nyt nyt) {
        return m35851b(nyt);
    }

    public nnz() {
        m35852d();
    }

    private nnz m35852d() {
        this.f30319a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35854a(nyu nyu) {
        if (this.f30319a != null) {
            nyu.m37172a(1, this.f30319a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35855b() {
        int b = super.b();
        if (this.f30319a == null) {
            return b;
        }
        this.f30319a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nnz m35851b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30319a = Boolean.valueOf(nyt.m37116i());
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
