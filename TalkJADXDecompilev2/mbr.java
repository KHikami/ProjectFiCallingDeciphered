package defpackage;

public final class mbr extends nyx<mbr> {
    public Long a;
    public String b;
    public Long c;
    public Long d;
    public Integer e;
    public Integer f;
    public Integer g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mbr() {
        d();
    }

    private mbr d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a.longValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c.longValue());
        }
        if (this.d != null) {
            nyu.b(4, this.d.longValue());
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
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.longValue());
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.longValue());
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.longValue());
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.f(6, this.f.intValue());
        }
        if (this.g != null) {
            return b + nyu.f(7, this.g.intValue());
        }
        return b;
    }

    private mbr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    this.d = Long.valueOf(nyt.e());
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
                        case 7:
                        case 8:
                        case 9:
                            this.e = Integer.valueOf(a);
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
                            this.f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
