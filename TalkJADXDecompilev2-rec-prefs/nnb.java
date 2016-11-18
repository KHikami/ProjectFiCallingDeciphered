package p000;

public final class nnb extends nyx<nnb> {
    public Boolean f30268a;

    public /* synthetic */ nzf m35731a(nyt nyt) {
        return m35729b(nyt);
    }

    public nnb() {
        m35730d();
    }

    private nnb m35730d() {
        this.f30268a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35732a(nyu nyu) {
        if (this.f30268a != null) {
            nyu.m37172a(1, this.f30268a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35733b() {
        int b = super.b();
        if (this.f30268a == null) {
            return b;
        }
        this.f30268a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nnb m35729b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30268a = Boolean.valueOf(nyt.m37116i());
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
