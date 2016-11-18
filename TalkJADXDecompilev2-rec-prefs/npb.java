package p000;

public final class npb extends nyx<npb> {
    public Boolean f30422a;

    public /* synthetic */ nzf m36000a(nyt nyt) {
        return m35999b(nyt);
    }

    public npb() {
        this.f30422a = null;
        this.cachedSize = -1;
    }

    public void m36001a(nyu nyu) {
        if (this.f30422a != null) {
            nyu.m37172a(1, this.f30422a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36002b() {
        int b = super.b();
        if (this.f30422a == null) {
            return b;
        }
        this.f30422a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private npb m35999b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30422a = Boolean.valueOf(nyt.m37116i());
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
