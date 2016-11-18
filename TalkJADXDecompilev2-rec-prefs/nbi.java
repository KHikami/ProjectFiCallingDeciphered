package p000;

public final class nbi extends nyx<nbi> {
    public String f29431a;

    public /* synthetic */ nzf m34179a(nyt nyt) {
        return m34178b(nyt);
    }

    public nbi() {
        this.f29431a = null;
        this.cachedSize = -1;
    }

    public void m34180a(nyu nyu) {
        if (this.f29431a != null) {
            nyu.m37170a(1, this.f29431a);
        }
        super.a(nyu);
    }

    protected int m34181b() {
        int b = super.b();
        if (this.f29431a != null) {
            return b + nyu.m37137b(1, this.f29431a);
        }
        return b;
    }

    private nbi m34178b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29431a = nyt.m37117j();
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
