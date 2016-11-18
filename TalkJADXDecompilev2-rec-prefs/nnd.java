package p000;

public final class nnd extends nyx<nnd> {
    public Boolean f30270a;

    public /* synthetic */ nzf m35741a(nyt nyt) {
        return m35739b(nyt);
    }

    public nnd() {
        m35740d();
    }

    private nnd m35740d() {
        this.f30270a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35742a(nyu nyu) {
        if (this.f30270a != null) {
            nyu.m37172a(1, this.f30270a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35743b() {
        int b = super.b();
        if (this.f30270a == null) {
            return b;
        }
        this.f30270a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nnd m35739b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30270a = Boolean.valueOf(nyt.m37116i());
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
