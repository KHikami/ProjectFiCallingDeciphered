package p000;

public final class nmw extends nyx<nmw> {
    public Boolean f30261a;

    public /* synthetic */ nzf m35705a(nyt nyt) {
        return m35703b(nyt);
    }

    public nmw() {
        m35704d();
    }

    private nmw m35704d() {
        this.f30261a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35706a(nyu nyu) {
        if (this.f30261a != null) {
            nyu.m37172a(1, this.f30261a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35707b() {
        int b = super.b();
        if (this.f30261a == null) {
            return b;
        }
        this.f30261a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nmw m35703b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30261a = Boolean.valueOf(nyt.m37116i());
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
