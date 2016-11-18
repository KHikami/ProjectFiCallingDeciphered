package p000;

public final class kuo extends nyx<kuo> {
    private static volatile kuo[] f23474e;
    public Integer f23475a;
    public Integer f23476b;
    public Integer f23477c;
    public String f23478d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27591b(nyt);
    }

    public static kuo[] m27592d() {
        if (f23474e == null) {
            synchronized (nzc.c) {
                if (f23474e == null) {
                    f23474e = new kuo[0];
                }
            }
        }
        return f23474e;
    }

    public kuo() {
        this.f23475a = null;
        this.f23476b = null;
        this.f23477c = null;
        this.f23478d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23475a.intValue());
        nyu.a(2, this.f23476b.intValue());
        nyu.a(3, this.f23477c.intValue());
        if (this.f23478d != null) {
            nyu.a(4, this.f23478d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = ((super.mo147b() + nyu.f(1, this.f23475a.intValue())) + nyu.f(2, this.f23476b.intValue())) + nyu.f(3, this.f23477c.intValue());
        if (this.f23478d != null) {
            return b + nyu.b(4, this.f23478d);
        }
        return b;
    }

    private kuo m27591b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23475a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f23476b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f23477c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f23478d = nyt.j();
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
