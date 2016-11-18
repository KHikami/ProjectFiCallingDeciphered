package p000;

public final class ncu extends nyx<ncu> {
    private static volatile ncu[] f29526h;
    public int f29527a;
    public String f29528b;
    public ncw f29529c;
    public ncx f29530d;
    public ncy f29531e;
    public ncz f29532f;
    public ncv f29533g;

    public /* synthetic */ nzf m34357a(nyt nyt) {
        return m34355b(nyt);
    }

    public static ncu[] m34356d() {
        if (f29526h == null) {
            synchronized (nzc.f31309c) {
                if (f29526h == null) {
                    f29526h = new ncu[0];
                }
            }
        }
        return f29526h;
    }

    public ncu() {
        this.f29527a = nzf.UNSET_ENUM_VALUE;
        this.f29528b = null;
        this.cachedSize = -1;
    }

    public void m34358a(nyu nyu) {
        if (this.f29527a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29527a);
        }
        if (this.f29528b != null) {
            nyu.m37170a(2, this.f29528b);
        }
        if (this.f29529c != null) {
            nyu.m37182b(3, this.f29529c);
        }
        if (this.f29530d != null) {
            nyu.m37182b(4, this.f29530d);
        }
        if (this.f29531e != null) {
            nyu.m37182b(5, this.f29531e);
        }
        if (this.f29532f != null) {
            nyu.m37182b(6, this.f29532f);
        }
        if (this.f29533g != null) {
            nyu.m37182b(7, this.f29533g);
        }
        super.a(nyu);
    }

    protected int m34359b() {
        int b = super.b();
        if (this.f29527a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f29527a);
        }
        if (this.f29528b != null) {
            b += nyu.m37137b(2, this.f29528b);
        }
        if (this.f29529c != null) {
            b += nyu.m37145d(3, this.f29529c);
        }
        if (this.f29530d != null) {
            b += nyu.m37145d(4, this.f29530d);
        }
        if (this.f29531e != null) {
            b += nyu.m37145d(5, this.f29531e);
        }
        if (this.f29532f != null) {
            b += nyu.m37145d(6, this.f29532f);
        }
        if (this.f29533g != null) {
            return b + nyu.m37145d(7, this.f29533g);
        }
        return b;
    }

    private ncu m34355b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
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
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            this.f29527a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f29528b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f29529c == null) {
                        this.f29529c = new ncw();
                    }
                    nyt.m37101a(this.f29529c);
                    continue;
                case 34:
                    if (this.f29530d == null) {
                        this.f29530d = new ncx();
                    }
                    nyt.m37101a(this.f29530d);
                    continue;
                case 42:
                    if (this.f29531e == null) {
                        this.f29531e = new ncy();
                    }
                    nyt.m37101a(this.f29531e);
                    continue;
                case 50:
                    if (this.f29532f == null) {
                        this.f29532f = new ncz();
                    }
                    nyt.m37101a(this.f29532f);
                    continue;
                case 58:
                    if (this.f29533g == null) {
                        this.f29533g = new ncv();
                    }
                    nyt.m37101a(this.f29533g);
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
