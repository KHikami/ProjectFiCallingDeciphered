public final class kjt extends nyx<kjt> {
    private static volatile kjt[] h;
    public klk a;
    public String b;
    public String c;
    public Integer d;
    public Integer e;
    public Boolean f;
    public Boolean g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kjt[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new kjt[0];
                }
            }
        }
        return h;
    }

    public kjt() {
        g();
    }

    private kjt g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b);
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.d != null) {
            nyu.a(3, this.d.intValue());
        }
        if (this.e != null) {
            nyu.a(4, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(5, this.f.booleanValue());
        }
        if (this.a != null) {
            nyu.b(6, this.a);
        }
        if (this.g != null) {
            nyu.a(7, this.g.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.b(1, this.b);
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.d != null) {
            b += nyu.f(3, this.d.intValue());
        }
        if (this.e != null) {
            b += nyu.f(4, this.e.intValue());
        }
        if (this.f != null) {
            this.f.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.a != null) {
            b += nyu.d(6, this.a);
        }
        if (this.g == null) {
            return b;
        }
        this.g.booleanValue();
        return b + (nyu.h(7) + 1);
    }

    private kjt b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.e = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    if (this.a == null) {
                        this.a = new klk();
                    }
                    nyt.a(this.a);
                    continue;
                case 56:
                    this.g = Boolean.valueOf(nyt.i());
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
