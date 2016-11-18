package p000;

public final class khu extends nyx<khu> {
    public Long f21795a;
    public String f21796b;
    public Long f21797c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25896b(nyt);
    }

    public khu() {
        m25897d();
    }

    private khu m25897d() {
        this.f21795a = null;
        this.f21796b = null;
        this.f21797c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21795a != null) {
            nyu.b(1, this.f21795a.longValue());
        }
        if (this.f21796b != null) {
            nyu.a(2, this.f21796b);
        }
        if (this.f21797c != null) {
            nyu.b(3, this.f21797c.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21795a != null) {
            b += nyu.f(1, this.f21795a.longValue());
        }
        if (this.f21796b != null) {
            b += nyu.b(2, this.f21796b);
        }
        if (this.f21797c != null) {
            return b + nyu.f(3, this.f21797c.longValue());
        }
        return b;
    }

    private khu m25896b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f21795a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    this.f21796b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f21797c = Long.valueOf(nyt.e());
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
