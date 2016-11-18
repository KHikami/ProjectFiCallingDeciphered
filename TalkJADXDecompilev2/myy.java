package defpackage;

public final class myy extends nyx<myy> {
    private static volatile myy[] f;
    public Integer a;
    public mza b;
    public Long c;
    public myz d;
    public Integer e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static myy[] d() {
        if (f == null) {
            synchronized (nzc.c) {
                if (f == null) {
                    f = new myy[0];
                }
            }
        }
        return f;
    }

    public myy() {
        g();
    }

    private myy g() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
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
        if (this.e != null) {
            nyu.a(5, this.e.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
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
        if (this.e != null) {
            return b + nyu.f(5, this.e.intValue());
        }
        return b;
    }

    private myy b(nyt nyt) {
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
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new mza();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new myz();
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
                            this.e = Integer.valueOf(a);
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
