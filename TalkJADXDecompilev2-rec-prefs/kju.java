package p000;

public final class kju extends nyx<kju> {
    private static volatile kju[] f21987k;
    public klk f21988a;
    public String f21989b;
    public String f21990c;
    public Integer f21991d;
    public String f21992e;
    public String f21993f;
    public String f21994g;
    public String f21995h;
    public Boolean f21996i;
    public String f21997j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26155b(nyt);
    }

    public static kju[] m26156d() {
        if (f21987k == null) {
            synchronized (nzc.c) {
                if (f21987k == null) {
                    f21987k = new kju[0];
                }
            }
        }
        return f21987k;
    }

    public kju() {
        m26157g();
    }

    private kju m26157g() {
        this.f21988a = null;
        this.f21989b = null;
        this.f21990c = null;
        this.f21992e = null;
        this.f21993f = null;
        this.f21994g = null;
        this.f21995h = null;
        this.f21996i = null;
        this.f21997j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21988a != null) {
            nyu.b(1, this.f21988a);
        }
        if (this.f21989b != null) {
            nyu.a(2, this.f21989b);
        }
        if (this.f21990c != null) {
            nyu.a(3, this.f21990c);
        }
        if (this.f21991d != null) {
            nyu.a(4, this.f21991d.intValue());
        }
        if (this.f21992e != null) {
            nyu.a(5, this.f21992e);
        }
        if (this.f21993f != null) {
            nyu.a(6, this.f21993f);
        }
        if (this.f21994g != null) {
            nyu.a(7, this.f21994g);
        }
        if (this.f21995h != null) {
            nyu.a(8, this.f21995h);
        }
        if (this.f21996i != null) {
            nyu.a(9, this.f21996i.booleanValue());
        }
        if (this.f21997j != null) {
            nyu.a(10, this.f21997j);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21988a != null) {
            b += nyu.d(1, this.f21988a);
        }
        if (this.f21989b != null) {
            b += nyu.b(2, this.f21989b);
        }
        if (this.f21990c != null) {
            b += nyu.b(3, this.f21990c);
        }
        if (this.f21991d != null) {
            b += nyu.f(4, this.f21991d.intValue());
        }
        if (this.f21992e != null) {
            b += nyu.b(5, this.f21992e);
        }
        if (this.f21993f != null) {
            b += nyu.b(6, this.f21993f);
        }
        if (this.f21994g != null) {
            b += nyu.b(7, this.f21994g);
        }
        if (this.f21995h != null) {
            b += nyu.b(8, this.f21995h);
        }
        if (this.f21996i != null) {
            this.f21996i.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.f21997j != null) {
            return b + nyu.b(10, this.f21997j);
        }
        return b;
    }

    private kju m26155b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f21988a == null) {
                        this.f21988a = new klk();
                    }
                    nyt.a(this.f21988a);
                    continue;
                case wi.dH /*18*/:
                    this.f21989b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f21990c = nyt.j();
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f21991d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    this.f21992e = nyt.j();
                    continue;
                case 50:
                    this.f21993f = nyt.j();
                    continue;
                case 58:
                    this.f21994g = nyt.j();
                    continue;
                case 66:
                    this.f21995h = nyt.j();
                    continue;
                case 72:
                    this.f21996i = Boolean.valueOf(nyt.i());
                    continue;
                case 82:
                    this.f21997j = nyt.j();
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
