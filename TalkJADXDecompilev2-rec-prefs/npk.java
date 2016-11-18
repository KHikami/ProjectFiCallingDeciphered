package p000;

public final class npk extends nyx<npk> {
    public Boolean f30438a;

    public /* synthetic */ nzf m36036a(nyt nyt) {
        return m36035b(nyt);
    }

    public npk() {
        this.f30438a = null;
        this.cachedSize = -1;
    }

    public void m36037a(nyu nyu) {
        if (this.f30438a != null) {
            nyu.m37172a(1, this.f30438a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36038b() {
        int b = super.b();
        if (this.f30438a == null) {
            return b;
        }
        this.f30438a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private npk m36035b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30438a = Boolean.valueOf(nyt.m37116i());
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
