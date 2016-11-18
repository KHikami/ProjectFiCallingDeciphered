package p000;

public final class nra extends nyx<nra> {
    public String f30538a;
    public Long f30539b;
    public String f30540c;

    public /* synthetic */ nzf m36223a(nyt nyt) {
        return m36222b(nyt);
    }

    public nra() {
        this.f30538a = null;
        this.f30539b = null;
        this.f30540c = null;
        this.cachedSize = -1;
    }

    public void m36224a(nyu nyu) {
        if (this.f30538a != null) {
            nyu.m37170a(1, this.f30538a);
        }
        if (this.f30539b != null) {
            nyu.m37187c(2, this.f30539b.longValue());
        }
        if (this.f30540c != null) {
            nyu.m37170a(3, this.f30540c);
        }
        super.a(nyu);
    }

    protected int m36225b() {
        int b = super.b();
        if (this.f30538a != null) {
            b += nyu.m37137b(1, this.f30538a);
        }
        if (this.f30539b != null) {
            this.f30539b.longValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f30540c != null) {
            return b + nyu.m37137b(3, this.f30540c);
        }
        return b;
    }

    private nra m36222b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30538a = nyt.m37117j();
                    continue;
                case wi.dK /*17*/:
                    this.f30539b = Long.valueOf(nyt.m37114g());
                    continue;
                case wi.dx /*26*/:
                    this.f30540c = nyt.m37117j();
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
