package defpackage;

public final class nmj extends nyx<nmj> {
    public Integer a;
    public String b;
    public Long c;
    public String d;
    public String e;
    public Long f;
    public String g;
    public String h;
    public String i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nmj() {
        d();
    }

    private nmj d() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
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
            nyu.b(3, this.c.longValue());
        }
        if (this.e != null) {
            nyu.a(4, this.e);
        }
        if (this.f != null) {
            nyu.b(5, this.f.longValue());
        }
        if (this.d != null) {
            nyu.a(6, this.d);
        }
        if (this.g != null) {
            nyu.a(7, this.g);
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        if (this.i != null) {
            nyu.a(9, this.i);
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
            b += nyu.f(3, this.c.longValue());
        }
        if (this.e != null) {
            b += nyu.b(4, this.e);
        }
        if (this.f != null) {
            b += nyu.f(5, this.f.longValue());
        }
        if (this.d != null) {
            b += nyu.b(6, this.d);
        }
        if (this.g != null) {
            b += nyu.b(7, this.g);
        }
        if (this.h != null) {
            b += nyu.b(8, this.h);
        }
        if (this.i != null) {
            return b + nyu.b(9, this.i);
        }
        return b;
    }

    private nmj b(nyt nyt) {
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
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    this.e = nyt.j();
                    continue;
                case 40:
                    this.f = Long.valueOf(nyt.e());
                    continue;
                case 50:
                    this.d = nyt.j();
                    continue;
                case 58:
                    this.g = nyt.j();
                    continue;
                case 66:
                    this.h = nyt.j();
                    continue;
                case 74:
                    this.i = nyt.j();
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
