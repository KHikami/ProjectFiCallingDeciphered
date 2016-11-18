package defpackage;

public final class ogg extends nyx<ogg> {
    private static volatile ogg[] e;
    public Integer a;
    public Double b;
    public Double c;
    public Integer d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ogg[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new ogg[0];
                }
            }
        }
        return e;
    }

    public ogg() {
        g();
    }

    private ogg g() {
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b.doubleValue());
        }
        if (this.c != null) {
            nyu.a(2, this.c.doubleValue());
        }
        if (this.d != null) {
            nyu.a(3, this.d.intValue());
        }
        if (this.a != null) {
            nyu.a(4, this.a.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            this.b.doubleValue();
            b += nyu.h(1) + 8;
        }
        if (this.c != null) {
            this.c.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.d != null) {
            b += nyu.f(3, this.d.intValue());
        }
        if (this.a != null) {
            return b + nyu.f(4, this.a.intValue());
        }
        return b;
    }

    private ogg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.b = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.c = Double.valueOf(nyt.b());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.d = Integer.valueOf(a);
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
                            this.a = Integer.valueOf(a);
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
