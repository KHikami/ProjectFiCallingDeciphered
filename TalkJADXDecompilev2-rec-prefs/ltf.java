package p000;

public final class ltf extends nyx<ltf> {
    public lqg f26372a;
    public lom f26373b;
    public Boolean f26374c;
    public Long f26375d;
    public String f26376e;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30429b(nyt);
    }

    public ltf() {
        m30430d();
    }

    private ltf m30430d() {
        this.responseHeader = null;
        this.f26372a = null;
        this.f26373b = null;
        this.f26374c = null;
        this.f26375d = null;
        this.f26376e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26375d != null) {
            nyu.a(2, this.f26375d.longValue());
        }
        if (this.f26376e != null) {
            nyu.a(3, this.f26376e);
        }
        if (this.f26372a != null) {
            nyu.b(4, this.f26372a);
        }
        if (this.f26373b != null) {
            nyu.b(5, this.f26373b);
        }
        if (this.f26374c != null) {
            nyu.a(6, this.f26374c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26375d != null) {
            b += nyu.e(2, this.f26375d.longValue());
        }
        if (this.f26376e != null) {
            b += nyu.b(3, this.f26376e);
        }
        if (this.f26372a != null) {
            b += nyu.d(4, this.f26372a);
        }
        if (this.f26373b != null) {
            b += nyu.d(5, this.f26373b);
        }
        if (this.f26374c == null) {
            return b;
        }
        this.f26374c.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private ltf m30429b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case 16:
                    this.f26375d = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    this.f26376e = nyt.j();
                    continue;
                case 34:
                    if (this.f26372a == null) {
                        this.f26372a = new lqg();
                    }
                    nyt.a(this.f26372a);
                    continue;
                case 42:
                    if (this.f26373b == null) {
                        this.f26373b = new lom();
                    }
                    nyt.a(this.f26373b);
                    continue;
                case 48:
                    this.f26374c = Boolean.valueOf(nyt.i());
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
