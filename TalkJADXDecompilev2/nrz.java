package defpackage;

public final class nrz extends nyx<nrz> {
    public Integer a;
    public Integer b;
    public int c;
    public nru d;
    public nry e;
    public nsd f;
    public nrv g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nrz() {
        this.a = null;
        this.b = null;
        this.c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
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
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(3, this.c);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null) {
            return b + nyu.d(7, this.g);
        }
        return b;
    }

    private nrz b(nyt nyt) {
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
                            this.c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.d == null) {
                        this.d = new nru();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new nry();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new nsd();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new nrv();
                    }
                    nyt.a(this.g);
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
