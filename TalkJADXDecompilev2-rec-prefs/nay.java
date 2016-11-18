package p000;

public final class nay extends nyx<nay> {
    public nat f29404a;
    public nav f29405b;
    public naz f29406c;
    public nba f29407d;
    public nbd f29408e;
    public nbe f29409f;
    public nau f29410g;
    public nbc f29411h;

    public /* synthetic */ nzf m34131a(nyt nyt) {
        return m34129b(nyt);
    }

    public nay() {
        m34130d();
    }

    private nay m34130d() {
        this.f29404a = null;
        this.f29405b = null;
        this.f29406c = null;
        this.f29407d = null;
        this.f29408e = null;
        this.f29409f = null;
        this.f29410g = null;
        this.f29411h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34132a(nyu nyu) {
        if (this.f29404a != null) {
            nyu.m37182b(1, this.f29404a);
        }
        if (this.f29405b != null) {
            nyu.m37182b(2, this.f29405b);
        }
        if (this.f29406c != null) {
            nyu.m37182b(3, this.f29406c);
        }
        if (this.f29407d != null) {
            nyu.m37182b(4, this.f29407d);
        }
        if (this.f29408e != null) {
            nyu.m37182b(5, this.f29408e);
        }
        if (this.f29409f != null) {
            nyu.m37182b(6, this.f29409f);
        }
        if (this.f29410g != null) {
            nyu.m37182b(7, this.f29410g);
        }
        if (this.f29411h != null) {
            nyu.m37182b(8, this.f29411h);
        }
        super.a(nyu);
    }

    protected int m34133b() {
        int b = super.b();
        if (this.f29404a != null) {
            b += nyu.m37145d(1, this.f29404a);
        }
        if (this.f29405b != null) {
            b += nyu.m37145d(2, this.f29405b);
        }
        if (this.f29406c != null) {
            b += nyu.m37145d(3, this.f29406c);
        }
        if (this.f29407d != null) {
            b += nyu.m37145d(4, this.f29407d);
        }
        if (this.f29408e != null) {
            b += nyu.m37145d(5, this.f29408e);
        }
        if (this.f29409f != null) {
            b += nyu.m37145d(6, this.f29409f);
        }
        if (this.f29410g != null) {
            b += nyu.m37145d(7, this.f29410g);
        }
        if (this.f29411h != null) {
            return b + nyu.m37145d(8, this.f29411h);
        }
        return b;
    }

    private nay m34129b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29404a == null) {
                        this.f29404a = new nat();
                    }
                    nyt.m37101a(this.f29404a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29405b == null) {
                        this.f29405b = new nav();
                    }
                    nyt.m37101a(this.f29405b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29406c == null) {
                        this.f29406c = new naz();
                    }
                    nyt.m37101a(this.f29406c);
                    continue;
                case 34:
                    if (this.f29407d == null) {
                        this.f29407d = new nba();
                    }
                    nyt.m37101a(this.f29407d);
                    continue;
                case 42:
                    if (this.f29408e == null) {
                        this.f29408e = new nbd();
                    }
                    nyt.m37101a(this.f29408e);
                    continue;
                case 50:
                    if (this.f29409f == null) {
                        this.f29409f = new nbe();
                    }
                    nyt.m37101a(this.f29409f);
                    continue;
                case 58:
                    if (this.f29410g == null) {
                        this.f29410g = new nau();
                    }
                    nyt.m37101a(this.f29410g);
                    continue;
                case 66:
                    if (this.f29411h == null) {
                        this.f29411h = new nbc();
                    }
                    nyt.m37101a(this.f29411h);
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
