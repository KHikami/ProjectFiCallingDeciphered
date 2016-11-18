package defpackage;

public final class lot extends nyx<lot> {
    private static volatile lot[] h;
    public ltr a;
    public String b;
    public Integer c;
    public Integer d;
    public muu e;
    public Integer f;
    public Boolean g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lot[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new lot[0];
                }
            }
        }
        return h;
    }

    public lot() {
        g();
    }

    private lot g() {
        this.a = null;
        this.b = null;
        this.e = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.e != null) {
            nyu.b(4, this.e);
        }
        if (this.f != null) {
            nyu.a(5, this.f.intValue());
        }
        if (this.d != null) {
            nyu.a(6, this.d.intValue());
        }
        if (this.g != null) {
            nyu.a(7, this.g.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.e != null) {
            b += nyu.d(4, this.e);
        }
        if (this.f != null) {
            b += nyu.f(5, this.f.intValue());
        }
        if (this.d != null) {
            b += nyu.f(6, this.d.intValue());
        }
        if (this.g == null) {
            return b;
        }
        this.g.booleanValue();
        return b + (nyu.h(7) + 1);
    }

    private lot b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new ltr();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.e == null) {
                        this.e = new muu();
                    }
                    nyt.a(this.e);
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
                            this.f = Integer.valueOf(a);
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
                            this.d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
