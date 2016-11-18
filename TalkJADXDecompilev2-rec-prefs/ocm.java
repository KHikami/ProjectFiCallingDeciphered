package p000;

public final class ocm extends nyx<ocm> {
    public String f32273a;
    public Long f32274b;
    public Long f32275c;
    public ock f32276d;
    public ock f32277e;

    public /* synthetic */ nzf m37759a(nyt nyt) {
        return m37758b(nyt);
    }

    public ocm() {
        this.f32273a = null;
        this.f32274b = null;
        this.f32275c = null;
        this.cachedSize = -1;
    }

    public void m37760a(nyu nyu) {
        nyu.m37170a(1, this.f32273a);
        nyu.m37181b(2, this.f32274b.longValue());
        nyu.m37181b(3, this.f32275c.longValue());
        if (this.f32276d != null) {
            nyu.m37182b(4, this.f32276d);
        }
        if (this.f32277e != null) {
            nyu.m37182b(5, this.f32277e);
        }
        super.a(nyu);
    }

    protected int m37761b() {
        int b = ((super.b() + nyu.m37137b(1, this.f32273a)) + nyu.m37148f(2, this.f32274b.longValue())) + nyu.m37148f(3, this.f32275c.longValue());
        if (this.f32276d != null) {
            b += nyu.m37145d(4, this.f32276d);
        }
        if (this.f32277e != null) {
            return b + nyu.m37145d(5, this.f32277e);
        }
        return b;
    }

    private ocm m37758b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32273a = nyt.m37117j();
                    continue;
                case 16:
                    this.f32274b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dA /*24*/:
                    this.f32275c = Long.valueOf(nyt.m37110e());
                    continue;
                case 34:
                    if (this.f32276d == null) {
                        this.f32276d = new ock();
                    }
                    nyt.m37101a(this.f32276d);
                    continue;
                case 42:
                    if (this.f32277e == null) {
                        this.f32277e = new ock();
                    }
                    nyt.m37101a(this.f32277e);
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
