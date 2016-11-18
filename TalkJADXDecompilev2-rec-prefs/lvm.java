package p000;

public final class lvm extends nyx<lvm> {
    public lor f26598a;
    public ltr f26599b;
    public Long f26600c;
    public Integer f26601d;
    public Integer f26602e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30748b(nyt);
    }

    public lvm() {
        m30749d();
    }

    private lvm m30749d() {
        this.f26598a = null;
        this.f26599b = null;
        this.f26600c = null;
        this.f26602e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26598a != null) {
            nyu.b(1, this.f26598a);
        }
        if (this.f26599b != null) {
            nyu.b(2, this.f26599b);
        }
        if (this.f26600c != null) {
            nyu.a(3, this.f26600c.longValue());
        }
        if (this.f26601d != null) {
            nyu.a(4, this.f26601d.intValue());
        }
        if (this.f26602e != null) {
            nyu.c(5, this.f26602e.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26598a != null) {
            b += nyu.d(1, this.f26598a);
        }
        if (this.f26599b != null) {
            b += nyu.d(2, this.f26599b);
        }
        if (this.f26600c != null) {
            b += nyu.e(3, this.f26600c.longValue());
        }
        if (this.f26601d != null) {
            b += nyu.f(4, this.f26601d.intValue());
        }
        if (this.f26602e != null) {
            return b + nyu.g(5, this.f26602e.intValue());
        }
        return b;
    }

    private lvm m30748b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26598a == null) {
                        this.f26598a = new lor();
                    }
                    nyt.a(this.f26598a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26599b == null) {
                        this.f26599b = new ltr();
                    }
                    nyt.a(this.f26599b);
                    continue;
                case wi.dA /*24*/:
                    this.f26600c = Long.valueOf(nyt.d());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f26601d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    this.f26602e = Integer.valueOf(nyt.l());
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
