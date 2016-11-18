package p000;

public final class nqm extends nyx<nqm> {
    public Boolean f30510a;
    public nqn f30511b;

    public /* synthetic */ nzf m36164a(nyt nyt) {
        return m36163b(nyt);
    }

    public nqm() {
        this.f30510a = null;
        this.cachedSize = -1;
    }

    public void m36165a(nyu nyu) {
        if (this.f30510a != null) {
            nyu.m37172a(1, this.f30510a.booleanValue());
        }
        if (this.f30511b != null) {
            nyu.m37182b(2, this.f30511b);
        }
        super.a(nyu);
    }

    protected int m36166b() {
        int b = super.b();
        if (this.f30510a != null) {
            this.f30510a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30511b != null) {
            return b + nyu.m37145d(2, this.f30511b);
        }
        return b;
    }

    private nqm m36163b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30510a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30511b == null) {
                        this.f30511b = new nqn();
                    }
                    nyt.m37101a(this.f30511b);
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
