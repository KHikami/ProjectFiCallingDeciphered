package p000;

public final class nhz extends nyx<nhz> {
    private static volatile nhz[] f29860h;
    public Integer f29861a;
    public String f29862b;
    public nib f29863c;
    public nic f29864d;
    public nid f29865e;
    public nie f29866f;
    public nia f29867g;

    public /* synthetic */ nzf m35042a(nyt nyt) {
        return m35039b(nyt);
    }

    public static nhz[] m35040d() {
        if (f29860h == null) {
            synchronized (nzc.f31309c) {
                if (f29860h == null) {
                    f29860h = new nhz[0];
                }
            }
        }
        return f29860h;
    }

    public nhz() {
        m35041g();
    }

    private nhz m35041g() {
        this.f29862b = null;
        this.f29863c = null;
        this.f29864d = null;
        this.f29865e = null;
        this.f29866f = null;
        this.f29867g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35043a(nyu nyu) {
        if (this.f29861a != null) {
            nyu.m37168a(1, this.f29861a.intValue());
        }
        if (this.f29862b != null) {
            nyu.m37170a(2, this.f29862b);
        }
        if (this.f29863c != null) {
            nyu.m37182b(3, this.f29863c);
        }
        if (this.f29864d != null) {
            nyu.m37182b(4, this.f29864d);
        }
        if (this.f29865e != null) {
            nyu.m37182b(5, this.f29865e);
        }
        if (this.f29866f != null) {
            nyu.m37182b(6, this.f29866f);
        }
        if (this.f29867g != null) {
            nyu.m37182b(7, this.f29867g);
        }
        super.a(nyu);
    }

    protected int m35044b() {
        int b = super.b();
        if (this.f29861a != null) {
            b += nyu.m37147f(1, this.f29861a.intValue());
        }
        if (this.f29862b != null) {
            b += nyu.m37137b(2, this.f29862b);
        }
        if (this.f29863c != null) {
            b += nyu.m37145d(3, this.f29863c);
        }
        if (this.f29864d != null) {
            b += nyu.m37145d(4, this.f29864d);
        }
        if (this.f29865e != null) {
            b += nyu.m37145d(5, this.f29865e);
        }
        if (this.f29866f != null) {
            b += nyu.m37145d(6, this.f29866f);
        }
        if (this.f29867g != null) {
            return b + nyu.m37145d(7, this.f29867g);
        }
        return b;
    }

    private nhz m35039b(nyt nyt) {
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
                            this.f29861a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f29862b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f29863c == null) {
                        this.f29863c = new nib();
                    }
                    nyt.m37101a(this.f29863c);
                    continue;
                case 34:
                    if (this.f29864d == null) {
                        this.f29864d = new nic();
                    }
                    nyt.m37101a(this.f29864d);
                    continue;
                case 42:
                    if (this.f29865e == null) {
                        this.f29865e = new nid();
                    }
                    nyt.m37101a(this.f29865e);
                    continue;
                case 50:
                    if (this.f29866f == null) {
                        this.f29866f = new nie();
                    }
                    nyt.m37101a(this.f29866f);
                    continue;
                case 58:
                    if (this.f29867g == null) {
                        this.f29867g = new nia();
                    }
                    nyt.m37101a(this.f29867g);
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
