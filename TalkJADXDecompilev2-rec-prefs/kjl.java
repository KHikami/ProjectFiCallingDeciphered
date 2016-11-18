package p000;

public final class kjl extends nyx<kjl> {
    private static volatile kjl[] f21934n;
    public klk f21935a;
    public String f21936b;
    public String f21937c;
    public String f21938d;
    public String f21939e;
    public String f21940f;
    public String f21941g;
    public String f21942h;
    public String f21943i;
    public String f21944j;
    public String f21945k;
    public String f21946l;
    public String f21947m;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26102b(nyt);
    }

    public static kjl[] m26103d() {
        if (f21934n == null) {
            synchronized (nzc.c) {
                if (f21934n == null) {
                    f21934n = new kjl[0];
                }
            }
        }
        return f21934n;
    }

    public kjl() {
        m26104g();
    }

    private kjl m26104g() {
        this.f21935a = null;
        this.f21936b = null;
        this.f21937c = null;
        this.f21938d = null;
        this.f21939e = null;
        this.f21940f = null;
        this.f21941g = null;
        this.f21942h = null;
        this.f21943i = null;
        this.f21944j = null;
        this.f21945k = null;
        this.f21946l = null;
        this.f21947m = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21935a != null) {
            nyu.b(1, this.f21935a);
        }
        if (this.f21936b != null) {
            nyu.a(2, this.f21936b);
        }
        if (this.f21938d != null) {
            nyu.a(3, this.f21938d);
        }
        if (this.f21939e != null) {
            nyu.a(4, this.f21939e);
        }
        if (this.f21940f != null) {
            nyu.a(5, this.f21940f);
        }
        if (this.f21942h != null) {
            nyu.a(6, this.f21942h);
        }
        if (this.f21943i != null) {
            nyu.a(7, this.f21943i);
        }
        if (this.f21944j != null) {
            nyu.a(8, this.f21944j);
        }
        if (this.f21945k != null) {
            nyu.a(9, this.f21945k);
        }
        if (this.f21946l != null) {
            nyu.a(10, this.f21946l);
        }
        if (this.f21937c != null) {
            nyu.a(11, this.f21937c);
        }
        if (this.f21941g != null) {
            nyu.a(12, this.f21941g);
        }
        if (this.f21947m != null) {
            nyu.a(13, this.f21947m);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21935a != null) {
            b += nyu.d(1, this.f21935a);
        }
        if (this.f21936b != null) {
            b += nyu.b(2, this.f21936b);
        }
        if (this.f21938d != null) {
            b += nyu.b(3, this.f21938d);
        }
        if (this.f21939e != null) {
            b += nyu.b(4, this.f21939e);
        }
        if (this.f21940f != null) {
            b += nyu.b(5, this.f21940f);
        }
        if (this.f21942h != null) {
            b += nyu.b(6, this.f21942h);
        }
        if (this.f21943i != null) {
            b += nyu.b(7, this.f21943i);
        }
        if (this.f21944j != null) {
            b += nyu.b(8, this.f21944j);
        }
        if (this.f21945k != null) {
            b += nyu.b(9, this.f21945k);
        }
        if (this.f21946l != null) {
            b += nyu.b(10, this.f21946l);
        }
        if (this.f21937c != null) {
            b += nyu.b(11, this.f21937c);
        }
        if (this.f21941g != null) {
            b += nyu.b(12, this.f21941g);
        }
        if (this.f21947m != null) {
            return b + nyu.b(13, this.f21947m);
        }
        return b;
    }

    private kjl m26102b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f21935a == null) {
                        this.f21935a = new klk();
                    }
                    nyt.a(this.f21935a);
                    continue;
                case wi.dH /*18*/:
                    this.f21936b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f21938d = nyt.j();
                    continue;
                case 34:
                    this.f21939e = nyt.j();
                    continue;
                case 42:
                    this.f21940f = nyt.j();
                    continue;
                case 50:
                    this.f21942h = nyt.j();
                    continue;
                case 58:
                    this.f21943i = nyt.j();
                    continue;
                case 66:
                    this.f21944j = nyt.j();
                    continue;
                case 74:
                    this.f21945k = nyt.j();
                    continue;
                case 82:
                    this.f21946l = nyt.j();
                    continue;
                case 90:
                    this.f21937c = nyt.j();
                    continue;
                case 98:
                    this.f21941g = nyt.j();
                    continue;
                case 106:
                    this.f21947m = nyt.j();
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
