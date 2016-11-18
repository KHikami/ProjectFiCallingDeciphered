package p000;

public final class nsu extends nyx<nsu> {
    public Boolean f30728a;

    public /* synthetic */ nzf m36412a(nyt nyt) {
        return m36411b(nyt);
    }

    public nsu() {
        this.f30728a = null;
        this.cachedSize = -1;
    }

    public void m36413a(nyu nyu) {
        if (this.f30728a != null) {
            nyu.m37172a(1, this.f30728a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36414b() {
        int b = super.b();
        if (this.f30728a == null) {
            return b;
        }
        this.f30728a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nsu m36411b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30728a = Boolean.valueOf(nyt.m37116i());
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
