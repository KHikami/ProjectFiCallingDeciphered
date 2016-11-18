package p000;

public final class nkc extends nyx<nkc> {
    public String f30030a;

    public /* synthetic */ nzf m35325a(nyt nyt) {
        return m35323b(nyt);
    }

    public nkc() {
        m35324d();
    }

    private nkc m35324d() {
        this.f30030a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35326a(nyu nyu) {
        if (this.f30030a != null) {
            nyu.m37170a(1, this.f30030a);
        }
        super.a(nyu);
    }

    protected int m35327b() {
        int b = super.b();
        if (this.f30030a != null) {
            return b + nyu.m37137b(1, this.f30030a);
        }
        return b;
    }

    private nkc m35323b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30030a = nyt.m37117j();
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
