package p000;

public final class llm extends nyx<llm> {
    private static volatile llm[] f25377e;
    public Integer f25378a;
    public Integer f25379b;
    public Integer f25380c;
    public Integer f25381d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29366b(nyt);
    }

    public static llm[] m29367d() {
        if (f25377e == null) {
            synchronized (nzc.c) {
                if (f25377e == null) {
                    f25377e = new llm[0];
                }
            }
        }
        return f25377e;
    }

    public llm() {
        m29368g();
    }

    private llm m29368g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25378a != null) {
            nyu.a(1, this.f25378a.intValue());
        }
        if (this.f25379b != null) {
            nyu.a(2, this.f25379b.intValue());
        }
        if (this.f25381d != null) {
            nyu.a(3, this.f25381d.intValue());
        }
        if (this.f25380c != null) {
            nyu.a(4, this.f25380c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25378a != null) {
            b += nyu.f(1, this.f25378a.intValue());
        }
        if (this.f25379b != null) {
            b += nyu.f(2, this.f25379b.intValue());
        }
        if (this.f25381d != null) {
            b += nyu.f(3, this.f25381d.intValue());
        }
        if (this.f25380c != null) {
            return b + nyu.f(4, this.f25380c.intValue());
        }
        return b;
    }

    private llm m29366b(nyt nyt) {
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
                            this.f25378a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f25379b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f25381d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f25380c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
