package p000;

public final class khg extends nyx<khg> {
    private static volatile khg[] f21749e;
    public String f21750a;
    public String f21751b;
    public khh f21752c;
    public String f21753d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25827b(nyt);
    }

    public static khg[] m25828d() {
        if (f21749e == null) {
            synchronized (nzc.c) {
                if (f21749e == null) {
                    f21749e = new khg[0];
                }
            }
        }
        return f21749e;
    }

    public khg() {
        m25829g();
    }

    private khg m25829g() {
        this.f21750a = null;
        this.f21751b = null;
        this.f21752c = null;
        this.f21753d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21750a != null) {
            nyu.a(1, this.f21750a);
        }
        if (this.f21751b != null) {
            nyu.a(2, this.f21751b);
        }
        if (this.f21752c != null) {
            nyu.b(3, this.f21752c);
        }
        if (this.f21753d != null) {
            nyu.a(4, this.f21753d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21750a != null) {
            b += nyu.b(1, this.f21750a);
        }
        if (this.f21751b != null) {
            b += nyu.b(2, this.f21751b);
        }
        if (this.f21752c != null) {
            b += nyu.d(3, this.f21752c);
        }
        if (this.f21753d != null) {
            return b + nyu.b(4, this.f21753d);
        }
        return b;
    }

    private khg m25827b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21750a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f21751b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f21752c == null) {
                        this.f21752c = new khh();
                    }
                    nyt.a(this.f21752c);
                    continue;
                case 34:
                    this.f21753d = nyt.j();
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
