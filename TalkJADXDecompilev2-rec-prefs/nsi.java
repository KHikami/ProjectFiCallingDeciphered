package p000;

public final class nsi extends nyx<nsi> {
    public Boolean f30702a;
    public nsj f30703b;

    public /* synthetic */ nzf m36363a(nyt nyt) {
        return m36362b(nyt);
    }

    public nsi() {
        this.f30702a = null;
        this.cachedSize = -1;
    }

    public void m36364a(nyu nyu) {
        if (this.f30702a != null) {
            nyu.m37172a(1, this.f30702a.booleanValue());
        }
        if (this.f30703b != null) {
            nyu.m37182b(5, this.f30703b);
        }
        super.a(nyu);
    }

    protected int m36365b() {
        int b = super.b();
        if (this.f30702a != null) {
            this.f30702a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30703b != null) {
            return b + nyu.m37145d(5, this.f30703b);
        }
        return b;
    }

    private nsi m36362b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30702a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 42:
                    if (this.f30703b == null) {
                        this.f30703b = new nsj();
                    }
                    nyt.m37101a(this.f30703b);
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
