package p000;

public final class nsz extends nyx<nsz> {
    public Boolean f30734a;

    public /* synthetic */ nzf m36432a(nyt nyt) {
        return m36431b(nyt);
    }

    public nsz() {
        this.f30734a = null;
        this.cachedSize = -1;
    }

    public void m36433a(nyu nyu) {
        if (this.f30734a != null) {
            nyu.m37172a(1, this.f30734a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36434b() {
        int b = super.b();
        if (this.f30734a == null) {
            return b;
        }
        this.f30734a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nsz m36431b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30734a = Boolean.valueOf(nyt.m37116i());
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
