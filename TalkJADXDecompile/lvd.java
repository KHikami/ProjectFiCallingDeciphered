public final class lvd extends nyx<lvd> {
    public Integer a;
    public Long b;
    public Long c;
    public luq responseHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lvd() {
        d();
    }

    private lvd d() {
        this.responseHeader = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.a != null) {
            nyu.a(2, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(3, this.b.longValue());
        }
        if (this.c != null) {
            nyu.a(4, this.c.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.a != null) {
            b += nyu.f(2, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.e(3, this.b.longValue());
        }
        if (this.c != null) {
            return b + nyu.e(4, this.c.longValue());
        }
        return b;
    }

    private lvd b(nyt nyt) {
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
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.b = Long.valueOf(nyt.d());
                    continue;
                case 32:
                    this.c = Long.valueOf(nyt.d());
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
