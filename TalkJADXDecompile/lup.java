public final class lup extends nyx<lup> {
    public loh a;
    public loe b;
    public lof c;
    public String d;
    public Boolean e;
    public Integer f;
    public off g;
    public String h;
    public lnw i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lup() {
        d();
    }

    private lup d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e.booleanValue());
        }
        if (this.f != null) {
            nyu.c(6, this.f.intValue());
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        if (this.i != null) {
            nyu.b(9, this.i);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f != null) {
            b += nyu.g(6, this.f.intValue());
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null) {
            b += nyu.b(8, this.h);
        }
        if (this.i != null) {
            return b + nyu.d(9, this.i);
        }
        return b;
    }

    private lup b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new loh();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new loe();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new lof();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 40:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f = Integer.valueOf(nyt.l());
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new off();
                    }
                    nyt.a(this.g);
                    continue;
                case 66:
                    this.h = nyt.j();
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new lnw();
                    }
                    nyt.a(this.i);
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
