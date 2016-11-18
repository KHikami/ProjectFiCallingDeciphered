package p000;

public final class ofy extends nyx<ofy> {
    public Long f32689a;
    public String f32690b;
    public String f32691c;

    public /* synthetic */ nzf m38135a(nyt nyt) {
        return m38134b(nyt);
    }

    public ofy() {
        this.f32689a = null;
        this.f32690b = null;
        this.f32691c = null;
        this.cachedSize = -1;
    }

    public void m38136a(nyu nyu) {
        if (this.f32689a != null) {
            nyu.m37181b(1, this.f32689a.longValue());
        }
        if (this.f32690b != null) {
            nyu.m37170a(2, this.f32690b);
        }
        if (this.f32691c != null) {
            nyu.m37170a(3, this.f32691c);
        }
        super.a(nyu);
    }

    protected int m38137b() {
        int b = super.b();
        if (this.f32689a != null) {
            b += nyu.m37148f(1, this.f32689a.longValue());
        }
        if (this.f32690b != null) {
            b += nyu.m37137b(2, this.f32690b);
        }
        if (this.f32691c != null) {
            return b + nyu.m37137b(3, this.f32691c);
        }
        return b;
    }

    private ofy m38134b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32689a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dH /*18*/:
                    this.f32690b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f32691c = nyt.m37117j();
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
