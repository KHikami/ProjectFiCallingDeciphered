package p000;

public final class klz extends nyx<klz> {
    private static volatile klz[] f22327f;
    public Integer f22328a;
    public String f22329b;
    public Boolean f22330c;
    public Long f22331d;
    public String f22332e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26481b(nyt);
    }

    public static klz[] m26482d() {
        if (f22327f == null) {
            synchronized (nzc.c) {
                if (f22327f == null) {
                    f22327f = new klz[0];
                }
            }
        }
        return f22327f;
    }

    public klz() {
        m26483g();
    }

    private klz m26483g() {
        this.f22329b = null;
        this.f22330c = null;
        this.f22331d = null;
        this.f22332e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22328a != null) {
            nyu.a(1, this.f22328a.intValue());
        }
        if (this.f22329b != null) {
            nyu.a(2, this.f22329b);
        }
        if (this.f22330c != null) {
            nyu.a(3, this.f22330c.booleanValue());
        }
        if (this.f22331d != null) {
            nyu.b(4, this.f22331d.longValue());
        }
        if (this.f22332e != null) {
            nyu.a(5, this.f22332e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22328a != null) {
            b += nyu.f(1, this.f22328a.intValue());
        }
        if (this.f22329b != null) {
            b += nyu.b(2, this.f22329b);
        }
        if (this.f22330c != null) {
            this.f22330c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f22331d != null) {
            b += nyu.f(4, this.f22331d.longValue());
        }
        if (this.f22332e != null) {
            return b + nyu.b(5, this.f22332e);
        }
        return b;
    }

    private klz m26481b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
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
                            this.f22328a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f22329b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f22330c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f22331d = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    this.f22332e = nyt.j();
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
