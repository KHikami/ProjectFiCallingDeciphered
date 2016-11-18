package p000;

public final class nnv extends nyx<nnv> {
    public Boolean f30314a;

    public /* synthetic */ nzf m35833a(nyt nyt) {
        return m35831b(nyt);
    }

    public nnv() {
        m35832d();
    }

    private nnv m35832d() {
        this.f30314a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35834a(nyu nyu) {
        if (this.f30314a != null) {
            nyu.m37172a(1, this.f30314a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35835b() {
        int b = super.b();
        if (this.f30314a == null) {
            return b;
        }
        this.f30314a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nnv m35831b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30314a = Boolean.valueOf(nyt.m37116i());
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
