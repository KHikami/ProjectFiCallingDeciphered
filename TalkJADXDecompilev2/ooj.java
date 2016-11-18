package defpackage;

public final class ooj extends nyx<ooj> {
    private static volatile ooj[] d;
    public onp a;
    public Integer b;
    public Long c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ooj[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new ooj[0];
                }
            }
        }
        return d;
    }

    public ooj() {
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            return b + nyu.f(3, this.c.longValue());
        }
        return b;
    }

    private ooj b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new onp();
                    }
                    nyt.a(this.a);
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.e());
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
