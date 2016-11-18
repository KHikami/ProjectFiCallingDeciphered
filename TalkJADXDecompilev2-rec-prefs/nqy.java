package p000;

public final class nqy extends nyx<nqy> {
    public Boolean f30535a;

    public /* synthetic */ nzf m36213a(nyt nyt) {
        return m36212b(nyt);
    }

    public nqy() {
        this.f30535a = null;
        this.cachedSize = -1;
    }

    public void m36214a(nyu nyu) {
        if (this.f30535a != null) {
            nyu.m37172a(1, this.f30535a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36215b() {
        int b = super.b();
        if (this.f30535a == null) {
            return b;
        }
        this.f30535a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nqy m36212b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30535a = Boolean.valueOf(nyt.m37116i());
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
