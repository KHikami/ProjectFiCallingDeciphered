package p000;

public final class ntd extends nyx<ntd> {
    public Boolean f30742a;

    public /* synthetic */ nzf m36450a(nyt nyt) {
        return m36449b(nyt);
    }

    public ntd() {
        this.f30742a = null;
        this.cachedSize = -1;
    }

    public void m36451a(nyu nyu) {
        if (this.f30742a != null) {
            nyu.m37172a(1, this.f30742a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36452b() {
        int b = super.b();
        if (this.f30742a == null) {
            return b;
        }
        this.f30742a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ntd m36449b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30742a = Boolean.valueOf(nyt.m37116i());
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
