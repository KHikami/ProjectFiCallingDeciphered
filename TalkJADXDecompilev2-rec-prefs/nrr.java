package p000;

public final class nrr extends nyx<nrr> {
    public Boolean f30616a;

    public /* synthetic */ nzf m36293a(nyt nyt) {
        return m36292b(nyt);
    }

    public nrr() {
        this.f30616a = null;
        this.cachedSize = -1;
    }

    public void m36294a(nyu nyu) {
        if (this.f30616a != null) {
            nyu.m37172a(1, this.f30616a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36295b() {
        int b = super.b();
        if (this.f30616a == null) {
            return b;
        }
        this.f30616a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nrr m36292b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30616a = Boolean.valueOf(nyt.m37116i());
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
