package p000;

public final class kgz extends nyx<kgz> {
    public Long f21673a;
    public String f21674b;
    public Long f21675c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25792b(nyt);
    }

    public kgz() {
        this.f21673a = null;
        this.f21674b = null;
        this.f21675c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21673a != null) {
            nyu.b(1, this.f21673a.longValue());
        }
        if (this.f21674b != null) {
            nyu.a(2, this.f21674b);
        }
        if (this.f21675c != null) {
            nyu.b(3, this.f21675c.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21673a != null) {
            b += nyu.f(1, this.f21673a.longValue());
        }
        if (this.f21674b != null) {
            b += nyu.b(2, this.f21674b);
        }
        if (this.f21675c != null) {
            return b + nyu.f(3, this.f21675c.longValue());
        }
        return b;
    }

    private kgz m25792b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f21673a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    this.f21674b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f21675c = Long.valueOf(nyt.e());
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
