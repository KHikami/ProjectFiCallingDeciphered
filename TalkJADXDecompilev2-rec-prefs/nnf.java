package p000;

public final class nnf extends nyx<nnf> {
    public Boolean f30272a;

    public /* synthetic */ nzf m35751a(nyt nyt) {
        return m35749b(nyt);
    }

    public nnf() {
        m35750d();
    }

    private nnf m35750d() {
        this.f30272a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35752a(nyu nyu) {
        if (this.f30272a != null) {
            nyu.m37172a(1, this.f30272a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35753b() {
        int b = super.b();
        if (this.f30272a == null) {
            return b;
        }
        this.f30272a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nnf m35749b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30272a = Boolean.valueOf(nyt.m37116i());
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
