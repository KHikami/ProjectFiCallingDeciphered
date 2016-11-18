package p000;

public final class gga extends nzf {
    private static volatile gga[] f15208j;
    public gfy f15209a;
    public String f15210b;
    public long f15211c;
    public long f15212d;
    public String f15213e;
    public String f15214f;
    public int f15215g;
    public gfz f15216h;
    public boolean f15217i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m17597b(nyt);
    }

    public static gga[] m17598d() {
        if (f15208j == null) {
            synchronized (nzc.c) {
                if (f15208j == null) {
                    f15208j = new gga[0];
                }
            }
        }
        return f15208j;
    }

    public gga() {
        m17599e();
    }

    private gga m17599e() {
        this.f15209a = null;
        this.f15210b = "";
        this.f15211c = 0;
        this.f15212d = 0;
        this.f15213e = "";
        this.f15214f = "";
        this.f15215g = 0;
        this.f15216h = null;
        this.f15217i = false;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f15209a != null) {
            nyu.b(1, this.f15209a);
        }
        if (!(this.f15210b == null || this.f15210b.equals(""))) {
            nyu.a(2, this.f15210b);
        }
        if (this.f15211c != 0) {
            nyu.b(3, this.f15211c);
        }
        if (this.f15212d != 0) {
            nyu.b(4, this.f15212d);
        }
        if (!(this.f15213e == null || this.f15213e.equals(""))) {
            nyu.a(5, this.f15213e);
        }
        if (!(this.f15214f == null || this.f15214f.equals(""))) {
            nyu.a(6, this.f15214f);
        }
        if (this.f15215g != 0) {
            nyu.a(7, this.f15215g);
        }
        if (this.f15216h != null) {
            nyu.b(8, this.f15216h);
        }
        if (this.f15217i) {
            nyu.a(9, this.f15217i);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f15209a != null) {
            b += nyu.d(1, this.f15209a);
        }
        if (!(this.f15210b == null || this.f15210b.equals(""))) {
            b += nyu.b(2, this.f15210b);
        }
        if (this.f15211c != 0) {
            b += nyu.f(3, this.f15211c);
        }
        if (this.f15212d != 0) {
            b += nyu.f(4, this.f15212d);
        }
        if (!(this.f15213e == null || this.f15213e.equals(""))) {
            b += nyu.b(5, this.f15213e);
        }
        if (!(this.f15214f == null || this.f15214f.equals(""))) {
            b += nyu.b(6, this.f15214f);
        }
        if (this.f15215g != 0) {
            b += nyu.f(7, this.f15215g);
        }
        if (this.f15216h != null) {
            b += nyu.d(8, this.f15216h);
        }
        if (!this.f15217i) {
            return b;
        }
        boolean z = this.f15217i;
        return b + (nyu.h(9) + 1);
    }

    private gga m17597b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f15209a == null) {
                        this.f15209a = new gfy();
                    }
                    nyt.a(this.f15209a);
                    continue;
                case wi.dH /*18*/:
                    this.f15210b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f15211c = nyt.e();
                    continue;
                case 32:
                    this.f15212d = nyt.e();
                    continue;
                case 42:
                    this.f15213e = nyt.j();
                    continue;
                case 50:
                    this.f15214f = nyt.j();
                    continue;
                case 56:
                    this.f15215g = nyt.f();
                    continue;
                case 66:
                    if (this.f15216h == null) {
                        this.f15216h = new gfz();
                    }
                    nyt.a(this.f15216h);
                    continue;
                case 72:
                    this.f15217i = nyt.i();
                    continue;
                default:
                    if (!nyt.b(a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
