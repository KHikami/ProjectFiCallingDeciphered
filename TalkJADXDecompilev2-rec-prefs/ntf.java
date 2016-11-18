package p000;

public final class ntf extends nyx<ntf> {
    public Boolean f30744a;
    public ntl f30745b;

    public /* synthetic */ nzf m36458a(nyt nyt) {
        return m36457b(nyt);
    }

    public ntf() {
        this.f30744a = null;
        this.cachedSize = -1;
    }

    public void m36459a(nyu nyu) {
        if (this.f30744a != null) {
            nyu.m37172a(1, this.f30744a.booleanValue());
        }
        if (this.f30745b != null) {
            nyu.m37182b(2, this.f30745b);
        }
        super.a(nyu);
    }

    protected int m36460b() {
        int b = super.b();
        if (this.f30744a != null) {
            this.f30744a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30745b != null) {
            return b + nyu.m37145d(2, this.f30745b);
        }
        return b;
    }

    private ntf m36457b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30744a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30745b == null) {
                        this.f30745b = new ntl();
                    }
                    nyt.m37101a(this.f30745b);
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
