package p000;

public final class not extends nyx<not> {
    public Boolean f30396a;

    public /* synthetic */ nzf m35950a(nyt nyt) {
        return m35949b(nyt);
    }

    public not() {
        this.f30396a = null;
        this.cachedSize = -1;
    }

    public void m35951a(nyu nyu) {
        if (this.f30396a != null) {
            nyu.m37172a(1, this.f30396a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35952b() {
        int b = super.b();
        if (this.f30396a == null) {
            return b;
        }
        this.f30396a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private not m35949b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30396a = Boolean.valueOf(nyt.m37116i());
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
