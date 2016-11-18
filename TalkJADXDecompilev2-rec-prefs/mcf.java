package p000;

public final class mcf extends nyx<mcf> {
    public Boolean f27303a;
    public Boolean f27304b;
    public Boolean f27305c;
    public Integer f27306d;
    public Long f27307e;
    public String f27308f;
    public Boolean f27309g;
    public Long f27310h;
    public Long f27311i;
    public Long f27312j;
    public Integer f27313k;
    public Integer f27314l;
    public Boolean f27315m;
    public Boolean f27316n;
    public Boolean f27317o;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31691b(nyt);
    }

    public mcf() {
        m31692d();
    }

    private mcf m31692d() {
        this.f27303a = null;
        this.f27304b = null;
        this.f27305c = null;
        this.f27307e = null;
        this.f27308f = null;
        this.f27309g = null;
        this.f27310h = null;
        this.f27311i = null;
        this.f27312j = null;
        this.f27315m = null;
        this.f27316n = null;
        this.f27317o = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27303a != null) {
            nyu.a(1, this.f27303a.booleanValue());
        }
        if (this.f27304b != null) {
            nyu.a(2, this.f27304b.booleanValue());
        }
        if (this.f27305c != null) {
            nyu.a(3, this.f27305c.booleanValue());
        }
        if (this.f27306d != null) {
            nyu.a(4, this.f27306d.intValue());
        }
        if (this.f27307e != null) {
            nyu.b(5, this.f27307e.longValue());
        }
        if (this.f27308f != null) {
            nyu.a(6, this.f27308f);
        }
        if (this.f27309g != null) {
            nyu.a(7, this.f27309g.booleanValue());
        }
        if (this.f27310h != null) {
            nyu.b(8, this.f27310h.longValue());
        }
        if (this.f27311i != null) {
            nyu.b(9, this.f27311i.longValue());
        }
        if (this.f27312j != null) {
            nyu.b(10, this.f27312j.longValue());
        }
        if (this.f27313k != null) {
            nyu.a(11, this.f27313k.intValue());
        }
        if (this.f27314l != null) {
            nyu.a(12, this.f27314l.intValue());
        }
        if (this.f27315m != null) {
            nyu.a(13, this.f27315m.booleanValue());
        }
        if (this.f27316n != null) {
            nyu.a(14, this.f27316n.booleanValue());
        }
        if (this.f27317o != null) {
            nyu.a(15, this.f27317o.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27303a != null) {
            this.f27303a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f27304b != null) {
            this.f27304b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f27305c != null) {
            this.f27305c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f27306d != null) {
            b += nyu.f(4, this.f27306d.intValue());
        }
        if (this.f27307e != null) {
            b += nyu.f(5, this.f27307e.longValue());
        }
        if (this.f27308f != null) {
            b += nyu.b(6, this.f27308f);
        }
        if (this.f27309g != null) {
            this.f27309g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f27310h != null) {
            b += nyu.f(8, this.f27310h.longValue());
        }
        if (this.f27311i != null) {
            b += nyu.f(9, this.f27311i.longValue());
        }
        if (this.f27312j != null) {
            b += nyu.f(10, this.f27312j.longValue());
        }
        if (this.f27313k != null) {
            b += nyu.f(11, this.f27313k.intValue());
        }
        if (this.f27314l != null) {
            b += nyu.f(12, this.f27314l.intValue());
        }
        if (this.f27315m != null) {
            this.f27315m.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.f27316n != null) {
            this.f27316n.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.f27317o == null) {
            return b;
        }
        this.f27317o.booleanValue();
        return b + (nyu.h(15) + 1);
    }

    private mcf m31691b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27303a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f27304b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f27305c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 10:
                        case 20:
                        case wi.dz /*25*/:
                        case 30:
                        case 100:
                            this.f27306d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    this.f27307e = Long.valueOf(nyt.e());
                    continue;
                case 50:
                    this.f27308f = nyt.j();
                    continue;
                case 56:
                    this.f27309g = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.f27310h = Long.valueOf(nyt.e());
                    continue;
                case 72:
                    this.f27311i = Long.valueOf(nyt.e());
                    continue;
                case 80:
                    this.f27312j = Long.valueOf(nyt.e());
                    continue;
                case 88:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f27313k = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 96:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f27314l = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 104:
                    this.f27315m = Boolean.valueOf(nyt.i());
                    continue;
                case 112:
                    this.f27316n = Boolean.valueOf(nyt.i());
                    continue;
                case 120:
                    this.f27317o = Boolean.valueOf(nyt.i());
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
