package defpackage;

public final class luq extends nyx<luq> {
    public Integer a;
    public String b;
    public String c;
    public Long d;
    public String e;
    public Integer f;
    public Long g;
    public Long h;
    public String i;
    public String j;
    public lwp k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public luq() {
        d();
    }

    private luq d() {
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
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d.longValue());
        }
        if (this.g != null) {
            nyu.a(5, this.g.longValue());
        }
        if (this.h != null) {
            nyu.a(6, this.h.longValue());
        }
        if (this.i != null) {
            nyu.a(7, this.i);
        }
        if (this.j != null) {
            nyu.a(8, this.j);
        }
        if (this.k != null) {
            nyu.b(9, this.k);
        }
        if (this.e != null) {
            nyu.a(10, this.e);
        }
        if (this.f != null) {
            nyu.a(11, this.f.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.e(4, this.d.longValue());
        }
        if (this.g != null) {
            b += nyu.e(5, this.g.longValue());
        }
        if (this.h != null) {
            b += nyu.e(6, this.h.longValue());
        }
        if (this.i != null) {
            b += nyu.b(7, this.i);
        }
        if (this.j != null) {
            b += nyu.b(8, this.j);
        }
        if (this.k != null) {
            b += nyu.d(9, this.k);
        }
        if (this.e != null) {
            b += nyu.b(10, this.e);
        }
        if (this.f != null) {
            return b + nyu.f(11, this.f.intValue());
        }
        return b;
    }

    private luq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
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
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 32:
                    this.d = Long.valueOf(nyt.d());
                    continue;
                case 40:
                    this.g = Long.valueOf(nyt.d());
                    continue;
                case 48:
                    this.h = Long.valueOf(nyt.d());
                    continue;
                case 58:
                    this.i = nyt.j();
                    continue;
                case 66:
                    this.j = nyt.j();
                    continue;
                case 74:
                    if (this.k == null) {
                        this.k = new lwp();
                    }
                    nyt.a(this.k);
                    continue;
                case 82:
                    this.e = nyt.j();
                    continue;
                case 88:
                    this.f = Integer.valueOf(nyt.f());
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
