package p000;

public final class ohq extends nyx<ohq> {
    public Long f32924a;
    public String f32925b;
    public String f32926c;

    public /* synthetic */ nzf m38382a(nyt nyt) {
        return m38380b(nyt);
    }

    public ohq() {
        m38381d();
    }

    private ohq m38381d() {
        this.f32924a = null;
        this.f32925b = null;
        this.f32926c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38383a(nyu nyu) {
        if (this.f32924a != null) {
            nyu.m37181b(1, this.f32924a.longValue());
        }
        if (this.f32925b != null) {
            nyu.m37170a(2, this.f32925b);
        }
        if (this.f32926c != null) {
            nyu.m37170a(3, this.f32926c);
        }
        super.a(nyu);
    }

    protected int m38384b() {
        int b = super.b();
        if (this.f32924a != null) {
            b += nyu.m37148f(1, this.f32924a.longValue());
        }
        if (this.f32925b != null) {
            b += nyu.m37137b(2, this.f32925b);
        }
        if (this.f32926c != null) {
            return b + nyu.m37137b(3, this.f32926c);
        }
        return b;
    }

    private ohq m38380b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32924a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dH /*18*/:
                    this.f32925b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f32926c = nyt.m37117j();
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
