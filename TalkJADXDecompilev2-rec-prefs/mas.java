package p000;

public final class mas extends nyx<mas> {
    private static volatile mas[] f27145e;
    public String f27146a;
    public Integer f27147b;
    public Integer f27148c;
    public String f27149d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31476b(nyt);
    }

    public static mas[] m31477d() {
        if (f27145e == null) {
            synchronized (nzc.c) {
                if (f27145e == null) {
                    f27145e = new mas[0];
                }
            }
        }
        return f27145e;
    }

    public mas() {
        m31478g();
    }

    private mas m31478g() {
        this.f27146a = null;
        this.f27148c = null;
        this.f27149d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27146a != null) {
            nyu.a(1, this.f27146a);
        }
        if (this.f27147b != null) {
            nyu.a(2, this.f27147b.intValue());
        }
        if (this.f27148c != null) {
            nyu.a(3, this.f27148c.intValue());
        }
        if (this.f27149d != null) {
            nyu.a(4, this.f27149d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27146a != null) {
            b += nyu.b(1, this.f27146a);
        }
        if (this.f27147b != null) {
            b += nyu.f(2, this.f27147b.intValue());
        }
        if (this.f27148c != null) {
            b += nyu.f(3, this.f27148c.intValue());
        }
        if (this.f27149d != null) {
            return b + nyu.b(4, this.f27149d);
        }
        return b;
    }

    private mas m31476b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27146a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f27147b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f27148c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f27149d = nyt.j();
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
