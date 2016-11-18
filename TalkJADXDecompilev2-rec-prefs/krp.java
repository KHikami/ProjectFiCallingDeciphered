package p000;

public final class krp extends nyx<krp> {
    public String f22922a;
    public Boolean f22923b;
    public Boolean f22924c;
    public Boolean f22925d;
    public Boolean f22926e;
    public Boolean f22927f;
    public krq f22928g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27220b(nyt);
    }

    public krp() {
        m27221d();
    }

    private krp m27221d() {
        this.f22922a = null;
        this.f22923b = null;
        this.f22924c = null;
        this.f22925d = null;
        this.f22926e = null;
        this.f22927f = null;
        this.f22928g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22922a != null) {
            nyu.a(1, this.f22922a);
        }
        if (this.f22923b != null) {
            nyu.a(2, this.f22923b.booleanValue());
        }
        if (this.f22924c != null) {
            nyu.a(3, this.f22924c.booleanValue());
        }
        if (this.f22925d != null) {
            nyu.a(4, this.f22925d.booleanValue());
        }
        if (this.f22926e != null) {
            nyu.a(5, this.f22926e.booleanValue());
        }
        if (this.f22927f != null) {
            nyu.a(6, this.f22927f.booleanValue());
        }
        if (this.f22928g != null) {
            nyu.b(7, this.f22928g);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22922a != null) {
            b += nyu.b(1, this.f22922a);
        }
        if (this.f22923b != null) {
            this.f22923b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f22924c != null) {
            this.f22924c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f22925d != null) {
            this.f22925d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f22926e != null) {
            this.f22926e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f22927f != null) {
            this.f22927f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f22928g != null) {
            return b + nyu.d(7, this.f22928g);
        }
        return b;
    }

    private krp m27220b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22922a = nyt.j();
                    continue;
                case 16:
                    this.f22923b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f22924c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f22925d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.f22926e = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f22927f = Boolean.valueOf(nyt.i());
                    continue;
                case 58:
                    if (this.f22928g == null) {
                        this.f22928g = new krq();
                    }
                    nyt.a(this.f22928g);
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
