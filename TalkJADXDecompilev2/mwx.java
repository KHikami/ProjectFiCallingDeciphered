package defpackage;

public final class mwx extends nyx<mwx> {
    private static volatile mwx[] e;
    public String a;
    public Long b;
    public String c;
    public Long d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mwx[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new mwx[0];
                }
            }
        }
        return e;
    }

    public mwx() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.c(2, this.b.longValue());
        }
        if (this.d != null) {
            nyu.b(3, this.d.longValue());
        }
        if (this.c != null) {
            nyu.a(4, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            this.b.longValue();
            b += nyu.h(2) + 8;
        }
        if (this.d != null) {
            b += nyu.f(3, this.d.longValue());
        }
        if (this.c != null) {
            return b + nyu.b(4, this.c);
        }
        return b;
    }

    private mwx b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dK /*17*/:
                    this.b = Long.valueOf(nyt.g());
                    continue;
                case wi.dA /*24*/:
                    this.d = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    this.c = nyt.j();
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
