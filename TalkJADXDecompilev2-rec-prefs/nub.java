package p000;

public final class nub extends nyx<nub> {
    public String f30810a;
    public Long f30811b;
    public Long f30812c;

    public /* synthetic */ nzf m36558a(nyt nyt) {
        return m36556b(nyt);
    }

    public nub() {
        m36557d();
    }

    private nub m36557d() {
        this.f30810a = null;
        this.f30811b = null;
        this.f30812c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36559a(nyu nyu) {
        if (this.f30810a != null) {
            nyu.m37170a(1, this.f30810a);
        }
        if (this.f30811b != null) {
            nyu.m37187c(2, this.f30811b.longValue());
        }
        if (this.f30812c != null) {
            nyu.m37187c(3, this.f30812c.longValue());
        }
        super.a(nyu);
    }

    protected int m36560b() {
        int b = super.b();
        if (this.f30810a != null) {
            b += nyu.m37137b(1, this.f30810a);
        }
        if (this.f30811b != null) {
            this.f30811b.longValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f30812c == null) {
            return b;
        }
        this.f30812c.longValue();
        return b + (nyu.m37154h(3) + 8);
    }

    private nub m36556b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30810a = nyt.m37117j();
                    continue;
                case wi.dK /*17*/:
                    this.f30811b = Long.valueOf(nyt.m37114g());
                    continue;
                case wi.dz /*25*/:
                    this.f30812c = Long.valueOf(nyt.m37114g());
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
