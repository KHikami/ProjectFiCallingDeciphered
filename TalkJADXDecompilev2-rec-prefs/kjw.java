package p000;

public final class kjw extends nyx<kjw> {
    private static volatile kjw[] f22002d;
    public String f22003a;
    public Integer f22004b;
    public Boolean f22005c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26167b(nyt);
    }

    public static kjw[] m26168d() {
        if (f22002d == null) {
            synchronized (nzc.c) {
                if (f22002d == null) {
                    f22002d = new kjw[0];
                }
            }
        }
        return f22002d;
    }

    public kjw() {
        m26169g();
    }

    private kjw m26169g() {
        this.f22003a = null;
        this.f22005c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22003a != null) {
            nyu.a(1, this.f22003a);
        }
        if (this.f22004b != null) {
            nyu.a(2, this.f22004b.intValue());
        }
        if (this.f22005c != null) {
            nyu.a(3, this.f22005c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22003a != null) {
            b += nyu.b(1, this.f22003a);
        }
        if (this.f22004b != null) {
            b += nyu.f(2, this.f22004b.intValue());
        }
        if (this.f22005c == null) {
            return b;
        }
        this.f22005c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private kjw m26167b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22003a = nyt.j();
                    continue;
                case 16:
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
                        case 10:
                        case 11:
                        case 12:
                            this.f22004b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f22005c = Boolean.valueOf(nyt.i());
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
