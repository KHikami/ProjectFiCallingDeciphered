package p000;

public final class ksu extends nyx<ksu> {
    private static volatile ksu[] f23155k;
    public String f23156a;
    public String f23157b;
    public String f23158c;
    public String f23159d;
    public String f23160e;
    public String f23161f;
    public String f23162g;
    public String f23163h;
    public Integer f23164i;
    public ksv f23165j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27373b(nyt);
    }

    public static ksu[] m27374d() {
        if (f23155k == null) {
            synchronized (nzc.c) {
                if (f23155k == null) {
                    f23155k = new ksu[0];
                }
            }
        }
        return f23155k;
    }

    public ksu() {
        m27375g();
    }

    private ksu m27375g() {
        this.f23156a = null;
        this.f23157b = null;
        this.f23158c = null;
        this.f23159d = null;
        this.f23160e = null;
        this.f23161f = null;
        this.f23162g = null;
        this.f23163h = null;
        this.f23164i = null;
        this.f23165j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23157b);
        if (this.f23158c != null) {
            nyu.a(2, this.f23158c);
        }
        if (this.f23159d != null) {
            nyu.a(3, this.f23159d);
        }
        if (this.f23160e != null) {
            nyu.a(4, this.f23160e);
        }
        if (this.f23161f != null) {
            nyu.a(5, this.f23161f);
        }
        if (this.f23163h != null) {
            nyu.a(6, this.f23163h);
        }
        if (this.f23164i != null) {
            nyu.a(7, this.f23164i.intValue());
        }
        if (this.f23162g != null) {
            nyu.a(8, this.f23162g);
        }
        if (this.f23156a != null) {
            nyu.a(9, this.f23156a);
        }
        if (this.f23165j != null) {
            nyu.b(10, this.f23165j);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b() + nyu.b(1, this.f23157b);
        if (this.f23158c != null) {
            b += nyu.b(2, this.f23158c);
        }
        if (this.f23159d != null) {
            b += nyu.b(3, this.f23159d);
        }
        if (this.f23160e != null) {
            b += nyu.b(4, this.f23160e);
        }
        if (this.f23161f != null) {
            b += nyu.b(5, this.f23161f);
        }
        if (this.f23163h != null) {
            b += nyu.b(6, this.f23163h);
        }
        if (this.f23164i != null) {
            b += nyu.f(7, this.f23164i.intValue());
        }
        if (this.f23162g != null) {
            b += nyu.b(8, this.f23162g);
        }
        if (this.f23156a != null) {
            b += nyu.b(9, this.f23156a);
        }
        if (this.f23165j != null) {
            return b + nyu.d(10, this.f23165j);
        }
        return b;
    }

    private ksu m27373b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23157b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23158c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23159d = nyt.j();
                    continue;
                case 34:
                    this.f23160e = nyt.j();
                    continue;
                case 42:
                    this.f23161f = nyt.j();
                    continue;
                case 50:
                    this.f23163h = nyt.j();
                    continue;
                case 56:
                    this.f23164i = Integer.valueOf(nyt.f());
                    continue;
                case 66:
                    this.f23162g = nyt.j();
                    continue;
                case 74:
                    this.f23156a = nyt.j();
                    continue;
                case 82:
                    if (this.f23165j == null) {
                        this.f23165j = new ksv();
                    }
                    nyt.a(this.f23165j);
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
