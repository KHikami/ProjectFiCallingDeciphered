public final class lmy extends nyx<lmy> {
    private static volatile lmy[] d;
    public Integer a;
    public Integer b;
    public Integer c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lmy[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new lmy[0];
                }
            }
        }
        return d;
    }

    public lmy() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.intValue());
        nyu.a(2, this.b.intValue());
        nyu.a(3, this.c.intValue());
        super.a(nyu);
    }

    protected int b() {
        return ((super.b() + nyu.f(1, this.a.intValue())) + nyu.f(2, this.b.intValue())) + nyu.f(3, this.c.intValue());
    }

    private lmy b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dI /*16*/:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
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
