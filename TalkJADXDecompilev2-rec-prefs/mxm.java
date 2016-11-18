package p000;

public final class mxm extends nyx<mxm> {
    private static volatile mxm[] f28687e;
    public String f28688a;
    public Long f28689b;
    public String f28690c;
    public Long f28691d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33345b(nyt);
    }

    public static mxm[] m33346d() {
        if (f28687e == null) {
            synchronized (nzc.c) {
                if (f28687e == null) {
                    f28687e = new mxm[0];
                }
            }
        }
        return f28687e;
    }

    public mxm() {
        m33347g();
    }

    private mxm m33347g() {
        this.f28688a = null;
        this.f28689b = null;
        this.f28690c = null;
        this.f28691d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28688a != null) {
            nyu.a(1, this.f28688a);
        }
        if (this.f28689b != null) {
            nyu.c(2, this.f28689b.longValue());
        }
        if (this.f28691d != null) {
            nyu.b(3, this.f28691d.longValue());
        }
        if (this.f28690c != null) {
            nyu.a(4, this.f28690c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28688a != null) {
            b += nyu.b(1, this.f28688a);
        }
        if (this.f28689b != null) {
            this.f28689b.longValue();
            b += nyu.h(2) + 8;
        }
        if (this.f28691d != null) {
            b += nyu.f(3, this.f28691d.longValue());
        }
        if (this.f28690c != null) {
            return b + nyu.b(4, this.f28690c);
        }
        return b;
    }

    private mxm m33345b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28688a = nyt.j();
                    continue;
                case wi.dK /*17*/:
                    this.f28689b = Long.valueOf(nyt.g());
                    continue;
                case wi.dA /*24*/:
                    this.f28691d = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    this.f28690c = nyt.j();
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
