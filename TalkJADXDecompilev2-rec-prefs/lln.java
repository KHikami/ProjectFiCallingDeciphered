package p000;

public final class lln extends nyx<lln> {
    private static volatile lln[] f25382g;
    public int f25383a;
    public Integer f25384b;
    public llo f25385c;
    public int f25386d;
    public int f25387e;
    public llp f25388f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29372b(nyt);
    }

    public static lln[] m29373d() {
        if (f25382g == null) {
            synchronized (nzc.c) {
                if (f25382g == null) {
                    f25382g = new lln[0];
                }
            }
        }
        return f25382g;
    }

    public lln() {
        this.f25383a = nzf.UNSET_ENUM_VALUE;
        this.f25384b = null;
        this.f25386d = nzf.UNSET_ENUM_VALUE;
        this.f25387e = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f25383a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f25383a);
        }
        if (this.f25384b != null) {
            nyu.a(2, this.f25384b.intValue());
        }
        if (this.f25385c != null) {
            nyu.b(3, this.f25385c);
        }
        if (this.f25386d != nzf.UNSET_ENUM_VALUE) {
            nyu.a(4, this.f25386d);
        }
        if (this.f25387e != nzf.UNSET_ENUM_VALUE) {
            nyu.a(5, this.f25387e);
        }
        if (this.f25388f != null) {
            nyu.b(6, this.f25388f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25383a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f25383a);
        }
        if (this.f25384b != null) {
            b += nyu.f(2, this.f25384b.intValue());
        }
        if (this.f25385c != null) {
            b += nyu.d(3, this.f25385c);
        }
        if (this.f25386d != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(4, this.f25386d);
        }
        if (this.f25387e != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(5, this.f25387e);
        }
        if (this.f25388f != null) {
            return b + nyu.d(6, this.f25388f);
        }
        return b;
    }

    private lln m29372b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
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
                            this.f25383a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f25384b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    if (this.f25385c == null) {
                        this.f25385c = new llo();
                    }
                    nyt.a(this.f25385c);
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f25386d = a;
                            break;
                        default:
                            continue;
                    }
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f25387e = a;
                            break;
                        default:
                            continue;
                    }
                case 50:
                    if (this.f25388f == null) {
                        this.f25388f = new llp();
                    }
                    nyt.a(this.f25388f);
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
