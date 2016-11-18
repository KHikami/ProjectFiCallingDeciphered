package defpackage;

public final class kik extends nyx<kik> {
    public kip a;
    public nzs b;
    public kim c;
    public Long d;
    public String e;
    public kil f;
    public String g;
    public Boolean h;
    public int i;
    public kio j;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kik() {
        this.d = null;
        this.e = null;
        this.g = null;
        this.h = null;
        this.i = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d.longValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null) {
            nyu.a(7, this.g);
        }
        if (this.h != null) {
            nyu.a(8, this.h.booleanValue());
        }
        if (this.i != nzf.UNSET_ENUM_VALUE) {
            nyu.a(9, this.i);
        }
        if (this.j != null) {
            nyu.b(10, this.j);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.longValue());
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null) {
            b += nyu.b(7, this.g);
        }
        if (this.h != null) {
            this.h.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.i != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(9, this.i);
        }
        if (this.j != null) {
            return b + nyu.d(10, this.j);
        }
        return b;
    }

    private kik b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new kip();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new nzs();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new kim();
                    }
                    nyt.a(this.c);
                    continue;
                case 32:
                    this.d = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new kil();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    this.g = nyt.j();
                    continue;
                case 64:
                    this.h = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.i = a;
                            break;
                        default:
                            continue;
                    }
                case 82:
                    if (this.j == null) {
                        this.j = new kio();
                    }
                    nyt.a(this.j);
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
