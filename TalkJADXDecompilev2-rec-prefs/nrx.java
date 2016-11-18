package p000;

public final class nrx extends nyx<nrx> {
    public Boolean f30626a;

    public /* synthetic */ nzf m36317a(nyt nyt) {
        return m36316b(nyt);
    }

    public nrx() {
        this.f30626a = null;
        this.cachedSize = -1;
    }

    public void m36318a(nyu nyu) {
        if (this.f30626a != null) {
            nyu.m37172a(1, this.f30626a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36319b() {
        int b = super.b();
        if (this.f30626a == null) {
            return b;
        }
        this.f30626a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nrx m36316b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30626a = Boolean.valueOf(nyt.m37116i());
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
