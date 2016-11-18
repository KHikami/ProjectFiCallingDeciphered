package p000;

public final class nbt extends nyx<nbt> {
    public String f29459a;
    public String f29460b;

    public /* synthetic */ nzf m34225a(nyt nyt) {
        return m34224b(nyt);
    }

    public nbt() {
        this.f29459a = null;
        this.f29460b = null;
        this.cachedSize = -1;
    }

    public void m34226a(nyu nyu) {
        if (this.f29459a != null) {
            nyu.m37170a(1, this.f29459a);
        }
        if (this.f29460b != null) {
            nyu.m37170a(2, this.f29460b);
        }
        super.a(nyu);
    }

    protected int m34227b() {
        int b = super.b();
        if (this.f29459a != null) {
            b += nyu.m37137b(1, this.f29459a);
        }
        if (this.f29460b != null) {
            return b + nyu.m37137b(2, this.f29460b);
        }
        return b;
    }

    private nbt m34224b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29459a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f29460b = nyt.m37117j();
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
