package p000;

public final class ntb extends nyx<ntb> {
    public Boolean f30738a;
    public ntd f30739b;

    public /* synthetic */ nzf m36441a(nyt nyt) {
        return m36440b(nyt);
    }

    public ntb() {
        this.f30738a = null;
        this.cachedSize = -1;
    }

    public void m36442a(nyu nyu) {
        if (this.f30738a != null) {
            nyu.m37172a(1, this.f30738a.booleanValue());
        }
        if (this.f30739b != null) {
            nyu.m37182b(2, this.f30739b);
        }
        super.a(nyu);
    }

    protected int m36443b() {
        int b = super.b();
        if (this.f30738a != null) {
            this.f30738a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30739b != null) {
            return b + nyu.m37145d(2, this.f30739b);
        }
        return b;
    }

    private ntb m36440b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30738a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30739b == null) {
                        this.f30739b = new ntd();
                    }
                    nyt.m37101a(this.f30739b);
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
