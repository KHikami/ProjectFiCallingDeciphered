package p000;

public final class khi extends nyx<khi> {
    public Long f21758a;
    public Long f21759b;
    public Long f21760c;
    public Long f21761d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25838b(nyt);
    }

    public khi() {
        m25839d();
    }

    private khi m25839d() {
        this.f21758a = null;
        this.f21759b = null;
        this.f21760c = null;
        this.f21761d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21758a != null) {
            nyu.b(1, this.f21758a.longValue());
        }
        if (this.f21759b != null) {
            nyu.b(2, this.f21759b.longValue());
        }
        if (this.f21760c != null) {
            nyu.b(3, this.f21760c.longValue());
        }
        if (this.f21761d != null) {
            nyu.b(4, this.f21761d.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21758a != null) {
            b += nyu.f(1, this.f21758a.longValue());
        }
        if (this.f21759b != null) {
            b += nyu.f(2, this.f21759b.longValue());
        }
        if (this.f21760c != null) {
            b += nyu.f(3, this.f21760c.longValue());
        }
        if (this.f21761d != null) {
            return b + nyu.f(4, this.f21761d.longValue());
        }
        return b;
    }

    private khi m25838b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f21758a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.f21759b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.f21760c = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    this.f21761d = Long.valueOf(nyt.e());
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
