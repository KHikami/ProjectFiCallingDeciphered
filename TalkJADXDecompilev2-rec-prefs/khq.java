package p000;

public final class khq extends nyx<khq> {
    public Long f21780a;
    public String f21781b;
    public Long f21782c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25876b(nyt);
    }

    public khq() {
        this.f21780a = null;
        this.f21781b = null;
        this.f21782c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21780a != null) {
            nyu.b(1, this.f21780a.longValue());
        }
        if (this.f21781b != null) {
            nyu.a(2, this.f21781b);
        }
        if (this.f21782c != null) {
            nyu.b(3, this.f21782c.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21780a != null) {
            b += nyu.f(1, this.f21780a.longValue());
        }
        if (this.f21781b != null) {
            b += nyu.b(2, this.f21781b);
        }
        if (this.f21782c != null) {
            return b + nyu.f(3, this.f21782c.longValue());
        }
        return b;
    }

    private khq m25876b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f21780a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    this.f21781b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f21782c = Long.valueOf(nyt.e());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
