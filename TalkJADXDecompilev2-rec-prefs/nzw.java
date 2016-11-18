package p000;

public final class nzw extends nyx<nzw> {
    public String f31396a;

    public /* synthetic */ nzf m37313a(nyt nyt) {
        return m37311b(nyt);
    }

    public nzw() {
        m37312d();
    }

    private nzw m37312d() {
        this.f31396a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37314a(nyu nyu) {
        if (this.f31396a != null) {
            nyu.m37170a(1, this.f31396a);
        }
        super.a(nyu);
    }

    protected int m37315b() {
        int b = super.b();
        if (this.f31396a != null) {
            return b + nyu.m37137b(1, this.f31396a);
        }
        return b;
    }

    private nzw m37311b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31396a = nyt.m37117j();
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
