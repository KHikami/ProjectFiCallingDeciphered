public final class ksx extends nyx<ksx> {
    private static volatile ksx[] e;
    public Integer a;
    public Integer b;
    public Integer c;
    public String d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ksx[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new ksx[0];
                }
            }
        }
        return e;
    }

    public ksx() {
        g();
    }

    private ksx g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.intValue());
        nyu.a(2, this.b.intValue());
        nyu.a(3, this.c.intValue());
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = ((super.b() + nyu.f(1, this.a.intValue())) + nyu.f(2, this.b.intValue())) + nyu.f(3, this.c.intValue());
        if (this.d != null) {
            return b + nyu.b(4, this.d);
        }
        return b;
    }

    private ksx b(nyt nyt) {
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
                case 34:
                    this.d = nyt.j();
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
