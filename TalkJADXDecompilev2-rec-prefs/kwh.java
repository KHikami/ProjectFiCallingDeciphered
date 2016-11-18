package p000;

public final class kwh extends nyx<kwh> {
    private static volatile kwh[] f23755j;
    public String f23756a;
    public String f23757b;
    public Boolean f23758c;
    public Boolean f23759d;
    public String f23760e;
    public String f23761f;
    public String f23762g;
    public lab f23763h;
    public Boolean f23764i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27791b(nyt);
    }

    public static kwh[] m27792d() {
        if (f23755j == null) {
            synchronized (nzc.c) {
                if (f23755j == null) {
                    f23755j = new kwh[0];
                }
            }
        }
        return f23755j;
    }

    public kwh() {
        this.f23756a = null;
        this.f23757b = null;
        this.f23758c = null;
        this.f23759d = null;
        this.f23760e = null;
        this.f23761f = null;
        this.f23762g = null;
        this.f23764i = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23756a);
        nyu.a(2, this.f23757b);
        nyu.a(3, this.f23758c.booleanValue());
        nyu.a(4, this.f23759d.booleanValue());
        if (this.f23760e != null) {
            nyu.a(5, this.f23760e);
        }
        if (this.f23761f != null) {
            nyu.a(6, this.f23761f);
        }
        if (this.f23762g != null) {
            nyu.a(7, this.f23762g);
        }
        if (this.f23763h != null) {
            nyu.b(8, this.f23763h);
        }
        if (this.f23764i != null) {
            nyu.a(9, this.f23764i.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.b(1, this.f23756a)) + nyu.b(2, this.f23757b);
        this.f23758c.booleanValue();
        b += nyu.h(3) + 1;
        this.f23759d.booleanValue();
        b += nyu.h(4) + 1;
        if (this.f23760e != null) {
            b += nyu.b(5, this.f23760e);
        }
        if (this.f23761f != null) {
            b += nyu.b(6, this.f23761f);
        }
        if (this.f23762g != null) {
            b += nyu.b(7, this.f23762g);
        }
        if (this.f23763h != null) {
            b += nyu.d(8, this.f23763h);
        }
        if (this.f23764i == null) {
            return b;
        }
        this.f23764i.booleanValue();
        return b + (nyu.h(9) + 1);
    }

    private kwh m27791b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23756a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23757b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f23758c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f23759d = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    this.f23760e = nyt.j();
                    continue;
                case 50:
                    this.f23761f = nyt.j();
                    continue;
                case 58:
                    this.f23762g = nyt.j();
                    continue;
                case 66:
                    if (this.f23763h == null) {
                        this.f23763h = new lab();
                    }
                    nyt.a(this.f23763h);
                    continue;
                case 72:
                    this.f23764i = Boolean.valueOf(nyt.i());
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
