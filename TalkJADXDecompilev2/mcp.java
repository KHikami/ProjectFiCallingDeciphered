package defpackage;

public final class mcp extends nyx<mcp> {
    private static volatile mcp[] g;
    public Integer a;
    public Integer b;
    public Integer c;
    public Long d;
    public Float e;
    public Long f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mcp[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new mcp[0];
                }
            }
        }
        return g;
    }

    public mcp() {
        g();
    }

    private mcp g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.c(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.c(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.c(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.longValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.floatValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.g(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.g(2, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.g(3, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.e(4, this.d.longValue());
        }
        if (this.e != null) {
            this.e.floatValue();
            b += nyu.h(5) + 4;
        }
        if (this.f != null) {
            return b + nyu.e(6, this.f.longValue());
        }
        return b;
    }

    private mcp b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.l());
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.l());
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.l());
                    continue;
                case 32:
                    this.d = Long.valueOf(nyt.d());
                    continue;
                case 45:
                    this.e = Float.valueOf(nyt.c());
                    continue;
                case 48:
                    this.f = Long.valueOf(nyt.d());
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
