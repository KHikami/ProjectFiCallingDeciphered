package p000;

public final class ocx extends nyx<ocx> {
    private static volatile ocx[] f32335d;
    public Long f32336a;
    public String f32337b;
    public String f32338c;

    public /* synthetic */ nzf m37805a(nyt nyt) {
        return m37803b(nyt);
    }

    public static ocx[] m37804d() {
        if (f32335d == null) {
            synchronized (nzc.f31309c) {
                if (f32335d == null) {
                    f32335d = new ocx[0];
                }
            }
        }
        return f32335d;
    }

    public ocx() {
        this.f32336a = null;
        this.f32337b = null;
        this.f32338c = null;
        this.cachedSize = -1;
    }

    public void m37806a(nyu nyu) {
        nyu.m37181b(1, this.f32336a.longValue());
        nyu.m37170a(2, this.f32337b);
        nyu.m37170a(3, this.f32338c);
        super.a(nyu);
    }

    protected int m37807b() {
        return ((super.b() + nyu.m37148f(1, this.f32336a.longValue())) + nyu.m37137b(2, this.f32337b)) + nyu.m37137b(3, this.f32338c);
    }

    private ocx m37803b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32336a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dH /*18*/:
                    this.f32337b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f32338c = nyt.m37117j();
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
