package p000;

public final class nhf extends nyx<nhf> {
    public ngp f29824a;
    public Boolean f29825b;
    public ngf f29826c;
    public nni f29827d;
    public nhr f29828e;
    public nhr f29829f;
    public nhs f29830g;

    public /* synthetic */ nzf m34937a(nyt nyt) {
        return m34935b(nyt);
    }

    public nhf() {
        m34936d();
    }

    private nhf m34936d() {
        this.f29824a = null;
        this.f29825b = null;
        this.f29826c = null;
        this.f29827d = null;
        this.f29828e = null;
        this.f29829f = null;
        this.f29830g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34938a(nyu nyu) {
        if (this.f29825b != null) {
            nyu.m37172a(1, this.f29825b.booleanValue());
        }
        if (this.f29826c != null) {
            nyu.m37182b(2, this.f29826c);
        }
        if (this.f29827d != null) {
            nyu.m37182b(3, this.f29827d);
        }
        if (this.f29828e != null) {
            nyu.m37182b(6, this.f29828e);
        }
        if (this.f29829f != null) {
            nyu.m37182b(7, this.f29829f);
        }
        if (this.f29830g != null) {
            nyu.m37182b(8, this.f29830g);
        }
        if (this.f29824a != null) {
            nyu.m37182b(12, this.f29824a);
        }
        super.a(nyu);
    }

    protected int m34939b() {
        int b = super.b();
        if (this.f29825b != null) {
            this.f29825b.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f29826c != null) {
            b += nyu.m37145d(2, this.f29826c);
        }
        if (this.f29827d != null) {
            b += nyu.m37145d(3, this.f29827d);
        }
        if (this.f29828e != null) {
            b += nyu.m37145d(6, this.f29828e);
        }
        if (this.f29829f != null) {
            b += nyu.m37145d(7, this.f29829f);
        }
        if (this.f29830g != null) {
            b += nyu.m37145d(8, this.f29830g);
        }
        if (this.f29824a != null) {
            return b + nyu.m37145d(12, this.f29824a);
        }
        return b;
    }

    private nhf m34935b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29825b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f29826c == null) {
                        this.f29826c = new ngf();
                    }
                    nyt.m37101a(this.f29826c);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29827d == null) {
                        this.f29827d = new nni();
                    }
                    nyt.m37101a(this.f29827d);
                    continue;
                case 50:
                    if (this.f29828e == null) {
                        this.f29828e = new nhr();
                    }
                    nyt.m37101a(this.f29828e);
                    continue;
                case 58:
                    if (this.f29829f == null) {
                        this.f29829f = new nhr();
                    }
                    nyt.m37101a(this.f29829f);
                    continue;
                case 66:
                    if (this.f29830g == null) {
                        this.f29830g = new nhs();
                    }
                    nyt.m37101a(this.f29830g);
                    continue;
                case 98:
                    if (this.f29824a == null) {
                        this.f29824a = new ngp();
                    }
                    nyt.m37101a(this.f29824a);
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
