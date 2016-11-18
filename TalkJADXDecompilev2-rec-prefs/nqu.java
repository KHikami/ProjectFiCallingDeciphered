package p000;

public final class nqu extends nyx<nqu> {
    public String f30525a;
    public Boolean f30526b;
    public Long f30527c;
    public String f30528d;

    public /* synthetic */ nzf m36197a(nyt nyt) {
        return m36196b(nyt);
    }

    public nqu() {
        this.f30525a = null;
        this.f30526b = null;
        this.f30527c = null;
        this.f30528d = null;
        this.cachedSize = -1;
    }

    public void m36198a(nyu nyu) {
        if (this.f30525a != null) {
            nyu.m37170a(1, this.f30525a);
        }
        if (this.f30527c != null) {
            nyu.m37181b(2, this.f30527c.longValue());
        }
        if (this.f30528d != null) {
            nyu.m37170a(3, this.f30528d);
        }
        if (this.f30526b != null) {
            nyu.m37172a(4, this.f30526b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36199b() {
        int b = super.b();
        if (this.f30525a != null) {
            b += nyu.m37137b(1, this.f30525a);
        }
        if (this.f30527c != null) {
            b += nyu.m37148f(2, this.f30527c.longValue());
        }
        if (this.f30528d != null) {
            b += nyu.m37137b(3, this.f30528d);
        }
        if (this.f30526b == null) {
            return b;
        }
        this.f30526b.booleanValue();
        return b + (nyu.m37154h(4) + 1);
    }

    private nqu m36196b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30525a = nyt.m37117j();
                    continue;
                case 16:
                    this.f30527c = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dx /*26*/:
                    this.f30528d = nyt.m37117j();
                    continue;
                case 32:
                    this.f30526b = Boolean.valueOf(nyt.m37116i());
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
