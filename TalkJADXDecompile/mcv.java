public final class mcv extends nyx<mcv> {
    public mcu a;
    public lko b;
    public lkw c;
    public llf d;
    public lld e;
    public lkx f;
    public lkz g;
    public llc h;
    public llj i;
    public mcw j;
    public mct k;
    public mde l;
    public mcz m;
    public mdh n;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mcv() {
        d();
    }

    private mcv d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
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
        if (this.f != null) {
            nyu.b(4, this.f);
        }
        if (this.g != null) {
            nyu.b(5, this.g);
        }
        if (this.h != null) {
            nyu.b(6, this.h);
        }
        if (this.i != null) {
            nyu.b(7, this.i);
        }
        if (this.j != null) {
            nyu.b(8, this.j);
        }
        if (this.k != null) {
            nyu.b(9, this.k);
        }
        if (this.e != null) {
            nyu.b(10, this.e);
        }
        if (this.l != null) {
            nyu.b(11, this.l);
        }
        if (this.m != null) {
            nyu.b(12, this.m);
        }
        if (this.d != null) {
            nyu.b(13, this.d);
        }
        if (this.n != null) {
            nyu.b(14, this.n);
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
        if (this.f != null) {
            b += nyu.d(4, this.f);
        }
        if (this.g != null) {
            b += nyu.d(5, this.g);
        }
        if (this.h != null) {
            b += nyu.d(6, this.h);
        }
        if (this.i != null) {
            b += nyu.d(7, this.i);
        }
        if (this.j != null) {
            b += nyu.d(8, this.j);
        }
        if (this.k != null) {
            b += nyu.d(9, this.k);
        }
        if (this.e != null) {
            b += nyu.d(10, this.e);
        }
        if (this.l != null) {
            b += nyu.d(11, this.l);
        }
        if (this.m != null) {
            b += nyu.d(12, this.m);
        }
        if (this.d != null) {
            b += nyu.d(13, this.d);
        }
        if (this.n != null) {
            return b + nyu.d(14, this.n);
        }
        return b;
    }

    private mcv b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new mcu();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new lko();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new lkw();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.f == null) {
                        this.f = new lkx();
                    }
                    nyt.a(this.f);
                    continue;
                case 42:
                    if (this.g == null) {
                        this.g = new lkz();
                    }
                    nyt.a(this.g);
                    continue;
                case 50:
                    if (this.h == null) {
                        this.h = new llc();
                    }
                    nyt.a(this.h);
                    continue;
                case 58:
                    if (this.i == null) {
                        this.i = new llj();
                    }
                    nyt.a(this.i);
                    continue;
                case 66:
                    if (this.j == null) {
                        this.j = new mcw();
                    }
                    nyt.a(this.j);
                    continue;
                case 74:
                    if (this.k == null) {
                        this.k = new mct();
                    }
                    nyt.a(this.k);
                    continue;
                case 82:
                    if (this.e == null) {
                        this.e = new lld();
                    }
                    nyt.a(this.e);
                    continue;
                case 90:
                    if (this.l == null) {
                        this.l = new mde();
                    }
                    nyt.a(this.l);
                    continue;
                case 98:
                    if (this.m == null) {
                        this.m = new mcz();
                    }
                    nyt.a(this.m);
                    continue;
                case 106:
                    if (this.d == null) {
                        this.d = new llf();
                    }
                    nyt.a(this.d);
                    continue;
                case 114:
                    if (this.n == null) {
                        this.n = new mdh();
                    }
                    nyt.a(this.n);
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
