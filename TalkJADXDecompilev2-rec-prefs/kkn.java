package p000;

public final class kkn extends nyx<kkn> {
    private static volatile kkn[] f22064g;
    public klk f22065a;
    public String f22066b;
    public String f22067c;
    public String f22068d;
    public String f22069e;
    public String f22070f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26262b(nyt);
    }

    public static kkn[] m26263d() {
        if (f22064g == null) {
            synchronized (nzc.c) {
                if (f22064g == null) {
                    f22064g = new kkn[0];
                }
            }
        }
        return f22064g;
    }

    public kkn() {
        m26264g();
    }

    private kkn m26264g() {
        this.f22065a = null;
        this.f22066b = null;
        this.f22067c = null;
        this.f22068d = null;
        this.f22069e = null;
        this.f22070f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22065a != null) {
            nyu.b(1, this.f22065a);
        }
        if (this.f22066b != null) {
            nyu.a(2, this.f22066b);
        }
        if (this.f22067c != null) {
            nyu.a(3, this.f22067c);
        }
        if (this.f22069e != null) {
            nyu.a(4, this.f22069e);
        }
        if (this.f22068d != null) {
            nyu.a(5, this.f22068d);
        }
        if (this.f22070f != null) {
            nyu.a(6, this.f22070f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22065a != null) {
            b += nyu.d(1, this.f22065a);
        }
        if (this.f22066b != null) {
            b += nyu.b(2, this.f22066b);
        }
        if (this.f22067c != null) {
            b += nyu.b(3, this.f22067c);
        }
        if (this.f22069e != null) {
            b += nyu.b(4, this.f22069e);
        }
        if (this.f22068d != null) {
            b += nyu.b(5, this.f22068d);
        }
        if (this.f22070f != null) {
            return b + nyu.b(6, this.f22070f);
        }
        return b;
    }

    private kkn m26262b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22065a == null) {
                        this.f22065a = new klk();
                    }
                    nyt.a(this.f22065a);
                    continue;
                case wi.dH /*18*/:
                    this.f22066b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22067c = nyt.j();
                    continue;
                case 34:
                    this.f22069e = nyt.j();
                    continue;
                case 42:
                    this.f22068d = nyt.j();
                    continue;
                case 50:
                    this.f22070f = nyt.j();
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
