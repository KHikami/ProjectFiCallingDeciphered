package p000;

public final class ozk extends nyx<ozk> {
    public mxq f34685a;

    public /* synthetic */ nzf m40023a(nyt nyt) {
        return m40021b(nyt);
    }

    public ozk() {
        m40022d();
    }

    private ozk m40022d() {
        this.f34685a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m40024a(nyu nyu) {
        if (this.f34685a != null) {
            nyu.m37182b(2, this.f34685a);
        }
        super.a(nyu);
    }

    protected int m40025b() {
        int b = super.b();
        if (this.f34685a != null) {
            return b + nyu.m37145d(2, this.f34685a);
        }
        return b;
    }

    private ozk m40021b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f34685a == null) {
                        this.f34685a = new mxq();
                    }
                    nyt.m37101a(this.f34685a);
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
