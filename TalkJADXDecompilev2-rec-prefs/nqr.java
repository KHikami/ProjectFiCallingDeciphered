package p000;

public final class nqr extends nyx<nqr> {
    public Boolean f30520a;
    public nsv f30521b;

    public /* synthetic */ nzf m36185a(nyt nyt) {
        return m36184b(nyt);
    }

    public nqr() {
        this.f30520a = null;
        this.cachedSize = -1;
    }

    public void m36186a(nyu nyu) {
        if (this.f30520a != null) {
            nyu.m37172a(1, this.f30520a.booleanValue());
        }
        if (this.f30521b != null) {
            nyu.m37182b(2, this.f30521b);
        }
        super.a(nyu);
    }

    protected int m36187b() {
        int b = super.b();
        if (this.f30520a != null) {
            this.f30520a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30521b != null) {
            return b + nyu.m37145d(2, this.f30521b);
        }
        return b;
    }

    private nqr m36184b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30520a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30521b == null) {
                        this.f30521b = new nsv();
                    }
                    nyt.m37101a(this.f30521b);
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
