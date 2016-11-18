package p000;

public final class nqn extends nyx<nqn> {
    public Boolean f30512a;

    public /* synthetic */ nzf m36168a(nyt nyt) {
        return m36167b(nyt);
    }

    public nqn() {
        this.f30512a = null;
        this.cachedSize = -1;
    }

    public void m36169a(nyu nyu) {
        if (this.f30512a != null) {
            nyu.m37172a(1, this.f30512a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36170b() {
        int b = super.b();
        if (this.f30512a == null) {
            return b;
        }
        this.f30512a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nqn m36167b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30512a = Boolean.valueOf(nyt.m37116i());
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
