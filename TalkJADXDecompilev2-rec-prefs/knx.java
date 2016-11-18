package p000;

public final class knx extends nyx<knx> {
    public String f22453a;
    public koa f22454b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26734b(nyt);
    }

    public knx() {
        m26735d();
    }

    private knx m26735d() {
        this.f22453a = null;
        this.f22454b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22453a != null) {
            nyu.a(1, this.f22453a);
        }
        if (this.f22454b != null) {
            nyu.b(2, this.f22454b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22453a != null) {
            b += nyu.b(1, this.f22453a);
        }
        if (this.f22454b != null) {
            return b + nyu.d(2, this.f22454b);
        }
        return b;
    }

    private knx m26734b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22453a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f22454b == null) {
                        this.f22454b = new koa();
                    }
                    nyt.a(this.f22454b);
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
