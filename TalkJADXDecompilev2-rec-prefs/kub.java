package p000;

public final class kub extends nyx<kub> {
    private static volatile kub[] f23355e;
    public String f23356a;
    public Integer f23357b;
    public Integer f23358c;
    public Integer f23359d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27534b(nyt);
    }

    public static kub[] m27535d() {
        if (f23355e == null) {
            synchronized (nzc.c) {
                if (f23355e == null) {
                    f23355e = new kub[0];
                }
            }
        }
        return f23355e;
    }

    public kub() {
        this.f23356a = null;
        this.f23357b = null;
        this.f23358c = null;
        this.f23359d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23356a);
        if (this.f23357b != null) {
            nyu.a(2, this.f23357b.intValue());
        }
        if (this.f23358c != null) {
            nyu.a(3, this.f23358c.intValue());
        }
        if (this.f23359d != null) {
            nyu.a(4, this.f23359d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b() + nyu.b(1, this.f23356a);
        if (this.f23357b != null) {
            b += nyu.f(2, this.f23357b.intValue());
        }
        if (this.f23358c != null) {
            b += nyu.f(3, this.f23358c.intValue());
        }
        if (this.f23359d != null) {
            return b + nyu.f(4, this.f23359d.intValue());
        }
        return b;
    }

    private kub m27534b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23356a = nyt.j();
                    continue;
                case 16:
                    this.f23357b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f23358c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f23359d = Integer.valueOf(nyt.f());
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
