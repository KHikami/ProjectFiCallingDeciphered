package p000;

public final class lot extends nyx<lot> {
    private static volatile lot[] f25933h;
    public ltr f25934a;
    public String f25935b;
    public Integer f25936c;
    public Integer f25937d;
    public muu f25938e;
    public Integer f25939f;
    public Boolean f25940g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29801b(nyt);
    }

    public static lot[] m29802d() {
        if (f25933h == null) {
            synchronized (nzc.c) {
                if (f25933h == null) {
                    f25933h = new lot[0];
                }
            }
        }
        return f25933h;
    }

    public lot() {
        m29803g();
    }

    private lot m29803g() {
        this.f25934a = null;
        this.f25935b = null;
        this.f25938e = null;
        this.f25940g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25934a != null) {
            nyu.b(1, this.f25934a);
        }
        if (this.f25935b != null) {
            nyu.a(2, this.f25935b);
        }
        if (this.f25936c != null) {
            nyu.a(3, this.f25936c.intValue());
        }
        if (this.f25938e != null) {
            nyu.b(4, this.f25938e);
        }
        if (this.f25939f != null) {
            nyu.a(5, this.f25939f.intValue());
        }
        if (this.f25937d != null) {
            nyu.a(6, this.f25937d.intValue());
        }
        if (this.f25940g != null) {
            nyu.a(7, this.f25940g.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25934a != null) {
            b += nyu.d(1, this.f25934a);
        }
        if (this.f25935b != null) {
            b += nyu.b(2, this.f25935b);
        }
        if (this.f25936c != null) {
            b += nyu.f(3, this.f25936c.intValue());
        }
        if (this.f25938e != null) {
            b += nyu.d(4, this.f25938e);
        }
        if (this.f25939f != null) {
            b += nyu.f(5, this.f25939f.intValue());
        }
        if (this.f25937d != null) {
            b += nyu.f(6, this.f25937d.intValue());
        }
        if (this.f25940g == null) {
            return b;
        }
        this.f25940g.booleanValue();
        return b + (nyu.h(7) + 1);
    }

    private lot m29801b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25934a == null) {
                        this.f25934a = new ltr();
                    }
                    nyt.a(this.f25934a);
                    continue;
                case wi.dH /*18*/:
                    this.f25935b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f25936c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f25938e == null) {
                        this.f25938e = new muu();
                    }
                    nyt.a(this.f25938e);
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f25939f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f25937d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 56:
                    this.f25940g = Boolean.valueOf(nyt.i());
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
