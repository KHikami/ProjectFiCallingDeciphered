package defpackage;

public final class kww extends nyx<kww> {
    public String a;
    public int b;
    public int c;
    public kvi d;
    public kwb e;
    public kxl f;
    public kvx g;
    public int h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kww() {
        this.a = null;
        this.b = nzf.UNSET_ENUM_VALUE;
        this.c = nzf.UNSET_ENUM_VALUE;
        this.h = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.b);
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
        if (this.h != nzf.UNSET_ENUM_VALUE) {
            nyu.a(8, this.h);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.b);
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
            b += nyu.d(7, this.g);
        }
        if (this.h != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(8, this.h);
        }
        return b;
    }

    private kww b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
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
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.d == null) {
                        this.d = new kvi();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new kwb();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new kxl();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new kvx();
                    }
                    nyt.a(this.g);
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.h = a;
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
