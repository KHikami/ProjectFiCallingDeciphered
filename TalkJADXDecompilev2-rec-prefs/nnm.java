package p000;

public final class nnm extends nyx<nnm> {
    public Boolean f30295a;

    public /* synthetic */ nzf m35787a(nyt nyt) {
        return m35785b(nyt);
    }

    public nnm() {
        m35786d();
    }

    private nnm m35786d() {
        this.f30295a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35788a(nyu nyu) {
        if (this.f30295a != null) {
            nyu.m37172a(1, this.f30295a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35789b() {
        int b = super.b();
        if (this.f30295a == null) {
            return b;
        }
        this.f30295a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nnm m35785b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30295a = Boolean.valueOf(nyt.m37116i());
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
