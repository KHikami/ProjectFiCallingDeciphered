package p000;

public final class ocv extends nyx<ocv> {
    public String f32331a;
    public String f32332b;
    public Long f32333c;

    public /* synthetic */ nzf m37796a(nyt nyt) {
        return m37795b(nyt);
    }

    public ocv() {
        this.f32331a = null;
        this.f32332b = null;
        this.f32333c = null;
        this.cachedSize = -1;
    }

    public void m37797a(nyu nyu) {
        nyu.m37170a(1, this.f32331a);
        nyu.m37170a(2, this.f32332b);
        if (this.f32333c != null) {
            nyu.m37181b(7, this.f32333c.longValue());
        }
        super.a(nyu);
    }

    protected int m37798b() {
        int b = (super.b() + nyu.m37137b(1, this.f32331a)) + nyu.m37137b(2, this.f32332b);
        if (this.f32333c != null) {
            return b + nyu.m37148f(7, this.f32333c.longValue());
        }
        return b;
    }

    private ocv m37795b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32331a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32332b = nyt.m37117j();
                    continue;
                case 56:
                    this.f32333c = Long.valueOf(nyt.m37110e());
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
