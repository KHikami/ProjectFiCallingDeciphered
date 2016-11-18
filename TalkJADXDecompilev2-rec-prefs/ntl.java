package p000;

public final class ntl extends nyx<ntl> {
    public Boolean f30754a;

    public /* synthetic */ nzf m36486a(nyt nyt) {
        return m36485b(nyt);
    }

    public ntl() {
        this.f30754a = null;
        this.cachedSize = -1;
    }

    public void m36487a(nyu nyu) {
        if (this.f30754a != null) {
            nyu.m37172a(1, this.f30754a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36488b() {
        int b = super.b();
        if (this.f30754a == null) {
            return b;
        }
        this.f30754a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ntl m36485b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30754a = Boolean.valueOf(nyt.m37116i());
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
