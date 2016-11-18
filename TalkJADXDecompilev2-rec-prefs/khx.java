package p000;

public final class khx extends nyx<khx> {
    private static volatile khx[] f21803d;
    public Integer f21804a;
    public Integer f21805b;
    public String f21806c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25911b(nyt);
    }

    public static khx[] m25912d() {
        if (f21803d == null) {
            synchronized (nzc.c) {
                if (f21803d == null) {
                    f21803d = new khx[0];
                }
            }
        }
        return f21803d;
    }

    public khx() {
        m25913g();
    }

    private khx m25913g() {
        this.f21806c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21804a != null) {
            nyu.a(1, this.f21804a.intValue());
        }
        if (this.f21805b != null) {
            nyu.a(2, this.f21805b.intValue());
        }
        if (this.f21806c != null) {
            nyu.a(3, this.f21806c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21804a != null) {
            b += nyu.f(1, this.f21804a.intValue());
        }
        if (this.f21805b != null) {
            b += nyu.f(2, this.f21805b.intValue());
        }
        if (this.f21806c != null) {
            return b + nyu.b(3, this.f21806c);
        }
        return b;
    }

    private khx m25911b(nyt nyt) {
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
                            this.f21804a = Integer.valueOf(a);
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
                            this.f21805b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f21806c = nyt.j();
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
