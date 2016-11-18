package p000;

public final class lup extends nyx<lup> {
    public loh f26506a;
    public loe f26507b;
    public lof f26508c;
    public String f26509d;
    public Boolean f26510e;
    public Integer f26511f;
    public off f26512g;
    public String f26513h;
    public lnw f26514i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30632b(nyt);
    }

    public lup() {
        m30633d();
    }

    private lup m30633d() {
        this.f26506a = null;
        this.f26507b = null;
        this.f26508c = null;
        this.f26509d = null;
        this.f26510e = null;
        this.f26511f = null;
        this.f26512g = null;
        this.f26513h = null;
        this.f26514i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26506a != null) {
            nyu.b(1, this.f26506a);
        }
        if (this.f26507b != null) {
            nyu.b(2, this.f26507b);
        }
        if (this.f26508c != null) {
            nyu.b(3, this.f26508c);
        }
        if (this.f26509d != null) {
            nyu.a(4, this.f26509d);
        }
        if (this.f26510e != null) {
            nyu.a(5, this.f26510e.booleanValue());
        }
        if (this.f26511f != null) {
            nyu.c(6, this.f26511f.intValue());
        }
        if (this.f26512g != null) {
            nyu.b(7, this.f26512g);
        }
        if (this.f26513h != null) {
            nyu.a(8, this.f26513h);
        }
        if (this.f26514i != null) {
            nyu.b(9, this.f26514i);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26506a != null) {
            b += nyu.d(1, this.f26506a);
        }
        if (this.f26507b != null) {
            b += nyu.d(2, this.f26507b);
        }
        if (this.f26508c != null) {
            b += nyu.d(3, this.f26508c);
        }
        if (this.f26509d != null) {
            b += nyu.b(4, this.f26509d);
        }
        if (this.f26510e != null) {
            this.f26510e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f26511f != null) {
            b += nyu.g(6, this.f26511f.intValue());
        }
        if (this.f26512g != null) {
            b += nyu.d(7, this.f26512g);
        }
        if (this.f26513h != null) {
            b += nyu.b(8, this.f26513h);
        }
        if (this.f26514i != null) {
            return b + nyu.d(9, this.f26514i);
        }
        return b;
    }

    private lup m30632b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26506a == null) {
                        this.f26506a = new loh();
                    }
                    nyt.a(this.f26506a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26507b == null) {
                        this.f26507b = new loe();
                    }
                    nyt.a(this.f26507b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26508c == null) {
                        this.f26508c = new lof();
                    }
                    nyt.a(this.f26508c);
                    continue;
                case 34:
                    this.f26509d = nyt.j();
                    continue;
                case 40:
                    this.f26510e = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f26511f = Integer.valueOf(nyt.l());
                    continue;
                case 58:
                    if (this.f26512g == null) {
                        this.f26512g = new off();
                    }
                    nyt.a(this.f26512g);
                    continue;
                case 66:
                    this.f26513h = nyt.j();
                    continue;
                case 74:
                    if (this.f26514i == null) {
                        this.f26514i = new lnw();
                    }
                    nyt.a(this.f26514i);
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
