package defpackage;

public final class ofi extends nyx<ofi> {
    public static final nyy<ofj, ofi> a = nyy.a(11, ofi.class, 693824626);
    private static final ofi[] h = new ofi[0];
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ofi() {
        this.b = nzf.UNSET_ENUM_VALUE;
        this.c = nzf.UNSET_ENUM_VALUE;
        this.d = nzf.UNSET_ENUM_VALUE;
        this.e = nzf.UNSET_ENUM_VALUE;
        this.f = nzf.UNSET_ENUM_VALUE;
        this.g = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.b);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.c);
        }
        if (this.d != nzf.UNSET_ENUM_VALUE) {
            nyu.a(3, this.d);
        }
        if (this.e != nzf.UNSET_ENUM_VALUE) {
            nyu.a(4, this.e);
        }
        if (this.f != nzf.UNSET_ENUM_VALUE) {
            nyu.a(5, this.f);
        }
        if (this.g != nzf.UNSET_ENUM_VALUE) {
            nyu.a(6, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.b);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.c);
        }
        if (this.d != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(3, this.d);
        }
        if (this.e != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(4, this.e);
        }
        if (this.f != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(5, this.f);
        }
        if (this.g != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(6, this.g);
        }
        return b;
    }

    private ofi b(nyt nyt) {
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
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.c = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.d = a;
                            break;
                        default:
                            continue;
                    }
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.e = a;
                            break;
                        default:
                            continue;
                    }
                case 40:
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
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.g = a;
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
