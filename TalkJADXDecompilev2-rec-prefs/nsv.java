package p000;

public final class nsv extends nyx<nsv> {
    public Boolean f30729a;

    public /* synthetic */ nzf m36416a(nyt nyt) {
        return m36415b(nyt);
    }

    public nsv() {
        this.f30729a = null;
        this.cachedSize = -1;
    }

    public void m36417a(nyu nyu) {
        if (this.f30729a != null) {
            nyu.m37172a(1, this.f30729a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36418b() {
        int b = super.b();
        if (this.f30729a == null) {
            return b;
        }
        this.f30729a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nsv m36415b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30729a = Boolean.valueOf(nyt.m37116i());
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
