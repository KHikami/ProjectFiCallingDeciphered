package p000;

public final class nou extends nyx<nou> {
    public String f30397a;
    public nov f30398b;
    public now f30399c;

    public /* synthetic */ nzf m35954a(nyt nyt) {
        return m35953b(nyt);
    }

    public nou() {
        this.f30397a = null;
        this.cachedSize = -1;
    }

    public void m35955a(nyu nyu) {
        if (this.f30397a != null) {
            nyu.m37170a(1, this.f30397a);
        }
        if (this.f30398b != null) {
            nyu.m37182b(2, this.f30398b);
        }
        if (this.f30399c != null) {
            nyu.m37182b(3, this.f30399c);
        }
        super.a(nyu);
    }

    protected int m35956b() {
        int b = super.b();
        if (this.f30397a != null) {
            b += nyu.m37137b(1, this.f30397a);
        }
        if (this.f30398b != null) {
            b += nyu.m37145d(2, this.f30398b);
        }
        if (this.f30399c != null) {
            return b + nyu.m37145d(3, this.f30399c);
        }
        return b;
    }

    private nou m35953b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30397a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f30398b == null) {
                        this.f30398b = new nov();
                    }
                    nyt.m37101a(this.f30398b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30399c == null) {
                        this.f30399c = new now();
                    }
                    nyt.m37101a(this.f30399c);
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
