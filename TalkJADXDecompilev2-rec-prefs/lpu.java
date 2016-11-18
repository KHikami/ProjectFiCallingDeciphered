package p000;

public final class lpu extends nyx<lpu> {
    public Boolean f26027a;
    public Long f26028b;
    public Long f26029c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29956b(nyt);
    }

    public lpu() {
        m29957d();
    }

    private lpu m29957d() {
        this.f26027a = null;
        this.f26028b = null;
        this.f26029c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26027a != null) {
            nyu.a(1, this.f26027a.booleanValue());
        }
        if (this.f26028b != null) {
            nyu.b(2, this.f26028b.longValue());
        }
        if (this.f26029c != null) {
            nyu.b(3, this.f26029c.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26027a != null) {
            this.f26027a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f26028b != null) {
            b += nyu.f(2, this.f26028b.longValue());
        }
        if (this.f26029c != null) {
            return b + nyu.f(3, this.f26029c.longValue());
        }
        return b;
    }

    private lpu m29956b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26027a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f26028b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.f26029c = Long.valueOf(nyt.e());
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
