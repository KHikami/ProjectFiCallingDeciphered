package p000;

public final class kjp extends nyx<kjp> {
    private static volatile kjp[] f21961e;
    public klk f21962a;
    public Long f21963b;
    public Long f21964c;
    public String f21965d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26125b(nyt);
    }

    public static kjp[] m26126d() {
        if (f21961e == null) {
            synchronized (nzc.c) {
                if (f21961e == null) {
                    f21961e = new kjp[0];
                }
            }
        }
        return f21961e;
    }

    public kjp() {
        m26127g();
    }

    private kjp m26127g() {
        this.f21962a = null;
        this.f21963b = null;
        this.f21964c = null;
        this.f21965d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21962a != null) {
            nyu.b(1, this.f21962a);
        }
        if (this.f21963b != null) {
            nyu.b(2, this.f21963b.longValue());
        }
        if (this.f21964c != null) {
            nyu.b(3, this.f21964c.longValue());
        }
        if (this.f21965d != null) {
            nyu.a(4, this.f21965d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21962a != null) {
            b += nyu.d(1, this.f21962a);
        }
        if (this.f21963b != null) {
            b += nyu.f(2, this.f21963b.longValue());
        }
        if (this.f21964c != null) {
            b += nyu.f(3, this.f21964c.longValue());
        }
        if (this.f21965d != null) {
            return b + nyu.b(4, this.f21965d);
        }
        return b;
    }

    private kjp m26125b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f21962a == null) {
                        this.f21962a = new klk();
                    }
                    nyt.a(this.f21962a);
                    continue;
                case 16:
                    this.f21963b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.f21964c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    this.f21965d = nyt.j();
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
