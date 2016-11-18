package p000;

public final class lna extends nyx<lna> {
    private static volatile lna[] f25722e;
    public String f25723a;
    public String f25724b;
    public Long f25725c;
    public String f25726d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29569b(nyt);
    }

    public static lna[] m29570d() {
        if (f25722e == null) {
            synchronized (nzc.c) {
                if (f25722e == null) {
                    f25722e = new lna[0];
                }
            }
        }
        return f25722e;
    }

    public lna() {
        this.f25723a = null;
        this.f25724b = null;
        this.f25725c = null;
        this.f25726d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f25723a != null) {
            nyu.a(1, this.f25723a);
        }
        if (this.f25724b != null) {
            nyu.a(2, this.f25724b);
        }
        if (this.f25725c != null) {
            nyu.b(3, this.f25725c.longValue());
        }
        if (this.f25726d != null) {
            nyu.a(4, this.f25726d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25723a != null) {
            b += nyu.b(1, this.f25723a);
        }
        if (this.f25724b != null) {
            b += nyu.b(2, this.f25724b);
        }
        if (this.f25725c != null) {
            b += nyu.f(3, this.f25725c.longValue());
        }
        if (this.f25726d != null) {
            return b + nyu.b(4, this.f25726d);
        }
        return b;
    }

    private lna m29569b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25723a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f25724b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f25725c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    this.f25726d = nyt.j();
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
