package p000;

public final class lcb extends nyx<lcb> {
    public String f24549a;
    public String f24550b;
    public String f24551c;
    public String f24552d;
    public String f24553e;
    public Boolean f24554f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28565b(nyt);
    }

    public lcb() {
        m28566d();
    }

    private lcb m28566d() {
        this.f24549a = null;
        this.f24550b = null;
        this.f24551c = null;
        this.f24552d = null;
        this.f24553e = null;
        this.f24554f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24549a != null) {
            nyu.a(1, this.f24549a);
        }
        if (this.f24550b != null) {
            nyu.a(2, this.f24550b);
        }
        if (this.f24551c != null) {
            nyu.a(3, this.f24551c);
        }
        if (this.f24552d != null) {
            nyu.a(4, this.f24552d);
        }
        if (this.f24553e != null) {
            nyu.a(5, this.f24553e);
        }
        if (this.f24554f != null) {
            nyu.a(6, this.f24554f.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24549a != null) {
            b += nyu.b(1, this.f24549a);
        }
        if (this.f24550b != null) {
            b += nyu.b(2, this.f24550b);
        }
        if (this.f24551c != null) {
            b += nyu.b(3, this.f24551c);
        }
        if (this.f24552d != null) {
            b += nyu.b(4, this.f24552d);
        }
        if (this.f24553e != null) {
            b += nyu.b(5, this.f24553e);
        }
        if (this.f24554f == null) {
            return b;
        }
        this.f24554f.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private lcb m28565b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24549a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24550b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24551c = nyt.j();
                    continue;
                case 34:
                    this.f24552d = nyt.j();
                    continue;
                case 42:
                    this.f24553e = nyt.j();
                    continue;
                case 48:
                    this.f24554f = Boolean.valueOf(nyt.i());
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
