package p000;

public final class ntn extends nyx<ntn> {
    public Boolean f30757a;

    public /* synthetic */ nzf m36494a(nyt nyt) {
        return m36493b(nyt);
    }

    public ntn() {
        this.f30757a = null;
        this.cachedSize = -1;
    }

    public void m36495a(nyu nyu) {
        if (this.f30757a != null) {
            nyu.m37172a(1, this.f30757a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36496b() {
        int b = super.b();
        if (this.f30757a == null) {
            return b;
        }
        this.f30757a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ntn m36493b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30757a = Boolean.valueOf(nyt.m37116i());
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
