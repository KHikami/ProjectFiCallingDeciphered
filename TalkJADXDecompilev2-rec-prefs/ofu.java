package p000;

public final class ofu extends nyx<ofu> {
    private static volatile ofu[] f32677g;
    public Integer f32678a;
    public String f32679b;
    public ofr f32680c;
    public oft f32681d;
    public ofw f32682e;
    public ofs f32683f;

    public /* synthetic */ nzf m38117a(nyt nyt) {
        return m38114b(nyt);
    }

    public static ofu[] m38115d() {
        if (f32677g == null) {
            synchronized (nzc.f31309c) {
                if (f32677g == null) {
                    f32677g = new ofu[0];
                }
            }
        }
        return f32677g;
    }

    public ofu() {
        m38116g();
    }

    private ofu m38116g() {
        this.f32679b = null;
        this.f32680c = null;
        this.f32681d = null;
        this.f32682e = null;
        this.f32683f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38118a(nyu nyu) {
        if (this.f32678a != null) {
            nyu.m37168a(1, this.f32678a.intValue());
        }
        if (this.f32679b != null) {
            nyu.m37170a(2, this.f32679b);
        }
        if (this.f32680c != null) {
            nyu.m37182b(3, this.f32680c);
        }
        if (this.f32681d != null) {
            nyu.m37182b(4, this.f32681d);
        }
        if (this.f32682e != null) {
            nyu.m37182b(5, this.f32682e);
        }
        if (this.f32683f != null) {
            nyu.m37182b(6, this.f32683f);
        }
        super.a(nyu);
    }

    protected int m38119b() {
        int b = super.b();
        if (this.f32678a != null) {
            b += nyu.m37147f(1, this.f32678a.intValue());
        }
        if (this.f32679b != null) {
            b += nyu.m37137b(2, this.f32679b);
        }
        if (this.f32680c != null) {
            b += nyu.m37145d(3, this.f32680c);
        }
        if (this.f32681d != null) {
            b += nyu.m37145d(4, this.f32681d);
        }
        if (this.f32682e != null) {
            b += nyu.m37145d(5, this.f32682e);
        }
        if (this.f32683f != null) {
            return b + nyu.m37145d(6, this.f32683f);
        }
        return b;
    }

    private ofu m38114b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f32678a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f32679b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f32680c == null) {
                        this.f32680c = new ofr();
                    }
                    nyt.m37101a(this.f32680c);
                    continue;
                case 34:
                    if (this.f32681d == null) {
                        this.f32681d = new oft();
                    }
                    nyt.m37101a(this.f32681d);
                    continue;
                case 42:
                    if (this.f32682e == null) {
                        this.f32682e = new ofw();
                    }
                    nyt.m37101a(this.f32682e);
                    continue;
                case 50:
                    if (this.f32683f == null) {
                        this.f32683f = new ofs();
                    }
                    nyt.m37101a(this.f32683f);
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
