package p000;

public final class nne extends nyx<nne> {
    public Boolean f30271a;

    public /* synthetic */ nzf m35746a(nyt nyt) {
        return m35744b(nyt);
    }

    public nne() {
        m35745d();
    }

    private nne m35745d() {
        this.f30271a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35747a(nyu nyu) {
        if (this.f30271a != null) {
            nyu.m37172a(1, this.f30271a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35748b() {
        int b = super.b();
        if (this.f30271a == null) {
            return b;
        }
        this.f30271a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nne m35744b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30271a = Boolean.valueOf(nyt.m37116i());
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
