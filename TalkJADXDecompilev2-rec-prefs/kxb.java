package p000;

public final class kxb extends nyx<kxb> {
    public Boolean f23825a;
    public Boolean f23826b;
    public Boolean f23827c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27886b(nyt);
    }

    public kxb() {
        m27887d();
    }

    private kxb m27887d() {
        this.f23825a = null;
        this.f23826b = null;
        this.f23827c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23825a != null) {
            nyu.a(1, this.f23825a.booleanValue());
        }
        if (this.f23826b != null) {
            nyu.a(2, this.f23826b.booleanValue());
        }
        if (this.f23827c != null) {
            nyu.a(3, this.f23827c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23825a != null) {
            this.f23825a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f23826b != null) {
            this.f23826b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f23827c == null) {
            return b;
        }
        this.f23827c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private kxb m27886b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23825a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f23826b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f23827c = Boolean.valueOf(nyt.i());
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
