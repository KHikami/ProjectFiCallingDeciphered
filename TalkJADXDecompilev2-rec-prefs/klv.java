package p000;

public final class klv extends nyx<klv> {
    private static volatile klv[] f22310e;
    public klk f22311a;
    public String f22312b;
    public String f22313c;
    public String f22314d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26458b(nyt);
    }

    public static klv[] m26459d() {
        if (f22310e == null) {
            synchronized (nzc.c) {
                if (f22310e == null) {
                    f22310e = new klv[0];
                }
            }
        }
        return f22310e;
    }

    public klv() {
        m26460g();
    }

    private klv m26460g() {
        this.f22311a = null;
        this.f22312b = null;
        this.f22313c = null;
        this.f22314d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22311a != null) {
            nyu.b(1, this.f22311a);
        }
        if (this.f22312b != null) {
            nyu.a(2, this.f22312b);
        }
        if (this.f22313c != null) {
            nyu.a(3, this.f22313c);
        }
        if (this.f22314d != null) {
            nyu.a(4, this.f22314d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22311a != null) {
            b += nyu.d(1, this.f22311a);
        }
        if (this.f22312b != null) {
            b += nyu.b(2, this.f22312b);
        }
        if (this.f22313c != null) {
            b += nyu.b(3, this.f22313c);
        }
        if (this.f22314d != null) {
            return b + nyu.b(4, this.f22314d);
        }
        return b;
    }

    private klv m26458b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22311a == null) {
                        this.f22311a = new klk();
                    }
                    nyt.a(this.f22311a);
                    continue;
                case wi.dH /*18*/:
                    this.f22312b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22313c = nyt.j();
                    continue;
                case 34:
                    this.f22314d = nyt.j();
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
