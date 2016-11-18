package p000;

public final class nrn extends nyx<nrn> {
    public Boolean f30605a;

    public /* synthetic */ nzf m36276a(nyt nyt) {
        return m36275b(nyt);
    }

    public nrn() {
        this.f30605a = null;
        this.cachedSize = -1;
    }

    public void m36277a(nyu nyu) {
        if (this.f30605a != null) {
            nyu.m37172a(1, this.f30605a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36278b() {
        int b = super.b();
        if (this.f30605a == null) {
            return b;
        }
        this.f30605a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nrn m36275b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30605a = Boolean.valueOf(nyt.m37116i());
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
