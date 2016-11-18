package defpackage;

public final class ocm extends nyx<ocm> {
    public String a;
    public Long b;
    public Long c;
    public ock d;
    public ock e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ocm() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        nyu.b(2, this.b.longValue());
        nyu.b(3, this.c.longValue());
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = ((super.b() + nyu.b(1, this.a)) + nyu.f(2, this.b.longValue())) + nyu.f(3, this.c.longValue());
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            return b + nyu.d(5, this.e);
        }
        return b;
    }

    private ocm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    this.b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new ock();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new ock();
                    }
                    nyt.a(this.e);
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
