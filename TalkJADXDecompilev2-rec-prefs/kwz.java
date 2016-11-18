package p000;

public final class kwz extends nyx<kwz> {
    private static volatile kwz[] f23817g;
    public String f23818a;
    public kvs f23819b;
    public int f23820c;
    public kvy f23821d;
    public kzk f23822e;
    public kvu f23823f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27875b(nyt);
    }

    public static kwz[] m27876d() {
        if (f23817g == null) {
            synchronized (nzc.c) {
                if (f23817g == null) {
                    f23817g = new kwz[0];
                }
            }
        }
        return f23817g;
    }

    public kwz() {
        this.f23818a = null;
        this.f23820c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23818a != null) {
            nyu.a(1, this.f23818a);
        }
        if (this.f23819b != null) {
            nyu.b(2, this.f23819b);
        }
        if (this.f23820c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(3, this.f23820c);
        }
        if (this.f23821d != null) {
            nyu.b(4, this.f23821d);
        }
        if (this.f23822e != null) {
            nyu.b(5, this.f23822e);
        }
        if (this.f23823f != null) {
            nyu.b(6, this.f23823f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23818a != null) {
            b += nyu.b(1, this.f23818a);
        }
        if (this.f23819b != null) {
            b += nyu.d(2, this.f23819b);
        }
        if (this.f23820c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(3, this.f23820c);
        }
        if (this.f23821d != null) {
            b += nyu.d(4, this.f23821d);
        }
        if (this.f23822e != null) {
            b += nyu.d(5, this.f23822e);
        }
        if (this.f23823f != null) {
            return b + nyu.d(6, this.f23823f);
        }
        return b;
    }

    private kwz m27875b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23818a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f23819b == null) {
                        this.f23819b = new kvs();
                    }
                    nyt.a(this.f23819b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f23820c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f23821d == null) {
                        this.f23821d = new kvy();
                    }
                    nyt.a(this.f23821d);
                    continue;
                case 42:
                    if (this.f23822e == null) {
                        this.f23822e = new kzk();
                    }
                    nyt.a(this.f23822e);
                    continue;
                case 50:
                    if (this.f23823f == null) {
                        this.f23823f = new kvu();
                    }
                    nyt.a(this.f23823f);
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
