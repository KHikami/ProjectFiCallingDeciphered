package defpackage;

public final class mul extends nyx<mul> {
    public Integer a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mul() {
        d();
    }

    private mul d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.f = null;
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
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.intValue());
        }
        if (this.g != null) {
            nyu.a(7, this.g.intValue());
        }
        if (this.h != null) {
            nyu.a(8, this.h.intValue());
        }
        if (this.i != null) {
            nyu.a(9, this.i.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.f(6, this.f.intValue());
        }
        if (this.g != null) {
            b += nyu.f(7, this.g.intValue());
        }
        if (this.h != null) {
            b += nyu.f(8, this.h.intValue());
        }
        if (this.i != null) {
            return b + nyu.f(9, this.i.intValue());
        }
        return b;
    }

    private mul b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    this.f = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 64:
                    a = nyt.f();
                    switch (a) {
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
                            this.h = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 72:
                    this.i = Integer.valueOf(nyt.f());
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
