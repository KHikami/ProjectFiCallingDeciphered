package p000;

public final class ohe extends nyx<ohe> {
    public String f32843a;
    public Long f32844b;
    public String f32845c;

    public /* synthetic */ nzf m38327a(nyt nyt) {
        return m38326b(nyt);
    }

    public ohe() {
        this.f32843a = null;
        this.f32844b = null;
        this.f32845c = null;
        this.cachedSize = -1;
    }

    public void m38328a(nyu nyu) {
        nyu.m37170a(1, this.f32843a);
        if (this.f32845c != null) {
            nyu.m37170a(2, this.f32845c);
        }
        if (this.f32844b != null) {
            nyu.m37181b(3, this.f32844b.longValue());
        }
        super.a(nyu);
    }

    protected int m38329b() {
        int b = super.b() + nyu.m37137b(1, this.f32843a);
        if (this.f32845c != null) {
            b += nyu.m37137b(2, this.f32845c);
        }
        if (this.f32844b != null) {
            return b + nyu.m37148f(3, this.f32844b.longValue());
        }
        return b;
    }

    private ohe m38326b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32843a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32845c = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    this.f32844b = Long.valueOf(nyt.m37110e());
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
