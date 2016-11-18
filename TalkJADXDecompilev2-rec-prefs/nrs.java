package p000;

public final class nrs extends nyx<nrs> {
    public nrq f30617a;
    public nrq f30618b;

    public /* synthetic */ nzf m36297a(nyt nyt) {
        return m36296b(nyt);
    }

    public nrs() {
        this.cachedSize = -1;
    }

    public void m36298a(nyu nyu) {
        if (this.f30617a != null) {
            nyu.m37182b(1, this.f30617a);
        }
        if (this.f30618b != null) {
            nyu.m37182b(2, this.f30618b);
        }
        super.a(nyu);
    }

    protected int m36299b() {
        int b = super.b();
        if (this.f30617a != null) {
            b += nyu.m37145d(1, this.f30617a);
        }
        if (this.f30618b != null) {
            return b + nyu.m37145d(2, this.f30618b);
        }
        return b;
    }

    private nrs m36296b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30617a == null) {
                        this.f30617a = new nrq();
                    }
                    nyt.m37101a(this.f30617a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f30618b == null) {
                        this.f30618b = new nrq();
                    }
                    nyt.m37101a(this.f30618b);
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
