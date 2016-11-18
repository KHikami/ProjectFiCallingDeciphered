package p000;

public final class obi extends nyx<obi> {
    public String f31925a;

    public /* synthetic */ nzf m37623a(nyt nyt) {
        return m37622b(nyt);
    }

    public obi() {
        this.f31925a = null;
        this.cachedSize = -1;
    }

    public void m37624a(nyu nyu) {
        if (this.f31925a != null) {
            nyu.m37170a(1, this.f31925a);
        }
        super.a(nyu);
    }

    protected int m37625b() {
        int b = super.b();
        if (this.f31925a != null) {
            return b + nyu.m37137b(1, this.f31925a);
        }
        return b;
    }

    private obi m37622b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31925a = nyt.m37117j();
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
