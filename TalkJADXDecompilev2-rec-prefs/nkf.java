package p000;

public final class nkf extends nyx<nkf> {
    public Boolean f30033a;

    public /* synthetic */ nzf m35340a(nyt nyt) {
        return m35338b(nyt);
    }

    public nkf() {
        m35339d();
    }

    private nkf m35339d() {
        this.f30033a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35341a(nyu nyu) {
        if (this.f30033a != null) {
            nyu.m37172a(1, this.f30033a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35342b() {
        int b = super.b();
        if (this.f30033a == null) {
            return b;
        }
        this.f30033a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nkf m35338b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30033a = Boolean.valueOf(nyt.m37116i());
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
