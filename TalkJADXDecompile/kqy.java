public final class kqy extends nyx<kqy> {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Boolean j;
    public Boolean k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kqy() {
        d();
    }

    private kqy d() {
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
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.a(5, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.a(6, this.e.booleanValue());
        }
        if (this.f != null) {
            nyu.a(7, this.f.booleanValue());
        }
        if (this.g != null) {
            nyu.a(8, this.g.booleanValue());
        }
        if (this.h != null) {
            nyu.a(9, this.h.booleanValue());
        }
        if (this.i != null) {
            nyu.a(10, this.i.booleanValue());
        }
        if (this.j != null) {
            nyu.a(11, this.j.booleanValue());
        }
        if (this.k != null) {
            nyu.a(12, this.k.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f != null) {
            this.f.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.h != null) {
            this.h.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(10) + 1;
        }
        if (this.j != null) {
            this.j.booleanValue();
            b += nyu.h(11) + 1;
        }
        if (this.k == null) {
            return b;
        }
        this.k.booleanValue();
        return b + (nyu.h(12) + 1);
    }

    private kqy b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dI /*16*/:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.f = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    this.h = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 88:
                    this.j = Boolean.valueOf(nyt.i());
                    continue;
                case 96:
                    this.k = Boolean.valueOf(nyt.i());
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
