package defpackage;

public final class ohl extends nyx<ohl> {
    private static volatile ohl[] d;
    public String a;
    public ohj b;
    public Long c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ohl[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new ohl[0];
                }
            }
        }
        return d;
    }

    public ohl() {
        this.a = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b() + nyu.b(1, this.a);
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            return b + nyu.f(3, this.c.longValue());
        }
        return b;
    }

    private ohl b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new ohj();
                    }
                    nyt.a(this.b);
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
