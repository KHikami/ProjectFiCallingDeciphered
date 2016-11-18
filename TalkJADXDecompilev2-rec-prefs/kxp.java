package p000;

public final class kxp extends nyx<kxp> {
    private static volatile kxp[] f23865e;
    public String f23866a;
    public String f23867b;
    public int f23868c;
    public String f23869d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27952b(nyt);
    }

    public static kxp[] m27953d() {
        if (f23865e == null) {
            synchronized (nzc.c) {
                if (f23865e == null) {
                    f23865e = new kxp[0];
                }
            }
        }
        return f23865e;
    }

    public kxp() {
        this.f23866a = null;
        this.f23867b = null;
        this.f23868c = nzf.UNSET_ENUM_VALUE;
        this.f23869d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23866a != null) {
            nyu.a(1, this.f23866a);
        }
        if (this.f23867b != null) {
            nyu.a(2, this.f23867b);
        }
        if (this.f23868c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(3, this.f23868c);
        }
        if (this.f23869d != null) {
            nyu.a(4, this.f23869d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23866a != null) {
            b += nyu.b(1, this.f23866a);
        }
        if (this.f23867b != null) {
            b += nyu.b(2, this.f23867b);
        }
        if (this.f23868c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(3, this.f23868c);
        }
        if (this.f23869d != null) {
            return b + nyu.b(4, this.f23869d);
        }
        return b;
    }

    private kxp m27952b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23866a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23867b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f23868c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.f23869d = nyt.j();
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
