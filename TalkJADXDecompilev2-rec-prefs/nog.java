package p000;

public final class nog extends nyx<nog> {
    public Boolean f30353a;

    public /* synthetic */ nzf m35889a(nyt nyt) {
        return m35887b(nyt);
    }

    public nog() {
        m35888d();
    }

    private nog m35888d() {
        this.f30353a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35890a(nyu nyu) {
        if (this.f30353a != null) {
            nyu.m37172a(1, this.f30353a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35891b() {
        int b = super.b();
        if (this.f30353a == null) {
            return b;
        }
        this.f30353a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nog m35887b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30353a = Boolean.valueOf(nyt.m37116i());
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
