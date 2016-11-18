package p000;

public final class oci extends nyx<oci> {
    public Long f32248a;
    public Long f32249b;
    public Long f32250c;
    public Long f32251d;

    public /* synthetic */ nzf m37742a(nyt nyt) {
        return m37741b(nyt);
    }

    public oci() {
        this.f32248a = null;
        this.f32249b = null;
        this.f32250c = null;
        this.f32251d = null;
        this.cachedSize = -1;
    }

    public void m37743a(nyu nyu) {
        if (this.f32248a != null) {
            nyu.m37181b(1, this.f32248a.longValue());
        }
        if (this.f32249b != null) {
            nyu.m37181b(2, this.f32249b.longValue());
        }
        if (this.f32250c != null) {
            nyu.m37181b(3, this.f32250c.longValue());
        }
        if (this.f32251d != null) {
            nyu.m37181b(4, this.f32251d.longValue());
        }
        super.a(nyu);
    }

    protected int m37744b() {
        int b = super.b();
        if (this.f32248a != null) {
            b += nyu.m37148f(1, this.f32248a.longValue());
        }
        if (this.f32249b != null) {
            b += nyu.m37148f(2, this.f32249b.longValue());
        }
        if (this.f32250c != null) {
            b += nyu.m37148f(3, this.f32250c.longValue());
        }
        if (this.f32251d != null) {
            return b + nyu.m37148f(4, this.f32251d.longValue());
        }
        return b;
    }

    private oci m37741b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32248a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f32249b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dA /*24*/:
                    this.f32250c = Long.valueOf(nyt.m37110e());
                    continue;
                case 32:
                    this.f32251d = Long.valueOf(nyt.m37110e());
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
