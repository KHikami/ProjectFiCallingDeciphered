public final class ltf extends nyx<ltf> {
    public lqg a;
    public lom b;
    public Boolean c;
    public Long d;
    public String e;
    public luq responseHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ltf() {
        d();
    }

    private ltf d() {
        this.responseHeader = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.d != null) {
            nyu.a(2, this.d.longValue());
        }
        if (this.e != null) {
            nyu.a(3, this.e);
        }
        if (this.a != null) {
            nyu.b(4, this.a);
        }
        if (this.b != null) {
            nyu.b(5, this.b);
        }
        if (this.c != null) {
            nyu.a(6, this.c.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.d != null) {
            b += nyu.e(2, this.d.longValue());
        }
        if (this.e != null) {
            b += nyu.b(3, this.e);
        }
        if (this.a != null) {
            b += nyu.d(4, this.a);
        }
        if (this.b != null) {
            b += nyu.d(5, this.b);
        }
        if (this.c == null) {
            return b;
        }
        this.c.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private ltf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dI /*16*/:
                    this.d = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    this.e = nyt.j();
                    continue;
                case 34:
                    if (this.a == null) {
                        this.a = new lqg();
                    }
                    nyt.a(this.a);
                    continue;
                case 42:
                    if (this.b == null) {
                        this.b = new lom();
                    }
                    nyt.a(this.b);
                    continue;
                case 48:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
