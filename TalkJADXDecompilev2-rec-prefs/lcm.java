package p000;

public final class lcm extends nyx<lcm> {
    private static volatile lcm[] f24587h;
    public lex f24588a;
    public String f24589b;
    public int f24590c;
    public ldc f24591d;
    public lah f24592e;
    public ldo f24593f;
    public lat f24594g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28616b(nyt);
    }

    public static lcm[] m28617d() {
        if (f24587h == null) {
            synchronized (nzc.c) {
                if (f24587h == null) {
                    f24587h = new lcm[0];
                }
            }
        }
        return f24587h;
    }

    public lcm() {
        this.f24589b = null;
        this.f24590c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24588a != null) {
            nyu.b(1, this.f24588a);
        }
        if (this.f24589b != null) {
            nyu.a(2, this.f24589b);
        }
        if (this.f24590c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(3, this.f24590c);
        }
        if (this.f24591d != null) {
            nyu.b(4, this.f24591d);
        }
        if (this.f24592e != null) {
            nyu.b(5, this.f24592e);
        }
        if (this.f24593f != null) {
            nyu.b(6, this.f24593f);
        }
        if (this.f24594g != null) {
            nyu.b(7, this.f24594g);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24588a != null) {
            b += nyu.d(1, this.f24588a);
        }
        if (this.f24589b != null) {
            b += nyu.b(2, this.f24589b);
        }
        if (this.f24590c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(3, this.f24590c);
        }
        if (this.f24591d != null) {
            b += nyu.d(4, this.f24591d);
        }
        if (this.f24592e != null) {
            b += nyu.d(5, this.f24592e);
        }
        if (this.f24593f != null) {
            b += nyu.d(6, this.f24593f);
        }
        if (this.f24594g != null) {
            return b + nyu.d(7, this.f24594g);
        }
        return b;
    }

    private lcm m28616b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24588a == null) {
                        this.f24588a = new lex();
                    }
                    nyt.a(this.f24588a);
                    continue;
                case wi.dH /*18*/:
                    this.f24589b = nyt.j();
                    continue;
                case wi.dA /*24*/:
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
                            this.f24590c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f24591d == null) {
                        this.f24591d = new ldc();
                    }
                    nyt.a(this.f24591d);
                    continue;
                case 42:
                    if (this.f24592e == null) {
                        this.f24592e = new lah();
                    }
                    nyt.a(this.f24592e);
                    continue;
                case 50:
                    if (this.f24593f == null) {
                        this.f24593f = new ldo();
                    }
                    nyt.a(this.f24593f);
                    continue;
                case 58:
                    if (this.f24594g == null) {
                        this.f24594g = new lat();
                    }
                    nyt.a(this.f24594g);
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
