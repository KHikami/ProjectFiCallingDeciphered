public final class lnm extends nyx<lnm> {
    public String a;
    public lnn b;
    public int c;
    public int d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lnm() {
        d();
    }

    private lnm d() {
        this.a = "";
        this.b = null;
        this.c = 0;
        this.d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!(this.a == null || this.a.equals(""))) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != 0) {
            nyu.a(3, this.c);
        }
        if (this.d != 0) {
            nyu.a(4, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (!(this.a == null || this.a.equals(""))) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != 0) {
            b += nyu.f(3, this.c);
        }
        if (this.d != 0) {
            return b + nyu.f(4, this.d);
        }
        return b;
    }

    private lnm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new lnn();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dA /*24*/:
                    this.c = nyt.f();
                    continue;
                case 32:
                    this.d = nyt.f();
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
