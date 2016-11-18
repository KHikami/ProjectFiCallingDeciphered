package p000;

public final class osx extends nyx<osx> {
    private static volatile osx[] f34202i;
    public Boolean f34203a;
    public Boolean f34204b;
    public String f34205c;
    public oox f34206d;
    public String f34207e;
    public String f34208f;
    public String f34209g;
    public oqu f34210h;

    public /* synthetic */ nzf m39642a(nyt nyt) {
        return m39639b(nyt);
    }

    public static osx[] m39640d() {
        if (f34202i == null) {
            synchronized (nzc.f31309c) {
                if (f34202i == null) {
                    f34202i = new osx[0];
                }
            }
        }
        return f34202i;
    }

    public osx() {
        m39641g();
    }

    private osx m39641g() {
        this.f34203a = null;
        this.f34204b = null;
        this.f34205c = null;
        this.f34206d = null;
        this.f34207e = null;
        this.f34208f = null;
        this.f34209g = null;
        this.f34210h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39643a(nyu nyu) {
        if (this.f34203a != null) {
            nyu.m37172a(1, this.f34203a.booleanValue());
        }
        if (this.f34204b != null) {
            nyu.m37172a(2, this.f34204b.booleanValue());
        }
        if (this.f34205c != null) {
            nyu.m37170a(3, this.f34205c);
        }
        if (this.f34206d != null) {
            nyu.m37182b(4, this.f34206d);
        }
        if (this.f34207e != null) {
            nyu.m37170a(5, this.f34207e);
        }
        if (this.f34208f != null) {
            nyu.m37170a(6, this.f34208f);
        }
        if (this.f34209g != null) {
            nyu.m37170a(7, this.f34209g);
        }
        if (this.f34210h != null) {
            nyu.m37182b(9, this.f34210h);
        }
        super.a(nyu);
    }

    protected int m39644b() {
        int b = super.b();
        if (this.f34203a != null) {
            this.f34203a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f34204b != null) {
            this.f34204b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f34205c != null) {
            b += nyu.m37137b(3, this.f34205c);
        }
        if (this.f34206d != null) {
            b += nyu.m37145d(4, this.f34206d);
        }
        if (this.f34207e != null) {
            b += nyu.m37137b(5, this.f34207e);
        }
        if (this.f34208f != null) {
            b += nyu.m37137b(6, this.f34208f);
        }
        if (this.f34209g != null) {
            b += nyu.m37137b(7, this.f34209g);
        }
        if (this.f34210h != null) {
            return b + nyu.m37145d(9, this.f34210h);
        }
        return b;
    }

    private osx m39639b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34203a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f34204b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dx /*26*/:
                    this.f34205c = nyt.m37117j();
                    continue;
                case 34:
                    if (this.f34206d == null) {
                        this.f34206d = new oox();
                    }
                    nyt.m37101a(this.f34206d);
                    continue;
                case 42:
                    this.f34207e = nyt.m37117j();
                    continue;
                case 50:
                    this.f34208f = nyt.m37117j();
                    continue;
                case 58:
                    this.f34209g = nyt.m37117j();
                    continue;
                case 74:
                    if (this.f34210h == null) {
                        this.f34210h = new oqu();
                    }
                    nyt.m37101a(this.f34210h);
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
