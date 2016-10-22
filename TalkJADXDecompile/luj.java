public final class luj extends nyx<luj> {
    public lqg a;
    public lom b;
    public Long c;
    public String d;
    public luq responseHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public luj() {
        d();
    }

    private luj d() {
        this.responseHeader = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.c != null) {
            nyu.a(2, this.c.longValue());
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.a != null) {
            nyu.b(4, this.a);
        }
        if (this.b != null) {
            nyu.b(5, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.c != null) {
            b += nyu.e(2, this.c.longValue());
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.a != null) {
            b += nyu.d(4, this.a);
        }
        if (this.b != null) {
            return b + nyu.d(5, this.b);
        }
        return b;
    }

    private luj b(nyt nyt) {
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
                    this.c = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
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
