package p000;

public final class npf extends nyx<npf> {
    public nph f30429a;

    public /* synthetic */ nzf m36016a(nyt nyt) {
        return m36015b(nyt);
    }

    public npf() {
        this.cachedSize = -1;
    }

    public void m36017a(nyu nyu) {
        if (this.f30429a != null) {
            nyu.m37182b(2, this.f30429a);
        }
        super.a(nyu);
    }

    protected int m36018b() {
        int b = super.b();
        if (this.f30429a != null) {
            return b + nyu.m37145d(2, this.f30429a);
        }
        return b;
    }

    private npf m36015b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f30429a == null) {
                        this.f30429a = new nph();
                    }
                    nyt.m37101a(this.f30429a);
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
