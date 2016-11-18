package p000;

public final class mcp extends nyx<mcp> {
    private static volatile mcp[] f27346g;
    public Integer f27347a;
    public Integer f27348b;
    public Integer f27349c;
    public Long f27350d;
    public Float f27351e;
    public Long f27352f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31742b(nyt);
    }

    public static mcp[] m31743d() {
        if (f27346g == null) {
            synchronized (nzc.c) {
                if (f27346g == null) {
                    f27346g = new mcp[0];
                }
            }
        }
        return f27346g;
    }

    public mcp() {
        m31744g();
    }

    private mcp m31744g() {
        this.f27347a = null;
        this.f27348b = null;
        this.f27349c = null;
        this.f27350d = null;
        this.f27351e = null;
        this.f27352f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27347a != null) {
            nyu.c(1, this.f27347a.intValue());
        }
        if (this.f27348b != null) {
            nyu.c(2, this.f27348b.intValue());
        }
        if (this.f27349c != null) {
            nyu.c(3, this.f27349c.intValue());
        }
        if (this.f27350d != null) {
            nyu.a(4, this.f27350d.longValue());
        }
        if (this.f27351e != null) {
            nyu.a(5, this.f27351e.floatValue());
        }
        if (this.f27352f != null) {
            nyu.a(6, this.f27352f.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27347a != null) {
            b += nyu.g(1, this.f27347a.intValue());
        }
        if (this.f27348b != null) {
            b += nyu.g(2, this.f27348b.intValue());
        }
        if (this.f27349c != null) {
            b += nyu.g(3, this.f27349c.intValue());
        }
        if (this.f27350d != null) {
            b += nyu.e(4, this.f27350d.longValue());
        }
        if (this.f27351e != null) {
            this.f27351e.floatValue();
            b += nyu.h(5) + 4;
        }
        if (this.f27352f != null) {
            return b + nyu.e(6, this.f27352f.longValue());
        }
        return b;
    }

    private mcp m31742b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27347a = Integer.valueOf(nyt.l());
                    continue;
                case 16:
                    this.f27348b = Integer.valueOf(nyt.l());
                    continue;
                case wi.dA /*24*/:
                    this.f27349c = Integer.valueOf(nyt.l());
                    continue;
                case 32:
                    this.f27350d = Long.valueOf(nyt.d());
                    continue;
                case 45:
                    this.f27351e = Float.valueOf(nyt.c());
                    continue;
                case 48:
                    this.f27352f = Long.valueOf(nyt.d());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
