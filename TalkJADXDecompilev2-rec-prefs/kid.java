package p000;

public final class kid extends nyx<kid> {
    public kii f21820a;
    public nzr f21821b;
    public kif f21822c;
    public Long f21823d;
    public String f21824e;
    public kie f21825f;
    public String f21826g;
    public Boolean f21827h;
    public Integer f21828i;
    public kih f21829j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25940b(nyt);
    }

    public kid() {
        m25941d();
    }

    private kid m25941d() {
        this.f21820a = null;
        this.f21821b = null;
        this.f21822c = null;
        this.f21823d = null;
        this.f21824e = null;
        this.f21825f = null;
        this.f21826g = null;
        this.f21827h = null;
        this.f21829j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21820a != null) {
            nyu.b(1, this.f21820a);
        }
        if (this.f21821b != null) {
            nyu.b(2, this.f21821b);
        }
        if (this.f21822c != null) {
            nyu.b(3, this.f21822c);
        }
        if (this.f21823d != null) {
            nyu.b(4, this.f21823d.longValue());
        }
        if (this.f21824e != null) {
            nyu.a(5, this.f21824e);
        }
        if (this.f21825f != null) {
            nyu.b(6, this.f21825f);
        }
        if (this.f21826g != null) {
            nyu.a(7, this.f21826g);
        }
        if (this.f21827h != null) {
            nyu.a(8, this.f21827h.booleanValue());
        }
        if (this.f21828i != null) {
            nyu.a(9, this.f21828i.intValue());
        }
        if (this.f21829j != null) {
            nyu.b(10, this.f21829j);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21820a != null) {
            b += nyu.d(1, this.f21820a);
        }
        if (this.f21821b != null) {
            b += nyu.d(2, this.f21821b);
        }
        if (this.f21822c != null) {
            b += nyu.d(3, this.f21822c);
        }
        if (this.f21823d != null) {
            b += nyu.f(4, this.f21823d.longValue());
        }
        if (this.f21824e != null) {
            b += nyu.b(5, this.f21824e);
        }
        if (this.f21825f != null) {
            b += nyu.d(6, this.f21825f);
        }
        if (this.f21826g != null) {
            b += nyu.b(7, this.f21826g);
        }
        if (this.f21827h != null) {
            this.f21827h.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.f21828i != null) {
            b += nyu.f(9, this.f21828i.intValue());
        }
        if (this.f21829j != null) {
            return b + nyu.d(10, this.f21829j);
        }
        return b;
    }

    private kid m25940b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f21820a == null) {
                        this.f21820a = new kii();
                    }
                    nyt.a(this.f21820a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f21821b == null) {
                        this.f21821b = new nzr();
                    }
                    nyt.a(this.f21821b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f21822c == null) {
                        this.f21822c = new kif();
                    }
                    nyt.a(this.f21822c);
                    continue;
                case 32:
                    this.f21823d = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    this.f21824e = nyt.j();
                    continue;
                case 50:
                    if (this.f21825f == null) {
                        this.f21825f = new kie();
                    }
                    nyt.a(this.f21825f);
                    continue;
                case 58:
                    this.f21826g = nyt.j();
                    continue;
                case 64:
                    this.f21827h = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f21828i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 82:
                    if (this.f21829j == null) {
                        this.f21829j = new kih();
                    }
                    nyt.a(this.f21829j);
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
