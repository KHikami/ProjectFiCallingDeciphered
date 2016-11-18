package p000;

public final class nqt extends nyx<nqt> {
    public Boolean f30524a;

    public /* synthetic */ nzf m36193a(nyt nyt) {
        return m36192b(nyt);
    }

    public nqt() {
        this.f30524a = null;
        this.cachedSize = -1;
    }

    public void m36194a(nyu nyu) {
        if (this.f30524a != null) {
            nyu.m37172a(1, this.f30524a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36195b() {
        int b = super.b();
        if (this.f30524a == null) {
            return b;
        }
        this.f30524a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nqt m36192b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30524a = Boolean.valueOf(nyt.m37116i());
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
