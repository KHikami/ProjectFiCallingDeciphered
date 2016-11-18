package p000;

public final class gfy extends nzf {
    public String f15193a;
    public String f15194b;
    public String f15195c;
    public String f15196d;
    public String f15197e;
    public String f15198f;
    public String f15199g;
    public String f15200h;
    public String f15201i;
    public int f15202j;
    public int f15203k;
    public String f15204l;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m17586b(nyt);
    }

    public gfy() {
        m17587d();
    }

    private gfy m17587d() {
        this.f15193a = "";
        this.f15194b = "";
        this.f15195c = "";
        this.f15196d = "";
        this.f15197e = "";
        this.f15198f = "";
        this.f15199g = "";
        this.f15200h = "";
        this.f15201i = "";
        this.f15202j = 0;
        this.f15203k = 0;
        this.f15204l = "";
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f15193a == null || this.f15193a.equals(""))) {
            nyu.a(1, this.f15193a);
        }
        if (!(this.f15194b == null || this.f15194b.equals(""))) {
            nyu.a(2, this.f15194b);
        }
        if (!(this.f15195c == null || this.f15195c.equals(""))) {
            nyu.a(3, this.f15195c);
        }
        if (!(this.f15196d == null || this.f15196d.equals(""))) {
            nyu.a(4, this.f15196d);
        }
        if (!(this.f15197e == null || this.f15197e.equals(""))) {
            nyu.a(5, this.f15197e);
        }
        if (!(this.f15198f == null || this.f15198f.equals(""))) {
            nyu.a(6, this.f15198f);
        }
        if (!(this.f15199g == null || this.f15199g.equals(""))) {
            nyu.a(7, this.f15199g);
        }
        if (!(this.f15200h == null || this.f15200h.equals(""))) {
            nyu.a(8, this.f15200h);
        }
        if (!(this.f15201i == null || this.f15201i.equals(""))) {
            nyu.a(9, this.f15201i);
        }
        if (this.f15202j != 0) {
            nyu.a(10, this.f15202j);
        }
        if (this.f15203k != 0) {
            nyu.a(11, this.f15203k);
        }
        if (!(this.f15204l == null || this.f15204l.equals(""))) {
            nyu.a(12, this.f15204l);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f15193a == null || this.f15193a.equals(""))) {
            b += nyu.b(1, this.f15193a);
        }
        if (!(this.f15194b == null || this.f15194b.equals(""))) {
            b += nyu.b(2, this.f15194b);
        }
        if (!(this.f15195c == null || this.f15195c.equals(""))) {
            b += nyu.b(3, this.f15195c);
        }
        if (!(this.f15196d == null || this.f15196d.equals(""))) {
            b += nyu.b(4, this.f15196d);
        }
        if (!(this.f15197e == null || this.f15197e.equals(""))) {
            b += nyu.b(5, this.f15197e);
        }
        if (!(this.f15198f == null || this.f15198f.equals(""))) {
            b += nyu.b(6, this.f15198f);
        }
        if (!(this.f15199g == null || this.f15199g.equals(""))) {
            b += nyu.b(7, this.f15199g);
        }
        if (!(this.f15200h == null || this.f15200h.equals(""))) {
            b += nyu.b(8, this.f15200h);
        }
        if (!(this.f15201i == null || this.f15201i.equals(""))) {
            b += nyu.b(9, this.f15201i);
        }
        if (this.f15202j != 0) {
            b += nyu.f(10, this.f15202j);
        }
        if (this.f15203k != 0) {
            b += nyu.f(11, this.f15203k);
        }
        if (this.f15204l == null || this.f15204l.equals("")) {
            return b;
        }
        return b + nyu.b(12, this.f15204l);
    }

    private gfy m17586b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f15193a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f15194b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f15195c = nyt.j();
                    continue;
                case 34:
                    this.f15196d = nyt.j();
                    continue;
                case 42:
                    this.f15197e = nyt.j();
                    continue;
                case 50:
                    this.f15198f = nyt.j();
                    continue;
                case 58:
                    this.f15199g = nyt.j();
                    continue;
                case 66:
                    this.f15200h = nyt.j();
                    continue;
                case 74:
                    this.f15201i = nyt.j();
                    continue;
                case 80:
                    this.f15202j = nyt.f();
                    continue;
                case 88:
                    this.f15203k = nyt.f();
                    continue;
                case 98:
                    this.f15204l = nyt.j();
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
