package p000;

public final class ktk extends nyx<ktk> {
    private static volatile ktk[] f23225d;
    public Integer f23226a;
    public String f23227b;
    public String f23228c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27454b(nyt);
    }

    public static ktk[] m27455d() {
        if (f23225d == null) {
            synchronized (nzc.c) {
                if (f23225d == null) {
                    f23225d = new ktk[0];
                }
            }
        }
        return f23225d;
    }

    public ktk() {
        m27456g();
    }

    private ktk m27456g() {
        this.f23227b = null;
        this.f23228c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23226a != null) {
            nyu.a(1, this.f23226a.intValue());
        }
        if (this.f23227b != null) {
            nyu.a(2, this.f23227b);
        }
        if (this.f23228c != null) {
            nyu.a(3, this.f23228c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23226a != null) {
            b += nyu.f(1, this.f23226a.intValue());
        }
        if (this.f23227b != null) {
            b += nyu.b(2, this.f23227b);
        }
        if (this.f23228c != null) {
            return b + nyu.b(3, this.f23228c);
        }
        return b;
    }

    private ktk m27454b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            this.f23226a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f23227b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23228c = nyt.j();
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
