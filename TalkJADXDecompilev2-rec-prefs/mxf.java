package p000;

public final class mxf extends nyx<mxf> {
    private static volatile mxf[] f28670d;
    public Long f28671a;
    public Long f28672b;
    public Boolean f28673c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33309b(nyt);
    }

    public static mxf[] m33310d() {
        if (f28670d == null) {
            synchronized (nzc.c) {
                if (f28670d == null) {
                    f28670d = new mxf[0];
                }
            }
        }
        return f28670d;
    }

    public mxf() {
        m33311g();
    }

    private mxf m33311g() {
        this.f28671a = null;
        this.f28672b = null;
        this.f28673c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28671a != null) {
            nyu.b(1, this.f28671a.longValue());
        }
        if (this.f28672b != null) {
            nyu.b(2, this.f28672b.longValue());
        }
        if (this.f28673c != null) {
            nyu.a(3, this.f28673c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28671a != null) {
            b += nyu.f(1, this.f28671a.longValue());
        }
        if (this.f28672b != null) {
            b += nyu.f(2, this.f28672b.longValue());
        }
        if (this.f28673c == null) {
            return b;
        }
        this.f28673c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private mxf m33309b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28671a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.f28672b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.f28673c = Boolean.valueOf(nyt.i());
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
