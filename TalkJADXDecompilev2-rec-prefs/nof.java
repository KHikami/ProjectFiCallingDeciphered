package p000;

public final class nof extends nyx<nof> {
    public Boolean f30351a;
    public Boolean f30352b;

    public /* synthetic */ nzf m35884a(nyt nyt) {
        return m35882b(nyt);
    }

    public nof() {
        m35883d();
    }

    private nof m35883d() {
        this.f30351a = null;
        this.f30352b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35885a(nyu nyu) {
        if (this.f30351a != null) {
            nyu.m37172a(1, this.f30351a.booleanValue());
        }
        if (this.f30352b != null) {
            nyu.m37172a(2, this.f30352b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35886b() {
        int b = super.b();
        if (this.f30351a != null) {
            this.f30351a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30352b == null) {
            return b;
        }
        this.f30352b.booleanValue();
        return b + (nyu.m37154h(2) + 1);
    }

    private nof m35882b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30351a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f30352b = Boolean.valueOf(nyt.m37116i());
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
