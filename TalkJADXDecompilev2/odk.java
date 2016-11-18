package defpackage;

public final class odk extends nyx<odk> {
    public odc a;
    public nuj b;
    public nac c;
    public muy d;
    public Integer e;
    public int f;
    public oen g;
    public Float h;
    public Boolean i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public odk() {
        this.e = null;
        this.f = nzf.UNSET_ENUM_VALUE;
        this.h = null;
        this.i = null;
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
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e.intValue());
        }
        if (this.f != nzf.UNSET_ENUM_VALUE) {
            nyu.a(6, this.f);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null) {
            nyu.a(10, this.h.floatValue());
        }
        if (this.i != null) {
            nyu.a(11, this.i.booleanValue());
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
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.intValue());
        }
        if (this.f != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(6, this.f);
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null) {
            this.h.floatValue();
            b += nyu.h(10) + 4;
        }
        if (this.i == null) {
            return b;
        }
        this.i.booleanValue();
        return b + (nyu.h(11) + 1);
    }

    private odk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new odc();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new nuj();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new nac();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new muy();
                    }
                    nyt.a(this.d);
                    continue;
                case 40:
                    this.e = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f = a;
                            break;
                        default:
                            continue;
                    }
                case 58:
                    if (this.g == null) {
                        this.g = new oen();
                    }
                    nyt.a(this.g);
                    continue;
                case 85:
                    this.h = Float.valueOf(nyt.c());
                    continue;
                case 88:
                    this.i = Boolean.valueOf(nyt.i());
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
