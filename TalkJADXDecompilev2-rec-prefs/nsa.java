package p000;

public final class nsa extends nyx<nsa> {
    public Boolean f30641a;

    public /* synthetic */ nzf m36330a(nyt nyt) {
        return m36329b(nyt);
    }

    public nsa() {
        this.f30641a = null;
        this.cachedSize = -1;
    }

    public void m36331a(nyu nyu) {
        if (this.f30641a != null) {
            nyu.m37172a(1, this.f30641a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36332b() {
        int b = super.b();
        if (this.f30641a == null) {
            return b;
        }
        this.f30641a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nsa m36329b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30641a = Boolean.valueOf(nyt.m37116i());
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
