package p000;

public final class nkm extends nyx<nkm> {
    public Boolean f30041a;

    public /* synthetic */ nzf m35375a(nyt nyt) {
        return m35373b(nyt);
    }

    public nkm() {
        m35374d();
    }

    private nkm m35374d() {
        this.f30041a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35376a(nyu nyu) {
        if (this.f30041a != null) {
            nyu.m37172a(1, this.f30041a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35377b() {
        int b = super.b();
        if (this.f30041a == null) {
            return b;
        }
        this.f30041a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nkm m35373b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30041a = Boolean.valueOf(nyt.m37116i());
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
