package p000;

public final class kjn extends nyx<kjn> {
    private static volatile kjn[] f21956c;
    public klk f21957a;
    public Integer f21958b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26114b(nyt);
    }

    public static kjn[] m26115d() {
        if (f21956c == null) {
            synchronized (nzc.c) {
                if (f21956c == null) {
                    f21956c = new kjn[0];
                }
            }
        }
        return f21956c;
    }

    public kjn() {
        m26116g();
    }

    private kjn m26116g() {
        this.f21957a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21957a != null) {
            nyu.b(1, this.f21957a);
        }
        if (this.f21958b != null) {
            nyu.a(2, this.f21958b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21957a != null) {
            b += nyu.d(1, this.f21957a);
        }
        if (this.f21958b != null) {
            return b + nyu.f(2, this.f21958b.intValue());
        }
        return b;
    }

    private kjn m26114b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f21957a == null) {
                        this.f21957a = new klk();
                    }
                    nyt.a(this.f21957a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f21958b = Integer.valueOf(a);
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
