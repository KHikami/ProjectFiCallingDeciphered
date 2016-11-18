package p000;

public final class ldz extends nyx<ldz> {
    private static volatile ldz[] f24735g;
    public String f24736a;
    public String f24737b;
    public String f24738c;
    public String f24739d;
    public String f24740e;
    public String f24741f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28816b(nyt);
    }

    public static ldz[] m28817d() {
        if (f24735g == null) {
            synchronized (nzc.c) {
                if (f24735g == null) {
                    f24735g = new ldz[0];
                }
            }
        }
        return f24735g;
    }

    public ldz() {
        m28818g();
    }

    private ldz m28818g() {
        this.f24736a = null;
        this.f24737b = null;
        this.f24738c = null;
        this.f24739d = null;
        this.f24740e = null;
        this.f24741f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24736a != null) {
            nyu.a(1, this.f24736a);
        }
        if (this.f24737b != null) {
            nyu.a(2, this.f24737b);
        }
        if (this.f24738c != null) {
            nyu.a(3, this.f24738c);
        }
        if (this.f24739d != null) {
            nyu.a(4, this.f24739d);
        }
        if (this.f24740e != null) {
            nyu.a(5, this.f24740e);
        }
        if (this.f24741f != null) {
            nyu.a(6, this.f24741f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24736a != null) {
            b += nyu.b(1, this.f24736a);
        }
        if (this.f24737b != null) {
            b += nyu.b(2, this.f24737b);
        }
        if (this.f24738c != null) {
            b += nyu.b(3, this.f24738c);
        }
        if (this.f24739d != null) {
            b += nyu.b(4, this.f24739d);
        }
        if (this.f24740e != null) {
            b += nyu.b(5, this.f24740e);
        }
        if (this.f24741f != null) {
            return b + nyu.b(6, this.f24741f);
        }
        return b;
    }

    private ldz m28816b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24736a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24737b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24738c = nyt.j();
                    continue;
                case 34:
                    this.f24739d = nyt.j();
                    continue;
                case 42:
                    this.f24740e = nyt.j();
                    continue;
                case 50:
                    this.f24741f = nyt.j();
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
