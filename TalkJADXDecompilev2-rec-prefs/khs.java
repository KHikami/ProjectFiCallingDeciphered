package p000;

public final class khs extends nyx<khs> {
    public Boolean f21785a;
    public Boolean f21786b;
    public Boolean f21787c;
    public Boolean f21788d;
    public Boolean f21789e;
    public Boolean f21790f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25886b(nyt);
    }

    public khs() {
        m25887d();
    }

    private khs m25887d() {
        this.f21785a = null;
        this.f21786b = null;
        this.f21787c = null;
        this.f21788d = null;
        this.f21789e = null;
        this.f21790f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21785a != null) {
            nyu.a(1, this.f21785a.booleanValue());
        }
        if (this.f21786b != null) {
            nyu.a(2, this.f21786b.booleanValue());
        }
        if (this.f21787c != null) {
            nyu.a(3, this.f21787c.booleanValue());
        }
        if (this.f21788d != null) {
            nyu.a(4, this.f21788d.booleanValue());
        }
        if (this.f21789e != null) {
            nyu.a(5, this.f21789e.booleanValue());
        }
        if (this.f21790f != null) {
            nyu.a(6, this.f21790f.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21785a != null) {
            this.f21785a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f21786b != null) {
            this.f21786b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f21787c != null) {
            this.f21787c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f21788d != null) {
            this.f21788d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f21789e != null) {
            this.f21789e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f21790f == null) {
            return b;
        }
        this.f21790f.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private khs m25886b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f21785a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f21786b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f21787c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f21788d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.f21789e = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f21790f = Boolean.valueOf(nyt.i());
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
