package defpackage;

public final class log extends nyx<log> {
    private static volatile log[] d;
    public loe a;
    public Integer b;
    public Long c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static log[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new log[0];
                }
            }
        }
        return d;
    }

    public log() {
        g();
    }

    private log g() {
        this.a = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            return b + nyu.f(3, this.c.longValue());
        }
        return b;
    }

    private log b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new loe();
                    }
                    nyt.a(this.a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 10:
                        case 20:
                        case 30:
                        case 40:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.e());
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
