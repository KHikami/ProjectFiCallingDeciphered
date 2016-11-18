package defpackage;

public final class lwk extends nyx<lwk> {
    private static volatile lwk[] h;
    public String a;
    public Long b;
    public Integer c;
    public ofm d;
    public lqb e;
    public String f;
    public String g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lwk[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new lwk[0];
                }
            }
        }
        return h;
    }

    public lwk() {
        g();
    }

    private lwk g() {
        this.a = null;
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.longValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.b(6, this.d);
        }
        if (this.e != null) {
            nyu.b(7, this.e);
        }
        if (this.f != null) {
            nyu.a(8, this.f);
        }
        if (this.g != null) {
            nyu.a(9, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.e(2, this.b.longValue());
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.d(6, this.d);
        }
        if (this.e != null) {
            b += nyu.d(7, this.e);
        }
        if (this.f != null) {
            b += nyu.b(8, this.f);
        }
        if (this.g != null) {
            return b + nyu.b(9, this.g);
        }
        return b;
    }

    private lwk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    this.b = Long.valueOf(nyt.d());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
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
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 50:
                    if (this.d == null) {
                        this.d = new ofm();
                    }
                    nyt.a(this.d);
                    continue;
                case 58:
                    if (this.e == null) {
                        this.e = new lqb();
                    }
                    nyt.a(this.e);
                    continue;
                case 66:
                    this.f = nyt.j();
                    continue;
                case 74:
                    this.g = nyt.j();
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
