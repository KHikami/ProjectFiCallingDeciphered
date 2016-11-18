package defpackage;

public final class myh extends nyx<myh> {
    private static volatile myh[] f;
    public int a;
    public myj b;
    public Long c;
    public myi d;
    public int e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static myh[] d() {
        if (f == null) {
            synchronized (nzc.c) {
                if (f == null) {
                    f = new myh[0];
                }
            }
        }
        return f;
    }

    public myh() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.c = null;
        this.e = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c.longValue());
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != nzf.UNSET_ENUM_VALUE) {
            nyu.a(5, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.longValue());
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(5, this.e);
        }
        return b;
    }

    private myh b(nyt nyt) {
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
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new myj();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new myi();
                    }
                    nyt.a(this.d);
                    continue;
                case 40:
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
