package p000;

public final class mwl extends nyx<mwl> {
    private static volatile mwl[] f28595e;
    public int f28596a;
    public mwu f28597b;
    public mwm f28598c;
    public mwn f28599d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33217b(nyt);
    }

    public static mwl[] m33218d() {
        if (f28595e == null) {
            synchronized (nzc.c) {
                if (f28595e == null) {
                    f28595e = new mwl[0];
                }
            }
        }
        return f28595e;
    }

    public mwl() {
        this.f28596a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28596a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f28596a);
        }
        if (this.f28597b != null) {
            nyu.b(2, this.f28597b);
        }
        if (this.f28598c != null) {
            nyu.b(3, this.f28598c);
        }
        if (this.f28599d != null) {
            nyu.b(4, this.f28599d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28596a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f28596a);
        }
        if (this.f28597b != null) {
            b += nyu.d(2, this.f28597b);
        }
        if (this.f28598c != null) {
            b += nyu.d(3, this.f28598c);
        }
        if (this.f28599d != null) {
            return b + nyu.d(4, this.f28599d);
        }
        return b;
    }

    private mwl m33217b(nyt nyt) {
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
                            this.f28596a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f28597b == null) {
                        this.f28597b = new mwu();
                    }
                    nyt.a(this.f28597b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f28598c == null) {
                        this.f28598c = new mwm();
                    }
                    nyt.a(this.f28598c);
                    continue;
                case 34:
                    if (this.f28599d == null) {
                        this.f28599d = new mwn();
                    }
                    nyt.a(this.f28599d);
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
