package defpackage;

public final class oyg extends nyx<oyg> {
    private static volatile oyg[] d;
    public oyh a;
    public oyi b;
    public Integer c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oyg[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new oyg[0];
                }
            }
        }
        return d;
    }

    public oyg() {
        g();
    }

    private oyg g() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.c != null) {
            nyu.a(2, this.c.intValue());
        }
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.c != null) {
            b += nyu.f(2, this.c.intValue());
        }
        if (this.b != null) {
            return b + nyu.d(3, this.b);
        }
        return b;
    }

    private oyg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new oyh();
                    }
                    nyt.a(this.a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 45:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new oyi();
                    }
                    nyt.a(this.b);
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
