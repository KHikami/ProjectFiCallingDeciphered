package p000;

public final class ngx extends nyx<ngx> {
    public Boolean f29811a;
    public ngy f29812b;

    public /* synthetic */ nzf m34891a(nyt nyt) {
        return m34889b(nyt);
    }

    public ngx() {
        m34890d();
    }

    private ngx m34890d() {
        this.f29811a = null;
        this.f29812b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34892a(nyu nyu) {
        if (this.f29811a != null) {
            nyu.m37172a(1, this.f29811a.booleanValue());
        }
        if (this.f29812b != null) {
            nyu.m37182b(2, this.f29812b);
        }
        super.a(nyu);
    }

    protected int m34893b() {
        int b = super.b();
        if (this.f29811a != null) {
            this.f29811a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f29812b != null) {
            return b + nyu.m37145d(2, this.f29812b);
        }
        return b;
    }

    private ngx m34889b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29811a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f29812b == null) {
                        this.f29812b = new ngy();
                    }
                    nyt.m37101a(this.f29812b);
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
