package p000;

public final class mwh extends nyx<mwh> {
    private static volatile mwh[] f28586e;
    public String f28587a;
    public Integer f28588b;
    public Integer f28589c;
    public Integer f28590d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33200b(nyt);
    }

    public static mwh[] m33201d() {
        if (f28586e == null) {
            synchronized (nzc.c) {
                if (f28586e == null) {
                    f28586e = new mwh[0];
                }
            }
        }
        return f28586e;
    }

    public mwh() {
        this.f28587a = null;
        this.f28588b = null;
        this.f28589c = null;
        this.f28590d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28587a != null) {
            nyu.a(1, this.f28587a);
        }
        if (this.f28588b != null) {
            nyu.a(2, this.f28588b.intValue());
        }
        if (this.f28589c != null) {
            nyu.a(3, this.f28589c.intValue());
        }
        if (this.f28590d != null) {
            nyu.a(4, this.f28590d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28587a != null) {
            b += nyu.b(1, this.f28587a);
        }
        if (this.f28588b != null) {
            b += nyu.f(2, this.f28588b.intValue());
        }
        if (this.f28589c != null) {
            b += nyu.f(3, this.f28589c.intValue());
        }
        if (this.f28590d != null) {
            return b + nyu.f(4, this.f28590d.intValue());
        }
        return b;
    }

    private mwh m33200b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28587a = nyt.j();
                    continue;
                case 16:
                    this.f28588b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f28589c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f28590d = Integer.valueOf(nyt.f());
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
