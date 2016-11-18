package p000;

public final class nzu extends nyx<nzu> {
    public String f31391a;

    public /* synthetic */ nzf m37303a(nyt nyt) {
        return m37302b(nyt);
    }

    public nzu() {
        this.f31391a = null;
        this.cachedSize = -1;
    }

    public void m37304a(nyu nyu) {
        if (this.f31391a != null) {
            nyu.m37170a(1, this.f31391a);
        }
        super.a(nyu);
    }

    protected int m37305b() {
        int b = super.b();
        if (this.f31391a != null) {
            return b + nyu.m37137b(1, this.f31391a);
        }
        return b;
    }

    private nzu m37302b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31391a = nyt.m37117j();
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
