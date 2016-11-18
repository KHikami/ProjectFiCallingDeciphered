package p000;

public final class nkj extends nyx<nkj> {
    public Boolean f30037a;

    public /* synthetic */ nzf m35360a(nyt nyt) {
        return m35358b(nyt);
    }

    public nkj() {
        m35359d();
    }

    private nkj m35359d() {
        this.f30037a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35361a(nyu nyu) {
        if (this.f30037a != null) {
            nyu.m37172a(1, this.f30037a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35362b() {
        int b = super.b();
        if (this.f30037a == null) {
            return b;
        }
        this.f30037a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nkj m35358b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30037a = Boolean.valueOf(nyt.m37116i());
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
