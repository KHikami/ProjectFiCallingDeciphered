package p000;

public final class oof extends nyx<oof> {
    private static volatile oof[] f33373h;
    public Long f33374a;
    public Long f33375b;
    public Long f33376c;
    public Long f33377d;
    public Long f33378e;
    public Long f33379f;
    public onp f33380g;

    public /* synthetic */ nzf m38892a(nyt nyt) {
        return m38890b(nyt);
    }

    public static oof[] m38891d() {
        if (f33373h == null) {
            synchronized (nzc.f31309c) {
                if (f33373h == null) {
                    f33373h = new oof[0];
                }
            }
        }
        return f33373h;
    }

    public oof() {
        this.f33374a = null;
        this.f33375b = null;
        this.f33376c = null;
        this.f33377d = null;
        this.f33378e = null;
        this.f33379f = null;
        this.cachedSize = -1;
    }

    public void m38893a(nyu nyu) {
        if (this.f33374a != null) {
            nyu.m37181b(1, this.f33374a.longValue());
        }
        if (this.f33375b != null) {
            nyu.m37181b(2, this.f33375b.longValue());
        }
        if (this.f33376c != null) {
            nyu.m37181b(3, this.f33376c.longValue());
        }
        if (this.f33377d != null) {
            nyu.m37181b(4, this.f33377d.longValue());
        }
        if (this.f33378e != null) {
            nyu.m37181b(5, this.f33378e.longValue());
        }
        if (this.f33379f != null) {
            nyu.m37181b(6, this.f33379f.longValue());
        }
        if (this.f33380g != null) {
            nyu.m37182b(7, this.f33380g);
        }
        super.a(nyu);
    }

    protected int m38894b() {
        int b = super.b();
        if (this.f33374a != null) {
            b += nyu.m37148f(1, this.f33374a.longValue());
        }
        if (this.f33375b != null) {
            b += nyu.m37148f(2, this.f33375b.longValue());
        }
        if (this.f33376c != null) {
            b += nyu.m37148f(3, this.f33376c.longValue());
        }
        if (this.f33377d != null) {
            b += nyu.m37148f(4, this.f33377d.longValue());
        }
        if (this.f33378e != null) {
            b += nyu.m37148f(5, this.f33378e.longValue());
        }
        if (this.f33379f != null) {
            b += nyu.m37148f(6, this.f33379f.longValue());
        }
        if (this.f33380g != null) {
            return b + nyu.m37145d(7, this.f33380g);
        }
        return b;
    }

    private oof m38890b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33374a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f33375b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dA /*24*/:
                    this.f33376c = Long.valueOf(nyt.m37110e());
                    continue;
                case 32:
                    this.f33377d = Long.valueOf(nyt.m37110e());
                    continue;
                case 40:
                    this.f33378e = Long.valueOf(nyt.m37110e());
                    continue;
                case 48:
                    this.f33379f = Long.valueOf(nyt.m37110e());
                    continue;
                case 58:
                    if (this.f33380g == null) {
                        this.f33380g = new onp();
                    }
                    nyt.m37101a(this.f33380g);
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
