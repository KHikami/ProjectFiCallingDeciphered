package p000;

public final class nmz extends nyx<nmz> {
    public Boolean f30264a;

    public /* synthetic */ nzf m35718a(nyt nyt) {
        return m35716b(nyt);
    }

    public nmz() {
        m35717d();
    }

    private nmz m35717d() {
        this.f30264a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35719a(nyu nyu) {
        if (this.f30264a != null) {
            nyu.m37172a(1, this.f30264a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35720b() {
        int b = super.b();
        if (this.f30264a == null) {
            return b;
        }
        this.f30264a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nmz m35716b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30264a = Boolean.valueOf(nyt.m37116i());
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
