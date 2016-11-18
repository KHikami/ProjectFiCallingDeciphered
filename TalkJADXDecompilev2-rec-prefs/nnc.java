package p000;

public final class nnc extends nyx<nnc> {
    public Boolean f30269a;

    public /* synthetic */ nzf m35736a(nyt nyt) {
        return m35734b(nyt);
    }

    public nnc() {
        m35735d();
    }

    private nnc m35735d() {
        this.f30269a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35737a(nyu nyu) {
        if (this.f30269a != null) {
            nyu.m37172a(1, this.f30269a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35738b() {
        int b = super.b();
        if (this.f30269a == null) {
            return b;
        }
        this.f30269a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nnc m35734b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30269a = Boolean.valueOf(nyt.m37116i());
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
