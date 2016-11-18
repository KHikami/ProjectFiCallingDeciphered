package p000;

public final class oaw extends nyx<oaw> {
    public Boolean f31821a;
    public Boolean f31822b;
    public Boolean f31823c;
    public Boolean f31824d;
    public Boolean f31825e;
    public Boolean f31826f;
    public Boolean f31827g;

    public /* synthetic */ nzf m37477a(nyt nyt) {
        return m37476b(nyt);
    }

    public oaw() {
        this.f31821a = null;
        this.f31822b = null;
        this.f31823c = null;
        this.f31824d = null;
        this.f31825e = null;
        this.f31826f = null;
        this.f31827g = null;
        this.cachedSize = -1;
    }

    public void m37478a(nyu nyu) {
        if (this.f31821a != null) {
            nyu.m37172a(1, this.f31821a.booleanValue());
        }
        if (this.f31822b != null) {
            nyu.m37172a(2, this.f31822b.booleanValue());
        }
        if (this.f31823c != null) {
            nyu.m37172a(3, this.f31823c.booleanValue());
        }
        if (this.f31824d != null) {
            nyu.m37172a(4, this.f31824d.booleanValue());
        }
        if (this.f31825e != null) {
            nyu.m37172a(5, this.f31825e.booleanValue());
        }
        if (this.f31826f != null) {
            nyu.m37172a(6, this.f31826f.booleanValue());
        }
        if (this.f31827g != null) {
            nyu.m37172a(7, this.f31827g.booleanValue());
        }
        super.a(nyu);
    }

    protected int m37479b() {
        int b = super.b();
        if (this.f31821a != null) {
            this.f31821a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f31822b != null) {
            this.f31822b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f31823c != null) {
            this.f31823c.booleanValue();
            b += nyu.m37154h(3) + 1;
        }
        if (this.f31824d != null) {
            this.f31824d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f31825e != null) {
            this.f31825e.booleanValue();
            b += nyu.m37154h(5) + 1;
        }
        if (this.f31826f != null) {
            this.f31826f.booleanValue();
            b += nyu.m37154h(6) + 1;
        }
        if (this.f31827g == null) {
            return b;
        }
        this.f31827g.booleanValue();
        return b + (nyu.m37154h(7) + 1);
    }

    private oaw m37476b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31821a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f31822b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f31823c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 32:
                    this.f31824d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 40:
                    this.f31825e = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 48:
                    this.f31826f = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 56:
                    this.f31827g = Boolean.valueOf(nyt.m37116i());
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
