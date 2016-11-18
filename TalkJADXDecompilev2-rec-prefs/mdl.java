package p000;

public final class mdl extends nyx<mdl> {
    private static volatile mdl[] f27468j;
    public String f27469a;
    public mdm f27470b;
    public mdk f27471c;
    public Integer f27472d;
    public Integer f27473e;
    public Integer f27474f;
    public Long f27475g;
    public Integer f27476h;
    public Long f27477i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31857b(nyt);
    }

    public static mdl[] m31858d() {
        if (f27468j == null) {
            synchronized (nzc.c) {
                if (f27468j == null) {
                    f27468j = new mdl[0];
                }
            }
        }
        return f27468j;
    }

    public mdl() {
        m31859g();
    }

    private mdl m31859g() {
        this.f27469a = null;
        this.f27470b = null;
        this.f27471c = null;
        this.f27472d = null;
        this.f27475g = null;
        this.f27477i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27469a != null) {
            nyu.a(1, this.f27469a);
        }
        if (this.f27470b != null) {
            nyu.b(2, this.f27470b);
        }
        if (this.f27471c != null) {
            nyu.b(5, this.f27471c);
        }
        if (this.f27472d != null) {
            nyu.a(6, this.f27472d.intValue());
        }
        if (this.f27473e != null) {
            nyu.a(7, this.f27473e.intValue());
        }
        if (this.f27474f != null) {
            nyu.a(8, this.f27474f.intValue());
        }
        if (this.f27475g != null) {
            nyu.a(9, this.f27475g.longValue());
        }
        if (this.f27476h != null) {
            nyu.a(10, this.f27476h.intValue());
        }
        if (this.f27477i != null) {
            nyu.a(11, this.f27477i.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27469a != null) {
            b += nyu.b(1, this.f27469a);
        }
        if (this.f27470b != null) {
            b += nyu.d(2, this.f27470b);
        }
        if (this.f27471c != null) {
            b += nyu.d(5, this.f27471c);
        }
        if (this.f27472d != null) {
            b += nyu.f(6, this.f27472d.intValue());
        }
        if (this.f27473e != null) {
            b += nyu.f(7, this.f27473e.intValue());
        }
        if (this.f27474f != null) {
            b += nyu.f(8, this.f27474f.intValue());
        }
        if (this.f27475g != null) {
            b += nyu.e(9, this.f27475g.longValue());
        }
        if (this.f27476h != null) {
            b += nyu.f(10, this.f27476h.intValue());
        }
        if (this.f27477i != null) {
            return b + nyu.e(11, this.f27477i.longValue());
        }
        return b;
    }

    private mdl m31857b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27469a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f27470b == null) {
                        this.f27470b = new mdm();
                    }
                    nyt.a(this.f27470b);
                    continue;
                case 42:
                    if (this.f27471c == null) {
                        this.f27471c = new mdk();
                    }
                    nyt.a(this.f27471c);
                    continue;
                case 48:
                    this.f27472d = Integer.valueOf(nyt.f());
                    continue;
                case 56:
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
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                            this.f27473e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 64:
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
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                        case 22:
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 1001:
                        case 1002:
                            this.f27474f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 72:
                    this.f27475g = Long.valueOf(nyt.d());
                    continue;
                case 80:
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
                        case 8:
                        case 9:
                            this.f27476h = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 88:
                    this.f27477i = Long.valueOf(nyt.d());
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
