package p000;

public final class occ extends nyx<occ> {
    public String f32178a;
    public String f32179b;

    public /* synthetic */ nzf m37716a(nyt nyt) {
        return m37715b(nyt);
    }

    public occ() {
        this.f32178a = null;
        this.f32179b = null;
        this.cachedSize = -1;
    }

    public void m37717a(nyu nyu) {
        nyu.m37170a(1, this.f32178a);
        nyu.m37170a(2, this.f32179b);
        super.a(nyu);
    }

    protected int m37718b() {
        return (super.b() + nyu.m37137b(1, this.f32178a)) + nyu.m37137b(2, this.f32179b);
    }

    private occ m37715b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32178a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32179b = nyt.m37117j();
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
