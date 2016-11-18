package p000;

public final class lmw extends nyx<lmw> {
    private static volatile lmw[] f25708e;
    public String f25709a;
    public String f25710b;
    public Long f25711c;
    public String f25712d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29548b(nyt);
    }

    public static lmw[] m29549d() {
        if (f25708e == null) {
            synchronized (nzc.c) {
                if (f25708e == null) {
                    f25708e = new lmw[0];
                }
            }
        }
        return f25708e;
    }

    public lmw() {
        m29550g();
    }

    private lmw m29550g() {
        this.f25709a = null;
        this.f25710b = null;
        this.f25711c = null;
        this.f25712d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25709a != null) {
            nyu.a(1, this.f25709a);
        }
        if (this.f25710b != null) {
            nyu.a(2, this.f25710b);
        }
        if (this.f25711c != null) {
            nyu.b(3, this.f25711c.longValue());
        }
        if (this.f25712d != null) {
            nyu.a(4, this.f25712d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25709a != null) {
            b += nyu.b(1, this.f25709a);
        }
        if (this.f25710b != null) {
            b += nyu.b(2, this.f25710b);
        }
        if (this.f25711c != null) {
            b += nyu.f(3, this.f25711c.longValue());
        }
        if (this.f25712d != null) {
            return b + nyu.b(4, this.f25712d);
        }
        return b;
    }

    private lmw m29548b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25709a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f25710b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f25711c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    this.f25712d = nyt.j();
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
