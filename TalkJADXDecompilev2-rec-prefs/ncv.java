package p000;

public final class ncv extends nyx<ncv> {
    public nou f29534a;
    public Boolean f29535b;

    public /* synthetic */ nzf m34361a(nyt nyt) {
        return m34360b(nyt);
    }

    public ncv() {
        this.f29535b = null;
        this.cachedSize = -1;
    }

    public void m34362a(nyu nyu) {
        if (this.f29534a != null) {
            nyu.m37182b(1, this.f29534a);
        }
        if (this.f29535b != null) {
            nyu.m37172a(2, this.f29535b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34363b() {
        int b = super.b();
        if (this.f29534a != null) {
            b += nyu.m37145d(1, this.f29534a);
        }
        if (this.f29535b == null) {
            return b;
        }
        this.f29535b.booleanValue();
        return b + (nyu.m37154h(2) + 1);
    }

    private ncv m34360b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29534a == null) {
                        this.f29534a = new nou();
                    }
                    nyt.m37101a(this.f29534a);
                    continue;
                case 16:
                    this.f29535b = Boolean.valueOf(nyt.m37116i());
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
