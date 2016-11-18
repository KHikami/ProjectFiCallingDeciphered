package p000;

public final class mwx extends nyx<mwx> {
    private static volatile mwx[] f28634e;
    public String f28635a;
    public Long f28636b;
    public String f28637c;
    public Long f28638d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33270b(nyt);
    }

    public static mwx[] m33271d() {
        if (f28634e == null) {
            synchronized (nzc.c) {
                if (f28634e == null) {
                    f28634e = new mwx[0];
                }
            }
        }
        return f28634e;
    }

    public mwx() {
        this.f28635a = null;
        this.f28636b = null;
        this.f28637c = null;
        this.f28638d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28635a != null) {
            nyu.a(1, this.f28635a);
        }
        if (this.f28636b != null) {
            nyu.c(2, this.f28636b.longValue());
        }
        if (this.f28638d != null) {
            nyu.b(3, this.f28638d.longValue());
        }
        if (this.f28637c != null) {
            nyu.a(4, this.f28637c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28635a != null) {
            b += nyu.b(1, this.f28635a);
        }
        if (this.f28636b != null) {
            this.f28636b.longValue();
            b += nyu.h(2) + 8;
        }
        if (this.f28638d != null) {
            b += nyu.f(3, this.f28638d.longValue());
        }
        if (this.f28637c != null) {
            return b + nyu.b(4, this.f28637c);
        }
        return b;
    }

    private mwx m33270b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28635a = nyt.j();
                    continue;
                case wi.dK /*17*/:
                    this.f28636b = Long.valueOf(nyt.g());
                    continue;
                case wi.dA /*24*/:
                    this.f28638d = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    this.f28637c = nyt.j();
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
