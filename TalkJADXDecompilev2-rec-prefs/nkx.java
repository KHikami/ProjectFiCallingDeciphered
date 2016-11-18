package p000;

public final class nkx extends nyx<nkx> {
    public Boolean f30085a;

    public /* synthetic */ nzf m35430a(nyt nyt) {
        return m35428b(nyt);
    }

    public nkx() {
        m35429d();
    }

    private nkx m35429d() {
        this.f30085a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35431a(nyu nyu) {
        if (this.f30085a != null) {
            nyu.m37172a(1, this.f30085a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35432b() {
        int b = super.b();
        if (this.f30085a == null) {
            return b;
        }
        this.f30085a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nkx m35428b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30085a = Boolean.valueOf(nyt.m37116i());
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
