package p000;

public final class lqd extends nyx<lqd> {
    private static volatile lqd[] f26078g;
    public String f26079a;
    public String f26080b;
    public String f26081c;
    public String f26082d;
    public String f26083e;
    public Boolean f26084f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30007b(nyt);
    }

    public static lqd[] m30008d() {
        if (f26078g == null) {
            synchronized (nzc.c) {
                if (f26078g == null) {
                    f26078g = new lqd[0];
                }
            }
        }
        return f26078g;
    }

    public lqd() {
        m30009g();
    }

    private lqd m30009g() {
        this.f26079a = null;
        this.f26080b = null;
        this.f26081c = null;
        this.f26082d = null;
        this.f26083e = null;
        this.f26084f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26079a != null) {
            nyu.a(1, this.f26079a);
        }
        if (this.f26080b != null) {
            nyu.a(2, this.f26080b);
        }
        if (this.f26081c != null) {
            nyu.a(3, this.f26081c);
        }
        if (this.f26082d != null) {
            nyu.a(4, this.f26082d);
        }
        if (this.f26083e != null) {
            nyu.a(5, this.f26083e);
        }
        if (this.f26084f != null) {
            nyu.a(6, this.f26084f.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26079a != null) {
            b += nyu.b(1, this.f26079a);
        }
        if (this.f26080b != null) {
            b += nyu.b(2, this.f26080b);
        }
        if (this.f26081c != null) {
            b += nyu.b(3, this.f26081c);
        }
        if (this.f26082d != null) {
            b += nyu.b(4, this.f26082d);
        }
        if (this.f26083e != null) {
            b += nyu.b(5, this.f26083e);
        }
        if (this.f26084f == null) {
            return b;
        }
        this.f26084f.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private lqd m30007b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26079a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26080b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f26081c = nyt.j();
                    continue;
                case 34:
                    this.f26082d = nyt.j();
                    continue;
                case 42:
                    this.f26083e = nyt.j();
                    continue;
                case 48:
                    this.f26084f = Boolean.valueOf(nyt.i());
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
