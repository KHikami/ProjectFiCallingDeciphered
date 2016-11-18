package p000;

public final class noo extends nyx<noo> {
    public String f30388a;
    public Long f30389b;

    public /* synthetic */ nzf m35930a(nyt nyt) {
        return m35929b(nyt);
    }

    public noo() {
        this.f30388a = null;
        this.f30389b = null;
        this.cachedSize = -1;
    }

    public void m35931a(nyu nyu) {
        if (this.f30388a != null) {
            nyu.m37170a(1, this.f30388a);
        }
        if (this.f30389b != null) {
            nyu.m37187c(2, this.f30389b.longValue());
        }
        super.a(nyu);
    }

    protected int m35932b() {
        int b = super.b();
        if (this.f30388a != null) {
            b += nyu.m37137b(1, this.f30388a);
        }
        if (this.f30389b == null) {
            return b;
        }
        this.f30389b.longValue();
        return b + (nyu.m37154h(2) + 8);
    }

    private noo m35929b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30388a = nyt.m37117j();
                    continue;
                case wi.dK /*17*/:
                    this.f30389b = Long.valueOf(nyt.m37114g());
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
