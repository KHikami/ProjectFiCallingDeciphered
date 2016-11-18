package p000;

public final class nri extends nyx<nri> {
    public Boolean f30586a;

    public /* synthetic */ nzf m36255a(nyt nyt) {
        return m36254b(nyt);
    }

    public nri() {
        this.f30586a = null;
        this.cachedSize = -1;
    }

    public void m36256a(nyu nyu) {
        if (this.f30586a != null) {
            nyu.m37172a(1, this.f30586a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36257b() {
        int b = super.b();
        if (this.f30586a == null) {
            return b;
        }
        this.f30586a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nri m36254b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30586a = Boolean.valueOf(nyt.m37116i());
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
