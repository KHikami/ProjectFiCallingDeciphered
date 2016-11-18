package defpackage;

public final class oof extends nyx<oof> {
    private static volatile oof[] h;
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public onp g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oof[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new oof[0];
                }
            }
        }
        return h;
    }

    public oof() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a.longValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b.longValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c.longValue());
        }
        if (this.d != null) {
            nyu.b(4, this.d.longValue());
        }
        if (this.e != null) {
            nyu.b(5, this.e.longValue());
        }
        if (this.f != null) {
            nyu.b(6, this.f.longValue());
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.longValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.longValue());
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.longValue());
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.longValue());
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.longValue());
        }
        if (this.f != null) {
            b += nyu.f(6, this.f.longValue());
        }
        if (this.g != null) {
            return b + nyu.d(7, this.g);
        }
        return b;
    }

    private oof b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    this.d = Long.valueOf(nyt.e());
                    continue;
                case 40:
                    this.e = Long.valueOf(nyt.e());
                    continue;
                case 48:
                    this.f = Long.valueOf(nyt.e());
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new onp();
                    }
                    nyt.a(this.g);
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
