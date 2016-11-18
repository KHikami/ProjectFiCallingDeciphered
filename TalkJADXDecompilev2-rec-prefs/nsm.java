package p000;

public final class nsm extends nyx<nsm> {
    public Boolean f30714a;

    public /* synthetic */ nzf m36379a(nyt nyt) {
        return m36378b(nyt);
    }

    public nsm() {
        this.f30714a = null;
        this.cachedSize = -1;
    }

    public void m36380a(nyu nyu) {
        if (this.f30714a != null) {
            nyu.m37172a(1, this.f30714a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36381b() {
        int b = super.b();
        if (this.f30714a == null) {
            return b;
        }
        this.f30714a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nsm m36378b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30714a = Boolean.valueOf(nyt.m37116i());
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
