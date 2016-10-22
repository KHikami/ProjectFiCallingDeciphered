public final class gfy extends nzf {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    public int k;
    public String l;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public gfy() {
        d();
    }

    private gfy d() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = 0;
        this.k = 0;
        this.l = "";
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!(this.a == null || this.a.equals(""))) {
            nyu.a(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            nyu.a(2, this.b);
        }
        if (!(this.c == null || this.c.equals(""))) {
            nyu.a(3, this.c);
        }
        if (!(this.d == null || this.d.equals(""))) {
            nyu.a(4, this.d);
        }
        if (!(this.e == null || this.e.equals(""))) {
            nyu.a(5, this.e);
        }
        if (!(this.f == null || this.f.equals(""))) {
            nyu.a(6, this.f);
        }
        if (!(this.g == null || this.g.equals(""))) {
            nyu.a(7, this.g);
        }
        if (!(this.h == null || this.h.equals(""))) {
            nyu.a(8, this.h);
        }
        if (!(this.i == null || this.i.equals(""))) {
            nyu.a(9, this.i);
        }
        if (this.j != 0) {
            nyu.a(10, this.j);
        }
        if (this.k != 0) {
            nyu.a(11, this.k);
        }
        if (!(this.l == null || this.l.equals(""))) {
            nyu.a(12, this.l);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (!(this.a == null || this.a.equals(""))) {
            b += nyu.b(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            b += nyu.b(2, this.b);
        }
        if (!(this.c == null || this.c.equals(""))) {
            b += nyu.b(3, this.c);
        }
        if (!(this.d == null || this.d.equals(""))) {
            b += nyu.b(4, this.d);
        }
        if (!(this.e == null || this.e.equals(""))) {
            b += nyu.b(5, this.e);
        }
        if (!(this.f == null || this.f.equals(""))) {
            b += nyu.b(6, this.f);
        }
        if (!(this.g == null || this.g.equals(""))) {
            b += nyu.b(7, this.g);
        }
        if (!(this.h == null || this.h.equals(""))) {
            b += nyu.b(8, this.h);
        }
        if (!(this.i == null || this.i.equals(""))) {
            b += nyu.b(9, this.i);
        }
        if (this.j != 0) {
            b += nyu.f(10, this.j);
        }
        if (this.k != 0) {
            b += nyu.f(11, this.k);
        }
        if (this.l == null || this.l.equals("")) {
            return b;
        }
        return b + nyu.b(12, this.l);
    }

    private gfy b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 58:
                    this.g = nyt.j();
                    continue;
                case 66:
                    this.h = nyt.j();
                    continue;
                case 74:
                    this.i = nyt.j();
                    continue;
                case 80:
                    this.j = nyt.f();
                    continue;
                case 88:
                    this.k = nyt.f();
                    continue;
                case 98:
                    this.l = nyt.j();
                    continue;
                default:
                    if (!nyt.b(a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
