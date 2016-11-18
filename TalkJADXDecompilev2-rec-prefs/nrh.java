package p000;

public final class nrh extends nyx<nrh> {
    public Boolean f30585a;

    public /* synthetic */ nzf m36251a(nyt nyt) {
        return m36250b(nyt);
    }

    public nrh() {
        this.f30585a = null;
        this.cachedSize = -1;
    }

    public void m36252a(nyu nyu) {
        if (this.f30585a != null) {
            nyu.m37172a(1, this.f30585a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36253b() {
        int b = super.b();
        if (this.f30585a == null) {
            return b;
        }
        this.f30585a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nrh m36250b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30585a = Boolean.valueOf(nyt.m37116i());
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
