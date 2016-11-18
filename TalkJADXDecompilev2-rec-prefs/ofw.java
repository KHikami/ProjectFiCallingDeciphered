package p000;

public final class ofw extends nyx<ofw> {
    public Long f32685a;
    public String f32686b;
    public String f32687c;

    public /* synthetic */ nzf m38127a(nyt nyt) {
        return m38125b(nyt);
    }

    public ofw() {
        m38126d();
    }

    private ofw m38126d() {
        this.f32685a = null;
        this.f32686b = null;
        this.f32687c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38128a(nyu nyu) {
        if (this.f32685a != null) {
            nyu.m37181b(1, this.f32685a.longValue());
        }
        if (this.f32686b != null) {
            nyu.m37170a(2, this.f32686b);
        }
        if (this.f32687c != null) {
            nyu.m37170a(3, this.f32687c);
        }
        super.a(nyu);
    }

    protected int m38129b() {
        int b = super.b();
        if (this.f32685a != null) {
            b += nyu.m37148f(1, this.f32685a.longValue());
        }
        if (this.f32686b != null) {
            b += nyu.m37137b(2, this.f32686b);
        }
        if (this.f32687c != null) {
            return b + nyu.m37137b(3, this.f32687c);
        }
        return b;
    }

    private ofw m38125b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32685a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dH /*18*/:
                    this.f32686b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f32687c = nyt.m37117j();
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
